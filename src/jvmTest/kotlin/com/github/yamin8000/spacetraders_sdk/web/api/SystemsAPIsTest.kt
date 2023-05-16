package com.github.yamin8000.spacetraders_sdk.web.api

import com.github.yamin8000.spacetraders_sdk.web.api.SystemsAPIs.systems
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SystemsAPIsTest : MainTest() {

    @Test
    fun systems() {
        runBlocking {
            assertEquals("X1-ZA40", client.systems().map { it.symbol }.find { it == "X1-ZA40" })
        }
    }
}