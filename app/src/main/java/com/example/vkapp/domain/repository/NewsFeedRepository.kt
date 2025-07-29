package com.example.vkapp.domain.repository

import com.example.vkapp.domain.entity.FeedPost
import com.example.vkapp.domain.entity.PostComment
import com.example.vkapp.domain.entity.AuthState
import kotlinx.coroutines.flow.*

interface NewsFeedRepository {

    fun getAuthStateFlow(): StateFlow<AuthState>

    fun getRecommendations(): StateFlow<List<FeedPost>>

    fun getComments(feedPost: FeedPost): StateFlow<List<PostComment>>

    suspend fun loadNextData()

    suspend fun checkAuthState()

    suspend fun deletePost(feedPost: FeedPost)

    suspend fun changeLikeStatus(feedPost: FeedPost)
}
