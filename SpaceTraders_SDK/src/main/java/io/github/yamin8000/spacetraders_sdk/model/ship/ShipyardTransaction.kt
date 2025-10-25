package io.github.yamin8000.spacetraders_sdk.model.ship

import kotlin.time.Instant
import kotlinx.serialization.Serializable
import kotlin.time.ExperimentalTime

@Serializable
data class ShipyardTransaction @OptIn(ExperimentalTime::class) constructor(
    val waypointSymbol: String,
    val shipSymbol: String,
    val price: Int,
    val agentSymbol: String,
    val timestamp: Instant
)
