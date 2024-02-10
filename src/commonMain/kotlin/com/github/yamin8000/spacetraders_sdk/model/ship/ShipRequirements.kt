package com.github.yamin8000.spacetraders_sdk.model.ship

import kotlinx.serialization.Serializable

@Serializable
data class ShipRequirements(
    val power: Int? = null,
    val crew: Int? = null,
    val slots: Int? = null
)
