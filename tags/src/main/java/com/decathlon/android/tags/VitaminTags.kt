package com.decathlon.android.tags

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.DrawableRes
import com.google.android.material.chip.Chip

open class VitaminTag @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagAccent
) : Chip(context, attrs, defStyleAttr) {
    @DrawableRes
    var tagIcon: Int = -1
        set(value) {
            field = value
            updateIcon()
        }

    init {
        val attributes = context.obtainStyledAttributes(
            attrs,
            R.styleable.VitaminTag,
            defStyleAttr,
            R.style.Widget_Vitamin_Tag_Accent
        )

        tagIcon = attributes.getResourceId(
            R.styleable.VitaminTag_tagIcon,
            -1
        )

        attributes.recycle()
    }

    private fun updateIcon() {
        if (tagIcon < 0) return
        else setChipIconResource(tagIcon)
    }
}

open class VitaminTagAccent @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagAccent
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagAccentInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagAccentInteractive
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagAlert @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagAlert
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagAlertInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagAlertInteractive
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagBrand @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagBrand
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagBrandInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagBrandInteractive
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeGravel @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagDecorativeGravel
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeGravelInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagDecorativeGravelInteractive
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeBrick @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagDecorativeBrick
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeBrickInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagDecorativeBrickInteractive
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeSaffron @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagDecorativeSaffron
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeSaffronInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagDecorativeSaffronInteractive
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeGold @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagDecorativeGold
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeGoldInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagDecorativeGoldInteractive
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeJade @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagDecorativeJade
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeJadeInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagDecorativeJadeInteractive
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeEmerald @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagDecorativeEmerald
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeEmeraldInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagDecorativeEmeraldInteractive
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeCobalt @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagDecorativeCobalt
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeCobaltInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagDecorativeCobaltInteractive
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeAmethyst @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagDecorativeAmethyst
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeAmethystInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.tagDecorativeAmethystInteractive
) : VitaminTag(context, attrs, defStyleAttr)