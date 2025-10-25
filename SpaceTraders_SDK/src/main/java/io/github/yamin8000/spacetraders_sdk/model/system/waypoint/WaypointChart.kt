package io.github.yamin8000.spacetraders_sdk.model.system.waypoint

import io.github.yamin8000.spacetraders_sdk.model.utils.InstantSerializer
import java.time.Instant
import kotlinx.serialization.Serializable

@Serializable
data class WaypointChart (
    val waypointSymbol: String? = null,
    val submittedBy: String? = null,
    @Serializable(with = InstantSerializer::class)
    val submittedOn: Instant? = null
)
