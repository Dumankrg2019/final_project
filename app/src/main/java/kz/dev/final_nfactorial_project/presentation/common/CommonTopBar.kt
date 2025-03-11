package kz.dev.final_nfactorial_project.presentation.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kz.dev.final_nfactorial_project.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CommonTopBar(
    onLogoClick: () -> Unit = {},
    onMenuIconClick: () -> Unit = {}
) {
    TopAppBar(

        {
            Row(
                modifier = Modifier
                    .padding(top = 7.dp)
                    .fillMaxSize()
                    .padding(vertical = 8.dp, horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Image(
                    painter = painterResource(id = R.drawable.ic_splash_logo), // Replace with your image
                    contentDescription = "App Logo",
                    modifier = Modifier.size(40.dp) // Adjust size as needed
                )

                IconButton(
                    onClick = onMenuIconClick
                ) {
                    Image(
                        modifier = Modifier.size(30.dp, 30.dp),
                        painter = painterResource(id = R.drawable.ic_exit),
                        contentDescription = "Menu Icon"
                    )
                }

            }
        },
        actions = {
            // If you have other actions (e.g. profile icon, settings icon), add them here
        },
    )
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    CommonTopBar()

}