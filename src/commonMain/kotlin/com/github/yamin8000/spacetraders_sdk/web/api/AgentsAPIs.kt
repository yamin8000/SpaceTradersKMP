package com.github.yamin8000.spacetraders_sdk.web.api

import com.github.yamin8000.spacetraders_sdk.model.Agent
import com.github.yamin8000.spacetraders_sdk.web.GameClient
import com.github.yamin8000.spacetraders_sdk.web.Utility.data

object AgentsAPIs {

    /**
     * Fetch your agent's details.
     */
    suspend fun GameClient.myAgent(): Agent = authorizedGet("my/agent").data()
}