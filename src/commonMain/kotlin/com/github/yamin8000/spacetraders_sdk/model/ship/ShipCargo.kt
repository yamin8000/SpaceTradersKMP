package com.github.yamin8000.spacetraders_sdk.model.ship

data class ShipCargo(
    val capacity: Int,
    val units: Int,
    val inventory: List<ShipCargoItem>
)
