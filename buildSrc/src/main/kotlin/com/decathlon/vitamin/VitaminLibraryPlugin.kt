package com.decathlon.vitamin

import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.repositories

class VitaminLibraryPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.repositories {
            google()
            mavenCentral()
        }
        target.configureAndroid()
    }
}

@Suppress("UnstableApiUsage")
internal fun Project.configureAndroid() = this.extensions.getByType(LibraryExtension::class).run {
    compileSdk = Versions.AndroidConfig.compileSdk
    defaultConfig {
        minSdk = Versions.AndroidConfig.minSdk
        proguardFile("consumer-rules.pro")
        vectorDrawables {
            useSupportLibrary = true
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        viewBinding = true
    }
}
