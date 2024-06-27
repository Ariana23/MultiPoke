package domain.model

import data.network.PokemonResults
import kotlinx.serialization.SerialName

data class Pokemon(
    @SerialName("count")
    val count: Int,
    @SerialName("next")
    val next: String,
    @SerialName("previous")
    val previous: String,
    @SerialName("results")
    val results: List<PokemonResults>
)