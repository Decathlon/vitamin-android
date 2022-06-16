package com.decathlon.vitamin.prices

import android.content.Context
import android.text.SpannableString
import android.util.AttributeSet
import com.google.android.material.textview.MaterialTextView
import fondation.extensions.setStrikethrough

open class VitaminPriceDefaultSmall @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceDefaultSmallStyle
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceDefaultMedium @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceDefaultMediumStyle
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceDefaultLarge @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceDefaultLargeStyle
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceAccentSmall @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceAccentSmallStyle
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceAccentMedium @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceAccentMediumStyle
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceAccentLarge @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceAccentLargeStyle
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceAlertSmall @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceAlertSmallStyle
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceAlertMedium @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceAlertMediumStyle
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceAlertLarge @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceAlertLargeStyle
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceStrikethroughSmall @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceStrikethroughSmallStyle
) : MaterialTextView(context, attrs, defStyleAttr) {
    override fun setText(text: CharSequence?, type: BufferType?) {
        super.setText(SpannableString(text).setStrikethrough(), type)
    }
}

open class VitaminPriceStrikethroughMedium @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceStrikethroughMediumStyle
) : MaterialTextView(context, attrs, defStyleAttr) {
    override fun setText(text: CharSequence?, type: BufferType?) {
        super.setText(SpannableString(text).setStrikethrough(), type)
    }
}

open class VitaminPriceStrikethroughLarge @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceStrikethroughLargeStyle
) : MaterialTextView(context, attrs, defStyleAttr) {
    override fun setText(text: CharSequence?, type: BufferType?) {
        super.setText(SpannableString(text).setStrikethrough(), type)
    }
}
