package com.hananfarizta.marketapp.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hananfarizta.marketapp.R
import com.hananfarizta.marketapp.model.ListProducts
import com.hananfarizta.marketapp.model.dummyListHighlightProducts
import com.hananfarizta.marketapp.ui.theme.MarketAppTheme

@Composable
fun HighlightProductCard(modifier: Modifier = Modifier, listHighlightProducts: ListProducts) {

    Column {
        Image(
            painter = painterResource(id = listHighlightProducts.imgProduct),
            contentDescription = null,
            modifier = modifier
                .size(100.dp)
                .clip(RoundedCornerShape(8.dp))
        )
        Text(
            text = stringResource(id = listHighlightProducts.txtProduct),
            fontSize = 12.sp,
            modifier = modifier.padding(top = 8.dp),
            lineHeight = 14.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun HighlightProductCardPreview() {
    MarketAppTheme {
        HighlightProductCard(
            listHighlightProducts = ListProducts(
                R.drawable.product1,
                R.string.txt_produk1
            )
        )
    }
}

@Composable
fun HighlightProduct(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding( top = 16.dp)
    ) {
        Text(
            text = stringResource(id = R.string.txt_title_highlight),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(start = 16.dp)
        )
        LazyRow(
            modifier = modifier.padding(top = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            itemsIndexed(dummyListHighlightProducts) {index, item ->
                val itemModifier = when (index) {
                    0 -> Modifier.padding(start = 16.dp)
                    dummyListHighlightProducts.size - 1 -> Modifier.padding(end = 16.dp)
                    else -> Modifier
                }

                HighlightProductCard(
                    listHighlightProducts = item,
                    modifier = itemModifier
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HighlightProductPreview() {
    MarketAppTheme {
        HighlightProduct()
    }
}