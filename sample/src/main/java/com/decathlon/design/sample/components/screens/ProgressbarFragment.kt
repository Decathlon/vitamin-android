package com.decathlon.design.sample.components.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.decathlon.design.sample.databinding.FragmentProgressbarBinding

class ProgressbarFragment: ComponentFragment() {
    lateinit var binding: FragmentProgressbarBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProgressbarBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.slider.addOnChangeListener { _, value, _ ->
            binding.linearProgressIndicatorDeterminatedSmall.setProgressCompat(value.toInt(), true)
            binding.linearProgressIndicatorDeterminatedMedium.setProgressCompat(value.toInt(), true)
            binding.linearProgressIndicatorDeterminatedLarge.setProgressCompat(value.toInt(), true)
            binding.circularProgressIndicatorDeterminatedExtraSmall.setProgressCompat(value.toInt(), true)
            binding.circularProgressIndicatorDeterminatedSmall.setProgressCompat(value.toInt(), true)
            binding.circularProgressIndicatorDeterminatedMedium.setProgressCompat(value.toInt(), true)
            binding.circularProgressIndicatorDeterminatedLarge.setProgressCompat(value.toInt(), true)
        }
        binding.linearProgressIndicatorSmall.apply {
            isIndeterminate = true
            show()
        }
        binding.linearProgressIndicatorMedium.apply {
            isIndeterminate = true
            show()
        }
        binding.linearProgressIndicatorLarge.apply {
            isIndeterminate = true
            show()
        }
        binding.circularProgressIndicatorExtraSmall.apply {
            isIndeterminate = true
            show()
        }
        binding.circularProgressIndicatorSmall.apply {
            isIndeterminate = true
            show()
        }
        binding.circularProgressIndicatorMedium.apply {
            isIndeterminate = true
            show()
        }
        binding.circularProgressIndicatorLarge.apply {
            isIndeterminate = true
            show()
        }
    }
}