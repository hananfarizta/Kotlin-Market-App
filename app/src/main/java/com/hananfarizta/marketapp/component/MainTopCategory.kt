package com.hananfarizta.marketapp.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableDefaults
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hananfarizta.marketapp.R
import com.hananfarizta.marketapp.model.ListCategory
import com.hananfarizta.marketapp.model.dummyListTopCategory1
import com.hananfarizta.marketapp.model.dummyListTopCategory2
import com.hananfarizta.marketapp.ui.theme.Grey
import com.hananfarizta.marketapp.ui.theme.MarketAppTheme
import kotlinx.coroutines.launch

@Composable
fun MainTopCategory(modifier: Modifier = Modifier, listTopCategory: ListCategory) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(start = 16.dp, end = 16.dp, top = 5.dp, )
            .width(70.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = modifier
                .height(60.dp)
                .width(60.dp)
                .clip(CircleShape)
                .background(Grey)
        ) {
            Image(
                painter = painterResource(id = listTopCategory.imgTopCategory),
                contentDescription = null,
                modifier = modifier
                    .size(30.dp)
                    .clip(CircleShape)
            )
        }

        Text(
            text = stringResource(id = listTopCategory.txtTopCategory),
            fontSize = 12.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.padding(top = 8.dp),
            lineHeight = 14.sp

        )
    }
}

@Preview
@Composable
fun MainCardCategoryPreview() {
    MarketAppTheme {
        MainTopCategory(listTopCategory = ListCategory(R.drawable.cicil, R.string.txt_cod))
    }
}

@Composable
fun MainCategoryTop(
    modifier: Modifier = Modifier
) {
    val stateRowX = rememberLazyListState() // State for the first Row, X
    val stateRowY = rememberLazyListState() // State for the second Row, Y
    val scope = rememberCoroutineScope()
    val scrollState = rememberScrollableState { delta ->
        scope.launch {
            stateRowX.scrollBy(-delta)
            stateRowY.scrollBy(-delta)
        }
        delta
    }

    Column(
        modifier = modifier
            .padding(top = 18.dp)
            .scrollable(
                scrollState,
                Orientation.Horizontal,
                flingBehavior = ScrollableDefaults.flingBehavior()
            )
    ) {
        LazyRow(
            state = stateRowX,
            userScrollEnabled = false
        ) {
            items(dummyListTopCategory1) {
                MainTopCategory(listTopCategory = it)
            }
        }
        LazyRow(
            state = stateRowY,
            userScrollEnabled = false
        ) {
            items(dummyListTopCategory2) {
                MainTopCategory(listTopCategory = it)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainCategoryTopPreview() {
    MarketAppTheme {
        MainCategoryTop()
    }
}