package com.decathlon.vitamin.ratings

import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.AppCompatRatingBar

class VitaminInteractiveRatingView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnInteractiveRatingViewStyle
) : AppCompatRatingBar(context, attrs, defStyleAttr) {

    init {
        retrieveAttributes(attrs, defStyleAttr)
    }

    private fun retrieveAttributes(attrs: AttributeSet?, defStyleAttr: Int) {
        val attributes = context.obtainStyledAttributes(
            attrs,
            R.styleable.VitaminInteractiveRatingView,
            defStyleAttr,
            R.style.Widget_Vitamin_InteractiveRatingView
        )
        emphasis =
            attributes.getBoolean(
                R.styleable.VitaminInteractiveRatingView_vtmnInteractiveRatingView_emphasis,
                EMPHASIS_DEFAULT_VALUE
            )
        defaultColor = AppCompatResources.getColorStateList(
            context,
            attributes.getResourceId(
                R.styleable.VitaminInteractiveRatingView_vtmnInteractiveRatingView_defaultColor,
                -1
            )
        )
        emphasisColor = AppCompatResources.getColorStateList(
            context,
            attributes.getResourceId(
                R.styleable.VitaminInteractiveRatingView_vtmnInteractiveRatingView_emphasisColor,
                -1
            )
        )
        attributes.recycle()
    }

    var emphasis: Boolean = EMPHASIS_DEFAULT_VALUE
        set(value) {
            field = value
            updateColor()
        }

    var defaultColor: ColorStateList? = null
        set(value) {
            field = value
            updateColor()
        }

    var emphasisColor: ColorStateList? = null
        set(value) {
            field = value
            updateColor()
        }

    private fun updateColor() {
        val color = when (emphasis) {
            true -> emphasisColor
            else -> defaultColor
        }
        progressDrawable.setTintList(color)
    }

    companion object {
        private const val EMPHASIS_DEFAULT_VALUE = false
    }
}
