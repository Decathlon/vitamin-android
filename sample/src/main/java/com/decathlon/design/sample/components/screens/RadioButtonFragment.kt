package com.decathlon.design.sample.components.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.decathlon.design.sample.databinding.FragmentRadioButtonsBinding

class RadioButtonFragment: ComponentFragment() {

    private lateinit var binding: FragmentRadioButtonsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRadioButtonsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun showResetOption() = true

    override fun onResetClick() {
        binding.unselectedRadioButton.isChecked = false
        binding.radioGroup.clearCheck()
    }
}