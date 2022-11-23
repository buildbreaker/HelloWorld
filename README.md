# HelloWorld
Hello World

# Dealing with teavm

	# initial
	$ git clone https://github.com/fermyon/teavm-wasi && cd teavm-wasi
	teavm-wasi $ git apply 0001-Minimal-changes-for-square-wire.patch
	teavm-wasi $ mvn install -Dmaven.test.skip=true


	# incremental
	teavm-wasi $ mvn --projects classlib install -Dmaven.test.skip=true -Dmaven.javadoc.skip=true -Dcheckstyle.skip

	# this project
	HelloWorld $ bazelisk build  //plugin:generator_exec_deploy.jar && mvn package -e
	HelloWorld $ wasm-objdump --section 'import' --details target/generated/wasm/teavm-wasm/classes.wasm

	HelloWorld $ cat request.proto.bin | wasmtime target/generated/wasm/teavm-wasm/classes.wasm | protoc --decode=google.protobuf.compiler.CodeGeneratorResponse google/protobuf/compiler/plugin.proto
