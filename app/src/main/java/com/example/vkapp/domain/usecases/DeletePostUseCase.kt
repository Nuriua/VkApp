package com.example.vkapp.domain.usecases

import com.example.vkapp.domain.entity.FeedPost
import com.example.vkapp.domain.repository.NewsFeedRepository
import javax.inject.Inject

class DeletePostUseCase @Inject constructor(
    private val repository: NewsFeedRepository
) {

    suspend operator fun invoke(feedPost: FeedPost) {
        repository.changeLikeStatus(feedPost)
    }
}