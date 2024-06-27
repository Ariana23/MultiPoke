package di

import data.network.NetworkDataSource
import data.network.PostService
import data.repository.PostRepositoryImpl
import domain.repository.PostRepository
import domain.uses_cases.GetPostsUseCase
import org.koin.dsl.module
import util.provideDispatcher

private val dataModule = module {
    factory { NetworkDataSource(get(), get()) }
    factory { PostService() }
}

private val utilityModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    single<PostRepository> { PostRepositoryImpl(get()) }
    factory { GetPostsUseCase() }
}

private val sharedModule = listOf(domainModule, dataModule, utilityModule)

fun getSharedModules() = sharedModule