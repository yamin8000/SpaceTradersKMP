package com.github.yamin8000.spacetraders_sdk.web.api

import com.github.yamin8000.spacetraders_sdk.model.Agent
import com.github.yamin8000.spacetraders_sdk.model.api.ApiResponse
import com.github.yamin8000.spacetraders_sdk.web.GameClient
import com.github.yamin8000.spacetraders_sdk.web.Utility.div
import com.github.yamin8000.spacetraders_sdk.web.Utility.response

object AgentsAPIs {

    /**
     * Fetch your agent's details.
     */
    suspend fun GameClient.myAgent(): ApiResponse<Agent?> = authorizedGet("my/agent").response()

    suspend fun GameClient.agents(): ApiResponse<List<Agent>?> = get("agents").response()

    suspend fun GameClient.findAgent(agentSymbol: String): ApiResponse<Agent?> = get("agents" / agentSymbol).response()
}