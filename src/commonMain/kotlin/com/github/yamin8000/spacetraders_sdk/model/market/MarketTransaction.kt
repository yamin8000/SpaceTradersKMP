package com.github.yamin8000.spacetraders_sdk.model.market

import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class MarketTransaction(
    val waypointSymbol: String,
    val shipSymbol: String,
    val tradeSymbol: String,
    val type: MarketTransactionType,
    val units: Int,
    val pricePerUnit: Int,
    val totalPrice: Int,
    val timestamp: Instant
)
