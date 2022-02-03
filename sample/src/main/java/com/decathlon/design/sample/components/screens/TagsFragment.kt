package com.decathlon.design.sample.components.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.decathlon.design.sample.databinding.FragmentTagsBinding

class TagsFragment : ComponentFragment() {

    private lateinit var binding: FragmentTagsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTagsBinding.inflate(inflater, container, false)
        return binding.root
    }
}