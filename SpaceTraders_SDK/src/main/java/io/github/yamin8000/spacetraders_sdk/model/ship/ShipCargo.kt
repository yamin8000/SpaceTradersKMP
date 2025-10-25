package io.github.yamin8000.spacetraders_sdk.model.ship

import io.github.yamin8000.spacetraders_sdk.model.ship.ShipCargoItem
import kotlinx.serialization.Serializable

@Serializable
data class ShipCargo(
    val capacity: Int,
    val units: Int,
    val inventory: List<ShipCargoItem>
)
