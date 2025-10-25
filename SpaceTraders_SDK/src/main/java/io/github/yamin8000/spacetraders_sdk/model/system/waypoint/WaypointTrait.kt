package io.github.yamin8000.spacetraders_sdk.model.system.waypoint

import kotlinx.serialization.Serializable

@Serializable
data class WaypointTrait(
    val symbol: WaypointTraitSymbol,
    val name: String,
    val description: String
)
