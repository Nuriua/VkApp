package com.example.vkapp.presentation.comments

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.vkapp.data.repository.NewsFeedRepository
import com.example.vkapp.domain.FeedPost
import kotlinx.coroutines.flow.map

class CommentsViewModel(
    feedPost: FeedPost,
    application: Application
) : ViewModel() {

    private val repository = NewsFeedRepository(application)

    val screenState = repository.getComments(feedPost)
        .map {
            CommentsScreenState.Comments(
                feedPost = feedPost,
                comments = it
            )
        }
}
