package com.decathlon.design.sample.components.screens

import android.graphics.PorterDuff
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.decathlon.design.sample.R
import com.google.android.material.transition.MaterialSharedAxis

abstract class ComponentFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enterTransition = MaterialSharedAxis(MaterialSharedAxis.Z, true)
        returnTransition = MaterialSharedAxis(MaterialSharedAxis.Z, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(showResetOption())
    }

    //region Reset menu

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_reset, menu)
    }

    @Suppress("DEPRECATION")
    override fun onPrepareOptionsMenu(menu: Menu) {
        super.onPrepareOptionsMenu(menu)
        // This line should be removed when the Vitamin's Toolbar will be available
        context?.let {
            menu.getItem(0).icon.setColorFilter(
                ContextCompat.getColor(it, R.color.vtmn_white),
                PorterDuff.Mode.SRC_ATOP
            )
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.reset -> {
                onResetClick()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    /**
     * Override this function and return true if you want to see the option "Reset" in the toolbar
     */
    protected open fun showResetOption(): Boolean {
        return false
    }

    /**
     * Override this function to catch the click of the "Reset" option
     */
    protected open fun onResetClick() {
    }

    //endregion

}