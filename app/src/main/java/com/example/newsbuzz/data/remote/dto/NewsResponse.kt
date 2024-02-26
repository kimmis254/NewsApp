package com.example.newsbuzz.data.remote.dto

import com.example.newsbuzz.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)