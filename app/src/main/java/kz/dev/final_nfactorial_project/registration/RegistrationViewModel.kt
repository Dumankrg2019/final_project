package kz.dev.final_nfactorial_project.registration

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController

class RegistrationViewModel: ViewModel() {

    var registrationState by mutableStateOf(
        RegistrationState(success = "", error = "")
    )

    fun dispatch(event: RegistrationEvent, navController: NavController) {
        when(event) {
            is RegistrationEvent.OnEnterClick -> {
                Log.e("dd", "click on Enter from reg sreen")
                navController.navigate(RegistrationFragmentDirections
                    .actionRegistrationFragmentToAuthFragment()
                )
            }
            is RegistrationEvent.OnRegistrationClick -> {
                Log.e("dd", "click on Registration from reg sreen")

            }
        }
    }
}