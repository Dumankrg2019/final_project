package kz.dev.final_nfactorial_project.auth.presentation

sealed class AuthEvent {

    data class OnEnterClick(val login: String, val password: String): AuthEvent()

    data object OnRegistrationClick: AuthEvent()
}