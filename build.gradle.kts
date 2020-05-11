plugins {
    id("org.jetbrains.kotlin.js") version "1.4-M1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
//    maven("https://dl.bintray.com/kotlin/kotlin-dev")
    maven("https://teamcity.jetbrains.com/guestAuth/app/rest/builds/buildType:(id:Kotlin_KotlinPublic_Compiler),number:1.4.0-dev-8210,branch:(default:any)/artifacts/content/maven")
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(npm("firebase", "7.14.2"))
}

kotlin {
    target {
        browser { }
            //binaries.executable()
    }
}