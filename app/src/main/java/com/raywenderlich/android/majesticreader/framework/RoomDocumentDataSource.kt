package com.raywenderlich.android.majesticreader.framework

import android.content.Context
import com.raywenderlich.android.majesticreader.data.DocumentDataSource
import com.raywenderlich.android.majesticreader.domain.Document
import com.raywenderlich.android.majesticreader.framework.db.DocumentEntity
import com.raywenderlich.android.majesticreader.framework.db.MajesticReaderDatabase

class RoomDocumentDataSource(context: Context) : DocumentDataSource {

    private val documentDao = MajesticReaderDatabase.getInstance(context).documentDao()

    override suspend fun add(document: Document) {
        documentDao.addDocument(DocumentEntity(
            uri = document.url,
            title = document.name,
            size = document.size,
            thumbnailUri = document.thumbnail
        ))
    }

    override suspend fun remove(document: Document) {
        documentDao.removeDocument(DocumentEntity(
            uri = document.url,
            title = document.name,
            size = document.size,
            thumbnailUri = document.thumbnail
        ))
    }

    override suspend fun readAll(): List<Document> {
        return documentDao.getDocuments().map { entity ->
            Document(
                url = entity.uri,
                name = entity.title,
                size = entity.size,
                thumbnail = entity.thumbnailUri
            )
        }
    }
}