package com.github.yamin8000.spacetraders_sdk.web.api

import com.github.yamin8000.spacetraders_sdk.model.faction.Faction
import com.github.yamin8000.spacetraders_sdk.model.general.ApiResponse
import com.github.yamin8000.spacetraders_sdk.model.system.System
import com.github.yamin8000.spacetraders_sdk.web.Constants
import com.github.yamin8000.spacetraders_sdk.web.Constants.BASE_URL
import com.github.yamin8000.spacetraders_sdk.web.Utility.client
import com.github.yamin8000.spacetraders_sdk.web.Utility.pagingRequest
import io.ktor.client.call.*
import io.ktor.client.request.*

object SystemsAPIs {

    private const val SYSTEMS = "systems"

    suspend fun systems(
        limit: Int = Constants.QueryParameter.LIMIT_DEFAULT,
        page: Int = Constants.QueryParameter.PAGE_DEFAULT
    ): ApiResponse<List<System>> = client.get("${BASE_URL}${SYSTEMS}") { pagingRequest(limit, page) }.body()
}