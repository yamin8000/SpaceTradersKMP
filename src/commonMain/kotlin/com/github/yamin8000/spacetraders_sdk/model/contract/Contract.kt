package com.github.yamin8000.spacetraders_sdk.model.contract

import com.github.yamin8000.spacetraders_sdk.model.faction.FactionSymbol
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
data class Contract(
    val id: String,
    val factionSymbol: FactionSymbol,
    val type: ContractType,
    val terms: ContractTerms,
    val accepted: Boolean = false,
    val fulfilled: Boolean = false,
    @Deprecated("Deprecated in favor of deadlineToAccept")
    val expiration: LocalDateTime,
    val deadlineToAccept: LocalDateTime
)