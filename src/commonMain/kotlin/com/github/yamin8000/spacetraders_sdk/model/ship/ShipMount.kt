package com.github.yamin8000.spacetraders_sdk.model.ship

import kotlinx.serialization.Serializable

/**
 * A mount is installed on the exterior of a ship.
 */
@Serializable
data class ShipMount(
    val symbol: ShipMountSymbol,
    val name: String,
    val description: String?,
    val strength: Int?,
    val deposits: List<Deposit>?
)
