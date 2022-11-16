package buildbreaker

import buf.connect.kotlin.ConnectClientOption
import buf.connect.kotlin.ConnectOkHttpClient
import buf.connect.kotlin.ProtoClientOption
import buf.connect.kotlin.ProtocolClient
import com.buf.connect.demo.eliza.v1.ElizaServiceClient
import com.buf.connect.demo.eliza.v1.SayRequest
import okhttp3.OkHttpClient

fun connect() {
    val client = ProtocolClient(
        target = "https://demo.connect.build",
        httpClient = ConnectOkHttpClient(
            OkHttpClient()
            .newBuilder()
            .build()
        ),
        ConnectClientOption(),
        ProtoClientOption(),
    )

    val elizaServiceClient = ElizaServiceClient(client)

    val response = elizaServiceClient.say(SayRequest(sentence = "Hello!"))

    println(response.message?.sentence)
}
