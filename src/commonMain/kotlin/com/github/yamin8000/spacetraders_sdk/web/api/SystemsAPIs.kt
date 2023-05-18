package com.github.yamin8000.spacetraders_sdk.web.api

import com.github.yamin8000.spacetraders_sdk.model.system.System
import com.github.yamin8000.spacetraders_sdk.model.system.waypoint.Waypoint
import com.github.yamin8000.spacetraders_sdk.web.Constants
import com.github.yamin8000.spacetraders_sdk.web.GameClient
import com.github.yamin8000.spacetraders_sdk.web.Utility.data
import com.github.yamin8000.spacetraders_sdk.web.Utility.pagingRequest

object SystemsAPIs {

    private const val SYSTEMS = "systems"

    suspend fun GameClient.systems(
        limit: Int = Constants.QueryParameter.LIMIT_DEFAULT,
        page: Int = Constants.QueryParameter.PAGE_DEFAULT
    ): List<System> = get(SYSTEMS) { pagingRequest(limit, page) }.data()

    suspend fun GameClient.getSystem(systemSymbol: String): System = get("${SYSTEMS}/$systemSymbol").data()

    suspend fun GameClient.waypoints(systemSymbol: String): List<Waypoint> {
        return get("${SYSTEMS}/$systemSymbol/waypoints").data()
    }

    suspend fun GameClient.waypoints(system: System): List<Waypoint> = waypoints(system.symbol)
}