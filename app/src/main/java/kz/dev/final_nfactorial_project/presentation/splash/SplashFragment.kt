package kz.dev.final_nfactorial_project.presentation.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.navigation.fragment.NavHostFragment
import kz.dev.final_nfactorial_project.R
import kz.dev.final_nfactorial_project.presentation.common.CommonTopBar
import kz.dev.final_nfactorial_project.ui.theme.AppTheme


class SplashFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = ComposeView(requireContext()).apply {
        val navController = NavHostFragment.findNavController(this@SplashFragment)
        setContent {
            AppTheme {
                AppScreen(showTopBar = false) {
                    SplashScreen {
                        navController.navigate(
                            R.id.authFragment
                        )
                    }
                }
            }
        }
    }

}


@Composable
fun AppScreen(
    showTopBar: Boolean,
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold(
        topBar = {
            if (showTopBar) {
                CommonTopBar(
                    onLogoClick = { /* handle logo clicks if needed */ },
                    onMenuIconClick = { /* handle menu clicks if needed */ }
                )
            }
        }
    ) { innerPadding ->
        // Pass innerPadding to your screen content so it can
        // respect the topBar (if visible)
        content(innerPadding)
    }
}