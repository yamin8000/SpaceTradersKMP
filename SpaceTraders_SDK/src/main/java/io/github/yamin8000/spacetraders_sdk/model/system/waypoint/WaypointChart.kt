package io.github.yamin8000.spacetraders_sdk.model.system.waypoint

import kotlin.time.Instant
import kotlinx.serialization.Serializable
import kotlin.time.ExperimentalTime

@Serializable
data class WaypointChart @OptIn(ExperimentalTime::class) constructor(
    val waypointSymbol: String? = null,
    val submittedBy: String? = null,
    val submittedOn: Instant? = null
)
