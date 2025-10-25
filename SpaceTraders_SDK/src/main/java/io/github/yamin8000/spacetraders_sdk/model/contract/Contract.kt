package io.github.yamin8000.spacetraders_sdk.model.contract

import io.github.yamin8000.spacetraders_sdk.model.faction.FactionSymbol
import io.github.yamin8000.spacetraders_sdk.model.utils.InstantSerializer
import kotlinx.serialization.Serializable
import java.time.Instant

@Serializable
data class Contract(
    val id: String,
    val factionSymbol: FactionSymbol,
    val type: ContractType,
    val terms: ContractTerms,
    val accepted: Boolean = false,
    val fulfilled: Boolean = false,
    @Deprecated("Deprecated in favor of deadlineToAccept")
    @Serializable(with = InstantSerializer::class)
    val expiration: Instant,
    @Serializable(with = InstantSerializer::class)
    val deadlineToAccept: Instant,
)