package com.decathlon.vitamin.radiobuttons

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.radiobutton.MaterialRadioButton

open class VitaminRadioButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.radioButtonStyle
) : MaterialRadioButton(context, attrs, defStyleAttr)