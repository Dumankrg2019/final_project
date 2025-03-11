package kz.dev.final_nfactorial_project.presentation.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kz.dev.final_nfactorial_project.R

@Composable
fun  SplashScreen(
    nextScreen: () -> Unit
) {

    LaunchedEffect(Unit) {
        delay(3000)
        nextScreen.invoke()
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE01425)),
        contentAlignment = Alignment.Center
    ) {

        Box(
            modifier = Modifier
                .size(100.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_splash_logo), // Replace with your image
                contentDescription = "App Logo",
                modifier = Modifier.size(80.dp) // Adjust size as needed
            )
        }
    }
}
