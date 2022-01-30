package com.orderforyou.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.orderforyou.R

@Composable
fun ProductElement(
    itemName: String? = "Not defined",
    itemPrice: String? = "Not defined"
) {


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable {

            }
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {

            Card(
                modifier = Modifier.width(100.dp),
                shape = RoundedCornerShape(15.dp),
                elevation = 5.dp
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally


                ) {
                    Image(
                        painter = painterResource(id = R.drawable.order_for_you),
                        contentDescription = "Category Image"
                    )


                }

            }
            Spacer(modifier = Modifier.padding(8.dp))
            Column(
                verticalArrangement = Arrangement.Center
            ) {
                
                Text(text = itemName!!, style = MaterialTheme.typography.subtitle1.copy(
                    fontSize = 14.sp
                ))
                Spacer(modifier = Modifier.padding(8.dp))
                Text(text = "price: " + itemPrice!!, style = MaterialTheme.typography.body1.copy(
                    fontWeight = FontWeight.Normal
                ))

            }
        }


    }


}