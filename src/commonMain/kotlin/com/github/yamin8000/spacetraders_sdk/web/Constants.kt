package com.github.yamin8000.spacetraders_sdk.web

internal object Constants {
    const val BASE = "https://api.spacetraders.io"
    private const val VERSION = "v2"
    const val BASE_URL = "$BASE/$VERSION/"

    object QueryParameter {
        const val LIMIT = "limit"
        const val PAGE = "page"
    }
}