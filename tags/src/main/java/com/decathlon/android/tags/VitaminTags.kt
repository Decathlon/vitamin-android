package com.decathlon.android.tags

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.DrawableRes
import com.google.android.material.chip.Chip

open class VitaminTag @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagAccentStyle,
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
            R.style.Widget_Vitamin_Tag_Accent,
        )

        tagIcon = attributes.getResourceId(
            R.styleable.VitaminTag_tagIcon,
            -1,
        )

        attributes.recycle()
    }

    private fun updateIcon() {
        if (tagIcon == -1) {
            return
        } else {
            setChipIconResource(tagIcon)
        }
    }
}

open class VitaminTagAccent @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagAccentStyle,
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagAccentInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagAccentInteractiveStyle,
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagAlert @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagAlertStyle,
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagAlertInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagAlertInteractiveStyle,
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagBrand @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagBrandStyle,
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagBrandInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagBrandInteractiveStyle,
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeGravel @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagDecorativeGravelStyle,
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeGravelInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagDecorativeGravelInteractiveStyle,
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeBrick @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagDecorativeBrickStyle,
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeBrickInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagDecorativeBrickInteractiveStyle,
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeSaffron @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagDecorativeSaffronStyle,
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeSaffronInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagDecorativeSaffronInteractiveStyle,
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeGold @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagDecorativeGoldStyle,
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeGoldInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagDecorativeGoldInteractiveStyle,
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeJade @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagDecorativeJadeStyle,
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeJadeInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagDecorativeJadeInteractiveStyle,
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeEmerald @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagDecorativeEmeraldStyle,
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeEmeraldInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagDecorativeEmeraldInteractiveStyle,
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeCobalt @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagDecorativeCobaltStyle,
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeCobaltInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagDecorativeCobaltInteractiveStyle,
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeAmethyst @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagDecorativeAmethystStyle,
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagDecorativeAmethystInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagDecorativeAmethystInteractiveStyle,
) : VitaminTag(context, attrs, defStyleAttr)
