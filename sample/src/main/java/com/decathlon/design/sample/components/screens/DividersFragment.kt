package com.decathlon.design.sample.components.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.decathlon.design.sample.databinding.FragmentDividersBinding

class DividersFragment : ComponentFragment() {

    private lateinit var binding: FragmentDividersBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDividersBinding.inflate(inflater, container, false)
        return binding.root
    }

}