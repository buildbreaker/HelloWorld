// Code generated by Wire protocol buffer compiler, do not edit.
// Source: proto3.simple.HelloResponse in simple.proto
package proto3.simple

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_3
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmField
import okio.ByteString

/**
 *  Hello response
 */
public class HelloResponse(
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<HelloResponse, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  public override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is HelloResponse) return false
    if (unknownFields != other.unknownFields) return false
    return true
  }

  public override fun hashCode(): Int = unknownFields.hashCode()

  public override fun toString(): String = "HelloResponse{}"

  public fun copy(unknownFields: ByteString = this.unknownFields): HelloResponse =
      HelloResponse(unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<HelloResponse> = object : ProtoAdapter<HelloResponse>(
      FieldEncoding.LENGTH_DELIMITED, 
      HelloResponse::class, 
      "type.googleapis.com/proto3.simple.HelloResponse", 
      PROTO_3, 
      null, 
      "simple.proto"
    ) {
      public override fun encodedSize(`value`: HelloResponse): Int {
        var size = value.unknownFields.size
        return size
      }

      public override fun encode(writer: ProtoWriter, `value`: HelloResponse): Unit {
        writer.writeBytes(value.unknownFields)
      }

      public override fun encode(writer: ReverseProtoWriter, `value`: HelloResponse): Unit {
        writer.writeBytes(value.unknownFields)
      }

      public override fun decode(reader: ProtoReader): HelloResponse {
        val unknownFields = reader.forEachTag(reader::readUnknownField)
        return HelloResponse(
          unknownFields = unknownFields
        )
      }

      public override fun redact(`value`: HelloResponse): HelloResponse = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
