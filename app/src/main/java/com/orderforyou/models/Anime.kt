package com.orderforyou.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Anime(
    @Json(name = "anilist_id")
    val anilistId: Int? = 0,
    @Json(name = "banner_image")
    val bannerImage: String? ="",
    @Json(name = "cover_color")
    val coverColor: String? ="",
    @Json(name = "cover_image")
    val coverImage: String? ="",
    @Json(name = "descriptions")
    val descriptions: Descriptions? = Descriptions(),
    @Json(name = "end_date")
    val endDate: String? ="",
    @Json(name = "episode_duration")
    val episodeDuration: Int? = 0,
    @Json(name = "episodes_count")
    val episodesCount: Int? = 0,
    @Json(name = "format")
    val format: Int? = 0,
    @Json(name = "genres")
    val genres: List<String>? = emptyList(),
    @Json(name = "id")
    val id: Int? = 0,
    @Json(name = "mal_id")
    val malId: Int? = 0,
    @Json(name = "prequel")
    val prequel: Int? = 0,
    @Json(name = "score")
    val score: Int? =0,
    @Json(name = "season_period")
    val seasonPeriod: Int? = 0,
    @Json(name = "season_year")
    val seasonYear: Int? = 0,
    @Json(name = "sequel")
    val sequel: Int? = 0,
    @Json(name = "start_date")
    val startDate: String? ="",
    @Json(name = "status")
    val status: Int? = 0,
    @Json(name = "titles")
    val titles: Titles? = Titles(),
    @Json(name = "trailer_url")
    val trailerUrl: String? =""
)