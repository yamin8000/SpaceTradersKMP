package com.github.yamin8000.spacetraders_sdk.model.system

import kotlinx.serialization.Serializable

@Serializable
data class ConnectedSystem(
    override val symbol: String,
    override val sectorSymbol: String,
    override val type: SystemType,
    val factionSymbol: String? = null,
    override val x: Int,
    override val y: Int,
    val distance: Int
) : CoreSystem()
