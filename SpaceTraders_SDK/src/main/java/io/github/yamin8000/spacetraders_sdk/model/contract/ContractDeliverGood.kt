package io.github.yamin8000.spacetraders_sdk.model.contract

import kotlinx.serialization.Serializable

@Serializable
data class ContractDeliverGood(
    val tradeSymbol: String,
    val destinationSymbol: String,
    val unitsRequired: Int,
    val unitsFulfilled: Int
)
