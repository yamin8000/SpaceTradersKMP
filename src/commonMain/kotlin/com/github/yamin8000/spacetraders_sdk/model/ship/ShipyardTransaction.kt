package com.github.yamin8000.spacetraders_sdk.model.ship

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
data class ShipyardTransaction(
    val waypointSymbol: String,
    val shipSymbol: String,
    val price: Int,
    val agentSymbol: String,
    val timestamp: LocalDateTime
)
