package com.orderforyou.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.orderforyou.R

@Composable
fun ProductElement (
    itemName: String? = "Not defined"
) {


    Box(
        modifier = Modifier
            .width(100.dp)
            .padding(8.dp)
            .clickable {

            }
    ) {

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(15.dp),
            elevation = 5.dp
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally


            ) {
                Image(painter =  painterResource(id = R.drawable.order_for_you), contentDescription = "Category Image")

                Text(text = itemName!!)
            }

        }

    }


}