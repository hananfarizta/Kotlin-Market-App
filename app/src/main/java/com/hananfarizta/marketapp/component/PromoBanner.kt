package com.hananfarizta.marketapp.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hananfarizta.marketapp.R
import com.hananfarizta.marketapp.model.ListBanner
import com.hananfarizta.marketapp.model.dummyListBanner
import com.hananfarizta.marketapp.ui.theme.MarketAppTheme

@Composable
fun BannerVertical(modifier: Modifier = Modifier, listBanner: ListBanner) {
    Image(
        painter = painterResource(id = listBanner.imgProduct),
        contentDescription = null,
        modifier = modifier
            .height(231.dp)
            .width(132.dp)
            .clip(RoundedCornerShape(8.dp))
    )
}

@Preview
@Composable
private fun BannerVerticalPreview() {
    MarketAppTheme {
        BannerVertical(listBanner = ListBanner(R.drawable.banner_vertikal1))
    }
}

@Composable
fun PromoBanner(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(top = 16.dp, bottom = 16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier
                .fillMaxWidth()
                .padding(end = 16.dp)
        ) {
            Text(
                text = stringResource(id = R.string.txt_title_banner),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier.padding(start = 16.dp)
            )
            Box(
                modifier = modifier
                    .size(35.dp)
                    .clip(CircleShape)
                    .border(0.3.dp, Color.Gray, CircleShape)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowRight,
                    contentDescription = null,
                    modifier = modifier.align(Alignment.Center)
                )
            }
        }
        LazyRow(
            modifier = modifier.padding(top = 10.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            itemsIndexed(dummyListBanner) { index, item ->
                val itemModifier = when (index) {
                    0 -> Modifier.padding(start = 16.dp) // Padding khusus untuk item pertama
                    dummyListBanner.size - 1 -> Modifier.padding(end = 16.dp) // Padding khusus untuk item terakhir
                    else -> Modifier
                }
                BannerVertical(
                    listBanner = ListBanner(item),
                    modifier = itemModifier
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PromoBannerPreview() {
    MarketAppTheme {
        PromoBanner()
    }
}