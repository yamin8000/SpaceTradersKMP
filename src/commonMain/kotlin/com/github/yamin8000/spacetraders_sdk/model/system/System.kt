package com.github.yamin8000.spacetraders_sdk.model.system

import kotlinx.serialization.Serializable

@Serializable
data class System(
    val symbol: String,
    val sectorSymbol: String,
    val type: SystemType,
    val x: Int,
    val y: Int,
    val waypoints: List<SystemWaypoint>,
    val factions: List<SystemFaction>
)
