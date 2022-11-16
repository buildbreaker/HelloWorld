// Code generated by Wire protocol buffer compiler, do not edit.
// Source: buf.connect.demo.eliza.v1.StringMsg in simple.proto
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
 *  A very simple message with one string
 */
public class StringMsg(
  /**
   *  leading doc comment
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
  )
  public val str: String? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<StringMsg, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  public override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is StringMsg) return false
    if (unknownFields != other.unknownFields) return false
    if (str != other.str) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (str?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  public override fun toString(): String {
    val result = mutableListOf<String>()
    if (str != null) result += """str=${sanitize(str)}"""
    return result.joinToString(prefix = "StringMsg{", separator = ", ", postfix = "}")
  }

  public fun copy(str: String? = this.str, unknownFields: ByteString = this.unknownFields):
      StringMsg = StringMsg(str, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<StringMsg> = object : ProtoAdapter<StringMsg>(
      FieldEncoding.LENGTH_DELIMITED, 
      StringMsg::class, 
      "type.googleapis.com/buf.connect.demo.eliza.v1.StringMsg", 
      PROTO_3, 
      null, 
      "simple.proto"
    ) {
      public override fun encodedSize(`value`: StringMsg): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.str)
        return size
      }

      public override fun encode(writer: ProtoWriter, `value`: StringMsg): Unit {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.str)
        writer.writeBytes(value.unknownFields)
      }

      public override fun encode(writer: ReverseProtoWriter, `value`: StringMsg): Unit {
        writer.writeBytes(value.unknownFields)
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.str)
      }

      public override fun decode(reader: ProtoReader): StringMsg {
        var str: String? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> str = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return StringMsg(
          str = str,
          unknownFields = unknownFields
        )
      }

      public override fun redact(`value`: StringMsg): StringMsg = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}