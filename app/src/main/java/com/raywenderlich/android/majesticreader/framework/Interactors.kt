package com.raywenderlich.android.majesticreader.framework

import com.raywenderlich.android.majesticreader.usecase.AddBookmarkUseCase
import com.raywenderlich.android.majesticreader.usecase.AddDocumentUseCase
import com.raywenderlich.android.majesticreader.usecase.GetOpenDocumentUseCase
import com.raywenderlich.android.majesticreader.usecase.ReadAllDocumentUseCase
import com.raywenderlich.android.majesticreader.usecase.ReadBookmarkUseCase
import com.raywenderlich.android.majesticreader.usecase.RemoveBookmarkUseCase
import com.raywenderlich.android.majesticreader.usecase.RemoveDocumentUseCase
import com.raywenderlich.android.majesticreader.usecase.SetOpenDocumentUseCase

data class Interactors(
    val addBookmark: AddBookmarkUseCase,
    val getBookmarks: ReadBookmarkUseCase,
    val deleteBookmark: RemoveBookmarkUseCase,
    val addDocument: AddDocumentUseCase,
    val getDocuments: ReadAllDocumentUseCase,
    val removeDocument: RemoveDocumentUseCase,
    val getOpenDocument: GetOpenDocumentUseCase,
    val setOpenDocument: SetOpenDocumentUseCase)