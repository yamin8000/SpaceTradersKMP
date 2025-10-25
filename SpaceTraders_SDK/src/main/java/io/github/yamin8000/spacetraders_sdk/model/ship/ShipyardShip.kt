package io.github.yamin8000.spacetraders_sdk.model.ship

import io.github.yamin8000.spacetraders_sdk.model.ship.ShipFrame
import io.github.yamin8000.spacetraders_sdk.model.ship.ShipMount
import io.github.yamin8000.spacetraders_sdk.model.ship.ShipType
import kotlinx.serialization.Serializable

@Serializable
data class ShipyardShip(
    val type: ShipType? = null,
    val name: String,
    val description: String,
    val purchasePrice: Int,
    val frame: ShipFrame,
    val reactor: ShipReactor,
    val engine: ShipEngine,
    val modules: List<ShipModule>,
    val mounts: List<ShipMount>
)
