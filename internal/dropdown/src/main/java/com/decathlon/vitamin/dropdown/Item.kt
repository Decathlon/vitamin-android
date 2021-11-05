package com.decathlon.vitamin.dropdown

import androidx.annotation.DrawableRes

data class Item(
    @DrawableRes val leftIcon: Int?,
    @DrawableRes val rightIcon: Int?,
    val text: String
) {
    override fun toString(): String = text
}
