package kz.dev.final_nfactorial_project.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

data class AppTypography(
    val bigTitle: TextStyle,
    val title: TextStyle,
    val headline: TextStyle,
    val body: TextStyle,
    val bodyTiny: TextStyle,
    val caption: TextStyle,
    val captionLess: TextStyle,
    val captionLittle: TextStyle,
)

val appTypography = AppTypography(
    bigTitle = TextStyle(
        fontSize = 23.sp,
        lineHeight = 28.sp,
        fontWeight = FontWeight.Bold,
    ),
    title = TextStyle(
            fontSize = 22.sp,
            lineHeight = 26.sp,
            fontWeight = FontWeight.Bold,
    ),
    headline = TextStyle(
        fontSize = 20.sp,
        lineHeight = 23.sp,
        fontWeight = FontWeight.Bold,
    ),
    body = TextStyle(
        fontSize = 16.sp,
        lineHeight = 19.sp,
        fontWeight = FontWeight.Normal,
    ),
    bodyTiny = TextStyle(
        fontSize = 15.sp,
        lineHeight = 16.sp,
        fontWeight = FontWeight.Normal,
    ),
    caption = TextStyle(
        fontSize = 11.sp,
        lineHeight = 13.sp,
        fontWeight = FontWeight.Normal,
    ),
    captionLess = TextStyle(
        fontSize = 12.sp,
        lineHeight = 13.sp,
        fontWeight = FontWeight.Bold,
    ),
    captionLittle = TextStyle(
        fontSize = 8.sp,
        lineHeight = 12.sp,
        fontWeight = FontWeight.Normal,
    ),
)

val LocalTypography = staticCompositionLocalOf { appTypography }