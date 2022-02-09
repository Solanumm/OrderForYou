package com.orderforyou.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AnimeResponse(
    @Json(name = "data")
    val data: Anime? = Anime(),
    @Json(name = "message")
    val message: String? = "",
    @Json(name = "status_code")
    val statusCode: Int? = 0,
    @Json(name = "version")
    val version: String? = ""
)