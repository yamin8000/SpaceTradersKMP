package io.github.yamin8000.spacetraders_sdk.model.contract

import io.github.yamin8000.spacetraders_sdk.model.faction.FactionSymbol
import kotlinx.serialization.Serializable
import kotlin.time.ExperimentalTime
import kotlin.time.Instant

@Serializable
data class Contract @OptIn(ExperimentalTime::class) constructor(
    val id: String,
    val factionSymbol: FactionSymbol,
    val type: ContractType,
    val terms: ContractTerms,
    val accepted: Boolean = false,
    val fulfilled: Boolean = false,
    @Deprecated("Deprecated in favor of deadlineToAccept")
    val expiration: Instant,
    val deadlineToAccept: Instant,
)