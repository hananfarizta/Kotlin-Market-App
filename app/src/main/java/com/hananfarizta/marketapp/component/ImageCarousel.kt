package com.hananfarizta.marketapp.component

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hananfarizta.marketapp.R
import com.hananfarizta.marketapp.ui.theme.MarketAppTheme
import kotlinx.coroutines.delay

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImageCarousel(
    modifier: Modifier = Modifier
) {
    val images = listOf(
        R.drawable.banner1,
        R.drawable.banner2,
        R.drawable.banner3,
        R.drawable.banner4,
        R.drawable.banner5,
    )

    val pagerState = rememberPagerState(
        pageCount =
        { images.size }
    )
    LaunchedEffect(Unit) {
        while (true) {
            delay(5000)
            val nextPage = (pagerState.currentPage + 1) % pagerState.pageCount
            pagerState.animateScrollToPage(
                page = nextPage,
                animationSpec = tween(
                    durationMillis = 1000 // Adjust the duration as needed
                )
            )
        }
    }

    Box(modifier = modifier.wrapContentSize()) {
        HorizontalPager(
            state = pagerState,
            modifier
                .wrapContentSize()

        ) { currentPage ->
            Card(
                modifier
                    .wrapContentSize(),
                shape = RoundedCornerShape(0.dp),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Image(
                    painter = painterResource(id = images[currentPage]),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = modifier.fillMaxWidth()
                )
            }
        }
        PageIndicator(
            pageCount = images.size,
            currentPage = pagerState.currentPage,
            modifier = Modifier.align(Alignment.BottomStart)
        )
    }

}

@Composable
fun PageIndicator(pageCount: Int, currentPage: Int, modifier: Modifier) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.padding(bottom = 3.dp, start = 10.dp)
    ) {
        repeat(pageCount) {
            IndicatorDots(isSelected = it == currentPage, modifier = modifier)
        }
    }
}

@Composable
fun IndicatorDots(isSelected: Boolean, modifier: Modifier) {
    // Animation for the size of the indicator dot
    val size = animateDpAsState(targetValue = if (isSelected) 25.dp else 10.dp, label = "size")

    // Animation for the sliding effect
    val slideOffset =
        animateFloatAsState(targetValue = if (isSelected) 10f else 0f, label = "slideOffset")

    Box(
        modifier = modifier
            .padding(2.dp)
            .size(size.value, 10.dp)
            .clip(if (isSelected) RoundedCornerShape(50) else CircleShape)
            .background(if (isSelected) Color(0xFFFFFFFF) else Color(0xA8373737))
            .offset(x = slideOffset.value.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun ImageCarouselPreview() {
    MarketAppTheme {
        ImageCarousel()
    }
}