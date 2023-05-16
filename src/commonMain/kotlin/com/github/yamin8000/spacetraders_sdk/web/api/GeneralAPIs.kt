package com.github.yamin8000.spacetraders_sdk.web.api

import com.github.yamin8000.spacetraders_sdk.model.general.RegisterRequestBody
import com.github.yamin8000.spacetraders_sdk.model.general.RegisterResponse
import com.github.yamin8000.spacetraders_sdk.web.Constants.BASE
import com.github.yamin8000.spacetraders_sdk.web.GameClient
import com.github.yamin8000.spacetraders_sdk.web.Utility.data
import io.ktor.client.request.*
import io.ktor.client.statement.*

object GeneralAPIs {
    suspend fun GameClient.status() = client.get("${BASE}/game/status").bodyAsText()

    suspend fun GameClient.register(
        registerRequestBody: RegisterRequestBody
    ): RegisterResponse = client.post("${BASE}/register") { setBody(registerRequestBody) }.data()
}