package com.decathlon.vitamin.buttons

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.button.MaterialButton

@Deprecated(
    message = "This button is deprecated",
    replaceWith = ReplaceWith("VitaminPrimaryMediumButton")
)
open class VitaminPrimaryButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminPrimaryMediumButton(context, attrs)

open class VitaminPrimaryMediumButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnButtonPrimaryMediumStyle
) : MaterialButton(context, attrs, defStyleAttr)

open class VitaminPrimaryLargeButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnButtonPrimaryLargeStyle
) : MaterialButton(context, attrs, defStyleAttr)

@Deprecated(
    message = "This button is deprecated",
    replaceWith = ReplaceWith("VitaminSecondaryMediumButton")
)
open class VitaminSecondaryButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminSecondaryMediumButton(context, attrs)

open class VitaminSecondaryMediumButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnButtonSecondaryMediumStyle
) : MaterialButton(context, attrs, defStyleAttr)

open class VitaminSecondaryLargeButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnButtonSecondaryLargeStyle
) : MaterialButton(context, attrs, defStyleAttr)

open class VitaminTertiaryMediumButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnButtonTertiaryMediumStyle
) : MaterialButton(context, attrs, defStyleAttr)

open class VitaminTertiaryLargeButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnButtonTertiaryLargeStyle
) : MaterialButton(context, attrs, defStyleAttr)

@Deprecated(
    message = "This button is deprecated",
    replaceWith = ReplaceWith("VitaminConversionMediumButton")
)
open class VitaminConversionButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminConversionMediumButton(context, attrs)

open class VitaminConversionMediumButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnButtonConversionMediumStyle
) : MaterialButton(context, attrs, defStyleAttr)

open class VitaminConversionLargeButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnButtonConversionLargeStyle
) : MaterialButton(context, attrs, defStyleAttr)

@Deprecated(
    message = "This button is deprecated",
    replaceWith = ReplaceWith("VitaminPrimaryReversedMediumButton")
)
open class VitaminPrimaryReversedButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminPrimaryReversedMediumButton(context, attrs)

open class VitaminPrimaryReversedMediumButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnButtonPrimaryReversedMediumStyle
) : MaterialButton(context, attrs, defStyleAttr)

open class VitaminPrimaryReversedLargeButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnButtonPrimaryReversedLargeStyle
) : MaterialButton(context, attrs, defStyleAttr)

@Deprecated(
    message = "This button is deprecated",
    replaceWith = ReplaceWith("VitaminGhostMediumButton")
)
open class VitaminGhostButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminGhostMediumButton(context, attrs)

open class VitaminGhostMediumButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnButtonGhostMediumStyle
) : MaterialButton(context, attrs, defStyleAttr)

open class VitaminGhostLargeButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnButtonGhostLargeStyle
) : MaterialButton(context, attrs, defStyleAttr)

@Deprecated(
    message = "This button is deprecated",
    replaceWith = ReplaceWith("VitaminGhostReversedMediumButton")
)
open class VitaminGhostReversedButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminGhostReversedMediumButton(context, attrs)

open class VitaminGhostReversedMediumButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnButtonGhostReversedMediumStyle
) : MaterialButton(context, attrs, defStyleAttr)

open class VitaminGhostReversedLargeButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnButtonGhostReversedLargeStyle
) : MaterialButton(context, attrs, defStyleAttr)
