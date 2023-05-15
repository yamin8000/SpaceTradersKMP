package com.github.yamin8000.spacetraders_sdk.web.api

import com.github.yamin8000.spacetraders_sdk.model.faction.Faction
import com.github.yamin8000.spacetraders_sdk.model.general.ApiResponse
import com.github.yamin8000.spacetraders_sdk.web.Constants.BASE_URL
import com.github.yamin8000.spacetraders_sdk.web.Utility.client
import io.ktor.client.call.*
import io.ktor.client.request.*

object FactionsAPIs {

    private const val FACTIONS = "${BASE_URL}factions"

    suspend fun factions(): ApiResponse<List<Faction>> = client.get(FACTIONS).body()

    suspend fun getFaction(symbol: String): ApiResponse<Faction> = client.get("$FACTIONS/$symbol").body()
}