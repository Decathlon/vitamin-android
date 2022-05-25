package com.decathlon.vitamin.switches

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.switchmaterial.SwitchMaterial

open class VitaminSwitch @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnSwitchStyle
) : SwitchMaterial(context, attrs, defStyleAttr)