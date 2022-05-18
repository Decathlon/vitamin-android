package com.decathlon.vitamin.dividers

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.divider.MaterialDividerItemDecoration

open class VitaminFullBleedDividerItemDecoration @JvmOverloads constructor(
    context: Context,
    orientation: Int,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnDividerFullBleedStyle
) : MaterialDividerItemDecoration(context, attrs, defStyleAttr, orientation)

open class VitaminInsetDividerItemDecoration @JvmOverloads constructor(
    context: Context,
    orientation: Int,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnDividerInsetStyle
) : MaterialDividerItemDecoration(context, attrs, defStyleAttr, orientation)

open class VitaminMiddleDividerItemDecoration @JvmOverloads constructor(
    context: Context,
    orientation: Int,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnDividerMiddleStyle
) : MaterialDividerItemDecoration(context, attrs, defStyleAttr, orientation)
