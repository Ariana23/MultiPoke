package data.network

import kotlinx.serialization.SerialName

data class PokemonResults (
    @SerialName("name")
    val name: String,
    @SerialName("url")
    val url: String
)