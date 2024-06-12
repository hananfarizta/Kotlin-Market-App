package com.hananfarizta.marketapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.hananfarizta.marketapp.R

data class ListProducts(@DrawableRes val imgProduct: Int, @StringRes val txtProduct: Int)

val dummyListHighlightProducts = listOf(
    R.drawable.product1 to R.string.txt_produk1,
    R.drawable.product2 to R.string.txt_produk2,
    R.drawable.product3 to R.string.txt_produk3,
    R.drawable.product4 to R.string.txt_produk4,
    R.drawable.product5 to R.string.txt_produk5,
).map { ListProducts(it.first, it.second) }