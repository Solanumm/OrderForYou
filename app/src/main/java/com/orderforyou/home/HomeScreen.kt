package com.orderforyou.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.orderforyou.components.MenuElement
import com.orderforyou.components.ProductElement


@Composable
fun HomeScreen() {

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
                    backgroundColor = Color.Yellow,
                    onClick = {
                          //TODO
                    }) {
                    Icon(
                        imageVector = Icons.Filled.ShoppingCart,
                        contentDescription = "Shopping Cart",
                        modifier = Modifier.background(Color.Yellow)
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
                                MenuElement(category = "Alimentos")
                                MenuElement(category = "Ropa")
                                MenuElement(category = "Ropa")
                                MenuElement(category = "Ropa")
                                MenuElement(category = "Ropa")
                                MenuElement(category = "Ropa")
                                MenuElement(category = "Ropa")
                                MenuElement(category = "Ropa")
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


                            ProductElement()
                            ProductElement()
                            ProductElement()
                            ProductElement()
                            ProductElement()
                            ProductElement()
                            ProductElement()
                            ProductElement()
                            ProductElement()
                            ProductElement()
                            ProductElement()


                        }

                    })

                }

            }
        }
    }
}