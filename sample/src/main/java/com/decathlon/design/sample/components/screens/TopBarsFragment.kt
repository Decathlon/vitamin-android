package com.decathlon.design.sample.components.screens

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import com.decathlon.design.sample.R
import com.decathlon.design.sample.databinding.FragmentTopbarsBinding
import com.decathlon.vitamin.appbars.PrimaryActionModeCallback

class TopBarsFragment : ComponentFragment() {
    private val actionModeCallback = PrimaryActionModeCallback(R.menu.menu_contextual)
    private lateinit var binding: FragmentTopbarsBinding

    override fun showResetOption() = false

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
        setHasOptionsMenu(true)
        binding.btnToggleActionMode.setOnClickListener {
            if (!actionModeCallback.isActive) {
                (activity as AppCompatActivity).startSupportActionMode(actionModeCallback)
                actionModeCallback.updateTitle("1 selected")
            } else {
                actionModeCallback.finishActionMode()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_topbar, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.search -> {
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onStop() {
        super.onStop()
        if (actionModeCallback.isActive) {
            actionModeCallback.finishActionMode()
        }
    }
}
