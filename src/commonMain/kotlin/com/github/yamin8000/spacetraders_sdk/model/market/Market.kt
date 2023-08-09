package com.github.yamin8000.spacetraders_sdk.model.market

import kotlinx.serialization.Serializable

@Serializable
data class Market(
    val symbol: String,
    val exports: List<MarketGood>,
    val imports: List<MarketGood>,
    val exchange: List<MarketGood>,
    val transactions: List<MarketTransaction>,
    val tradeGoods: List<MarketTradeGood>
)
