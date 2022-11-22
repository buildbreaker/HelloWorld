// Code generated by Wire protocol buffer compiler, do not edit.
// Source: buf.connect.demo.eliza.v1.NestedMsg in simple.proto
package com.buf.connect.demo.eliza.v1

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireField
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
 *  NestedMsg
 */
public class NestedMsg(
  /**
   *  InnerMsg field
   */
  @field:WireField(
    tag = 1,
    adapter = "com.buf.connect.demo.eliza.v1.NestedMsg${'$'}InnerMsg#ADAPTER",
  )
  public val msg: InnerMsg? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<NestedMsg, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  public override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is NestedMsg) return false
    if (unknownFields != other.unknownFields) return false
    if (msg != other.msg) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (msg?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  public override fun toString(): String {
    val result = mutableListOf<String>()
    if (msg != null) result += """msg=$msg"""
    return result.joinToString(prefix = "NestedMsg{", separator = ", ", postfix = "}")
  }

  public fun copy(msg: InnerMsg? = this.msg, unknownFields: ByteString = this.unknownFields):
      NestedMsg = NestedMsg(msg, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<NestedMsg> = object : ProtoAdapter<NestedMsg>(
      FieldEncoding.LENGTH_DELIMITED, 
      NestedMsg::class, 
      "type.googleapis.com/buf.connect.demo.eliza.v1.NestedMsg", 
      PROTO_3, 
      null, 
      "simple.proto"
    ) {
      public override fun encodedSize(`value`: NestedMsg): Int {
        var size = value.unknownFields.size
        size += InnerMsg.ADAPTER.encodedSizeWithTag(1, value.msg)
        return size
      }

      public override fun encode(writer: ProtoWriter, `value`: NestedMsg): Unit {
        InnerMsg.ADAPTER.encodeWithTag(writer, 1, value.msg)
        writer.writeBytes(value.unknownFields)
      }

      public override fun encode(writer: ReverseProtoWriter, `value`: NestedMsg): Unit {
        writer.writeBytes(value.unknownFields)
        InnerMsg.ADAPTER.encodeWithTag(writer, 1, value.msg)
      }

      public override fun decode(reader: ProtoReader): NestedMsg {
        var msg: InnerMsg? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> msg = InnerMsg.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return NestedMsg(
          msg = msg,
          unknownFields = unknownFields
        )
      }

      public override fun redact(`value`: NestedMsg): NestedMsg = value.copy(
        msg = value.msg?.let(InnerMsg.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }

  /**
   *  This message is nested inside another
   */
  public class InnerMsg(
    /**
     *  InnerMsg field
     */
    @field:WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
    )
    public val i: Int? = null,
    unknownFields: ByteString = ByteString.EMPTY,
  ) : Message<InnerMsg, Nothing>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN,
    )
    public override fun newBuilder(): Nothing = throw
        AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

    public override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is InnerMsg) return false
      if (unknownFields != other.unknownFields) return false
      if (i != other.i) return false
      return true
    }

    public override fun hashCode(): Int {
      var result = super.hashCode
      if (result == 0) {
        result = unknownFields.hashCode()
        result = result * 37 + (i?.hashCode() ?: 0)
        super.hashCode = result
      }
      return result
    }

    public override fun toString(): String {
      val result = mutableListOf<String>()
      if (i != null) result += """i=$i"""
      return result.joinToString(prefix = "InnerMsg{", separator = ", ", postfix = "}")
    }

    public fun copy(i: Int? = this.i, unknownFields: ByteString = this.unknownFields): InnerMsg =
        InnerMsg(i, unknownFields)

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<InnerMsg> = object : ProtoAdapter<InnerMsg>(
        FieldEncoding.LENGTH_DELIMITED, 
        InnerMsg::class, 
        "type.googleapis.com/buf.connect.demo.eliza.v1.NestedMsg.InnerMsg", 
        PROTO_3, 
        null, 
        "simple.proto"
      ) {
        public override fun encodedSize(`value`: InnerMsg): Int {
          var size = value.unknownFields.size
          size += ProtoAdapter.INT32.encodedSizeWithTag(1, value.i)
          return size
        }

        public override fun encode(writer: ProtoWriter, `value`: InnerMsg): Unit {
          ProtoAdapter.INT32.encodeWithTag(writer, 1, value.i)
          writer.writeBytes(value.unknownFields)
        }

        public override fun encode(writer: ReverseProtoWriter, `value`: InnerMsg): Unit {
          writer.writeBytes(value.unknownFields)
          ProtoAdapter.INT32.encodeWithTag(writer, 1, value.i)
        }

        public override fun decode(reader: ProtoReader): InnerMsg {
          var i: Int? = null
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              1 -> i = ProtoAdapter.INT32.decode(reader)
              else -> reader.readUnknownField(tag)
            }
          }
          return InnerMsg(
            i = i,
            unknownFields = unknownFields
          )
        }

        public override fun redact(`value`: InnerMsg): InnerMsg = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L
    }
  }
}
