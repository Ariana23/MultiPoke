package data.util

import data.network.PokemonDTO
import domain.model.Pokemon


fun PokemonDTO.asExternalModel() = Pokemon(
    count = count,
    next = next,
    previous = previous,
    results = results
)