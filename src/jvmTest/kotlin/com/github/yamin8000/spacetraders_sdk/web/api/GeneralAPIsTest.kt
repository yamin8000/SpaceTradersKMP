package com.github.yamin8000.spacetraders_sdk.web.api

import com.github.yamin8000.spacetraders_sdk.model.faction.FactionSymbol
import com.github.yamin8000.spacetraders_sdk.model.RegisterRequest
import com.github.yamin8000.spacetraders_sdk.web.api.GeneralAPIs.register
import com.github.yamin8000.spacetraders_sdk.web.api.GeneralAPIs.simpleStatus
import com.github.yamin8000.spacetraders_sdk.web.api.GeneralAPIs.status
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GeneralAPIsTest : MainTest() {

    @Test
    fun simpleStatus() {
        runBlocking {
            assertEquals(
                "{\"status\":\"spacetraders is currently online and available to play\"}",
                client.simpleStatus()
            )
        }
    }

    @Test
    fun status() {
        runBlocking {
            assertEquals("SpaceTraders is currently online and available to play", client.status().status)
        }
    }

    @Test
    fun register() {
        val request = RegisterRequest(
            faction = FactionSymbol.COSMIC,
            symbol = "YS991",
            email = "yamin@yahoo.com"
        )
        runBlocking {
            assertEquals(FactionSymbol.COSMIC, client.register(request).data?.faction?.symbol)
        }
    }
}