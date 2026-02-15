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
        vectorDrawables {
            useSupportLibrary = true
        }
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

dependencies {
    implementation("androidx.annotation:annotation:1.1.0-rc01")
    implementation("androidx.core:core:1.2.0-alpha02")
    implementation("androidx.vectordrawable:vectordrawable:1.1.0-beta01")
    implementation("androidx.appcompat:appcompat:1.1.0-beta01")
    implementation("com.google.android.material:material:1.1.0-alpha05")
    implementation("androidx.legacy:legacy-support-v13:1.0.0")
    implementation("androidx.preference:preference:1.1.0-beta01")
    implementation("androidx.gridlayout:gridlayout:1.1.0-alpha01")
    implementation("androidx.percentlayout:percentlayout:1.0.0")
}
