package com.github.yamin8000.spacetraders_sdk.model.status

import kotlinx.datetime.LocalDate
import kotlinx.serialization.Serializable

@Serializable
data class Status(
    val status: String,
    val version: LocalDate,
    val description: String,
    val stats: Map<String, Int>,
    val leaderboards: Leaderboards,
    val serverResets: ServerResets,
    val announcements: List<Announcement>,
    val links: List<Link>
)