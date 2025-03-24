package kz.dev.final_nfactorial_project.registration

sealed class RegistrationEvent {

    data object OnEnterClick: RegistrationEvent()

    data class OnRegistrationClick(val login: String, val password: String): RegistrationEvent()
}