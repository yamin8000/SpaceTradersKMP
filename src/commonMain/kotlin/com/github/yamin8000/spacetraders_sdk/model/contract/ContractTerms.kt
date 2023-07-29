package com.github.yamin8000.spacetraders_sdk.model.contract

import kotlinx.datetime.LocalDate
import kotlinx.serialization.Serializable

@Serializable
data class ContractTerms(
    val deadline: LocalDate,
    val payment: ContractPayment,
    val deliver: ContractDeliverGood
)
