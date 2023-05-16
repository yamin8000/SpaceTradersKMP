package com.github.yamin8000.spacetraders_sdk.web

import io.ktor.client.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*

object Utility {

    internal val client = HttpClient {
        install(ContentNegotiation) {
            json()
        }
    }

    suspend fun HttpClient.get(url: Url, token: String) = authorizedRequest(url, HttpMethod.Get, token)

    suspend fun HttpClient.get(urlString: String, token: String) = get(Url(urlString), token)

    suspend fun HttpClient.post(url: Url, token: String) = authorizedRequest(url, HttpMethod.Post, token)
    suspend fun HttpClient.post(urlString: String, token: String) = post(Url(urlString), token)

    suspend fun HttpClient.authorizedRequest(
        url: Url,
        method: HttpMethod,
        token: String,
        block: HttpRequestBuilder.() -> Unit = {
            this.method = method
            bearerAuth(token)
        }
    ) = request(url, block)

    internal fun HttpRequestBuilder.pagingRequest(
        limit: Int = Constants.QueryParameter.LIMIT_DEFAULT,
        page: Int = Constants.QueryParameter.PAGE_DEFAULT
    ): HttpRequestBuilder {
        parameter(Constants.QueryParameter.LIMIT, limit)
        parameter(Constants.QueryParameter.PAGE, page)
        return this
    }
}