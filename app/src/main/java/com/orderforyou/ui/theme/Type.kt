package com.orderforyou.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.orderforyou.R

// Set of Material typography styles to start with

val Monserrat = FontFamily(
    Font(R.font.montserratblack, FontWeight.Black),
    Font(R.font.montserratbold, FontWeight.Bold),
    Font(R.font.montserratsemibold, FontWeight.SemiBold),
    Font(R.font.montserratextrabold, FontWeight.ExtraBold),
    Font(R.font.montserratextralight,FontWeight.ExtraLight),
    Font(R.font.montserratlight, FontWeight.Light),
    Font(R.font.montserratmediumitalic, FontWeight.Medium),
    Font(R.font.montserratregular, FontWeight.Normal),
    Font(R.font.montserratthin, FontWeight.Thin),

)

val Typography = Typography(

    h1 =TextStyle (
        fontFamily = Monserrat,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
            ),
    h4 = TextStyle (
        fontFamily = Monserrat,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
            ),
    subtitle1 = TextStyle (
        fontFamily = Monserrat,
        fontWeight = FontWeight.Medium,
        fontSize = 22.sp
            ),
    body1 = TextStyle(
        fontFamily = Monserrat,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)