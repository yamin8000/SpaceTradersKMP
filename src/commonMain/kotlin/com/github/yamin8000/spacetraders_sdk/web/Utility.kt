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

    suspend fun HttpClient.post(url: Url, token: String) = authorizedRequest(url, HttpMethod.Post, token)

    suspend fun HttpClient.authorizedRequest(
        url: Url,
        method: HttpMethod,
        token: String,
        block: HttpRequestBuilder.() -> Unit = {
            this.method = method
            headers { append(HttpHeaders.Authorization, "${Constants.BEARER} $token") }
        }
    ) = request(url, block)
}