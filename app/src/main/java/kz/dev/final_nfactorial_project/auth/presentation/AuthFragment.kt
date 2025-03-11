package kz.dev.final_nfactorial_project.auth.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.navigation.fragment.NavHostFragment
import kz.dev.final_nfactorial_project.R
import kz.dev.final_nfactorial_project.presentation.splash.AppScreen
import kz.dev.final_nfactorial_project.presentation.splash.SplashScreen
import kz.dev.final_nfactorial_project.ui.theme.AppTheme


class AuthFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = ComposeView(requireContext()).apply {
        val navController = NavHostFragment.findNavController(this@AuthFragment)
        setContent {
            AppTheme {
                AppScreen(showTopBar = true) {
                    AuthScreen({  _, _ ->}, {})
                }
            }
        }
    }

}