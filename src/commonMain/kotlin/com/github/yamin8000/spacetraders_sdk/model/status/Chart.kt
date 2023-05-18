package com.github.yamin8000.spacetraders_sdk.model.status

import kotlinx.serialization.Serializable

@Serializable
data class Chart(
    val agentSymbol: String,
    val chartCount: Int
)
