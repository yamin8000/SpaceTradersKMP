package io.github.yamin8000.spacetraders_sdk.model.system.waypoint

abstract class CoreWaypoint {
    abstract val symbol: String
    abstract val type: WaypointType
    abstract val x: Int
    abstract val y: Int
}