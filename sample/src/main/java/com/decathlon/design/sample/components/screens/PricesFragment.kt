package com.decathlon.design.sample.components.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.decathlon.design.sample.databinding.FragmentPricesBinding

class PricesFragment : ComponentFragment() {
    private lateinit var binding: FragmentPricesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPricesBinding.inflate(inflater, container, false)
        return binding.root
    }
}