package com.github.yamin8000.spacetraders_sdk.web.api

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

class GeneralAPIsTest {

    @Test
    fun status() {
        runBlocking {
            assertEquals(
                "{\"status\":\"spacetraders is currently online and available to play\"}",
                GeneralAPIs.status()
            )
        }
    }

    @Test
    fun register() {
        assertEquals(true, false)
    }
}