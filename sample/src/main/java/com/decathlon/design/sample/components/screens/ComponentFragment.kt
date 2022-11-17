package com.decathlon.design.sample.components.screens

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.Fragment
import com.decathlon.design.sample.R
import com.google.android.material.transition.MaterialSharedAxis

abstract class ComponentFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (playScreenAnimation()) {
            enterTransition = MaterialSharedAxis(MaterialSharedAxis.Z, true)
            returnTransition = MaterialSharedAxis(MaterialSharedAxis.Z, false)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(showResetOption() || showSearchOption())
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        if (showResetOption()) {
            inflater.inflate(R.menu.menu_reset, menu)
        } else if (showSearchOption()) {
            inflater.inflate(R.menu.menu_search, menu)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.reset -> {
                onResetClick()
                true
            }
            R.id.search -> {
                onSearchClick()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    //region Reset menu

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

    //region Search menu

    /**
     * Override this function and return true if you want to see the option "Search" in the toolbar
     */
    protected open fun showSearchOption(): Boolean {
        return false
    }

    /**
     * Override this function to catch the click of the "Search" option
     */
    protected open fun onSearchClick() {
    }

    //endregion

    // region Animation

    /**
     * Override this function to play or not the screen animation
     */
    protected open fun playScreenAnimation(): Boolean {
        return true
    }

    // endregion

}