package com.github.yamin8000.spacetraders_sdk.model.faction

import kotlinx.serialization.Serializable

@Serializable
data class Faction(
    val symbol: FactionSymbol,
    val name: String,
    val description: String,
    val headquarters: String,
    val traits: List<FactionTrait>,
    val isRecruiting: Boolean,
)
