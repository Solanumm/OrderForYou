package com.orderforyou.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Login
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.orderforyou.R

@Composable
fun LoginScreen(


) {
    var email = rememberSaveable { mutableStateOf("") }

    var password = rememberSaveable { mutableStateOf("") }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth(),

            painter = painterResource(id = R.drawable.order_for_you),
            contentDescription = "Login Image",
            contentScale = ContentScale.FillWidth

        )
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ) {

            ConstraintLayout() {
                val (surface, fab) = createRefs()



                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(400.dp)
                        .constrainAs(surface) {
                            bottom.linkTo(parent.bottom)
                        },
                    color = MaterialTheme.colors.background,
                    shape = RoundedCornerShape(topEndPercent = 8, topStartPercent = 8)

                ) {
                    Column(
                        Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "Welcome Back", style = MaterialTheme.typography.subtitle1)
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 100.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {

                        OutlinedTextField(
                            value = email.value,
                            onValueChange = { email.value = it },
                            label = { Text("email") },
                            placeholder = { Text(text = "Email") }
                        )

                        OutlinedTextField(
                            value = password.value,
                            onValueChange = { password.value = it },
                            label = { Text("password") },
                            placeholder = { Text(text = "Password") }
                        )
                    }

                }
                
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally) {
                    Button(
                        modifier = Modifier.padding(8.dp),
                        shape = RoundedCornerShape(20.dp),


                        onClick = { /*TODO*/ }) {


                    }
                    //
                }


            }


        }
    }
}
