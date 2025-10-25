package io.github.yamin8000.spacetraders_sdk.model.ship

import io.github.yamin8000.spacetraders_sdk.model.ship.ShipNavRoute
import io.github.yamin8000.spacetraders_sdk.model.ship.ShipNavStatus
import kotlinx.serialization.Serializable

@Serializable
data class ShipNav(
    val systemSymbol: String,
    val waypointSymbol: String,
    val route: ShipNavRoute,
    val status: ShipNavStatus,
    val flightMode: ShipNavFlightMode = ShipNavFlightMode.CRUISE
)