package com.github.yamin8000.spacetraders_sdk.model

data class Faction(
    val symbol: FactionSymbol,
    val name: String,
    val description: String,
    val headquarters: String,
    val traits: List<FactionTrait>
)
