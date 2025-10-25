package io.github.yamin8000.spacetraders_sdk.model.contract

import io.github.yamin8000.spacetraders_sdk.model.utils.InstantSerializer
import kotlinx.serialization.Serializable
import java.time.Instant

@Serializable
data class ContractTerms(
    @Serializable(with = InstantSerializer::class)
    val deadline: Instant,
    val payment: ContractPayment,
    val deliver: List<ContractDeliverGood>
)
