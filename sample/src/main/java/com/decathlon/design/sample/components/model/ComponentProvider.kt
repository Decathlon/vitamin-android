package com.decathlon.design.sample.components.model

import com.decathlon.design.sample.R

object ComponentProvider {

    fun getAll(): List<Component> {
        return listOf(
            Component(
                R.string.colors_screen_title,
                R.drawable.ic_placeholder,
                R.id.action_main_to_colors
            ),
            Component(
                R.string.typography_screen_title,
                R.drawable.ic_fonts,
                R.id.action_main_to_typography
            ),
            Component(
                R.string.button_screen_title,
                R.drawable.ic_button,
                R.id.action_main_to_button
            )
        )
    }

}