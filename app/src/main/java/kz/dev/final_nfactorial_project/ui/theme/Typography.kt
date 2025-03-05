package kz.dev.final_nfactorial_project.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

data class AppTypography(
    val title: TextStyle,
    val headline: TextStyle,
    val body: TextStyle,
    val caption: TextStyle,
    val captionLittle: TextStyle,
)

val appTypography = AppTypography(
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
    caption = TextStyle(
        fontSize = 11.sp,
        lineHeight = 13.sp,
        fontWeight = FontWeight.Normal,
    ),
    captionLittle = TextStyle(
        fontSize = 8.sp,
        lineHeight = 12.sp,
        fontWeight = FontWeight.Normal,
    ),
)

val LocalTypography = staticCompositionLocalOf { appTypography }