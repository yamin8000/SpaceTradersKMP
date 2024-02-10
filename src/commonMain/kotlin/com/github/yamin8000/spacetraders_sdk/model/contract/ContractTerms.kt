package com.github.yamin8000.spacetraders_sdk.model.contract

import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class ContractTerms(
    val deadline: Instant,
    val payment: ContractPayment,
    val deliver: List<ContractDeliverGood>
)
