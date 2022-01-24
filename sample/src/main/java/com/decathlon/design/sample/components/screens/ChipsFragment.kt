package com.decathlon.design.sample.components.screens

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.decathlon.design.sample.R
import com.decathlon.design.sample.databinding.FragmentChipsBinding
import com.decathlon.vitamin.chips.VitaminInputImageMediumChip
import com.decathlon.vitamin.chips.VitaminInputImageSmallChip
import com.decathlon.vitamin.chips.VitaminInputMediumChip
import com.decathlon.vitamin.chips.VitaminInputSmallChip
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class ChipsFragment : ComponentFragment() {

    private lateinit var binding: FragmentChipsBinding

    override fun showResetOption(): Boolean {
        return true
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChipsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initChips()
    }

    override fun onResetClick() {
        initChips()
    }

    private fun initChips() {
        resetSelectionFor(binding.mediumFilterChipGroup)
        resetSelectionFor(binding.smallFilterChipGroup)
        resetSelectionFor(binding.mediumSingleChoiceChipGroup)
        resetSelectionFor(binding.smallSingleChoiceChipGroup)
        setupInputChipGroup(binding.mediumInputChipGroup, small = false)
        setupInputChipGroup(binding.smallInputChipGroup, small = true)
    }

    private fun resetSelectionFor(chipGroup: ChipGroup) {
        (0 until chipGroup.childCount).forEach { index ->
            (chipGroup.getChildAt(index) as? Chip)?.isChecked = false
        }
    }

    private fun setupInputChipGroup(inputChipGroup: ChipGroup, small: Boolean) {
        inputChipGroup.apply {
            val onCloseIconClicked: (chip: Chip) -> Unit = {
                removeView(it)
            }
            removeAllViews()
            for (chip in getInputChipsForGroup(context, small, onCloseIconClicked)) {
                addView(chip)
            }
        }
    }

    private fun getInputChipsForGroup(
        context: Context,
        small: Boolean,
        onCloseIconClicked: (chip: Chip) -> Unit
    ): List<Chip> {
        return listOf(
            createInputChip(context, small, "Input 1", onCloseIconClicked = onCloseIconClicked),
            createInputChip(context, small, "Input 2", enable = false),
            createInputChip(
                context,
                small,
                "Input 3",
                iconRes = R.drawable.ic_vtmn_map_pin_line,
                onCloseIconClicked = onCloseIconClicked
            ),
            createInputChip(
                context,
                small,
                "Input 4",
                imageRes = R.drawable.profile_picture_round,
                onCloseIconClicked = onCloseIconClicked
            )
        )
    }

    private fun createInputChip(
        context: Context,
        small: Boolean,
        label: String,
        enable: Boolean = true,
        iconRes: Int? = null,
        imageRes: Int? = null,
        onCloseIconClicked: ((chip: Chip) -> Unit)? = null
    ): Chip {
        return if (small) {
            if (imageRes == null) {
                VitaminInputSmallChip(context).apply {
                    text = label
                    setOnCloseIconClickListener {
                        onCloseIconClicked?.invoke(this)
                    }
                    isEnabled = enable
                    iconRes?.let { setChipIconResource(it) }
                }
            } else {
                VitaminInputImageSmallChip(context).apply {
                    text = label
                    setOnCloseIconClickListener {
                        onCloseIconClicked?.invoke(this)
                    }
                    isEnabled = enable
                    setChipIconResource(imageRes)
                }
            }
        } else {
            if (imageRes == null) {
                VitaminInputMediumChip(context).apply {
                    text = label
                    setOnCloseIconClickListener {
                        onCloseIconClicked?.invoke(this)
                    }
                    isEnabled = enable
                    iconRes?.let { setChipIconResource(it) }
                }
            } else {
                VitaminInputImageMediumChip(context).apply {
                    text = label
                    setOnCloseIconClickListener {
                        onCloseIconClicked?.invoke(this)
                    }
                    isEnabled = enable
                    setChipIconResource(imageRes)
                }
            }
        }
    }

}