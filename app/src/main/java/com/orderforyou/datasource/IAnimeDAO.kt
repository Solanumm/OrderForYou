package com.orderforyou.datasource

import com.orderforyou.models.AnimeResponse
import com.orderforyou.models.Pagination
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface IAnimeDAO {


    @GET("anime/{id}")
    suspend fun getAnimeById (@Path("id") id: Int = 1): Response<AnimeResponse>

}