package com.github.yamin8000.spacetraders_sdk.web.api

import com.github.yamin8000.spacetraders_sdk.model.faction.Faction
import com.github.yamin8000.spacetraders_sdk.web.Constants
import com.github.yamin8000.spacetraders_sdk.web.GameClient
import com.github.yamin8000.spacetraders_sdk.web.Utility.data
import com.github.yamin8000.spacetraders_sdk.web.Utility.div
import com.github.yamin8000.spacetraders_sdk.web.Utility.pagingRequest

object FactionsAPIs {

    private const val FACTIONS = "factions"

    suspend fun GameClient.factions(
        limit: Int = Constants.QueryParameter.LIMIT_DEFAULT,
        page: Int = Constants.QueryParameter.PAGE_DEFAULT
    ): List<Faction> = get(FACTIONS) { pagingRequest(limit, page) }.data()

    suspend fun GameClient.getFaction(symbol: String): Faction = get(FACTIONS / symbol).data()
}