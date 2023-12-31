package com.kusitms.presentation.ui.signIn

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kusitms.presentation.R
import com.kusitms.presentation.common.ui.KusitmsMarginHorizontalSpacer
import com.kusitms.presentation.common.ui.theme.KusitmsColorPalette
import com.kusitms.presentation.common.ui.theme.KusitmsTypo
import com.kusitms.presentation.common.ui.theme.kusimsShapes
import com.kusitms.presentation.model.signIn.SignInViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi

@Composable
fun KusitmsLinkCheck(viewModel: SignInViewModel, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .width(290.dp)
            .height(48.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically
    ) {
        LinkCheckBox(viewModel= viewModel, onClick = onClick)
        LinkTextField(viewModel)
    }
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalCoroutinesApi::class)
@Composable
fun LinkTextField(viewModel: SignInViewModel) {
    val textState = viewModel.link.collectAsState()
    val isClicked by remember { mutableStateOf(false) }
    val borderColor = if(isClicked) KusitmsColorPalette.current.Main500 else KusitmsColorPalette.current.Grey700
    Box(modifier = Modifier
        .width(170.dp)
        .height(48.dp)
        .border(width = 1.dp, color = borderColor, shape = RoundedCornerShape(12.dp))
        .background(color = KusitmsColorPalette.current.Grey700, shape = RoundedCornerShape(12.dp)),
    ) {
        KusitmsInputField(
            text = R.string.login_id_validation,
            value = textState.value,
            onValueChange = { viewModel.updateLink(it) },
            modifier = Modifier
                .width(170.dp)
                .height(48.dp)
        )
    }
}
