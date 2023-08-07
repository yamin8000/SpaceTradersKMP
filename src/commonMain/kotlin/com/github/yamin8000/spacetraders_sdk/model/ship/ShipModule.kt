package com.github.yamin8000.spacetraders_sdk.model.ship

import kotlinx.serialization.Serializable

@Serializable
data class ShipModule(
    val symbol: ShipModuleSymbol,
    val capacity: Int?,
    val range: Int?,
    val name: String,
    val description: String,
    val requirements: ShipRequirements
)
