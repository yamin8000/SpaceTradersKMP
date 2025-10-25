package io.github.yamin8000.spacetraders_sdk.model.status

import kotlin.time.Instant
import kotlinx.serialization.Serializable
import kotlin.time.ExperimentalTime

@Serializable
data class ServerResets @OptIn(ExperimentalTime::class) constructor(
    val next: Instant,
    val frequency: String
)
