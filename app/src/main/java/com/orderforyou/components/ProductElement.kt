package com.orderforyou.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.glide.rememberGlidePainter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.lang.Exception

@Composable
fun ProductElement(
    animeName: String? = "Not defined",
    year: String? = "Not defined",
    backgroundColor: String? = "#ffffff",
    coverImage: String? = "https://hatrabbits.com/wp-content/uploads/2017/01/random.jpg",
    numberOfEpisodes: String? = "Not Information"



) {
    var color = android.graphics.Color.parseColor("#ffffff")
    runBlocking {
        launch (Dispatchers.IO){
        }

    }


    try {
        color = android.graphics.Color.parseColor(backgroundColor)

    } catch (e: Exception) {

    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable {

            }
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {

            Card(
                modifier = Modifier
                    .background(color = Color.White)
                    .width(100.dp),
                shape = RoundedCornerShape(15.dp),
                elevation = 5.dp
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally


                ) {
                    val isready = rememberGlidePainter(coverImage)




                    Image(
                        modifier = Modifier
                            .background(color = Color(color)),
                        painter = isready ,
                        contentDescription = "Anime  Image",

                    )


                }

            }
            Spacer(modifier = Modifier.padding(8.dp))
            Column(
                verticalArrangement = Arrangement.Center
            ) {

                Text(
                    text = animeName!!, style = MaterialTheme.typography.subtitle1.copy(
                        fontSize = 14.sp
                    )
                )
                Spacer(modifier = Modifier.padding(8.dp))
                Text(
                    text = "Year: " + year!!, style = MaterialTheme.typography.body1.copy(
                        fontWeight = FontWeight.Normal
                    )
                )
                Spacer(modifier = Modifier.padding(8.dp))
                Text(
                    text = "Number of Episodes: " + numberOfEpisodes!!, style = MaterialTheme.typography.body1.copy(
                        fontWeight = FontWeight.Normal
                    )
                )

            }
        }


    }


}