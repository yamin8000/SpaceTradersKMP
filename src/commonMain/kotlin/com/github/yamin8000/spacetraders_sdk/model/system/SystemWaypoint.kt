package com.github.yamin8000.spacetraders_sdk.model.system

import kotlinx.serialization.Serializable

@Serializable
data class SystemWaypoint(
    val symbol: String,
    val type: WaypointType,
    val x: Int,
    val y: Int
)
