package com.decathlon.vitamin.ratings

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import androidx.annotation.DrawableRes
import androidx.annotation.StyleRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.widget.TextViewCompat
import com.decathlon.vitamin.ratings.databinding.VtmnRatingsViewBinding


open class VitaminRatingView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = R.attr.vtmnRatingViewStyle
) : LinearLayout(context, attrs, defStyleAttr) {

    var note: Float = NOTE_DEFAULT_VALUE
        set(value) {
            field = value
            updateNote()
        }
    var commentsCount: Int = COMMENTS_COUNT_DEFAULT_VALUE
        set(value) {
            field = value
            updateCommentsCount()
        }
    var showComments: Boolean = SHOW_COMMENTS_DEFAULT_VALUE
        set(value) {
            field = value
            updateCommentsVisibility()
        }
    var compact: Boolean = COMPACT_DEFAULT_VALUE
        set(value) {
            field = value
            updateCompactMode()
        }
    var emphasis: Boolean = EMPHASIS_DEFAULT_VALUE
        set(value) {
            field = value
            updateIconsColor()
        }

    @StyleRes
    var noteTextAppearance: Int = -1
        set(value) {
            field = value
            updateNoteTextAppearance()
        }

    @StyleRes
    var commentsCountTextAppearance: Int = -1
        set(value) {
            field = value
            updateCommentsCountTextAppearance()
        }

    var defaultIconsColor: ColorStateList? = null
        set(value) {
            field = value
            updateIconsColor()
        }

    var emphasisIconsColor: ColorStateList? = null
        set(value) {
            field = value
            updateIconsColor()
        }

    @DrawableRes
    var compactIcon: Int = -1
        set(value) {
            field = value
            updateCompactIcon()
        }

    private val binding: VtmnRatingsViewBinding =
        VtmnRatingsViewBinding.inflate(LayoutInflater.from(context), this)

    init {
        retrieveAttributes(attrs, defStyleAttr)
    }

    private fun retrieveAttributes(attrs: AttributeSet?, defStyleAttr: Int) {
        val attributes = context.obtainStyledAttributes(
            attrs,
            R.styleable.VitaminRatingView,
            defStyleAttr,
            R.style.Widget_Vitamin_RatingView
        )
        note =
            attributes.getFloat(
                R.styleable.VitaminRatingView_vtmnRatingView_note,
                NOTE_DEFAULT_VALUE
            )
        commentsCount =
            attributes.getInteger(
                R.styleable.VitaminRatingView_vtmnRatingView_commentsCount,
                COMMENTS_COUNT_DEFAULT_VALUE
            )
        showComments =
            attributes.getBoolean(
                R.styleable.VitaminRatingView_vtmnRatingView_showComments,
                SHOW_COMMENTS_DEFAULT_VALUE
            )
        compact =
            attributes.getBoolean(
                R.styleable.VitaminRatingView_vtmnRatingView_compact,
                COMPACT_DEFAULT_VALUE
            )
        emphasis =
            attributes.getBoolean(
                R.styleable.VitaminRatingView_vtmnRatingView_emphasis,
                EMPHASIS_DEFAULT_VALUE
            )
        noteTextAppearance = attributes.getResourceId(
            R.styleable.VitaminRatingView_vtmnRatingView_noteTextAppearance,
            -1
        )
        commentsCountTextAppearance = attributes.getResourceId(
            R.styleable.VitaminRatingView_vtmnRatingView_commentsCountTextAppearance,
            -1
        )
        defaultIconsColor = AppCompatResources.getColorStateList(
            context,
            attributes.getResourceId(
                R.styleable.VitaminRatingView_vtmnRatingView_defaultIconsColor,
                -1
            )
        )
        emphasisIconsColor = AppCompatResources.getColorStateList(
            context,
            attributes.getResourceId(
                R.styleable.VitaminRatingView_vtmnRatingView_emphasisIconsColor,
                -1
            )
        )
        compactIcon =
            attributes.getResourceId(R.styleable.VitaminRatingView_vtmnRatingView_compactIcon, -1)
        attributes.recycle()
    }

    @SuppressLint("SetTextI18n")
    private fun updateNote() {
        binding.ratingBar.rating = note
        binding.noteTextView.text = "$note/5"
    }

    @SuppressLint("SetTextI18n")
    private fun updateCommentsCount() {
        binding.commentsCountTextView.text = "($commentsCount)"
    }

    private fun updateCommentsVisibility() {
        binding.commentsCountTextView.visibility =
            when (showComments) {
                true -> View.VISIBLE
                false -> View.GONE
            }
    }

    private fun updateCompactMode() {
        when (compact) {
            false -> {
                binding.ratingBar.visibility = View.VISIBLE
                binding.compactIcon.visibility = View.GONE
            }
            true -> {
                binding.ratingBar.visibility = View.GONE
                binding.compactIcon.visibility = View.VISIBLE
            }
        }
    }

    private fun updateIconsColor() {
        with(binding) {
            val color = when (emphasis) {
                true -> emphasisIconsColor
                else -> defaultIconsColor
            }
            ratingBar.progressDrawable.setTintList(color)
            compactIcon.imageTintList = color
        }
    }

    private fun updateNoteTextAppearance() {
        TextViewCompat.setTextAppearance(binding.noteTextView, noteTextAppearance)
    }

    private fun updateCommentsCountTextAppearance() {
        TextViewCompat.setTextAppearance(binding.commentsCountTextView, commentsCountTextAppearance)
    }

    private fun updateCompactIcon() {
        binding.compactIcon.setImageResource(compactIcon)
    }

    companion object {
        private const val NOTE_DEFAULT_VALUE = 0.0f
        private const val COMPACT_DEFAULT_VALUE = false
        private const val EMPHASIS_DEFAULT_VALUE = false
        private const val COMMENTS_COUNT_DEFAULT_VALUE: Int = 0
        private const val SHOW_COMMENTS_DEFAULT_VALUE: Boolean = false
    }
}