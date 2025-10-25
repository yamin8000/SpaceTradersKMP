package io.github.yamin8000.spacetraders_sdk.model.contract

import kotlin.time.Instant
import kotlinx.serialization.Serializable
import kotlin.time.ExperimentalTime

@Serializable
data class ContractTerms @OptIn(ExperimentalTime::class) constructor(
    val deadline: Instant,
    val payment: ContractPayment,
    val deliver: List<ContractDeliverGood>
)
