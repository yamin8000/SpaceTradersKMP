package com.github.yamin8000.spacetraders_sdk.model.faction

import kotlinx.serialization.Serializable

@Serializable
data class FactionTrait(
    val symbol: FactionTraitSymbol,
    val name: String,
    val description: String
)