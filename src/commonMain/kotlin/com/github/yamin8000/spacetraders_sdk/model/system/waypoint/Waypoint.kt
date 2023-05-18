package com.github.yamin8000.spacetraders_sdk.model.system.waypoint

import com.github.yamin8000.spacetraders_sdk.model.system.SystemFaction
import com.github.yamin8000.spacetraders_sdk.model.system.SystemOrbital
import kotlinx.serialization.Serializable

@Serializable
data class Waypoint(
    override val symbol: String,
    override val type: WaypointType,
    val systemSymbol: String,
    override val x: Int,
    override val y: Int,
    val orbitals: List<SystemOrbital>,
    val faction: SystemFaction,
    val traits: List<WaypointTrait>,
    val chart: WaypointChart
) : CoreWaypoint()
