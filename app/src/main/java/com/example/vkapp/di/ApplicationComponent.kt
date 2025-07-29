package com.example.vkapp.di

import android.content.Context
import com.example.vkapp.domain.entity.FeedPost
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

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance feedPost: FeedPost,
        ): ApplicationComponent
    }
}