package com.raywenderlich.android.majesticreader.usecase

import com.raywenderlich.android.majesticreader.data.DocumentRepository

class ReadAllDocumentUseCase(private val documentRepository: DocumentRepository) {
    suspend operator fun invoke()  =
        documentRepository.readAllDocuments()
}