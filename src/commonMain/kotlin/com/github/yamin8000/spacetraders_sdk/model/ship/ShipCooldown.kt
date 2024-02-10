package com.github.yamin8000.spacetraders_sdk.model.ship

import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class ShipCooldown(
    val shipSymbol: String,
    val totalSeconds: Int,
    val remainingSeconds: Int,
    val expiration: Instant? = null,
)
