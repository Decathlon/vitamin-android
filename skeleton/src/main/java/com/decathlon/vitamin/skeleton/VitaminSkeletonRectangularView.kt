package com.decathlon.vitamin.skeleton

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import androidx.annotation.ColorInt
import androidx.core.content.ContextCompat

class VitaminSkeletonRectangularView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnSkeletonRectangularViewStyle,
) : View(context, attrs, defStyleAttr) {

    private val paint = Paint()

    @ColorInt
    var color: Int = 0
        set(value) {
            field = value
            invalidate()
        }

    // Corner radius in pixel size
    var cornerRadius: Int = 0
        set(value) {
            field = value
            invalidate()
        }

    init {
        val attributes = context.obtainStyledAttributes(
            attrs,
            R.styleable.VitaminSkeletonRectangularView,
            defStyleAttr,
            R.style.Widget_Vitamin_SkeletonRectangularView
        )

        // Color
        val attrColorId = attributes.getResourceId(
            R.styleable.VitaminSkeletonRectangularView_vtmnSkeletonRectangularView_color,
            -1
        )
        color = ContextCompat.getColor(context, attrColorId)

        // Corner Radius
        cornerRadius = attributes.getDimensionPixelSize(
            R.styleable.VitaminSkeletonRectangularView_vtmnSkeletonRectangularView_cornerRadius,
            0
        )

        attributes.recycle()
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.style = Paint.Style.FILL
        paint.color = color
        canvas?.drawRoundRect(
            0f,
            0f,
            width.toFloat(),
            height.toFloat(),
            cornerRadius.toFloat(),
            cornerRadius.toFloat(),
            paint
        )
    }
}