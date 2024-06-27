package data.network

import kotlinx.serialization.SerialName

data class PokemonDTO(
    @SerialName("count")
    val count: Int,
    @SerialName("next")
    val next: String,
    @SerialName("previous")
    val previous: String,
    @SerialName("results")
    val results: List<PokemonResults>
)