package kz.dev.final_nfactorial_project.auth.presentation

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kz.dev.final_nfactorial_project.R
import kz.dev.final_nfactorial_project.ui.theme.LocalColors
import kz.dev.final_nfactorial_project.ui.theme.LocalTypography

@Composable
fun AuthScreen(
    state: AuthState,
    onEvent:(AuthEvent) -> Unit,
) {
    var login by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    var loginError by remember { mutableStateOf<String?>(null) }
    var passwordError by remember { mutableStateOf<String?>(null) }

    Column(
        modifier = Modifier
            .safeContentPadding()
            .background(
                LocalColors.current.commonColors
                    .greyWhiter900
            )
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.weight(1f) // Этот блок центрирует контент
        ) {
            Text(
                text = "Войти в аккаунт",
                style = LocalTypography.current.bigTitle,
                modifier = Modifier.padding(bottom = 24.dp)
            )

            Column (
                modifier = Modifier
                    .fillMaxWidth(0.8f) // 50% ширины экрана

            ){
                // Login TextField
                LoginField()
                Spacer(modifier = Modifier.height(15.dp))
                PasswordField()
                Spacer(modifier = Modifier.height(37.dp))
                // "Войти" button
                ButtonSignIn(signIn = { onEvent(AuthEvent.OnEnterClick(login, password)) })
            }
        }

        // "Зарегистрироваться" text
        BottomBlock(onEvent)
    }
}

@Composable
private fun LoginField() {
    var userName by remember {
        mutableStateOf("")
    }
    var focusState by remember {
        mutableStateOf(false)
    }
    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .onFocusChanged { focus ->
                focusState = focus.isFocused
            }
            .border(
                width = 2.dp,
                color = LocalColors.current.commonColors.greySolid,
                shape = RoundedCornerShape(10.dp)
            ),

        colors = TextFieldDefaults.colors(
            cursorColor = if (userName.isNotEmpty()) LocalColors.current.commonColors.textMain
            else LocalColors.current.commonColors.greySolid,
            focusedContainerColor = LocalColors.current.commonColors.white,  // Новый атрибут
            unfocusedContainerColor = LocalColors.current.commonColors.white, // Новый атрибут
            focusedIndicatorColor = Color.Transparent,  // Убираем стандартную линию
            unfocusedIndicatorColor = Color.Transparent

        ),
        textStyle = LocalTypography.current.bodyTiny,
        value = userName,
        onValueChange = {
            userName = it
        },
        placeholder = {
            Text(
                text = "Логин",
                color = LocalColors.current.commonColors.greySolid,
                style = LocalTypography.current.bodyTiny,
                overflow = TextOverflow.Ellipsis
            )
        },
        maxLines = 1,
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = ImeAction.Next // Show "Done" button on keyboard
        ),
        keyboardActions = KeyboardActions(
            onDone = { /* Handle action when "Done" is pressed */ },)

    )
}

@Composable
private fun PasswordField() {
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    var passwordFocus by remember { mutableStateOf(false) }

    TextField(
        value = password,
        onValueChange = { password = it },
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .onFocusChanged { focus ->
                passwordFocus = focus.isFocused
            }
            .border(
                width = 2.dp,
                color = LocalColors.current.commonColors.greySolid,
                shape = RoundedCornerShape(10.dp)
            ),
        placeholder = {
            Text(
                text = stringResource(R.string.password),
                color = LocalColors.current.commonColors.greySolid,
                style = LocalTypography.current.bodyTiny,
                overflow = TextOverflow.Ellipsis
            )
        },
        maxLines = 1,
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password,
            imeAction = ImeAction.Done
        ),
        trailingIcon = {
            if(passwordFocus && password.isNotEmpty()) {
                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    Icon(
                        imageVector = if (passwordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                        contentDescription = if (passwordVisible) "Hide password" else "Show password"
                    )
                }
            }
        },
        colors = TextFieldDefaults.colors(
            cursorColor = if(password.isNotEmpty()) LocalColors.current.commonColors.textMain
            else LocalColors.current.commonColors.greySolid,
            focusedContainerColor = LocalColors.current.commonColors.white,  // Новый атрибут
            unfocusedContainerColor = LocalColors.current.commonColors.white, // Новый атрибут
            focusedIndicatorColor = Color.Transparent,  // Убираем стандартную линию
            unfocusedIndicatorColor = Color.Transparent
        ),
        textStyle = LocalTypography.current.bodyTiny,

    )
}

@Composable
private fun ButtonSignIn(signIn: () -> Unit) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .height(42.dp),
        onClick = {
            signIn()
        },
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = LocalColors.current.commonColors.primary
        ),
    ) {
        Text(
            text = stringResource(R.string.enter),
            color = LocalColors.current.commonColors.white,
            style = LocalTypography.current.bodyTiny,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
private fun BottomBlock(onEvent:(AuthEvent) -> Unit) {
    Row(
        modifier = Modifier
            .padding(bottom = 36.dp)
    ) {
        Text(
            text = stringResource(R.string.not_account),
            color = LocalColors.current.commonColors.greyText,
            style = LocalTypography.current.captionLess
        )
        Spacer(modifier = Modifier.width(5.dp))
        Text(
            modifier = Modifier

                .clickable { onEvent(AuthEvent.OnRegistrationClick) },
            text = stringResource(R.string.registration),
            color = LocalColors.current.commonColors.primary,
            style = LocalTypography.current.captionLess
        )

    }
}
//@Preview(showBackground = true)
//@Composable
//fun Preview() {
//    AuthScreen({_, _ ->}, { })
//
//}