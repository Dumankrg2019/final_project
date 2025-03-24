package kz.dev.final_nfactorial_project.auth.presentation

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import kz.dev.final_nfactorial_project.R

class AuthViewModel: ViewModel() {

    var authState by mutableStateOf(
        AuthState(success = "", error = "")
    )

    fun dispatch(event: AuthEvent, navController: NavController) {
        when(event) {
            is AuthEvent.OnEnterClick -> {
                Log.e("dd", "click on enter")
            }
            is AuthEvent.OnRegistrationClick -> {
                Log.e("dd", "click on registration")
                navController.navigate(AuthFragmentDirections
                    .actionAuthFragmentToRegistrationFragment()
                )
            }
        }
    }
}