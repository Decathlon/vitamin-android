package com.decathlon.vitamin.prices

import android.content.Context
import android.graphics.Paint
import android.util.AttributeSet
import com.google.android.material.textview.MaterialTextView


open class VitaminPriceDefaultSmall @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.priceDefaultSmall
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceDefaultMedium @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.priceDefaultMedium
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceDefaultLarge @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.priceDefaultLarge
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceAccentSmall @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.priceAccentSmall
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceAccentMedium @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.priceAccentMedium
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceAccentLarge @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.priceAccentLarge
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceAlertSmall @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.priceAlertSmall
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceAlertMedium @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.priceAlertMedium
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceAlertLarge @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.priceAlertLarge
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceStrikethroughSmall @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.priceStrikethroughSmall
) : MaterialTextView(context, attrs, defStyleAttr) {
    init {
        this.paintFlags = Paint.STRIKE_THRU_TEXT_FLAG
    }
}

open class VitaminPriceStrikethroughMedium @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.priceStrikethroughMedium
) : MaterialTextView(context, attrs, defStyleAttr) {
    init {
        this.paintFlags = Paint.STRIKE_THRU_TEXT_FLAG
    }
}

open class VitaminPriceStrikethroughLarge @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.priceStrikethroughLarge
) : MaterialTextView(context, attrs, defStyleAttr) {
    init {
        this.paintFlags = Paint.STRIKE_THRU_TEXT_FLAG
    }
}
