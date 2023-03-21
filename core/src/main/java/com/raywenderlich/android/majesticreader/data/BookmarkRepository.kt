package com.raywenderlich.android.majesticreader.data

import com.raywenderlich.android.majesticreader.domain.Bookmark
import com.raywenderlich.android.majesticreader.domain.Document

class BookmarkRepository(private val bookMarkDataSource: BookMarkDataSource) {

    suspend fun addBookMark(document: Document, bookmark: Bookmark) =
        bookMarkDataSource.add(document, bookmark)

    suspend fun removeBookMark(document: Document, bookmark: Bookmark) =
        bookMarkDataSource.remove(document, bookmark)

    suspend fun getBookMarks(document: Document): List<Bookmark> =
        bookMarkDataSource.read(document)
}