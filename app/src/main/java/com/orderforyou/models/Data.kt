package com.orderforyou.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Data(
    @Json(name = "count")
    val count: Int? = 0,
    @Json(name = "current_page")
    val currentPage: Int? = 0,
    @Json(name = "documents")
    val anime: List<Anime>? = emptyList(),
    @Json(name = "last_page")
    val lastPage: Int? = 0
)