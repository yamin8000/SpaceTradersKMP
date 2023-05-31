package com.github.yamin8000.spacetraders_sdk.model.general

import com.github.yamin8000.spacetraders_sdk.model.faction.FactionSymbol

/**
 * @param faction The faction you choose determines your headquarters.
 * @param symbol How other agents will see your ships and information.
 * @param email Your email address. This is used if you reserved your call sign between resets.
 */
data class RegisterRequestBody(
    val faction: FactionSymbol,
    val symbol: String,
    val email: String? = null
)
