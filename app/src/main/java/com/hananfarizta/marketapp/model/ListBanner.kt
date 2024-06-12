package com.hananfarizta.marketapp.model

import androidx.annotation.DrawableRes
import com.hananfarizta.marketapp.R

data class ListBanner(@DrawableRes val imgProduct: Int)

val dummyListBanner = listOf(
    R.drawable.banner_vertikal1,
    R.drawable.banner_vertikal2,
    R.drawable.banner_vertikal3,
    R.drawable.banner_vertikal4,
    R.drawable.banner_vertikal5,
)