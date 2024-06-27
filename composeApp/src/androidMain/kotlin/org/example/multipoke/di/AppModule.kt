package org.example.multipoke.di

import org.example.multipoke.post.PostViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { PostViewModel(get()) }
}