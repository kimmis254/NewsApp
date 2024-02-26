package com.example.newsbuzz.domain.usecases.news

import com.example.newsbuzz.domain.model.Article
import com.example.newsbuzz.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class SelectArticles(
    private val newsRepository: NewsRepository
) {

    operator fun invoke(): Flow<List<Article>>{
        return newsRepository.selectArticles()
    }

}