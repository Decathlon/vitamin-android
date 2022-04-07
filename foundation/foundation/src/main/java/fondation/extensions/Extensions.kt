package fondation.extensions

import android.text.SpannableString
import android.text.Spanned
import android.text.style.StrikethroughSpan

fun SpannableString.setStrikethrough() : SpannableString {
    this.setSpan(StrikethroughSpan(), 0, this.length, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
    return this
}