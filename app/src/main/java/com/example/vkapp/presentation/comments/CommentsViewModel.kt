package com.example.vkapp.presentation.comments

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.vkapp.data.repository.NewsFeedRepositoryImpl
import com.example.vkapp.domain.entity.FeedPost
import com.example.vkapp.domain.usecases.GetCommentsUseCase
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class CommentsViewModel @Inject constructor(
    private val feedPost: FeedPost,
    private val getCommentsUseCase: GetCommentsUseCase
) : ViewModel() {

    val screenState = getCommentsUseCase(feedPost)
        .map {
            CommentsScreenState.Comments(
                feedPost = feedPost,
                comments = it
            )
        }
}
