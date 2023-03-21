package com.raywenderlich.android.majesticreader.framework;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0007H\u00c6\u0003J\t\u0010&\u001a\u00020\tH\u00c6\u0003J\t\u0010\'\u001a\u00020\u000bH\u00c6\u0003J\t\u0010(\u001a\u00020\rH\u00c6\u0003J\t\u0010)\u001a\u00020\u000fH\u00c6\u0003J\t\u0010*\u001a\u00020\u0011H\u00c6\u0003JY\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u000200H\u00d6\u0001J\t\u00101\u001a\u000202H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u00a8\u00063"}, d2 = {"Lcom/raywenderlich/android/majesticreader/framework/Interactors;", "", "addBookmark", "Lcom/raywenderlich/android/majesticreader/usecase/AddBookmarkUseCase;", "getBookmarks", "Lcom/raywenderlich/android/majesticreader/usecase/ReadBookmarkUseCase;", "deleteBookmark", "Lcom/raywenderlich/android/majesticreader/usecase/RemoveBookmarkUseCase;", "addDocument", "Lcom/raywenderlich/android/majesticreader/usecase/AddDocumentUseCase;", "getDocuments", "Lcom/raywenderlich/android/majesticreader/usecase/ReadAllDocumentUseCase;", "removeDocument", "Lcom/raywenderlich/android/majesticreader/usecase/RemoveDocumentUseCase;", "getOpenDocument", "Lcom/raywenderlich/android/majesticreader/usecase/GetOpenDocumentUseCase;", "setOpenDocument", "Lcom/raywenderlich/android/majesticreader/usecase/SetOpenDocumentUseCase;", "(Lcom/raywenderlich/android/majesticreader/usecase/AddBookmarkUseCase;Lcom/raywenderlich/android/majesticreader/usecase/ReadBookmarkUseCase;Lcom/raywenderlich/android/majesticreader/usecase/RemoveBookmarkUseCase;Lcom/raywenderlich/android/majesticreader/usecase/AddDocumentUseCase;Lcom/raywenderlich/android/majesticreader/usecase/ReadAllDocumentUseCase;Lcom/raywenderlich/android/majesticreader/usecase/RemoveDocumentUseCase;Lcom/raywenderlich/android/majesticreader/usecase/GetOpenDocumentUseCase;Lcom/raywenderlich/android/majesticreader/usecase/SetOpenDocumentUseCase;)V", "getAddBookmark", "()Lcom/raywenderlich/android/majesticreader/usecase/AddBookmarkUseCase;", "getAddDocument", "()Lcom/raywenderlich/android/majesticreader/usecase/AddDocumentUseCase;", "getDeleteBookmark", "()Lcom/raywenderlich/android/majesticreader/usecase/RemoveBookmarkUseCase;", "getGetBookmarks", "()Lcom/raywenderlich/android/majesticreader/usecase/ReadBookmarkUseCase;", "getGetDocuments", "()Lcom/raywenderlich/android/majesticreader/usecase/ReadAllDocumentUseCase;", "getGetOpenDocument", "()Lcom/raywenderlich/android/majesticreader/usecase/GetOpenDocumentUseCase;", "getRemoveDocument", "()Lcom/raywenderlich/android/majesticreader/usecase/RemoveDocumentUseCase;", "getSetOpenDocument", "()Lcom/raywenderlich/android/majesticreader/usecase/SetOpenDocumentUseCase;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class Interactors {
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.usecase.AddBookmarkUseCase addBookmark = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.usecase.ReadBookmarkUseCase getBookmarks = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.usecase.RemoveBookmarkUseCase deleteBookmark = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.usecase.AddDocumentUseCase addDocument = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.usecase.ReadAllDocumentUseCase getDocuments = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.usecase.RemoveDocumentUseCase removeDocument = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.usecase.GetOpenDocumentUseCase getOpenDocument = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.usecase.SetOpenDocumentUseCase setOpenDocument = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.usecase.AddBookmarkUseCase getAddBookmark() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.usecase.ReadBookmarkUseCase getGetBookmarks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.usecase.RemoveBookmarkUseCase getDeleteBookmark() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.usecase.AddDocumentUseCase getAddDocument() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.usecase.ReadAllDocumentUseCase getGetDocuments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.usecase.RemoveDocumentUseCase getRemoveDocument() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.usecase.GetOpenDocumentUseCase getGetOpenDocument() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.usecase.SetOpenDocumentUseCase getSetOpenDocument() {
        return null;
    }
    
    public Interactors(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.usecase.AddBookmarkUseCase addBookmark, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.usecase.ReadBookmarkUseCase getBookmarks, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.usecase.RemoveBookmarkUseCase deleteBookmark, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.usecase.AddDocumentUseCase addDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.usecase.ReadAllDocumentUseCase getDocuments, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.usecase.RemoveDocumentUseCase removeDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.usecase.GetOpenDocumentUseCase getOpenDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.usecase.SetOpenDocumentUseCase setOpenDocument) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.usecase.AddBookmarkUseCase component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.usecase.ReadBookmarkUseCase component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.usecase.RemoveBookmarkUseCase component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.usecase.AddDocumentUseCase component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.usecase.ReadAllDocumentUseCase component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.usecase.RemoveDocumentUseCase component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.usecase.GetOpenDocumentUseCase component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.usecase.SetOpenDocumentUseCase component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.framework.Interactors copy(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.usecase.AddBookmarkUseCase addBookmark, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.usecase.ReadBookmarkUseCase getBookmarks, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.usecase.RemoveBookmarkUseCase deleteBookmark, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.usecase.AddDocumentUseCase addDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.usecase.ReadAllDocumentUseCase getDocuments, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.usecase.RemoveDocumentUseCase removeDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.usecase.GetOpenDocumentUseCase getOpenDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.usecase.SetOpenDocumentUseCase setOpenDocument) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}