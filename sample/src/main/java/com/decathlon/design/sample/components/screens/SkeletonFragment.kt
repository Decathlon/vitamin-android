package com.decathlon.design.sample.components.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.decathlon.design.sample.databinding.FragmentSkeletonBinding

class SkeletonFragment : ComponentFragment() {

    private lateinit var binding: FragmentSkeletonBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSkeletonBinding.inflate(inflater, container, false)
        return binding.root
    }

}