package com.hananfarizta.marketapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.hananfarizta.marketapp.R

data class ListCategory(@DrawableRes val imgTopCategory: Int, @StringRes val txtTopCategory: Int)

val dummyListTopCategory1 = listOf(
    R.drawable.cicil to R.string.txt_credit,
    R.drawable.cod to R.string.txt_cod,
    R.drawable.computer to R.string.txt_laptop,
    R.drawable.promo to R.string.txt_category_discount,
    R.drawable.official to R.string.txt_official_store,
    R.drawable.paylater to R.string.txt_pay_later
).map { ListCategory(it.first, it.second) }

val dummyListTopCategory2 = listOf(
    R.drawable.kategori to R.string.txt_kategori,
    R.drawable.handphone to R.string.txt_handphone,
    R.drawable.topup to R.string.txt_topup,
    R.drawable.elektronik to R.string.txt_elektronik,
    R.drawable.hewan to R.string.txt_hewan,
    R.drawable.travel to R.string.txt_travel,
).map { ListCategory(it.first, it.second) }