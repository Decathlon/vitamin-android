package com.decathlon.design.sample.components.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.decathlon.design.sample.databinding.FragmentCheckboxesBinding

class CheckboxesFragment : ComponentFragment() {

    private lateinit var binding: FragmentCheckboxesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCheckboxesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun showResetOption(): Boolean {
        return true
    }

    override fun onResetClick() {
        binding.selectedCheckbox.isChecked = true
        binding.unselectedCheckbox.isChecked = false
    }
}