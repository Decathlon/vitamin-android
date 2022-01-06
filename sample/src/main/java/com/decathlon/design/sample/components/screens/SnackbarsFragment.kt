package com.decathlon.design.sample.components.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.decathlon.design.sample.databinding.FragmentSnackbarsBinding
import com.google.android.material.snackbar.Snackbar

class SnackbarsFragment : ComponentFragment() {
    private lateinit var binding: FragmentSnackbarsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSnackbarsBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnShowSnackbar.setOnClickListener {
            Snackbar.make(
                view, "This is the description of the snackbar. " +
                        "This is the description of the snackbar", Snackbar.LENGTH_LONG
            )
                .show()
        }
        binding.btnShowSnackbarWithButton.setOnClickListener {
            Snackbar.make(
                view, "This is the description of the snackbar.",
                Snackbar.LENGTH_LONG
            )
                .setAction("Action") {
                    // TODO : add your action here
                }
                .show()
        }

        binding.btnShowLongSnackbarWithButton.setOnClickListener {
            Snackbar.make(
                view, "This is the description of the snackbar. " +
                        "This is the description of the snackbar", Snackbar.LENGTH_LONG
            )
                .setAction("This is a long action") {
                    // TODO : add your action here
                }
                .show()

        }
    }
}
