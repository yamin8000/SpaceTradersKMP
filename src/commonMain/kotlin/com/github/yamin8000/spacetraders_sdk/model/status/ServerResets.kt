package com.github.yamin8000.spacetraders_sdk.model.status

import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class ServerResets(
    val next: Instant,
    val frequency: String
)
