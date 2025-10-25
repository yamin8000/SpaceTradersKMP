package io.github.yamin8000.spacetraders_sdk.model.ship

import kotlinx.serialization.Serializable

@Serializable
data class ShipCargoItem(
    val symbol: String,
    val name: String,
    val description: String,
    val units: Int
)
