package io.github.yamin8000.spacetraders_sdk.model.market

import io.github.yamin8000.spacetraders_sdk.model.utils.InstantSerializer
import java.time.Instant
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
    @Serializable(with = InstantSerializer::class)
    val timestamp: Instant
)
