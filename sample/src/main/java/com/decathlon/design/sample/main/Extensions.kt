package com.decathlon.design.sample.main

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

fun View.requestFocusAndShowKeyboard() {
    if (requestFocus()) {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY)
    }
}