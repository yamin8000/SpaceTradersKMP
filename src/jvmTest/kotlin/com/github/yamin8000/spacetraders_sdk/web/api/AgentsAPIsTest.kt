package com.github.yamin8000.spacetraders_sdk.web.api

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class AgentsAPIsTest {

    @Test
    fun myAgent() {
        runBlocking {
            val token = System.getenv("token")
            assertEquals("YS2", AgentsAPIs.myAgent(token).data.symbol)
        }
    }
}