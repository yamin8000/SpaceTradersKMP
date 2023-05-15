package com.github.yamin8000.spacetraders_sdk.web.api

import com.github.yamin8000.spacetraders_sdk.model.faction.Faction
import com.github.yamin8000.spacetraders_sdk.model.general.SpaceTradersResponse
import com.github.yamin8000.spacetraders_sdk.web.Constants.BASE_URL
import com.github.yamin8000.spacetraders_sdk.web.Utility.client
import io.ktor.client.call.*
import io.ktor.client.request.*

object FactionsAPIs {

    suspend fun factions(): SpaceTradersResponse<List<Faction>> = client.get("${BASE_URL}factions").body()
}