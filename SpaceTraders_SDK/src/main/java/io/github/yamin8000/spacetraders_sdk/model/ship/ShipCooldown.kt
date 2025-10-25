package io.github.yamin8000.spacetraders_sdk.model.ship

import io.github.yamin8000.spacetraders_sdk.model.utils.InstantSerializer
import java.time.Instant
import kotlinx.serialization.Serializable

@Serializable
data class ShipCooldown (
    val shipSymbol: String,
    val totalSeconds: Int,
    val remainingSeconds: Int,
    @Serializable(with = InstantSerializer::class)
    val expiration: Instant? = null,
)
