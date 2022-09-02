// Code generated by Wire protocol buffer compiler, do not edit.
// Source: proto3.simple.MessageFieldMsg in simple.proto
package proto3.simple

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
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
 *  trailing docs for MessageFieldMsg
 */
public class MessageFieldMsg(
  /**
   *  trailing doc comment
   */
  @field:WireField(
    tag = 1,
    adapter = "proto3.simple.StringMsg#ADAPTER",
  )
  public val msg: StringMsg? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<MessageFieldMsg, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  public override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is MessageFieldMsg) return false
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
    return result.joinToString(prefix = "MessageFieldMsg{", separator = ", ", postfix = "}")
  }

  public fun copy(msg: StringMsg? = this.msg, unknownFields: ByteString = this.unknownFields):
      MessageFieldMsg = MessageFieldMsg(msg, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<MessageFieldMsg> = object : ProtoAdapter<MessageFieldMsg>(
      FieldEncoding.LENGTH_DELIMITED, 
      MessageFieldMsg::class, 
      "type.googleapis.com/proto3.simple.MessageFieldMsg", 
      PROTO_3, 
      null, 
      "simple.proto"
    ) {
      public override fun encodedSize(`value`: MessageFieldMsg): Int {
        var size = value.unknownFields.size
        size += StringMsg.ADAPTER.encodedSizeWithTag(1, value.msg)
        return size
      }

      public override fun encode(writer: ProtoWriter, `value`: MessageFieldMsg): Unit {
        StringMsg.ADAPTER.encodeWithTag(writer, 1, value.msg)
        writer.writeBytes(value.unknownFields)
      }

      public override fun encode(writer: ReverseProtoWriter, `value`: MessageFieldMsg): Unit {
        writer.writeBytes(value.unknownFields)
        StringMsg.ADAPTER.encodeWithTag(writer, 1, value.msg)
      }

      public override fun decode(reader: ProtoReader): MessageFieldMsg {
        var msg: StringMsg? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> msg = StringMsg.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return MessageFieldMsg(
          msg = msg,
          unknownFields = unknownFields
        )
      }

      public override fun redact(`value`: MessageFieldMsg): MessageFieldMsg = value.copy(
        msg = value.msg?.let(StringMsg.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
