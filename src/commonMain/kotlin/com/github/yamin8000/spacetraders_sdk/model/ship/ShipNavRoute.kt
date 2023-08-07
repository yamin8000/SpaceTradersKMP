package com.github.yamin8000.spacetraders_sdk.model.ship

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
data class ShipNavRoute(
    val destination: ShipNavRouteWaypoint,
    val departure: ShipNavRouteWaypoint,
    val departureTime: LocalDateTime,
    val arrival: LocalDateTime
)