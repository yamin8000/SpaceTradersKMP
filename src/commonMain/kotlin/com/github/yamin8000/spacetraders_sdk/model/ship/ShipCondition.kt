package com.github.yamin8000.spacetraders_sdk.model.ship

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

/**
 * Condition is a range of 0 to 100 where 0 is completely worn out and 100 is brand new.
 */
@Serializable
@JvmInline
value class ShipCondition(val value: Int)