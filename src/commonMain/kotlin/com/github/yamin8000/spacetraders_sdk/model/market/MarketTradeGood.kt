package com.github.yamin8000.spacetraders_sdk.model.market

import kotlinx.serialization.Serializable

@Serializable
data class MarketTradeGood(
    val symbol: String,
    val tradeVolume: Int,
    val supply: MarketTradeGoodSupply,
    val purchasePrice: Int,
    val sellPrice: Int
)
