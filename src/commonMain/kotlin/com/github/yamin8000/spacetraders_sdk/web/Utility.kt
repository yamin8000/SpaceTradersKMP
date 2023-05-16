package com.github.yamin8000.spacetraders_sdk.web

import com.github.yamin8000.spacetraders_sdk.model.general.ApiResponse
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

object Utility {

    internal fun HttpRequestBuilder.pagingRequest(
        limit: Int = Constants.QueryParameter.LIMIT_DEFAULT,
        page: Int = Constants.QueryParameter.PAGE_DEFAULT
    ): HttpRequestBuilder {
        parameter(Constants.QueryParameter.LIMIT, limit)
        parameter(Constants.QueryParameter.PAGE, page)
        return this
    }

    suspend inline fun <reified T> HttpResponse.data() = body<ApiResponse<T>>().data
}