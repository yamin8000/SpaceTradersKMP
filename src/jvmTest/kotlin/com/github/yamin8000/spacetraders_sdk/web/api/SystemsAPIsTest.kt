package com.github.yamin8000.spacetraders_sdk.web.api

import com.github.yamin8000.spacetraders_sdk.web.api.SystemsAPIs.getSystem
import com.github.yamin8000.spacetraders_sdk.web.api.SystemsAPIs.systems
import com.github.yamin8000.spacetraders_sdk.web.api.SystemsAPIs.waypoints
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

private const val TEST_SYSTEM = "X1-ZA40"

class SystemsAPIsTest : MainTest() {

    @Test
    fun systems() {
        runBlocking {
            assertEquals(TEST_SYSTEM, client.systems().map { it.symbol }.find { it == TEST_SYSTEM })
        }
    }

    @Test
    fun getSystem() {
        runBlocking {
            assertEquals(TEST_SYSTEM, client.getSystem(TEST_SYSTEM).symbol)
        }
    }

    @Test
    fun waypointsWithSystemSymbol() {
        runBlocking {
            assertEquals(TEST_SYSTEM, client.waypoints(TEST_SYSTEM).map { it.systemSymbol }.find { it == TEST_SYSTEM })
        }
    }

    @Test
    fun waypointsWithSystem() {
        runBlocking {
            val system = client.getSystem(TEST_SYSTEM)
            assertEquals(TEST_SYSTEM, client.waypoints(system).map { it.systemSymbol }.find { it == TEST_SYSTEM })
        }
    }
}