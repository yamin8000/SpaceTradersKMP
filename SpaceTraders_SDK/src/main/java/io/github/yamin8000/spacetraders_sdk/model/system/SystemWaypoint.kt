package io.github.yamin8000.spacetraders_sdk.model.system

import io.github.yamin8000.spacetraders_sdk.model.system.waypoint.CoreWaypoint
import io.github.yamin8000.spacetraders_sdk.model.system.waypoint.WaypointType
import kotlinx.serialization.Serializable

@Serializable
data class SystemWaypoint(
    override val symbol: String,
    override val type: WaypointType,
    override val x: Int,
    override val y: Int
) : CoreWaypoint()
