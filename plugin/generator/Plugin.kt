package buildbreaker.plugin.generator

import com.google.protobuf.compiler.CodeGeneratorRequest
import java.io.InputStream
import java.io.IOException
import com.google.protobuf.compiler.CodeGeneratorResponse
import okio.Buffer
import java.lang.RuntimeException
import java.io.OutputStream

object Plugin {
    private val inputStream: InputStream  = System.`in`
    private val outputStream: OutputStream = System.out
    fun run() {
        val request = try {
            val inputStream = inputStream
            val rawRequest = Buffer().readFrom(inputStream).readByteString()
            CodeGeneratorRequest.ADAPTER.decode(rawRequest)
        } catch (e: IOException) {
            throw PluginException("protoc sent unparseable request to plugin.", e)
        }
        val response = CodeGeneratorResponse(
            file_ = request.file_to_generate.map { name ->
                  CodeGeneratorResponse.File(name, content = "file contents for $name")
            }
        )
        outputStream.write(response.encode())
        outputStream.flush()
    }

    class PluginException(message: String?, cause: Throwable?) : RuntimeException(message, cause)
}