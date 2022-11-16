load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")

kt_jvm_library(
    name = "hello",
    srcs = ["Hello.kt"],
    deps = [
        "@maven//:build_buf_connect_library_pt",
        "//gen:generated_sources"
    ],
)
