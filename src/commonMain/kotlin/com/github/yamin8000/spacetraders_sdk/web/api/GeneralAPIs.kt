package com.github.yamin8000.spacetraders_sdk.web.api

import com.github.yamin8000.spacetraders_sdk.model.general.RegisterRequestBody
import com.github.yamin8000.spacetraders_sdk.model.general.RegisterResponseBody
import com.github.yamin8000.spacetraders_sdk.model.general.SpaceTradersResponse
import com.github.yamin8000.spacetraders_sdk.web.Constants.BASE
import com.github.yamin8000.spacetraders_sdk.web.Constants.BASE_URL
import com.github.yamin8000.spacetraders_sdk.web.Utility.client
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

object GeneralAPIs {
    suspend fun status() = client.get("${BASE}/game/status").bodyAsText()

    suspend fun register(
        registerRequestBody: RegisterRequestBody
    ): SpaceTradersResponse<RegisterResponseBody> {
        return client.post("${BASE}register") { setBody(registerRequestBody) }.body()
    }
}