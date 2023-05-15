package com.github.yamin8000.spacetraders_sdk.model.general

import kotlinx.serialization.Serializable

@Serializable
data class SpaceTradersResponseMeta(
    val total: Int,
    val page: Int,
    val limit: Int
)
