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
val White = Color(0xFFFFFFFF)

data class Colors(
    val commonColors: CommonColors,
    val brand: BrandColors,
    val element: ElementColors,
    val back: BackColors,
    val icon: IconColors
)

data class CommonColors(
    val primary: Color,
    val link: Color,
    val textMain: Color,
    val greyDarker900: Color,
    val greyWhiter900: Color,
    val white: Color
)

data class BrandColors(
    val primary: Color,
    val secondary: Color
)

data class ElementColors(
    val light: Color,
    val lightAlt: Color,
    val star: Color,
    val back: Color,
    val like: Color,
    val inverse: Color,
    val destructive: Color,
    val destructiveBack: Color
)

data class BackColors(
    val primary: Color,
    val base: Color
)

data class IconColors(
    val secondary: Color,
    val primary: Color,
    val additional: Color,
    val backPrimary: Color,
    val inverse: Color
)

val appColors = Colors(
    commonColors = CommonColors(
        primary = Color(0xFFDF1323),
        link = Color(0xFF16A1ED),
        textMain = Color(0xFF1F1F1F),
        greyDarker900 = Color(0xFFB2B2B2),
        greyWhiter900 = Color(0xFFF6F6F6),
        white = Color(0xFFFFFFFF)
    ),
    brand = BrandColors(
        primary = Color(0xff36ac72),
        secondary = Color(0x36ac721a)
    ),
    element = ElementColors(
        light = Color(0xffd9d9d9),
        lightAlt = Color(0xfff8f8f8),
        star = Color(0xffffc962),
        back = Color(0x1f1f1f0d),
        like = Color(0xffdb414a),
        inverse = Color(0xffffffff),
        destructive = Color(0xffdb414a),
        destructiveBack = Color(0xdb414a),
    ),
    back = BackColors(
        primary = Color(0xffffffff),
        base = Color(0xfff2f1f6)
    ),
    icon = IconColors(
        secondary = Color(0xffa5a5a8),
        primary = Color(0xff1f1f1f),
        additional = Color(0xffdedede),
        backPrimary = Color(0x0d36ac72),
        inverse = Color(0xffffffff)
    )
)

internal val LocalColors = staticCompositionLocalOf { appColors }