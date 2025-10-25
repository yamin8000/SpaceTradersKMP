package io.github.yamin8000.spacetraders_sdk.model.ship

import kotlin.time.Instant
import kotlinx.serialization.Serializable
import kotlin.time.ExperimentalTime

@Serializable
data class ShipCooldown @OptIn(ExperimentalTime::class) constructor(
    val shipSymbol: String,
    val totalSeconds: Int,
    val remainingSeconds: Int,
    val expiration: Instant? = null,
)
