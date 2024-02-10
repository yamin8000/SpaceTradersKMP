package com.github.yamin8000.spacetraders_sdk.web.api

import com.github.yamin8000.spacetraders_sdk.web.api.FactionsAPIs.factions
import com.github.yamin8000.spacetraders_sdk.web.api.FactionsAPIs.getFaction
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FactionsAPIsTest : MainTest() {

    @Test
    fun factions() {
        runBlocking {
            assertEquals(1, client.factions(limit = 1).data?.size)
        }
    }

    @Test
    fun getFaction() {
        runBlocking {
            assertEquals("COSMIC", client.getFaction("COSMIC").data?.symbol)
        }
    }
}