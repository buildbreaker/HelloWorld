java_library(
    name = "local_buf",
    srcs = glob(["*.java"]),
    deps = [],
)

java_library(
    name = "local_envoy",
    srcs = glob(["BufInterface.java"]),
    deps = [],
)

genrule(
    name = "upload_envoy",
    srcs = ["local_envoy"],
    outs = ["envoy.jar"],
    cmd = """
        cp $< $@
        python3 java_playground/upload.py --local --group_id="io.envoyproxy.envoy" --files $@ java_playground/envoy_pom.xml
    """,
    tags = ["local"]
)

genrule(
    name = "upload_buf",
    srcs = ["local_buf"],
    outs = ["buf.jar"],
    cmd = """
        cp $< $@
        python3 java_playground/upload.py --local --group_id="build.buf" --files $@ java_playground/buf_pom.xml
    """,
    tags = ["local"]
)