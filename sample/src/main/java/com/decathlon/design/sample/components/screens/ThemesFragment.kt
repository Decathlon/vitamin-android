package com.decathlon.design.sample.components.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.decathlon.design.sample.databinding.FragmentThemesBinding

class ThemesFragment : ComponentFragment() {

    private lateinit var binding: FragmentThemesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThemesBinding.inflate(inflater, container, false)
        return binding.root
    }
}