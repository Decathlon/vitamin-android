package com.decathlon.vitamin.tabs

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.tabs.TabLayout

open class VitaminTabLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTabStyle
) : TabLayout(context, attrs, defStyleAttr)

open class VitaminTabLayoutLeadingIcon @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTabStyleLeadingIcon
) : TabLayout(context, attrs, defStyleAttr)

open class VitaminTabLayoutTopIcon @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTabStyleTopIcon
) : TabLayout(context, attrs, defStyleAttr)

