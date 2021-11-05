package com.decathlon.design.sample.components.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.annotation.MenuRes
import com.decathlon.design.sample.R
import com.decathlon.design.sample.databinding.FragmentMenusBinding
import com.decathlon.vitamin.dropdown.Item
import com.decathlon.vitamin.menus.VitaminListMenu
import com.decathlon.vitamin.menus.VitaminMenu

class MenusFragment : ComponentFragment() {

    private lateinit var binding: FragmentMenusBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMenusBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.menuButton.setOnClickListener { showMenu(it, R.menu.popup_menu) }
        binding.listMenuButton.setOnClickListener { showListMenu(it) }
        binding.listCustomMenuButton.setOnClickListener { showCustomListMenu(it) }
    }

    private fun showMenu(v: View, @MenuRes menuRes: Int) {
        val popup = VitaminMenu(requireContext(), v)
        popup.menuInflater.inflate(menuRes, popup.menu)
        popup.setOnMenuItemClickListener { return@setOnMenuItemClickListener false }
        popup.setOnDismissListener {}
        popup.show()
    }

    private fun showListMenu(v: View) {
        val listPopupWindow = VitaminListMenu(requireContext(), v)
        listPopupWindow.setSimpleAdapter(listOf("Option 1", "Option 2", "Option 3"))
        listPopupWindow.setOnItemClickListener { _: AdapterView<*>?, _: View?, _: Int, _: Long ->
            listPopupWindow.dismiss()
        }
        listPopupWindow.show()
    }

    private fun showCustomListMenu(v: View) {
        val listPopupWindow = VitaminListMenu(requireContext(), v)
        listPopupWindow.setAdapter(listOf(
            Item(R.drawable.ic_vtmn_heart_3_fill, R.drawable.ic_vtmn_heart_3_fill, "Option 1"),
            Item(R.drawable.ic_vtmn_heart_3_fill, null, "Option 2"),
            Item(null, R.drawable.ic_vtmn_heart_3_fill, "Option 3"),
            Item(null, null, "Option 4")
        ))
        listPopupWindow.setOnItemClickListener { _: AdapterView<*>?, _: View?, _: Int, _: Long ->
            listPopupWindow.dismiss()
        }
        listPopupWindow.show()
    }
}