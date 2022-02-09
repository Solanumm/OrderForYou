package com.orderforyou.repository

import com.orderforyou.datasource.IAnimeDAO
import com.orderforyou.models.AnimeResponse
import com.orderforyou.utils.Resource
import retrofit2.http.Path
import javax.inject.Inject

interface AnimeRepository {

    suspend fun getAnimeById(@Path("id") id:Int? = 1): Resource <AnimeResponse>


}

class AnimeRepositoryImp @Inject constructor(
    private val iAnimeDAO: IAnimeDAO
): AnimeRepository {
    override suspend fun getAnimeById(id: Int?): Resource<AnimeResponse> {
        val animeResponse: AnimeResponse
        if (iAnimeDAO.getAnimeById().isSuccessful){
            animeResponse = iAnimeDAO.getAnimeById(id = id!!).body()!!
        return Resource.Success(animeResponse)
        }else {
            return Resource.Error("Data don't found")
        }
    }
}