package com.kusitms.presentation.model.setting

import androidx.compose.ui.platform.UriHandler
import androidx.lifecycle.ViewModel
import androidx.navigation.NavHostController
import com.kusitms.presentation.navigation.NavRoutes
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject


@HiltViewModel
class SettingViewModel @Inject constructor(): ViewModel() {
    private val _alarmState = MutableStateFlow(false)
    val alarmState: StateFlow<Boolean> = _alarmState.asStateFlow()

    fun onToggleChange(newToggleState: Boolean) {
        _alarmState.value = newToggleState
    }

}
data class SettingUiModel(
    val title: String,
    val url: String = "",
    val onClick: () -> Unit = {}
)

fun getNonMemberSetting(navController: NavHostController): List<SettingUiModel> {
    return listOf(
        SettingUiModel(title = "개인정보 처리 방침", url = "https://sheer-billboard-d63.notion.site/KUSITMS-9e6619383bcd4ce68b6ba4b2b6ef0d40?pvs=4"),
        SettingUiModel(title = "서비스 이용약관", url = "https://sheer-billboard-d63.notion.site/24a4639559d4433cb89c8f1abb889726?pvs=4"),
        SettingUiModel(title = "로그인", onClick = { backToLogin(navController) })
    )
}

fun getMemberSetting(navController: NavHostController): List<SettingUiModel> {
    return listOf(
        SettingUiModel(title = "개인정보 처리 방침", url = "https://sheer-billboard-d63.notion.site/KUSITMS-9e6619383bcd4ce68b6ba4b2b6ef0d40?pvs=4"),
        SettingUiModel(title = "서비스 이용약관", url = "https://sheer-billboard-d63.notion.site/24a4639559d4433cb89c8f1abb889726?pvs=4"),
        SettingUiModel(title = "비밀번호 변경", onClick = { goToSetPw(navController) }),
        SettingUiModel(title = "로그아웃", onClick = { backToLogin(navController) }),
        SettingUiModel(title = "회원탈퇴", onClick = { backToLogin(navController) })
    )
}

fun openUriSetting(url: String, uriHandler: UriHandler) {
    if(url.isNotEmpty()) {
        uriHandler.openUri(url)
    }
}

fun backToLogin(navController: NavHostController) {
    navController.navigate(NavRoutes.LogInScreen.route)
}

fun goToSetPw(navController: NavHostController) {
    navController.navigate(NavRoutes.FindPwMemberCurrent.route)
}