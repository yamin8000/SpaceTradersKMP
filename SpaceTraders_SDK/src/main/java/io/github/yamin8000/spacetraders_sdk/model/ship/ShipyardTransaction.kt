package io.github.yamin8000.spacetraders_sdk.model.ship

import io.github.yamin8000.spacetraders_sdk.model.utils.InstantSerializer
import java.time.Instant
import kotlinx.serialization.Serializable

@Serializable
data class ShipyardTransaction (
    val waypointSymbol: String,
    val shipSymbol: String,
    val price: Int,
    val agentSymbol: String,
    @Serializable(with = InstantSerializer::class)
    val timestamp: Instant
)
