package com.example.newsbuzz.presentations.bookmark

import com.example.newsbuzz.domain.model.Article

data class BookmarkState(
    val articles: List<Article> = emptyList()
)