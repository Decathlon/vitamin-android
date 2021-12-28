package com.decathlon.design.sample.components.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.decathlon.design.sample.R
import com.decathlon.design.sample.databinding.FragmentTopbarsBinding
import com.decathlon.vitamin.appbars.PrimaryActionModeCallback

class TopBarsFragment : ComponentFragment() {
    private val actionModeCallback = PrimaryActionModeCallback(R.menu.menu_contextual)
    private lateinit var binding: FragmentTopbarsBinding

    override fun showResetOption() = true

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTopbarsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnToggleActionMode.setOnClickListener {
            if (!actionModeCallback.isActive) {
                (activity as AppCompatActivity).startSupportActionMode(actionModeCallback)
                actionModeCallback.updateTitle("1 selected")
            } else {
                actionModeCallback.finishActionMode()
            }
        }
    }

    override fun onStop() {
        super.onStop()
        if (actionModeCallback.isActive) {
            actionModeCallback.finishActionMode()
        }
    }
}
