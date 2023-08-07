package com.github.yamin8000.spacetraders_sdk.model.ship

import kotlinx.serialization.Serializable

@Serializable
data class ShipFrame(
    val symbol: ShipFrameSymbol,
    val name: String,
    val description: String,
    val condition: Condition?,
    val moduleSlots: Int,
    val mountingPoints: Int,
    val fuelCapacity: Int,
    val requirements: ShipRequirements
)
