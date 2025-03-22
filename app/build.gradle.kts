plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("plugin.serialization") version "2.1.10"
}

android {
    namespace = "software.revolution.xposed"
    compileSdk = 35

    defaultConfig {
        applicationId = "software.revolution.xposed"
        minSdk = 24
        targetSdk = 35
        versionCode = 100
        versionName = "0.1.0"
    }

    buildTypes {
        debug {
            isDebuggable = true
            isMinifyEnabled = false
        }
        release {
            isDebuggable = false
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        buildConfig = true
    }
}

dependencies {
    compileOnly("de.robv.android.xposed:api:82")

    implementation("androidx.core:core-ktx:1.15.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.10.1")
    implementation("io.ktor:ktor-client-core:2.3.4")
    implementation("io.ktor:ktor-client-okhttp:2.3.4")
}
