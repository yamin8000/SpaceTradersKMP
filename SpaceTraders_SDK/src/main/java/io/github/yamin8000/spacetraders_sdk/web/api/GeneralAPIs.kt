package io.github.yamin8000.spacetraders_sdk.web.api

import io.github.yamin8000.spacetraders_sdk.model.api.ApiResponse
import io.github.yamin8000.spacetraders_sdk.model.RegisterRequest
import io.github.yamin8000.spacetraders_sdk.model.RegisterResponse
import io.github.yamin8000.spacetraders_sdk.model.status.Status
import io.github.yamin8000.spacetraders_sdk.web.Constants.BASE
import io.github.yamin8000.spacetraders_sdk.web.Constants.BASE_API_URL
import io.github.yamin8000.spacetraders_sdk.web.GameClient
import io.github.yamin8000.spacetraders_sdk.web.Utility.response
import io.ktor.client.call.*
import io.ktor.client.statement.*

object GeneralAPIs {
    /**
     * Returns the status of the game server.
     */
    suspend fun GameClient.status(): Status = rawRequest(BASE_API_URL).body()

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
    ): ApiResponse<RegisterResponse?> = post("register", registerRequest).response()
}