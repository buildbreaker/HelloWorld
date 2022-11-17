import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven {
        url = uri("https://s01.oss.sonatype.org/")
    }
    mavenCentral()
}

dependencies {
    implementation("build.buf:connect-library-pt:0.0.0-TEST2")
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    implementation("com.squareup.wire:wire-runtime-jvm:4.4.1")
    implementation("com.squareup.okio:okio-jvm:3.0.0")
    implementation("com.squareup.wire:wire-moshi-adapter:4.4.1")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}
