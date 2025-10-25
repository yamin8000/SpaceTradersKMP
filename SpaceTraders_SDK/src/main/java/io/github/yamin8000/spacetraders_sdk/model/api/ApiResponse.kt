package io.github.yamin8000.spacetraders_sdk.model.api

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse<T>(
    val data: T? = null,
    val error: ApiError? = null,
    val meta: ApiResponseMeta? = null
)
