package com.decathlon.android.tags

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.DrawableRes
import com.google.android.material.chip.Chip

open class VitaminTag @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagAccentStyle
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
            R.style.Widget_Vitamin_Tag
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
) : VitaminTagMediumAccent(context, attrs)

open class VitaminTagAccentInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTagMediumAccentInteractive(context, attrs)

open class VitaminTagAlert @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTagMediumAlert(context, attrs)

open class VitaminTagAlertInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTagMediumAlertInteractive(context, attrs)

open class VitaminTagBrand @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTagMediumBrand(context, attrs)

open class VitaminTagBrandInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTagMediumBrandInteractive(context, attrs)

open class VitaminTagDecorativeGravel @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTagMediumDecorativeGravel(context, attrs)

open class VitaminTagDecorativeGravelInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTagMediumDecorativeGravelInteractive(context, attrs)

open class VitaminTagDecorativeBrick @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTagMediumDecorativeBrick(context, attrs)

open class VitaminTagDecorativeBrickInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTagMediumDecorativeBrickInteractive(context, attrs)

open class VitaminTagDecorativeSaffron @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTagMediumDecorativeSaffron(context, attrs)

open class VitaminTagDecorativeSaffronInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTagMediumDecorativeSaffronInteractive(context, attrs)

open class VitaminTagDecorativeGold @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTagMediumDecorativeGold(context, attrs)

open class VitaminTagDecorativeGoldInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTagMediumDecorativeGoldInteractive(context, attrs)

open class VitaminTagDecorativeJade @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTagMediumDecorativeJade(context, attrs)

open class VitaminTagDecorativeJadeInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTagMediumDecorativeJadeInteractive(context, attrs)

open class VitaminTagDecorativeEmerald @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTagMediumDecorativeEmerald(context, attrs)

open class VitaminTagDecorativeEmeraldInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTagMediumDecorativeEmeraldInteractive(context, attrs)

open class VitaminTagDecorativeCobalt @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTagMediumDecorativeCobalt(context, attrs)

open class VitaminTagDecorativeCobaltInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTagMediumDecorativeCobaltInteractive(context, attrs)

open class VitaminTagDecorativeAmethyst @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTagMediumDecorativeAmethyst(context, attrs)

open class VitaminTagDecorativeAmethystInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTagMediumDecorativeAmethystInteractive(context, attrs)

open class VitaminTagMediumAccent @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagMediumAccentStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagMediumAccentInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagMediumAccentInteractiveStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagMediumAlert @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagMediumAlertStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagMediumAlertInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagMediumAlertInteractiveStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagMediumBrand @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagMediumBrandStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagMediumBrandInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagMediumBrandInteractiveStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagMediumDecorativeGravel @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagMediumDecorativeGravelStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagMediumDecorativeGravelInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagMediumDecorativeGravelInteractiveStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagMediumDecorativeBrick @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagMediumDecorativeBrickStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagMediumDecorativeBrickInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagMediumDecorativeBrickInteractiveStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagMediumDecorativeSaffron @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagMediumDecorativeSaffronStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagMediumDecorativeSaffronInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagMediumDecorativeSaffronInteractiveStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagMediumDecorativeGold @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagMediumDecorativeGoldStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagMediumDecorativeGoldInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagMediumDecorativeGoldInteractiveStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagMediumDecorativeJade @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagMediumDecorativeJadeStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagMediumDecorativeJadeInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagMediumDecorativeJadeInteractiveStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagMediumDecorativeEmerald @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagMediumDecorativeEmeraldStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagMediumDecorativeEmeraldInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagMediumDecorativeEmeraldInteractiveStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagMediumDecorativeCobalt @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagMediumDecorativeCobaltStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagMediumDecorativeCobaltInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagMediumDecorativeCobaltInteractiveStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagMediumDecorativeAmethyst @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagMediumDecorativeAmethystStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagMediumDecorativeAmethystInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagMediumDecorativeAmethystInteractiveStyle
) : VitaminTag(context, attrs, defStyleAttr)


open class VitaminTagSmallAccent @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagSmallAccentStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagSmallAccentInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagSmallAccentInteractiveStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagSmallAlert @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagSmallAlertStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagSmallAlertInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagSmallAlertInteractiveStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagSmallBrand @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagSmallBrandStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagSmallBrandInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagSmallBrandInteractiveStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagSmallDecorativeGravel @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagSmallDecorativeGravelStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagSmallDecorativeGravelInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagSmallDecorativeGravelInteractiveStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagSmallDecorativeBrick @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagSmallDecorativeBrickStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagSmallDecorativeBrickInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagSmallDecorativeBrickInteractiveStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagSmallDecorativeSaffron @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagSmallDecorativeSaffronStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagSmallDecorativeSaffronInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagSmallDecorativeSaffronInteractiveStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagSmallDecorativeGold @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagSmallDecorativeGoldStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagSmallDecorativeGoldInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagSmallDecorativeGoldInteractiveStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagSmallDecorativeJade @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagSmallDecorativeJadeStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagSmallDecorativeJadeInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagSmallDecorativeJadeInteractiveStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagSmallDecorativeEmerald @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagSmallDecorativeEmeraldStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagSmallDecorativeEmeraldInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagSmallDecorativeEmeraldInteractiveStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagSmallDecorativeCobalt @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagSmallDecorativeCobaltStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagSmallDecorativeCobaltInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagSmallDecorativeCobaltInteractiveStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagSmallDecorativeAmethyst @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagSmallDecorativeAmethystStyle
) : VitaminTag(context, attrs, defStyleAttr)

open class VitaminTagSmallDecorativeAmethystInteractive @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTagSmallDecorativeAmethystInteractiveStyle
) : VitaminTag(context, attrs, defStyleAttr)