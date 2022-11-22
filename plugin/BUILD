load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")

kt_jvm_library(
    name = "generator",
    srcs = glob(["**/*.kt"]),
    deps = [
        "@maven//:com_squareup_okio_okio_jvm",
        "@maven//:com_squareup_wire_wire_runtime_jvm",
    ],
)

java_library(
    name = "lib",
    srcs = ["A.java"],
    deps = ["generator"],
)

java_binary(
    name = "generator_exec",
    srcs = ["A.java"],
    main_class = "buildbreaker.plugin.Main",
    deps = ["generator"],
)
