package com.decathlon.vitamin.appbars

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.widget.SearchView
import com.google.android.material.appbar.MaterialToolbar

open class VitaminTopBar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTopBarStyle
) : MaterialToolbar(context, attrs, defStyleAttr) {
    fun setNavigationDrawer() {
        setNavigationIcon(R.drawable.ic_vtmn_menu_line)
    }

    fun setNavigationContext() {
        setNavigationIcon(R.drawable.ic_vtmn_arrow_left_line)
    }
}

open class VitaminSearchTopBar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnSearchTopBarStyle
) : VitaminTopBar(context, attrs, defStyleAttr) {

    init {
        setNavigationContext()
    }

    override fun onViewAdded(child: View?) {
        super.onViewAdded(child)
        if (child is SearchView) {
            child.findViewById<View?>(R.id.search_edit_frame)
                ?.let { searchViewEditFrame ->
                    //Set left margin of search frame to 0 to remove spacing between topAppBar left icon and search view
                    (searchViewEditFrame.layoutParams as LinearLayout.LayoutParams?)?.leftMargin = 0
                }

            child.findViewById<View?>(R.id.search_src_text)?.let { searchViewTextField ->
                //Set left padding of search text field to 0 to remove spacing between topAppBar left icon and search view
                searchViewTextField.setPadding(
                    0,
                    searchViewTextField.paddingTop,
                    searchViewTextField.paddingRight,
                    searchViewTextField.paddingBottom
                )
            }
        }
    }
}
