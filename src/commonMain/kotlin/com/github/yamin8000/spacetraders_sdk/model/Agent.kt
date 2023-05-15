package com.github.yamin8000.spacetraders_sdk.model

import kotlinx.serialization.Serializable

@Serializable
data class Agent(
    val accountId: String,
    val symbol: String,
    val headquarters: String,
    val credits: Int
)