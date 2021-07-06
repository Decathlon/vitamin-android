package com.decathlon.design.sample.components.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewGroupCompat
import androidx.fragment.app.Fragment
import com.decathlon.design.sample.databinding.FragmentTextInputsBinding
import com.google.android.material.snackbar.Snackbar

class TextInputsFragment : ComponentFragment() {
    lateinit var binding: FragmentTextInputsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTextInputsBinding.inflate(inflater, container, false)
        ViewGroupCompat.setTransitionGroup(binding.scrollView, true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textInputLayoutOutlined2.error = "Error message"
        binding.textInputLayoutOutlined5.setEndIconOnClickListener {
            Snackbar.make(binding.scrollView, "Show dialog to pick birthday", Snackbar.LENGTH_SHORT)
                .show()
        }
        binding.textInputLayoutFilled2.error = "Error message"
        binding.textInputLayoutFilled5.setEndIconOnClickListener {
            Snackbar.make(binding.scrollView, "Show dialog to pick birthday", Snackbar.LENGTH_SHORT)
                .show()
        }
    }
}