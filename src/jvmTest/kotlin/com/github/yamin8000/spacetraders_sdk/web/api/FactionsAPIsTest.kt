package com.github.yamin8000.spacetraders_sdk.web.api

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FactionsAPIsTest {

    @Test
    fun factions() {
        runBlocking {
            assertEquals(7, FactionsAPIs.factions().data.size)
        }
    }

    @Test
    fun getFaction() {
        runBlocking {
            assertEquals("COSMIC", FactionsAPIs.getFaction("COSMIC").data.symbol)
        }
    }
}