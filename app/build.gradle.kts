plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.android.deskclock"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.android.deskclock"
        minSdk = 19
        targetSdk = 25
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}
