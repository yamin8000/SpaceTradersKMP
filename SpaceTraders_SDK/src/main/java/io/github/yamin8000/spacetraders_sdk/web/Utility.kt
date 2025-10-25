package io.github.yamin8000.spacetraders_sdk.web

import io.github.yamin8000.spacetraders_sdk.model.api.ApiResponse
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

internal object Utility {

    internal fun HttpRequestBuilder.pagingRequest(
        limit: Int = Constants.QueryParameter.LIMIT_DEFAULT,
        page: Int = Constants.QueryParameter.PAGE_DEFAULT
    ) = withQueries(
        Constants.QueryParameter.LIMIT to limit,
        Constants.QueryParameter.PAGE to page
    )

    private fun HttpRequestBuilder.withQueries(
        vararg query: Pair<String, Any?>
    ): HttpRequestBuilder {
        query.forEach { parameter(it.first, it.second) }
        return this
    }

    internal suspend inline fun <reified T> HttpResponse.response() = body<ApiResponse<T?>>()
    
    internal operator fun String.div(another: String) = "${this}/${another}"
}
