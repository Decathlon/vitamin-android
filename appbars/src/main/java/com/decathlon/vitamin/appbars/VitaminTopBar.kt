package com.decathlon.vitamin.appbars

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.appbar.MaterialToolbar

open class VitaminTopBar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTopBarStyle
) : MaterialToolbar(context, attrs, defStyleAttr) {
    fun setNavigationDrawer() {
        setNavigationIcon(R.drawable.ic_vtmn_menu_line)
    }

    fun setNavigationContext() {
        setNavigationIcon(R.drawable.ic_vtmn_arrow_left_line)
    }
}

open class VitaminSearchTopBar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnSearchTopBarStyle
) : VitaminTopBar(context, attrs, defStyleAttr)
