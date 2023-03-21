package com.raywenderlich.android.majesticreader.framework

import android.content.Context
import com.raywenderlich.android.majesticreader.data.BookMarkDataSource
import com.raywenderlich.android.majesticreader.domain.Bookmark
import com.raywenderlich.android.majesticreader.domain.Document
import com.raywenderlich.android.majesticreader.framework.db.BookmarkEntity
import com.raywenderlich.android.majesticreader.framework.db.MajesticReaderDatabase

class RoomBookMarkDataSource(context: Context) : BookMarkDataSource {

    private val bookmarkDao = MajesticReaderDatabase.getInstance(context).bookmarkDao()

    override suspend fun add(document: Document, bookmark: Bookmark) {
        bookmarkDao.addBookmark(BookmarkEntity(
            documentUri = document.url,
            page = bookmark.page
        ))
    }

    override suspend fun read(document: Document): List<Bookmark> {
        return bookmarkDao.getBookmarks(document.url).map { entity->
            Bookmark(
                entity.id,
                entity.page
            )
        }
    }

    override suspend fun remove(document: Document, bookmark: Bookmark) {
        bookmarkDao.removeBookmark(BookmarkEntity(
            documentUri = document.url,
            page = bookmark.page
        ))
    }
}