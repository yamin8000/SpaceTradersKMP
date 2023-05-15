package com.github.yamin8000.spacetraders_sdk.model.general

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse<T>(
    val data: T,
    val meta: ApiResponseMeta? = null
)
