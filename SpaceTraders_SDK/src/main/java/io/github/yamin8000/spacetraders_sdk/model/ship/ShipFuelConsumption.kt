package io.github.yamin8000.spacetraders_sdk.model.ship

import kotlin.time.Instant
import kotlinx.serialization.Serializable
import kotlin.time.ExperimentalTime

@Serializable
data class ShipFuelConsumption @OptIn(ExperimentalTime::class) constructor(
    val amount: Int,
    val timestamp: Instant
)
