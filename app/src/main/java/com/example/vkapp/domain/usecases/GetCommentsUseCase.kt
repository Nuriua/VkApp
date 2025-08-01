package com.example.vkapp.domain.usecases

import com.example.vkapp.domain.entity.FeedPost
import com.example.vkapp.domain.entity.PostComment
import com.example.vkapp.domain.repository.NewsFeedRepository
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class GetCommentsUseCase @Inject constructor(
    private val repository: NewsFeedRepository
) {

    operator fun invoke(feedPost: FeedPost): StateFlow<List<PostComment>> {
        return repository.getComments(feedPost)
    }
}
