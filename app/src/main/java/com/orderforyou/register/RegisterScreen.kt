package com.orderforyou.register

import android.widget.Space
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import com.orderforyou.R
import com.orderforyou.components.TransaprentTextField

@Composable
fun RegisterScreen(
    navController: NavController
) {
    val email = remember { mutableStateOf("") }
    val nickname = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    val phonoNumber = remember { mutableStateOf("") }
    val firstName = remember { mutableStateOf("") }
    val lastname = remember { mutableStateOf("") }
    var passwordVisibility by remember { mutableStateOf(false) }
    val focusManager = LocalFocusManager.current



    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxSize()
                .background(Color.White),
            contentAlignment = Alignment.TopCenter
        ) {
            Image(
                painterResource(id = R.drawable.logo_registrationpage),
                contentDescription = "hola"
            )
        }

        ConstraintLayout() {

            val (surface, fab) = createRefs()

            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.7f)
                    .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                    .background(MaterialTheme.colors.background)
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom,
                content = {

                    item {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {

                            TransaprentTextField(
                                textFieldValue = email,
                                textlabel = "Email",
                                keyboardType = KeyboardType.Email,
                                keyboardActions = KeyboardActions(
                                    onNext = {
                                        focusManager.moveFocus(FocusDirection.Down)
                                    }
                                ),
                                imeAction = ImeAction.Next
                            )
                            Spacer(modifier = Modifier.padding(8.dp))
                            TransaprentTextField(
                                textFieldValue = nickname,
                                textlabel = "nickName",
                                keyboardType = KeyboardType.Email,
                                keyboardActions = KeyboardActions(
                                    onNext = {
                                        focusManager.moveFocus(FocusDirection.Down)
                                    }
                                ),
                                imeAction = ImeAction.Next
                            )

                            Spacer(modifier = Modifier.padding(8.dp))
                            TransaprentTextField(
                                textFieldValue = firstName,
                                textlabel = "first name",
                                keyboardType = KeyboardType.Email,
                                keyboardActions = KeyboardActions(
                                    onNext = {
                                        focusManager.moveFocus(FocusDirection.Down)
                                    }
                                ),
                                imeAction = ImeAction.Next
                            )
                            Spacer(modifier = Modifier.padding(8.dp))
                            TransaprentTextField(
                                textFieldValue = lastname,
                                textlabel = "last name",
                                keyboardType = KeyboardType.Email,
                                keyboardActions = KeyboardActions(
                                    onNext = {
                                        focusManager.moveFocus(FocusDirection.Down)
                                    }
                                ),
                                imeAction = ImeAction.Next
                            )

                            Spacer(modifier = Modifier.padding(8.dp))

                            TransaprentTextField(
                                textFieldValue = password,
                                textlabel = "password",
                                keyboardType = KeyboardType.Email,
                                keyboardActions = KeyboardActions(
                                    onNext = {
                                        focusManager.moveFocus(FocusDirection.Down)
                                    }
                                ),
                                imeAction = ImeAction.Next,
                                trailingIcon = {
                                    IconButton(onClick = {
                                        passwordVisibility = !passwordVisibility
                                    }
                                    ) {
                                        Icon(
                                            imageVector = if (passwordVisibility) {
                                                Icons.Default.Visibility

                                            } else {
                                                Icons.Default.VisibilityOff
                                            },
                                            contentDescription = "Toggle Password Icon"
                                        )

                                    }
                                },
                                visualTransformation = if (passwordVisibility) {
                                    VisualTransformation.None
                                } else {
                                    PasswordVisualTransformation()
                                }

                            )

                            Spacer(modifier = Modifier.padding(8.dp))
                            val repeatedPassword = remember { mutableStateOf("") }
                            TransaprentTextField(
                                textFieldValue = repeatedPassword,
                                textlabel = " repeat password",
                                keyboardType = KeyboardType.Email,
                                keyboardActions = KeyboardActions(
                                    onNext = {
                                        focusManager.moveFocus(FocusDirection.Down)
                                    }
                                ),
                                imeAction = ImeAction.Next,
                                trailingIcon = {
                                    IconButton(onClick = {
                                        passwordVisibility = !passwordVisibility
                                    }
                                    ) {
                                        Icon(
                                            imageVector = if (passwordVisibility) {
                                                Icons.Default.Visibility

                                            } else {
                                                Icons.Default.VisibilityOff
                                            },
                                            contentDescription = "Toggle Password Icon"
                                        )

                                    }
                                },
                                visualTransformation = if (passwordVisibility) {
                                    VisualTransformation.None
                                } else {
                                    PasswordVisualTransformation()
                                }

                            )

                            Spacer(modifier = Modifier.padding(8.dp))
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth(0.8f),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Button(
                                    modifier = Modifier
                                        .fillMaxSize(0.7f),
                                    onClick = { /* ... */ },
                                    // Uses ButtonDefaults.ContentPadding by default
                                    contentPadding = PaddingValues(
                                        start = 20.dp,
                                        top = 12.dp,
                                        end = 20.dp,
                                        bottom = 12.dp
                                    )
                                ) {
                                    // Inner content including an icon and a text label
                                    Icon(
                                        Icons.Filled.Favorite,
                                        contentDescription = "Favorite",
                                        modifier = Modifier.size(ButtonDefaults.IconSize)
                                    )
                                    Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                                    Text("Sign Up! (:")
                                }

                                Spacer(modifier = Modifier.size(16.dp))
                                Button(
                                    modifier = Modifier
                                        .fillMaxSize(0.7f),
                                    onClick = { /* ... */ },
                                    // Uses ButtonDefaults.ContentPadding by default
                                    contentPadding = PaddingValues(
                                        start = 20.dp,
                                        top = 12.dp,
                                        end = 20.dp,
                                        bottom = 12.dp
                                    )
                                ) {
                                    // Inner content including an icon and a text label
                                    Icon(
                                        Icons.Filled.Person,
                                        contentDescription = "Favorite",
                                        modifier = Modifier.size(ButtonDefaults.IconSize)
                                    )
                                    Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                                    Text("Login")
                                }
                            }


                        }

                    }


                })

        }

    }


}