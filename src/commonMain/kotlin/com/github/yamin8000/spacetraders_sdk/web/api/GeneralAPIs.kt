package com.github.yamin8000.spacetraders_sdk.web.api

import com.github.yamin8000.spacetraders_sdk.model.general.RegisterRequest
import com.github.yamin8000.spacetraders_sdk.model.general.RegisterResponse
import com.github.yamin8000.spacetraders_sdk.model.status.Status
import com.github.yamin8000.spacetraders_sdk.web.Constants.BASE
import com.github.yamin8000.spacetraders_sdk.web.GameClient
import com.github.yamin8000.spacetraders_sdk.web.Utility.data
import com.github.yamin8000.spacetraders_sdk.web.Utility.div
import io.ktor.client.call.*
import io.ktor.client.statement.*

object GeneralAPIs {
    /**
     * Returns a simple status of the game server.
     */
    suspend fun GameClient.simpleStatus() = rawRequest("$BASE/game/status").bodyAsText()

    /**
     * Returns the status of the game server.
     */
    suspend fun GameClient.status(): Status = rawRequest("$BASE/v2").body()

    /**
     * Creates a new agent and ties it to a temporary Account.
     * The agent symbol is a 3-14 character string that will represent your agent.
     * This symbol will prefix the symbol of every ship you own.
     * Agent symbols will be cast to all uppercase characters.
     *
     * A new agent will be granted an authorization token,
     * a contract with their starting faction,
     * a command ship with a jump drive, and one hundred thousand credits.
     */
    suspend fun GameClient.register(
        registerRequest: RegisterRequest
    ): RegisterResponse = post(BASE / "register", registerRequest).data()
}