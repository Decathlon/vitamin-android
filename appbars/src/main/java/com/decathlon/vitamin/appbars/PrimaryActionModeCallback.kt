package com.decathlon.vitamin.appbars

import android.view.Menu
import android.view.MenuItem
import androidx.annotation.MenuRes
import androidx.appcompat.view.ActionMode

class PrimaryActionModeCallback(
    @MenuRes val menuResId: Int,
    val onActionItemClickListener: ((item: MenuItem) -> Unit)? = null,
    val onActionModeFinishedListener: (() -> Unit)? = null
) : ActionMode.Callback {
    private var actionMode: ActionMode? = null

    override fun onCreateActionMode(mode: ActionMode, menu: Menu): Boolean {
        this.actionMode = mode
        mode.menuInflater.inflate(menuResId, menu)
        return true
    }

    override fun onPrepareActionMode(mode: ActionMode, menu: Menu): Boolean {
        return false
    }

    override fun onDestroyActionMode(mode: ActionMode) {
        onActionModeFinishedListener?.invoke()
        this.actionMode = null
    }

    override fun onActionItemClicked(mode: ActionMode, item: MenuItem): Boolean {
        onActionItemClickListener?.invoke(item)
        mode.finish()
        return true
    }

    fun finishActionMode() {
        actionMode?.finish()
    }

    fun updateTitle(title: String) {
        this.actionMode?.title = title
    }

    val isActive: Boolean
        get() = actionMode != null
}