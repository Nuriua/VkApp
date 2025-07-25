package com.example.vkapp.presentation.comments

import com.example.vkapp.domain.FeedPost
import com.example.vkapp.domain.PostComment

sealed class CommentsScreenState {

    object Initial : CommentsScreenState()

    data class Comments(
        val feedPost: FeedPost,
        val comments: List<PostComment>
    ) : CommentsScreenState()
}