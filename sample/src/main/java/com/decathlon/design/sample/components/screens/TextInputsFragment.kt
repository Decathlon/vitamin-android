package com.decathlon.design.sample.components.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewGroupCompat
import com.decathlon.design.sample.R
import com.decathlon.design.sample.databinding.FragmentTextInputsBinding
import com.decathlon.vitamin.dropdown.Item
import com.decathlon.vitamin.textinputs.VitaminTextInputDropdownOutlined
import com.google.android.material.snackbar.Snackbar

class TextInputsFragment : ComponentFragment() {
    lateinit var binding: FragmentTextInputsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
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
        binding.textInputLayoutOutlined6.editText.setAdapter(listOf(
            Item(R.drawable.ic_vtmn_heart_fill, R.drawable.ic_vtmn_heart_fill, "Option 1"),
            Item(R.drawable.ic_vtmn_heart_fill, null, "Option 2"),
            Item(null, R.drawable.ic_vtmn_heart_fill, "Option 3"),
            Item(null, null, "Option 4")
        ))
        binding.textInputLayoutFilled2.error = "Error message"
        binding.textInputLayoutFilled5.setEndIconOnClickListener {
            Snackbar.make(binding.scrollView, "Show dialog to pick birthday", Snackbar.LENGTH_SHORT)
                .show()
        }
        binding.textInputLayoutFilled6.editText.setAdapter(listOf(
            Item(R.drawable.ic_vtmn_heart_fill, R.drawable.ic_vtmn_heart_fill, "Option 1"),
            Item(R.drawable.ic_vtmn_heart_fill, null, "Option 2"),
            Item(null, R.drawable.ic_vtmn_heart_fill, "Option 3"),
            Item(null, null, "Option 4")
        ))
    }
}