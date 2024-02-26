package com.example.newsbuzz.domain.usecases.news

import com.example.newsbuzz.domain.model.Article
import com.example.newsbuzz.domain.repository.NewsRepository

class SelectArticle(
    private val newsRepository: NewsRepository
) {

    suspend operator fun invoke(url: String): Article?{
        return newsRepository.selectArticle(url)
    }

}