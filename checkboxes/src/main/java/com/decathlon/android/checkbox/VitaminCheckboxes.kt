package com.decathlon.android.checkbox

import android.content.Context
import android.util.AttributeSet
import com.decathlon.android.checkboxes.R
import com.google.android.material.checkbox.MaterialCheckBox

open class VitaminCheckbox @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.checkboxStyle
) : MaterialCheckBox(context, attrs, defStyleAttr)