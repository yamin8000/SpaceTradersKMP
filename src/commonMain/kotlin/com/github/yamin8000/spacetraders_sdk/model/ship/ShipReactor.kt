package com.github.yamin8000.spacetraders_sdk.model.ship

import kotlinx.serialization.Serializable

@Serializable
data class ShipReactor(
    val symbol: ShipReactorSymbol,
    val name: String,
    val description: String,
    /**
     * Condition is a range of 0 to 100 where 0 is completely worn out and 100 is brand new.
     */
    val condition: Int,
    val powerOutput: Int,
    val requirements: ShipRequirements
)
