package com.decathlon.design.sample.components.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.decathlon.design.sample.databinding.FragmentCheckboxesBinding
import com.decathlon.design.sample.databinding.FragmentFabsBinding

@Suppress("SpellCheckingInspection")
class FabsFragment : ComponentFragment() {

    private lateinit var binding: FragmentFabsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFabsBinding.inflate(inflater, container, false)
        return binding.root
    }

}