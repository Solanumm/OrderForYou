package com.orderforyou.home

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.fragment.app.FragmentActivity
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.orderforyou.components.MenuElement
import com.orderforyou.components.ProductElement
import com.orderforyou.models.Anime
import com.orderforyou.models.Data
import com.orderforyou.models.GenreResponse
import com.orderforyou.models.Pagination
import com.orderforyou.utils.Constans

@Composable
fun HomeScreen() {

    val viewModel: HomeScreenViewModel = hiltViewModel()

    viewModel.getAllPages()
    var listOfAnimes: Data = Data()
    var anime: Anime
    var ready by remember { mutableStateOf(false) }

    val context = LocalContext.current
    val activity = context as FragmentActivity
    val genres = GenreResponse()

    viewModel.data.observe(
        activity, Observer { it ->
            listOfAnimes = it!!
            if (!it.anime.isNullOrEmpty()) {
                ready = true

            }
        }
    )


    viewModel.anime.observe(
        activity, Observer { it ->
            anime = it.data!!
        }
    )


    if (ready) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),

            ) {

            Scaffold(
                topBar = {
                    Row(

                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .background(Color.White),

                        horizontalArrangement = Arrangement.SpaceAround,
                        verticalAlignment = Alignment.CenterVertically,

                        ) {

                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Menu",
                            modifier = Modifier.clickable(
                                onClick = { //TODO
                                },
                                enabled = false
                            )
                        )
                        Text(text = "Home", style = MaterialTheme.typography.h2)
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = "Menu",
                            modifier = Modifier.clickable(
                                onClick = {
                                    //TODO
                                },
                                enabled = false
                            )
                        )

                    }
                },
                floatingActionButtonPosition = FabPosition.End,
                floatingActionButton = {
                    FloatingActionButton(
                        modifier = Modifier,
                        backgroundColor = MaterialTheme.colors.primary,
                        onClick = {
                            //TODO
                        },
                    ) {

                        Icon(
                            imageVector = Icons.Filled.Add,
                            contentDescription = "plus simbol",
                            modifier = Modifier.background(MaterialTheme.colors.primary)
                        )
                    }
                },
            ) {
                ConstraintLayout {
                    val (topMenu, Products) = createRefs()
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.2f)
                            .constrainAs(topMenu) {

                            }
                    ) {
                        Row(modifier = Modifier.fillMaxWidth()) {
                            LazyRow(content = {

                                item {
                                    for (genre in Constans.GENRES) {
                                        MenuElement(genre)
                                    }
                                }


                            })
                        }
                    }
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.8f)
                            .background(MaterialTheme.colors.background)
                            .constrainAs(Products) {
                                top.linkTo(topMenu.bottom)
                                bottom.linkTo(parent.bottom)
                            },
                        shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),


                        ) {
                        LazyColumn(content = {

                            item {
                                for (anime in listOfAnimes.anime!!) {
                                    ProductElement(
                                       animeName = anime.titles?.en,
                                        year = anime.seasonYear.toString(),
                                        backgroundColor = anime.coverColor,
                                        coverImage = anime.coverImage,
                                        numberOfEpisodes = anime.episodesCount.toString()

                                    )
                                }


                            }

                        })

                    }

                }
            }
        }


    }


}