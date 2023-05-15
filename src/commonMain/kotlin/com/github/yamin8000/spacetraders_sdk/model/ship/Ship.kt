package com.github.yamin8000.spacetraders_sdk.model.ship

import kotlinx.serialization.Serializable

@Serializable
data class Ship(
    val symbol: String,
    val registration: ShipRegistration,
    val nav: ShipNav
)