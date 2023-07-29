package com.github.yamin8000.spacetraders_sdk.model.contract

import kotlinx.serialization.Serializable

@Serializable
data class ContractPayment(
    val onAccepted: Int,
    val onFulfilled: Int
)
