package com.example.newsbuzz.presentations.search

sealed class SearchEvent {

    data class UpdateSearchQuery(val searchQuery: String): SearchEvent()

    object SearchNews : SearchEvent()
}