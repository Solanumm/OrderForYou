package com.orderforyou.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Descriptions(
    @Json(name = "en")
    val en: Any? = "",
    @Json(name = "it")
    val it: String? = ""

)