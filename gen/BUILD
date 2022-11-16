load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")

kt_jvm_library(
    name = "generated_sources",
    srcs = glob(["proto/**/*.kt",]),
    visibility = ["//visibility:public"],
    deps = [
        "@maven//:build_buf_connect_library_pt",
        "@maven//:com_squareup_okhttp3_okhttp",
        "@maven//:com_squareup_wire_wire_runtime_jvm",
        "@maven//:com_squareup_okio_okio_jvm",
    ],
)
