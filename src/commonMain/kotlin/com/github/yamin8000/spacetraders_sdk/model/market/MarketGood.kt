package com.github.yamin8000.spacetraders_sdk.model.market

import kotlinx.serialization.Serializable

@Serializable
data class MarketGood(
    val symbol: MarketGoodSymbol,
    val name: String,
    val description: String
)
