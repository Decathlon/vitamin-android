package com.decathlon.vitamin.buttons

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.button.MaterialButton

open class VitaminPrimaryMediumIconButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnIconButtonPrimaryMediumStyle
) : MaterialButton(context, attrs, defStyleAttr) {
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        layoutParams.width = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_medium)
        layoutParams.height = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_medium)
    }
}

open class VitaminPrimaryLargeIconButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnIconButtonPrimaryLargeStyle
) : MaterialButton(context, attrs, defStyleAttr) {
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        layoutParams.width = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_large)
        layoutParams.height = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_large)
    }
}

open class VitaminSecondaryMediumIconButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnIconButtonSecondaryMediumStyle
) : MaterialButton(context, attrs, defStyleAttr) {
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        layoutParams.width = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_medium)
        layoutParams.height = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_medium)
    }
}

open class VitaminSecondaryLargeIconButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnIconButtonSecondaryLargeStyle
) : MaterialButton(context, attrs, defStyleAttr) {
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        layoutParams.width = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_large)
        layoutParams.height = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_large)
    }
}

open class VitaminTertiaryMediumIconButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnIconButtonTertiaryMediumStyle
) : MaterialButton(context, attrs, defStyleAttr) {
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        layoutParams.width = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_medium)
        layoutParams.height = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_medium)
    }
}

open class VitaminTertiaryLargeIconButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnIconButtonTertiaryLargeStyle
) : MaterialButton(context, attrs, defStyleAttr) {
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        layoutParams.width = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_large)
        layoutParams.height = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_large)
    }
}

open class VitaminConversionMediumIconButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnIconButtonConversionMediumStyle
) : MaterialButton(context, attrs, defStyleAttr) {
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        layoutParams.width = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_medium)
        layoutParams.height = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_medium)
    }
}

open class VitaminConversionLargeIconButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnIconButtonConversionLargeStyle
) : MaterialButton(context, attrs, defStyleAttr) {
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        layoutParams.width = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_large)
        layoutParams.height = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_large)
    }
}

open class VitaminPrimaryReversedMediumIconButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnIconButtonPrimaryReversedMediumStyle
) : MaterialButton(context, attrs, defStyleAttr) {
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        layoutParams.width = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_medium)
        layoutParams.height = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_medium)
    }
}

open class VitaminPrimaryReversedLargeIconButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnIconButtonPrimaryReversedLargeStyle
) : MaterialButton(context, attrs, defStyleAttr) {
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        layoutParams.width = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_large)
        layoutParams.height = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_large)
    }
}

open class VitaminGhostMediumIconButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnIconButtonGhostMediumStyle
) : MaterialButton(context, attrs, defStyleAttr) {
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        layoutParams.width = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_medium)
        layoutParams.height = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_medium)
    }
}

open class VitaminGhostLargeIconButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnIconButtonGhostLargeStyle
) : MaterialButton(context, attrs, defStyleAttr) {
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        layoutParams.width = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_large)
        layoutParams.height = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_large)
    }
}

open class VitaminGhostReversedMediumIconButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnIconButtonGhostReversedMediumStyle
) : MaterialButton(context, attrs, defStyleAttr) {
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        layoutParams.width = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_medium)
        layoutParams.height = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_medium)
    }
}

open class VitaminGhostReversedLargeIconButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnIconButtonGhostReversedLargeStyle
) : MaterialButton(context, attrs, defStyleAttr) {
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        layoutParams.width = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_large)
        layoutParams.height = resources.getDimensionPixelSize(R.dimen.vtmn_icon_buttons_size_large)
    }
}
