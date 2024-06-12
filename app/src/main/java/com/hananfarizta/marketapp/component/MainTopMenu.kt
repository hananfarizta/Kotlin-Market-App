package com.hananfarizta.marketapp.component


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hananfarizta.marketapp.R
import com.hananfarizta.marketapp.ui.theme.Green
import com.hananfarizta.marketapp.ui.theme.MarketAppTheme

@Composable
fun MainTopMenu(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .padding(bottom = 16.dp)
            .fillMaxWidth()
            .height(IntrinsicSize.Max),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = R.drawable.gopay),
                contentDescription = null,
                modifier = Modifier.height(25.dp)
            )
            Column(
                modifier = Modifier.padding(start = 8.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.txt_dummy_gopay),
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 12.sp,
                )
                Text(
                    text = stringResource(id = R.string.txt_gopay),
                    color = Color.Gray,
                    fontSize = 10.sp
                )
            }
        }
        HorizontalDivider(
            modifier
                .width(1.dp)
                .height(40.dp)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = R.drawable.plus),
                contentDescription = null,
                modifier = Modifier.height(25.dp)
            )
            Column(
                modifier = Modifier.padding(start = 8.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.txt_dummy_discount),
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 12.sp,
                )
                Text(
                    text = stringResource(id = R.string.txt_subscription),
                    color = Green,
                    fontWeight = FontWeight.Bold,
                    fontSize = 10.sp
                )
            }
        }
        HorizontalDivider(
            modifier
                .width(1.dp)
                .height(40.dp)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = R.drawable.rewards),
                contentDescription = null,
                modifier = Modifier.height(25.dp)
            )
            Column(
                modifier = Modifier.padding(start = 8.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.txt_rewards),
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 12.sp,
                )
                Text(
                    text = stringResource(id = R.string.txt_dummy_rewards),
                    color = Color.Gray,
                    fontSize = 10.sp
                )
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun TopMenuPreview() {
    MarketAppTheme {
        MainTopMenu(
        )
    }
}