package com.example.vkapp.domain.usecases

import com.example.vkapp.domain.entity.FeedPost
import com.example.vkapp.domain.repository.NewsFeedRepository
import kotlinx.coroutines.flow.StateFlow

class GetRecommendationsUseCase(
    private val repository: NewsFeedRepository
) {

    operator fun invoke(): StateFlow<List<FeedPost>> {
        return repository.getRecommendations()
    }
}
