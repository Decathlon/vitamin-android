package com.decathlon.design.sample.components.screens.resources.common

import android.graphics.drawable.Drawable

data class ResourceModel(val name: String, val src: Drawable, val type: ResourceType)

enum class ResourceType {
    Icon,
    Asset
}
