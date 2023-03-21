package com.raywenderlich.android.majesticreader.usecase

import com.raywenderlich.android.majesticreader.data.BookmarkRepository
import com.raywenderlich.android.majesticreader.domain.Document

class ReadBookmarkUseCase(private val bookmarkRepository: BookmarkRepository) {
    suspend operator fun invoke(document: Document) =
        bookmarkRepository.getBookMarks(document)
}