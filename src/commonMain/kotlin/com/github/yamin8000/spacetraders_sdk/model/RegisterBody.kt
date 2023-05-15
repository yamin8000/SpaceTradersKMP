package com.github.yamin8000.spacetraders_sdk.model

data class RegisterBody(
    val faction: String,
    val symbol: String,
    val email: String? = null
)
