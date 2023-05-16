package com.github.yamin8000.spacetraders_sdk.web

import io.ktor.client.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*

class GameClient(
    private val baseUrl: String = Constants.BASE_URL,
    private val token: String? = null
) {
    private val _client = HttpClient {
        install(ContentNegotiation) {
            json()
        }
    }

    val client: HttpClient
        get() = _client

    suspend fun get(
        endpoint: String,
        block: HttpRequestBuilder.() -> Unit = { this.method = HttpMethod.Get }
    ) = request(endpoint, block)

    suspend inline fun <reified T> post(
        endpoint: String,
        body: T,
        noinline block: HttpRequestBuilder.() -> Unit = {
            this.method = HttpMethod.Post
            setBody(body)
        }
    ) = request(endpoint, block)

    suspend fun request(
        endpoint: String,
        block: HttpRequestBuilder.() -> Unit = {}
    ) = _client.request("$baseUrl$endpoint", block)

    suspend fun authorizedGet(endpoint: String) = authorizedRequest(endpoint, HttpMethod.Get)

    suspend inline fun <reified T> authorizedPost(
        endpoint: String,
        body: T,
        noinline block: HttpRequestBuilder.() -> Unit = { setBody(body) }
    ) = authorizedRequest(endpoint, HttpMethod.Post, block)

    suspend fun authorizedRequest(
        endpoint: String,
        method: HttpMethod,
        block: HttpRequestBuilder.() -> Unit = {
            this.method = method
            if (token != null)
                bearerAuth(token)
        }
    ) = _client.request("$baseUrl$endpoint", block)
}