package com.hananfarizta.marketapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hananfarizta.marketapp.component.HighlightProduct
import com.hananfarizta.marketapp.component.ImageCarousel
import com.hananfarizta.marketapp.component.MainCategoryTop
import com.hananfarizta.marketapp.component.MainTopBar
import com.hananfarizta.marketapp.component.MainTopMenu
import com.hananfarizta.marketapp.component.PromoBanner
import com.hananfarizta.marketapp.ui.theme.MarketAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MarketAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MarketApp()
                }
            }
        }
    }
}

@Composable
fun MarketApp(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
    ) {
        MainTopBar()
        MainTopMenu()
        ImageCarousel()
        MainCategoryTop()
        HighlightProduct()
        PromoBanner()
    }
}

@Preview(showBackground = true)
@Composable
fun MarketAppPreview() {
    MarketAppTheme {
        MarketApp()
    }
}

