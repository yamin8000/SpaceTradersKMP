package com.github.yamin8000.spacetraders_sdk.web.api

import com.github.yamin8000.spacetraders_sdk.model.faction.Faction
import com.github.yamin8000.spacetraders_sdk.model.general.ApiResponse
import com.github.yamin8000.spacetraders_sdk.web.Constants
import com.github.yamin8000.spacetraders_sdk.web.Constants.BASE_URL
import com.github.yamin8000.spacetraders_sdk.web.Utility.client
import io.ktor.client.call.*
import io.ktor.client.request.*

object FactionsAPIs {

    private const val FACTIONS = "${BASE_URL}factions"

    suspend fun factions(
        limit: Int = 20,
        page: Int = 1
    ): ApiResponse<List<Faction>> = client.get(FACTIONS) {
        parameter(Constants.QueryParameter.LIMIT, limit)
        parameter(Constants.QueryParameter.PAGE, page)
    }.body()

    suspend fun getFaction(symbol: String): ApiResponse<Faction> = client.get("$FACTIONS/$symbol").body()
}