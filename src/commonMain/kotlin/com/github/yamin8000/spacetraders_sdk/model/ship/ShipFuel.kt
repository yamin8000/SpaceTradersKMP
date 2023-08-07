package com.github.yamin8000.spacetraders_sdk.model.ship

import kotlinx.serialization.Serializable

@Serializable
data class ShipFuel(
    val current: Int,
    val capacity: Int,
    val consumed: ShipFuelConsumption?
)
