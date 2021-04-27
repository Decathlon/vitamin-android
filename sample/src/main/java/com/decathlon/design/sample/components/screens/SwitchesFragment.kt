package com.decathlon.design.sample.components.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.decathlon.design.sample.databinding.FragmentCheckboxesBinding
import com.decathlon.design.sample.databinding.FragmentSwitchesBinding

class SwitchesFragment : ComponentFragment() {

    private lateinit var binding: FragmentSwitchesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSwitchesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun showResetOption(): Boolean {
        return true
    }

    override fun onResetClick() {
        binding.checkedSwitch.isChecked = true
        binding.uncheckedSwitch.isChecked = false
    }
}