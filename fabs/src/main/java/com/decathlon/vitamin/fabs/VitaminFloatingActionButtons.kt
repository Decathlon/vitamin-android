package com.decathlon.vitamin.fabs

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

open class VitaminFloatingActionButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.floatingActionButtonStyle
) : FloatingActionButton(context, attrs, defStyleAttr)

open class VitaminMiniFloatingActionButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.miniFloatingActionButtonStyle
) : FloatingActionButton(context, attrs, defStyleAttr)

open class VitaminExtendedFloatingActionButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.extendedFloatingActionButtonStyle
) : ExtendedFloatingActionButton(context, attrs, defStyleAttr)
