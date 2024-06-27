package data.network

import io.ktor.client.call.body
import io.ktor.client.request.get

class PostService: ApiPokemon() {
    suspend fun getPosts(): List<PokemonDTO> = client.get {

    }.body()
}