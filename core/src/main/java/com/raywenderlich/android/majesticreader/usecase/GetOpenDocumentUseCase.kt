package com.raywenderlich.android.majesticreader.usecase

import com.raywenderlich.android.majesticreader.data.DocumentRepository

class GetOpenDocumentUseCase(private val documentRepository: DocumentRepository) {
    operator fun invoke() =
        documentRepository.getOpenDocument()
}