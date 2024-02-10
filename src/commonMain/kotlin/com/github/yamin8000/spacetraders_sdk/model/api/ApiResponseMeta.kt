package com.github.yamin8000.spacetraders_sdk.model.api

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponseMeta(
    val total: Int,
    val page: Int,
    val limit: Int
)
