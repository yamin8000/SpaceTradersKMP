package io.github.yamin8000.spacetraders_sdk.model

import io.github.yamin8000.spacetraders_sdk.model.faction.FactionSymbol
import kotlinx.serialization.Serializable

@Serializable
data class RegisterRequest(
    val faction: FactionSymbol,
    val symbol: String,
    val email: String? = null
)
