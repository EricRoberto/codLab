plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(30)
    buildToolsVersion("30.0.2")

    defaultConfig {
        applicationId = "com.aprendizadodo.kotlinfundamentals"
        minSdkVersion(19)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
        vectorDrawables.useSupportLibrary = true
        testInstrumentationRunner ="androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    //implementation (fileTree(dir: "libs", include: ["*.jar"]))
    implementation (fileTree("libs") {include(listOf("*.jar"))})
    implementation(Libs.kotlin)
    implementation(Libs.core)
    implementation(Libs.appCompat)
    implementation(Libs.constraintLayout)
    implementation(Libs.rxJava)
    implementation(Libs.rxJavaAndroid)
    testImplementation(TestLibs.jUnit)
    androidTestImplementation(TestLibs.testExt)
    androidTestImplementation(TestLibs.espresso)

}