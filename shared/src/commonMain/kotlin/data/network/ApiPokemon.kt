package data.network

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.http.path
import io.ktor.http.takeFrom
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

private const val BASE_URL = "https://pokeapi.co/api/v2/pokemon/?limit=800/"

abstract class ApiPokemon {

    val  client = HttpClient{
      install(ContentNegotiation){
          json(Json {
              ignoreUnknownKeys = true
          })
      }
    }
    fun HttpRequestBuilder.pathUUrl(path: String){
        url{
            takeFrom(BASE_URL)
            path(path)
        }
    }
}