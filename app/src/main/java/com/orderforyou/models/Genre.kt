package com.orderforyou.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Genre(
    @Json(name = "genres")
    val genres: List<String>? = emptyList()
)