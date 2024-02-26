package com.example.newsbuzz.domain.usecases.news

import com.example.newsbuzz.domain.model.Article
import com.example.newsbuzz.domain.repository.NewsRepository

class UpsertArticle(
    private val newsRepository: NewsRepository
) {

    suspend operator fun invoke(article: Article){
        newsRepository.upsertArticle(article)
    }

}