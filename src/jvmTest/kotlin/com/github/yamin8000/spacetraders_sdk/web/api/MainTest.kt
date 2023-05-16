package com.github.yamin8000.spacetraders_sdk.web.api

import com.github.yamin8000.spacetraders_sdk.web.GameClient

open class MainTest {
    var client = GameClient(token = System.getenv("token"))
}