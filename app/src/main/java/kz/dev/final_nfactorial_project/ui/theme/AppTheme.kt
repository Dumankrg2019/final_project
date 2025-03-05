package kz.dev.final_nfactorial_project.ui.theme

import androidx.compose.foundation.LocalIndication
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun AppTheme(
    content: @Composable () -> Unit,
) {
    val rippleIndication = ripple()
    val typography = appTypography

    CompositionLocalProvider(
        LocalColors provides appColors,
        LocalIndication provides rippleIndication,
        LocalTypography provides typography,
    ) {
        content()
    }
}

object AppTheme {

    val colors: Colors
        @Composable
        get() = appColors

    val fonts: AppTypography
        @Composable
        get() = appTypography

}