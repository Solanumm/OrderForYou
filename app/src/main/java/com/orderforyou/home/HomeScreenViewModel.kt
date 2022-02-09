package com.orderforyou.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.orderforyou.models.AnimeResponse
import com.orderforyou.models.Data
import com.orderforyou.models.Pagination
import com.orderforyou.repository.AnimeRepositoryImp
import com.orderforyou.repository.PaginationRepositoryImp
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class HomeScreenViewModel @Inject constructor(
    private val animeRepositoryImp: AnimeRepositoryImp,
    private val paginationRepositoryImp: PaginationRepositoryImp
) : ViewModel() {

    var data = MutableLiveData(Data())
    var anime = MutableLiveData(AnimeResponse())

    val state by lazy { MutableStateFlow(Pagination()) }

    fun getAnimeById (id: Int = 1) {
        viewModelScope.launch(Dispatchers.IO) {
            val animeResponse = animeRepositoryImp.getAnimeById(id = id).data
            anime.postValue(animeResponse)
            if (animeResponse?.data != null){
                anime.postValue(animeResponse)
            }
        }

    }

    fun getAllPages(page: Int = 1) {
        viewModelScope.launch(Dispatchers.IO) {
            val pages = paginationRepositoryImp.getAllPages(page = page).data
            if (pages != null) {
                data.postValue(pages.data)
            }


        }


    }


}