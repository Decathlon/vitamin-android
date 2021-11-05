package com.decathlon.vitamin.menus

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.widget.ArrayAdapter
import androidx.annotation.AttrRes
import androidx.annotation.LayoutRes
import androidx.appcompat.widget.ListPopupWindow
import androidx.appcompat.widget.PopupMenu
import com.decathlon.vitamin.dropdown.Item
import com.decathlon.vitamin.dropdown.VitaminDropdownAdapter

open class VitaminMenu @JvmOverloads constructor(
    context: Context,
    anchor: View,
    @AttrRes attrs: Int = androidx.appcompat.R.attr.popupMenuStyle,
) : PopupMenu(context, anchor, Gravity.NO_GRAVITY, attrs, 0)

open class VitaminListMenu @JvmOverloads constructor(
    private val context: Context,
    anchor: View,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.listPopupWindowStyle
): ListPopupWindow(context, attrs, defStyleAttr) {
    init {
        anchorView = anchor
    }

    fun setSimpleAdapter(items: List<String>) {
        setAdapter(ArrayAdapter(context, R.layout.vtmn_simple_dropdown_item, items))
    }

    fun setAdapter(items: List<Item>, @LayoutRes layout: Int = R.layout.vtmn_dropdown_item) {
        setAdapter(VitaminDropdownAdapter(context, layout, items))
    }
}
