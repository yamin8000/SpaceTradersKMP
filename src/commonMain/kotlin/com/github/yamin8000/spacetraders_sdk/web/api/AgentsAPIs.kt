package com.github.yamin8000.spacetraders_sdk.web.api

import com.github.yamin8000.spacetraders_sdk.model.Agent
import com.github.yamin8000.spacetraders_sdk.model.general.ApiResponse
import com.github.yamin8000.spacetraders_sdk.web.Constants.BASE_URL
import com.github.yamin8000.spacetraders_sdk.web.Utility.client
import com.github.yamin8000.spacetraders_sdk.web.Utility.get
import io.ktor.client.call.*

object AgentsAPIs {

    suspend fun myAgent(token: String): ApiResponse<Agent> = client.get("${BASE_URL}my/agent", token).body()
}