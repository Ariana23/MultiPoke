package domain.repository

import domain.model.Pokemon

interface PostRepository {
    suspend fun getPosts(): List<Pokemon>
}