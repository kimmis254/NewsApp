package com.example.newsbuzz.presentations.search

import androidx.paging.PagingData
import com.example.newsbuzz.domain.model.Article
import kotlinx.coroutines.flow.Flow

data class SearchState(
    val searchQuery: String = "",
    val articles: Flow<PagingData<Article>>? = null
) {
}