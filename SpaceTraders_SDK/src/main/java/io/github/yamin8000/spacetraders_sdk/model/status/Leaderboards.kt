package io.github.yamin8000.spacetraders_sdk.model.status

import kotlinx.serialization.Serializable

@Serializable
data class Leaderboards(
    val mostCredits: List<Credit>,
    val mostSubmittedCharts: List<Chart>
)