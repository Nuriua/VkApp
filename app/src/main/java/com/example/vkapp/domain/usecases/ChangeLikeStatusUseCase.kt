package com.example.vkapp.domain.usecases

import com.example.vkapp.domain.entity.AuthState
import com.example.vkapp.domain.entity.FeedPost
import com.example.vkapp.domain.entity.PostComment
import com.example.vkapp.domain.repository.NewsFeedRepository
import kotlinx.coroutines.flow.StateFlow

class ChangeLikeStatusUseCase(
    private val repository: NewsFeedRepository
) {

    suspend operator fun invoke(feedPost: FeedPost) {
        repository.changeLikeStatus(feedPost)
    }
}