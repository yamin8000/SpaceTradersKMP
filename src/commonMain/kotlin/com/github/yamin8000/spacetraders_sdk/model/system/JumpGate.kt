package com.github.yamin8000.spacetraders_sdk.model.system

import kotlinx.serialization.Serializable

@Serializable
data class JumpGate(
    val jumpRange: Int,
    val factionSymbol: String? = null,
    val connectedSystems: List<ConnectedSystem>
)
