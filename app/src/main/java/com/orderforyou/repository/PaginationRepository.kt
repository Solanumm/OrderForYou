package com.orderforyou.repository

import com.orderforyou.datasource.IPaginationDAO
import com.orderforyou.models.Pagination
import com.orderforyou.utils.Resource
import retrofit2.http.Query
import javax.inject.Inject

interface PaginationRepository {


    suspend fun getAllPages(
        @Query("per_page") per_page: Int = 100,
        @Query("page") page: Int = 1
    ): Resource<Pagination>
}

class PaginationRepositoryImp @Inject constructor(
    private val iPaginationDAO: IPaginationDAO
) : PaginationRepository {
    override suspend fun getAllPages(per_page: Int, page: Int): Resource<Pagination> {
        val pages: Pagination
        if (iPaginationDAO.getAllPages(page = page).isSuccessful) {
            pages = iPaginationDAO.getAllPages(page = page).body()!!
            return Resource.Success(pages)

        }else {
            return Resource.Error("Data not fetch")
        }
    }
}