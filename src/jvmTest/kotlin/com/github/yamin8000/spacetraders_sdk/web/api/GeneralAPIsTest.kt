package com.github.yamin8000.spacetraders_sdk.web.api

import com.github.yamin8000.spacetraders_sdk.web.api.GeneralAPIs.status
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

class GeneralAPIsTest : MainTest() {

    @Test
    fun status() {
        runBlocking {
            assertEquals(
                "{\"status\":\"spacetraders is currently online and available to play\"}",
                client.status()
            )
        }
    }
}