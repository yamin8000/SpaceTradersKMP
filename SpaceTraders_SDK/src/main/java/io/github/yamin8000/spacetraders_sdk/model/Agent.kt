package io.github.yamin8000.spacetraders_sdk.model

import io.github.yamin8000.spacetraders_sdk.model.faction.FactionSymbol
import kotlinx.serialization.Serializable

@Serializable
data class Agent(
    val accountId: String? = null,
    val symbol: String,
    val headquarters: String,
    val credits: Int,
    val startingFaction: FactionSymbol,
    val shipCount: Int,
)