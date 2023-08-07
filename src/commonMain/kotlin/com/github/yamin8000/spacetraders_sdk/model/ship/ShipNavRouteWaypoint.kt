package com.github.yamin8000.spacetraders_sdk.model.ship

import kotlinx.serialization.Serializable

@Serializable
data class ShipNavRouteWaypoint(
    val symbol: String,
    val type: ShipNavRouteWaypointType,
    val systemSymbol: String,
    val x: Int,
    val y: Int
)
