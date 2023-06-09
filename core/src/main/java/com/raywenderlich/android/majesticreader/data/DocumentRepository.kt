package com.raywenderlich.android.majesticreader.data

import com.raywenderlich.android.majesticreader.domain.Document

class DocumentRepository(
    private val documentDataSource: DocumentDataSource,
    private val openDocumentDataSource: OpenDocumentDataSource) {

    suspend fun addDocument(document: Document) =
        documentDataSource.add(document)

    suspend fun removeDocument(document: Document) =
        documentDataSource.remove(document)

    suspend fun readAllDocuments() =
        documentDataSource.readAll()

    fun setOpenDocument(document: Document) =
        openDocumentDataSource.setOpenDocument(document)

    fun getOpenDocument() =
        openDocumentDataSource.getOpenDocument()

}