package com.github.yamin8000.spacetraders_sdk.web.api

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SystemsAPIsTest {

    @Test
    fun systems() {
        runBlocking {
            assertEquals("X1-ZA40", SystemsAPIs.systems().data.map { it.symbol }.find { it == "X1-ZA40" })
        }
    }
}