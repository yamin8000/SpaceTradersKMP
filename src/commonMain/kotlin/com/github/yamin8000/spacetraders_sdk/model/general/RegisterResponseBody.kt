package com.github.yamin8000.spacetraders_sdk.model.general

import com.github.yamin8000.spacetraders_sdk.model.Agent
import com.github.yamin8000.spacetraders_sdk.model.Contract
import com.github.yamin8000.spacetraders_sdk.model.ship.Ship
import com.github.yamin8000.spacetraders_sdk.model.faction.Faction

data class RegisterResponseBody(
    val data: SpaceTradersResponse<RegisterResponseInternalBody>,
    val meta: SpaceTradersResponseMeta
)

data class RegisterResponseInternalBody(
    val agent: Agent,
    val contract: Contract,
    val faction: Faction,
    val ship: Ship,
    val token: String
)