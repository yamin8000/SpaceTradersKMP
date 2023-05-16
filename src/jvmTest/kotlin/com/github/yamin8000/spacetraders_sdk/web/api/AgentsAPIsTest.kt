package com.github.yamin8000.spacetraders_sdk.web.api

import com.github.yamin8000.spacetraders_sdk.web.api.AgentsAPIs.myAgent
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AgentsAPIsTest : MainTest() {

    @Test
    fun myAgent() {
        runBlocking {
            assertEquals("YS2", client.myAgent().symbol)
        }
    }
}