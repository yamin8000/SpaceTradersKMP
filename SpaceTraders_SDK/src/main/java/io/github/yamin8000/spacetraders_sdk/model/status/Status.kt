package io.github.yamin8000.spacetraders_sdk.model.status

import kotlinx.serialization.Serializable
import java.time.LocalDate

@Serializable
data class Status(
    val status: String,
    val version: String,
    val resetDate: LocalDate,
    val description: String,
    val stats: Map<String, Int>,
    val health: Map<String, String>,
    val leaderboards: Leaderboards,
    val serverResets: ServerResets,
    val announcements: List<Announcement>,
    val links: List<Link>
)