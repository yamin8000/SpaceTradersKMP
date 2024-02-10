package com.github.yamin8000.spacetraders_sdk.web.api

import com.github.yamin8000.spacetraders_sdk.model.api.ApiResponse
import com.github.yamin8000.spacetraders_sdk.model.system.System
import com.github.yamin8000.spacetraders_sdk.model.system.waypoint.Waypoint
import com.github.yamin8000.spacetraders_sdk.web.Constants
import com.github.yamin8000.spacetraders_sdk.web.GameClient
import com.github.yamin8000.spacetraders_sdk.web.Utility.response
import com.github.yamin8000.spacetraders_sdk.web.Utility.div
import com.github.yamin8000.spacetraders_sdk.web.Utility.pagingRequest

object SystemsAPIs {

    private const val SYSTEMS = "systems"

    private const val WAYPOINTS = "waypoints"

    suspend fun GameClient.systems(
        limit: Int = Constants.QueryParameter.LIMIT_DEFAULT,
        page: Int = Constants.QueryParameter.PAGE_DEFAULT
    ): ApiResponse<List<System>?> = get(SYSTEMS) { pagingRequest(limit, page) }.response()

    suspend fun GameClient.getSystem(systemSymbol: String): ApiResponse<System?> {
        return get(SYSTEMS / systemSymbol).response()
    }

    suspend fun GameClient.waypoints(systemSymbol: String): ApiResponse<List<Waypoint>?> {
        return get(SYSTEMS / systemSymbol / WAYPOINTS).response()
    }

    suspend fun GameClient.waypoints(system: System): ApiResponse<List<Waypoint>?> = waypoints(system.symbol)

    suspend fun GameClient.getWaypoint(
        systemSymbol: String,
        waypointSymbol: String,
    ): ApiResponse<Waypoint?> = get(SYSTEMS / systemSymbol / WAYPOINTS / waypointSymbol).response()

    suspend fun GameClient.getWaypoint(
        system: System,
        waypointSymbol: String
    ): ApiResponse<Waypoint?> = getWaypoint(system.symbol, waypointSymbol)
}