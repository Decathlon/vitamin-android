package com.decathlon.vitamin.checkboxes

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.checkbox.MaterialCheckBox

open class VitaminCheckbox @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnCheckboxStyle
) : MaterialCheckBox(context, attrs, defStyleAttr)
