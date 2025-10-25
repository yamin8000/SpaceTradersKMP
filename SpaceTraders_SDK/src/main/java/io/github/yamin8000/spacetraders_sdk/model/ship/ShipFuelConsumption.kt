package io.github.yamin8000.spacetraders_sdk.model.ship

import io.github.yamin8000.spacetraders_sdk.model.utils.InstantSerializer
import java.time.Instant
import kotlinx.serialization.Serializable

@Serializable
data class ShipFuelConsumption (
    val amount: Int,
    @Serializable(with = InstantSerializer::class)
    val timestamp: Instant
)
