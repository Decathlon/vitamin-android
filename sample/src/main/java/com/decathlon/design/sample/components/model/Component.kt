package com.decathlon.design.sample.components.model

import androidx.annotation.DrawableRes
import androidx.annotation.IdRes
import androidx.annotation.StringRes

data class Component(
    @StringRes
    val nameRes: Int,
    @DrawableRes
    val imageRes: Int,
    @IdRes
    val navDirection: Int
)