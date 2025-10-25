package io.github.yamin8000.spacetraders_sdk.web.api

import io.github.yamin8000.spacetraders_sdk.model.api.ApiResponse
import io.github.yamin8000.spacetraders_sdk.model.ship.Ship
import io.github.yamin8000.spacetraders_sdk.web.GameClient
import io.github.yamin8000.spacetraders_sdk.web.Utility.response

object ShipAPIs {

    suspend fun GameClient.ships(): ApiResponse<List<Ship>?> = authorizedGet("my/ships").response()
}