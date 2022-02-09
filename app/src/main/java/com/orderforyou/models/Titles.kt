package com.orderforyou.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Titles(
    @Json(name = "en")
    val en: String? ="",
    @Json(name = "it")
    val `it`: String? = "",
    @Json(name = "jp")
    val jp: String?= ""
)