package io.github.yamin8000.spacetraders_sdk.model.ship

import io.github.yamin8000.spacetraders_sdk.model.ship.ShipMountSymbol
import io.github.yamin8000.spacetraders_sdk.model.ship.ShipRequirements
import kotlinx.serialization.Serializable

/**
 * A mount is installed on the exterior of a ship.
 */
@Serializable
data class ShipMount(
    val symbol: ShipMountSymbol,
    val name: String,
    val description: String? = null,
    val strength: Int? = null,
    val deposits: List<Deposit>? = null,
    val requirements: ShipRequirements? = null
)
