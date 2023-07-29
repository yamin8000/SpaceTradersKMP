package com.github.yamin8000.spacetraders_sdk.model.general

import com.github.yamin8000.spacetraders_sdk.model.faction.FactionSymbol

data class RegisterRequest(
    val faction: FactionSymbol,
    val symbol: String,
    val email: String? = null
)
