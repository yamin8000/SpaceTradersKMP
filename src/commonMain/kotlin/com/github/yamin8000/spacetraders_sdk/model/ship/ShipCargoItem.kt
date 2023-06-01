package com.github.yamin8000.spacetraders_sdk.model.ship

import kotlinx.serialization.Serializable

/**
 * The type of cargo item and the number of units.
 */
@Serializable
data class ShipCargoItem(
    val symbol: String,
    val name: String,
    val description: String,
    val units: Int
)
