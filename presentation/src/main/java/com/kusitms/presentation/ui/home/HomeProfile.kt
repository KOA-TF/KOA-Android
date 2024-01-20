package com.kusitms.presentation.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kusitms.domain.model.profile.ProfileModel
import com.kusitms.presentation.R
import com.kusitms.presentation.common.ui.theme.KusitmsColorPalette
import com.kusitms.presentation.common.ui.theme.KusitmsTypo

@Composable
fun HomeProfile(
    profile: ProfileModel,
    modifier: Modifier = Modifier,
    onClickProfile: () -> Unit,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 20.dp), shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(
            containerColor = KusitmsColorPalette.current.Grey800,
        )
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .padding(vertical = 20.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
            ) {
                Row {
                    Text(
                        text = stringResource(R.string.home_profile),
                        style = KusitmsTypo.current.Text_Semibold,
                        color = KusitmsColorPalette.current.White
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Image(
                        painter = painterResource(id = R.drawable.ic_hello_emoji),
                        contentDescription = stringResource(id = R.string.home_ic_hello),
                    )
                }
                Text(
                    text = stringResource(R.string.home_profile_part),
                    style = KusitmsTypo.current.Text_Medium,
                    color = KusitmsColorPalette.current.Grey400,
                )
            }
            Card(
                modifier = Modifier
                    .width(75.dp)
                    .height(92.dp)
                    .padding(vertical = 16.dp)
                    .clickable { },
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(
                    containerColor = KusitmsColorPalette.current.Grey600,
                ),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = stringResource(R.string.home_profile_mine),
                        style = KusitmsTypo.current.Caption1,
                        color = KusitmsColorPalette.current.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun HomeProfilePreview() {
    HomeProfile(
        profile = ProfileModel(),
        modifier = Modifier,
        onClickProfile = {}
    )
}