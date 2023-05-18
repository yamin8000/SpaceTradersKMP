package com.github.yamin8000.spacetraders_sdk.model.general

import com.github.yamin8000.spacetraders_sdk.model.Agent
import com.github.yamin8000.spacetraders_sdk.model.Contract
import com.github.yamin8000.spacetraders_sdk.model.ship.Ship
import com.github.yamin8000.spacetraders_sdk.model.faction.Faction
import kotlinx.serialization.Serializable

@Serializable
data class RegisterResponse(
    val agent: Agent,
    val contract: Contract,
    val faction: Faction,
    val ship: Ship,
    val token: String
)