package com.github.yamin8000.spacetraders_sdk.model.system

abstract class CoreSystem {
    abstract val symbol: String
    abstract val sectorSymbol: String
    abstract val type: SystemType
    abstract val x: Int
    abstract val y: Int
}