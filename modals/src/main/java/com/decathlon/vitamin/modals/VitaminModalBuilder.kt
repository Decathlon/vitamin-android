package com.decathlon.vitamin.modals

import android.content.Context
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class VitaminModalBuilder(context: Context) :
    MaterialAlertDialogBuilder(context, R.style.ThemeOverlay_Vitamin_Modal)

class VitaminModalBuilderCentered(context: Context):
        MaterialAlertDialogBuilder(context, R.style.ThemeOverlay_Vitamin_Modal_Centered)
