package com.decathlon.vitamin.appbars

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.bottomnavigation.BottomNavigationView

open class VitaminBottomNavigation @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnBottomNavigationStyle
) : BottomNavigationView(context, attrs, defStyleAttr)
