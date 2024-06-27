package data.repository

import data.network.NetworkDataSource
import data.util.asExternalModel
import domain.model.Pokemon
import domain.repository.PostRepository

class PostRepositoryImpl(
    private val networkDataSource: NetworkDataSource
): PostRepository {
    override suspend fun getPosts(): List<Pokemon> {
        return networkDataSource.getPosts().map {
            it.asExternalModel()
        }
    }
}