package com.github.yamin8000.spacetraders_sdk.model.ship

import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
data class ShipFuelConsumption(
    val amount: Int,
    val timestamp: Instant
)
