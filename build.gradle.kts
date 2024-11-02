// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.google.services) apply false
    alias(libs.plugins.daggerHilt) apply false
    alias(libs.plugins.org.jetbrains.kotlin.kapt) apply false
}

tasks.register("clean", Delete::class) {
    delete(project.layout.buildDirectory)
}