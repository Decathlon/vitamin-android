package com.decathlon.vitamin.textinputs

import android.content.Context
import android.util.AttributeSet
import android.widget.ArrayAdapter
import androidx.annotation.LayoutRes
import com.decathlon.vitamin.dropdown.Item
import com.decathlon.vitamin.dropdown.VitaminDropdownAdapter
import com.google.android.material.textfield.MaterialAutoCompleteTextView
import com.google.android.material.textfield.TextInputLayout

open class VitaminTextInputLayoutFilled @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTextInputFilledStyle
) : TextInputLayout(context, attrs, defStyleAttr)

open class VitaminTextInputLayoutOutlined @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnTextInputOutlinedStyle
) : TextInputLayout(context, attrs, defStyleAttr)

open class VitaminTextInputDropdownFilled @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTextInputLayoutFilled(context, attrs, R.attr.vtmnTextInputDropdownFilledStyle) {
    override fun getEditText(): VitaminDropdownEditText {
        val editText = super.getEditText()
            ?: throw IllegalStateException("Add VitaminDropdownEditText as child")
        return editText as VitaminDropdownEditText
    }
}

open class VitaminTextInputDropdownOutlined @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : VitaminTextInputLayoutOutlined(context, attrs, R.attr.vtmnTextInputDropdownOutlinedStyle) {
    override fun getEditText(): VitaminDropdownEditText {
        val editText = super.getEditText()
            ?: throw IllegalStateException("Add VitaminDropdownEditText as child")
        return editText as VitaminDropdownEditText
    }
}

open class VitaminDropdownEditText @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = com.google.android.material.R.attr.autoCompleteTextViewStyle
): MaterialAutoCompleteTextView(context, attrs, defStyleAttr) {
    fun setSimpleAdapter(items: List<String>) {
        setAdapter(ArrayAdapter(context, R.layout.vtmn_simple_dropdown_item, items))
    }

    fun setAdapter(items: List<Item>, @LayoutRes layout: Int = R.layout.vtmn_dropdown_item) {
        setAdapter(VitaminDropdownAdapter(context, layout, items))
    }
}
