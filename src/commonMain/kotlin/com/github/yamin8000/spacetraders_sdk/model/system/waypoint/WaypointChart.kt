package com.github.yamin8000.spacetraders_sdk.model.system.waypoint

import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class WaypointChart(
    val waypointSymbol: String? = null,
    val submittedBy: String? = null,
    val submittedOn: Instant? = null
)
