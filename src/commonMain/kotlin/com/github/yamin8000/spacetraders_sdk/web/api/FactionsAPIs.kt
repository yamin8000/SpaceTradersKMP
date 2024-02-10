package com.github.yamin8000.spacetraders_sdk.web.api

import com.github.yamin8000.spacetraders_sdk.model.faction.Faction
import com.github.yamin8000.spacetraders_sdk.model.api.ApiResponse
import com.github.yamin8000.spacetraders_sdk.web.Constants
import com.github.yamin8000.spacetraders_sdk.web.GameClient
import com.github.yamin8000.spacetraders_sdk.web.Utility.response
import com.github.yamin8000.spacetraders_sdk.web.Utility.div
import com.github.yamin8000.spacetraders_sdk.web.Utility.pagingRequest

object FactionsAPIs {

    private const val FACTIONS = "factions"

    suspend fun GameClient.factions(
        limit: Int = Constants.QueryParameter.LIMIT_DEFAULT,
        page: Int = Constants.QueryParameter.PAGE_DEFAULT
    ): ApiResponse<List<Faction>?> = get(FACTIONS) { pagingRequest(limit, page) }.response()

    suspend fun GameClient.getFaction(symbol: String): ApiResponse<Faction?> = get(FACTIONS / symbol).response()
}