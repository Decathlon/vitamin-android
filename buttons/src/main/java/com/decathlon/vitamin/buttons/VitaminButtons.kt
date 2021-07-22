package com.decathlon.vitamin.buttons

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.button.MaterialButton

open class VitaminPrimaryButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.materialButtonStyle
) : MaterialButton(context, attrs, defStyleAttr)

open class VitaminPrimaryReversedButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.buttonReverseStyle
) : MaterialButton(context, attrs, defStyleAttr)

open class VitaminConversionButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.buttonConversionStyle
) : MaterialButton(context, attrs, defStyleAttr)

open class VitaminSecondaryButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.buttonSecondary
) : MaterialButton(context, attrs, defStyleAttr)

open class VitaminSecondaryReversedButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.buttonSecondaryReversed
) : MaterialButton(context, attrs, defStyleAttr)

open class VitaminGhostButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.buttonGhost
) : MaterialButton(context, attrs, defStyleAttr)

open class VitaminGhostReversedButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.buttonGhostReversed
) : MaterialButton(context, attrs, defStyleAttr)
