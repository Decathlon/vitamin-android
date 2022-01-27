package com.decathlon.vitamin.skeleton

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import androidx.annotation.ColorInt
import androidx.core.content.ContextCompat

class VitaminSkeletonRoundedView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnSkeletonRoundedViewStyle
) : View(context, attrs, defStyleAttr) {

    private val paint = Paint()

    @ColorInt
    var color: Int = 0
        set(value) {
            field = value
            invalidate()
        }

    init {
        val attributes = context.obtainStyledAttributes(
            attrs,
            R.styleable.VitaminSkeletonRoundedView,
            defStyleAttr,
            R.style.Widget_Vitamin_SkeletonRoundedView
        )

        // Color
        val attrColorId = attributes.getResourceId(
            R.styleable.VitaminSkeletonRoundedView_vtmnSkeletonRoundedView_color,
            -1
        )
        color = ContextCompat.getColor(context, attrColorId)

        attributes.recycle()
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.style = Paint.Style.FILL
        paint.color = color
        canvas?.drawOval(0f, 0f, width.toFloat(), height.toFloat(), paint)
    }
}