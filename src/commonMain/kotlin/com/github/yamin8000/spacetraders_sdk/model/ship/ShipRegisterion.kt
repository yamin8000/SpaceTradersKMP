package com.github.yamin8000.spacetraders_sdk.model.ship

import kotlinx.serialization.Serializable

@Serializable
data class ShipRegistration(
    val name: String,
    val factionSymbol: String,
    val role: ShipRole
)
