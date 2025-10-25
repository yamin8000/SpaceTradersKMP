package io.github.yamin8000.spacetraders_sdk.model.status

import kotlinx.serialization.Serializable

@Serializable
data class Link(
    val name: String,
    val url: String
)
