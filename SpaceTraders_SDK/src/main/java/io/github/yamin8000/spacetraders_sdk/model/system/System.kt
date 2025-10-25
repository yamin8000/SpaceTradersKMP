package io.github.yamin8000.spacetraders_sdk.model.system

import kotlinx.serialization.Serializable

@Serializable
data class System(
    override val symbol: String,
    override val sectorSymbol: String,
    override val type: SystemType,
    override val x: Int,
    override val y: Int,
    val waypoints: List<SystemWaypoint>,
    val factions: List<SystemFaction>
) : CoreSystem()
