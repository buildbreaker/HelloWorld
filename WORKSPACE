load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

http_archive(
    name = "io_bazel_rules_kotlin",
    sha256 = "f033fa36f51073eae224f18428d9493966e67c27387728b6be2ebbdae43f140e",
    urls = ["https://github.com/bazelbuild/rules_kotlin/releases/download/v1.7.0-RC-3/rules_kotlin_release.tgz"],
)

load("@io_bazel_rules_kotlin//kotlin:repositories.bzl", "kotlin_repositories", "kotlinc_version")

kotlin_repositories(
    compiler_release = kotlinc_version(
        release = "1.6.21",  # just the numeric version
        sha256 = "632166fed89f3f430482f5aa07f2e20b923b72ef688c8f5a7df3aa1502c6d8ba",
    ),
)

load("@io_bazel_rules_kotlin//kotlin:core.bzl", "kt_register_toolchains")

kt_register_toolchains()

# For maven
http_archive(
    name = "rules_jvm_external",
    sha256 = "f36441aa876c4f6427bfb2d1f2d723b48e9d930b62662bf723ddfb8fc80f0140",
    strip_prefix = "rules_jvm_external-4.1",
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/4.1.zip",
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "build.buf:connect-library-pt:0.0.0-TEST1",
        "com.squareup.okhttp3:okhttp:4.10.0",

        "com.squareup.wire:wire-runtime-jvm:4.4.1",
        "com.squareup.okio:okio-jvm:3.0.0",
        "com.squareup.wire:wire-moshi-adapter:4.4.1",

        # Android dependencies
        "com.android.support:appcompat-v7:26.1.0",
        "com.android.support.constraint:constraint-layout:1.0.2",
        "androidx.recyclerview:recyclerview:1.2.0",
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4",
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4",
    ],
    repositories = [
        "https://maven.google.com",
        "https://s01.oss.sonatype.org",
        "https://repo1.maven.org/maven2",
        "https://jcenter.bintray.com",
    ],
    version_conflict_policy = "pinned",
)

http_archive(
    name = "build_bazel_rules_android",
    sha256 = "cd06d15dd8bb59926e4d65f9003bfc20f9da4b2519985c27e190cddc8b7a7806",
    strip_prefix = "rules_android-0.1.1",
    urls = ["https://github.com/bazelbuild/rules_android/archive/v0.1.1.zip"],
)

load("@build_bazel_rules_android//android:rules.bzl", "android_sdk_repository")

android_sdk_repository(
    name = "androidsdk",
    build_tools_version = "30.0.3",
)
