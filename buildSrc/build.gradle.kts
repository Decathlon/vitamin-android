import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.31"
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions.apiVersion = "1.5"
}

gradlePlugin {
    plugins.register("VitaminLibraryPlugin") {
        id = "VitaminLibraryPlugin"
        implementationClass = "com.decathlon.vitamin.VitaminLibraryPlugin"
    }
}

dependencies {
    implementation(gradleApi())
    implementation("com.android.tools.build:gradle:7.0.3")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
    implementation("org.sonarsource.scanner.gradle:sonarqube-gradle-plugin:3.3")
    implementation("com.vanniktech:gradle-maven-publish-plugin:0.15.1")
}
