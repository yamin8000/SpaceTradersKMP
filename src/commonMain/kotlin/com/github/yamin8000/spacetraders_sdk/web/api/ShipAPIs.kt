package com.github.yamin8000.spacetraders_sdk.web.api

import com.github.yamin8000.spacetraders_sdk.model.api.ApiResponse
import com.github.yamin8000.spacetraders_sdk.model.ship.Ship
import com.github.yamin8000.spacetraders_sdk.web.GameClient
import com.github.yamin8000.spacetraders_sdk.web.Utility.response

object ShipAPIs {

    suspend fun GameClient.ships(): ApiResponse<List<Ship>?> = authorizedGet("my/ships").response()
}