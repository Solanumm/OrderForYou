package com.orderforyou.datasource

import com.orderforyou.models.Pagination
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface IPaginationDAO {

    @GET("anime")
    suspend fun getAllPages (@Query("per_page") per_page: Int = 100, @Query("page") page: Int): Response<Pagination>


}