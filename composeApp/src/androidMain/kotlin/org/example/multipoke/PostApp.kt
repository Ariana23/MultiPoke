package org.example.multipoke

import android.app.Application
import di.getSharedModules
import org.example.multipoke.di.appModule
import org.koin.core.context.startKoin

class PostApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule + getSharedModules())
        }
    }
}