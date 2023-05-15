package io.github.yamin8000.spacetraders_sdk.model

data class Faction(
    val symbol: String,
    val name: String,
    val description: String,
    val headquarters: String,
    val traits: List<FactionTrait>
)
