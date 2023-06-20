package com.decathlon.vitamin

object Versions {
    object AndroidConfig {
        const val minSdk = 21
        const val compileSdk = 33
    }

    const val kotlin = "1.8.21"
    const val material = "1.5.0-alpha01"
    const val appCompat = "1.2.0"
    const val constraint = "2.0.1"
    const val navigation = "2.1.0"
    const val fragment = "1.1.0"
}

object Dependencies {
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val constraint = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"
    const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment}"

    object NavigationComponents {
        const val fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    }
}
