package com.github.yamin8000.spacetraders_sdk.web

internal object Constants {
    const val BASE = "https://api.spacetraders.io"
    private const val VERSION = "v2"
    const val BASE_URL = "$BASE/$VERSION/"

    object QueryParameter {
        const val LIMIT = "limit"
        const val LIMIT_DEFAULT = 20
        const val PAGE = "page"
        const val PAGE_DEFAULT = 1
    }
}