package com.github.yamin8000.spacetraders_sdk.model.ship

import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
data class ShipNavRoute(
    val departure: ShipNavRouteWaypoint,
    val origin: ShipNavRouteWaypoint,
    val destination: ShipNavRouteWaypoint,
    val arrival: Instant,
    val departureTime: Instant
)