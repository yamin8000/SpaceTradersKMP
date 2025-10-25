package io.github.yamin8000.spacetraders_sdk.model.status

import io.github.yamin8000.spacetraders_sdk.model.utils.InstantSerializer
import java.time.Instant
import kotlinx.serialization.Serializable

@Serializable
data class ServerResets (
    @Serializable(with = InstantSerializer::class)
    val next: Instant,
    val frequency: String
)
