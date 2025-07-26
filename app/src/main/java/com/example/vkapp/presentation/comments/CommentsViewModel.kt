package com.example.vkapp.presentation.comments

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.vkapp.data.repository.NewsFeedRepositoryImpl
import com.example.vkapp.domain.entity.FeedPost
import com.example.vkapp.domain.usecases.GetCommentsUseCase
import kotlinx.coroutines.flow.map

class CommentsViewModel(
    feedPost: FeedPost,
    application: Application
) : ViewModel() {

    private val repository = NewsFeedRepositoryImpl(application)

    private val getCommentsUseCase = GetCommentsUseCase(repository)

    val screenState = getCommentsUseCase(feedPost)
        .map {
            CommentsScreenState.Comments(
                feedPost = feedPost,
                comments = it
            )
        }
}
