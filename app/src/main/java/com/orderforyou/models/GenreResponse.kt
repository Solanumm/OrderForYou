package com.orderforyou.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GenreResponse(
    @Json(name = "data")
    val `data`: Genre? = Genre(),
    @Json(name = "message")
    val message: String? = "",
    @Json(name = "status_code")
    val statusCode: Int? = 0,
    @Json(name = "version")
    val version: String? = ""
)