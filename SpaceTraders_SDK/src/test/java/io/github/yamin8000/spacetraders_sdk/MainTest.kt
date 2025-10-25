package io.github.yamin8000.spacetraders_sdk

import io.github.yamin8000.spacetraders_sdk.web.GameClient

open class MainTest {
    var client = GameClient(
        //baseApiUrl = "https://spacetraders.yamins.workers.dev/",
        token = System.getenv("token")
    )
}