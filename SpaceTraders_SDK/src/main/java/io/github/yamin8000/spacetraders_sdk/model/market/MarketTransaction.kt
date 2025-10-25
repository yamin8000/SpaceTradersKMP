package io.github.yamin8000.spacetraders_sdk.model.market

import kotlin.time.Instant
import kotlinx.serialization.Serializable
import kotlin.time.ExperimentalTime

@Serializable
data class MarketTransaction @OptIn(ExperimentalTime::class) constructor(
    val waypointSymbol: String,
    val shipSymbol: String,
    val tradeSymbol: String,
    val type: MarketTransactionType,
    val units: Int,
    val pricePerUnit: Int,
    val totalPrice: Int,
    val timestamp: Instant
)
