package kz.dev.final_nfactorial_project.registration

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.NavHostFragment
import kz.dev.final_nfactorial_project.R
import kz.dev.final_nfactorial_project.auth.presentation.AuthScreen
import kz.dev.final_nfactorial_project.auth.presentation.AuthViewModel
import kz.dev.final_nfactorial_project.presentation.splash.AppScreen
import kz.dev.final_nfactorial_project.ui.theme.AppTheme


class RegistrationFragment : Fragment() {

    private val viewModel: RegistrationViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    )= ComposeView(requireContext()).apply {
        val navController = NavHostFragment.findNavController(this@RegistrationFragment)
        setContent {
            AppTheme {
                AppScreen(showTopBar = true) {
                    RegistrationScreen(
                        state = viewModel.registrationState,
                        onEvent = { event-> viewModel.dispatch(event, navController) }
                    )
                }
            }
        }
    }

}