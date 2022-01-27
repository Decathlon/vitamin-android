package com.decathlon.vitamin.skeleton

import android.content.Context
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import com.facebook.shimmer.ShimmerFrameLayout

class VitaminSkeletonFrameLayout @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : ShimmerFrameLayout(ContextThemeWrapper(context, R.style.Widget_Vitamin_SkeletonFrameLayout), attrs)
