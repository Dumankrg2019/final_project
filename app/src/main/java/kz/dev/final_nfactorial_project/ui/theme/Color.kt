package kz.dev.final_nfactorial_project.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val Primary = Color(0xFFDF1323)
val Link = Color(0xFF16A1ED)
val TextMain = Color(0xFF1F1F1F)
val GreyDarker900 = Color(0xFFB2B2B2)
val GreyWhiter900 = Color(0xFFF6F6F6)
val GreySolid= Color(0xFFDBDBDB)
val GreyText= Color(0xFFA9A9A9)
val White = Color(0xFFFFFFFF)

data class Colors(
    val commonColors: CommonColors
)

data class CommonColors(
    val primary: Color,
    val link: Color,
    val textMain: Color,
    val greyDarker900: Color,
    val greyWhiter900: Color,
    val greySolid: Color,
    val greyText: Color,
    val white: Color
)


val appColors = Colors(
    commonColors = CommonColors(
        primary = Color(0xFFDF1323),
        link = Color(0xFF16A1ED),
        textMain = Color(0xFF1F1F1F),
        greyDarker900 = Color(0xFFB2B2B2),
        greyWhiter900 = Color(0xFFF6F6F6),
        greySolid = Color(0xFFDBDBDB),
        greyText = Color(0xFFA9A9A9),
        white = Color(0xFFFFFFFF)
    )
)

internal val LocalColors = staticCompositionLocalOf { appColors }