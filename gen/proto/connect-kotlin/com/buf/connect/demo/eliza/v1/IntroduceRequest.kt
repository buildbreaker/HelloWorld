// Code generated by Wire protocol buffer compiler, do not edit.
// Source: buf.connect.demo.eliza.v1.IntroduceRequest in eliza.proto
package com.buf.connect.demo.eliza.v1

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.sanitize
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
 *  IntroduceRequest describes a request for details from the ELIZA program.
 */
public class IntroduceRequest(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
  )
  public val name: String? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<IntroduceRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  public override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is IntroduceRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (name != other.name) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (name?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  public override fun toString(): String {
    val result = mutableListOf<String>()
    if (name != null) result += """name=${sanitize(name)}"""
    return result.joinToString(prefix = "IntroduceRequest{", separator = ", ", postfix = "}")
  }

  public fun copy(name: String? = this.name, unknownFields: ByteString = this.unknownFields):
      IntroduceRequest = IntroduceRequest(name, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<IntroduceRequest> = object : ProtoAdapter<IntroduceRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      IntroduceRequest::class, 
      "type.googleapis.com/buf.connect.demo.eliza.v1.IntroduceRequest", 
      PROTO_3, 
      null, 
      "eliza.proto"
    ) {
      public override fun encodedSize(`value`: IntroduceRequest): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.name)
        return size
      }

      public override fun encode(writer: ProtoWriter, `value`: IntroduceRequest): Unit {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name)
        writer.writeBytes(value.unknownFields)
      }

      public override fun encode(writer: ReverseProtoWriter, `value`: IntroduceRequest): Unit {
        writer.writeBytes(value.unknownFields)
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name)
      }

      public override fun decode(reader: ProtoReader): IntroduceRequest {
        var name: String? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> name = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return IntroduceRequest(
          name = name,
          unknownFields = unknownFields
        )
      }

      public override fun redact(`value`: IntroduceRequest): IntroduceRequest = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
