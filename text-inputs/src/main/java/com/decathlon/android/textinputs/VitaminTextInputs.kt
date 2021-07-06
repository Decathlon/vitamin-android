package com.decathlon.android.textinputs

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.textfield.TextInputLayout


open class VitaminTextInputLayoutFilled @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.textInputFilled
) : TextInputLayout(context, attrs, defStyleAttr)

open class VitaminTextInputLayoutOutlined @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.textInputOutlined
) : TextInputLayout(context, attrs, defStyleAttr)
