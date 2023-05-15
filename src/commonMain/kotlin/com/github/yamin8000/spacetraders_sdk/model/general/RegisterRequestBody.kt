package com.github.yamin8000.spacetraders_sdk.model.general

import com.github.yamin8000.spacetraders_sdk.model.faction.FactionSymbol

/**
 *@param symbol How other agents will see your ships and information.
 *
 * Greater equal than 3 characters and Lesser equal than 14 characters
 */
data class RegisterRequestBody(
    val faction: FactionSymbol,
    val symbol: String,
    val email: String? = null
)
