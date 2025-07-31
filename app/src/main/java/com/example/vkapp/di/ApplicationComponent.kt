package com.example.vkapp.di

import android.content.Context
import com.example.vkapp.domain.entity.FeedPost
import com.example.vkapp.presentation.ViewModelFactory
import com.example.vkapp.presentation.main.MainActivity
import dagger.Component
import dagger.BindsInstance

@ApplicationScope
@Component(
    modules = [
        DataModule::class,
        ViewModelModule::class
    ]
)
interface ApplicationComponent {

    fun getViewModelFactory(): ViewModelFactory

    fun getCommentsScreenComponentFactory(): CommentsScreenComponent.Factory

    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance context: Context
        ): ApplicationComponent
    }
}