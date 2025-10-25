package io.github.yamin8000.spacetraders_sdk.model.ship

import kotlin.time.Instant
import kotlinx.serialization.Serializable
import kotlin.time.ExperimentalTime

@Serializable
data class ShipNavRoute @OptIn(ExperimentalTime::class) constructor(
    val departure: ShipNavRouteWaypoint,
    val origin: ShipNavRouteWaypoint,
    val destination: ShipNavRouteWaypoint,
    val arrival: Instant,
    val departureTime: Instant
)