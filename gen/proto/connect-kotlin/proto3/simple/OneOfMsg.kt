// Code generated by Wire protocol buffer compiler, do not edit.
// Source: proto3.simple.OneOfMsg in simple.proto
package proto3.simple

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.countNonNull
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
 *  OneOfMsg
 */
public class OneOfMsg(
  /**
   *  oneof str_a
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    jsonName = "strA",
    oneofName = "some_oneof",
  )
  public val str_a: String? = null,
  /**
   *  oneof str_b
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    jsonName = "strB",
    oneofName = "some_oneof",
  )
  public val str_b: String? = null,
  /**
   *  present
   */
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    jsonName = "alwaysPresent",
  )
  public val always_present: String? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<OneOfMsg, Nothing>(ADAPTER, unknownFields) {
  init {
    require(countNonNull(str_a, str_b) <= 1) {
      "At most one of str_a, str_b may be non-null"
    }
  }

  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  public override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is OneOfMsg) return false
    if (unknownFields != other.unknownFields) return false
    if (str_a != other.str_a) return false
    if (str_b != other.str_b) return false
    if (always_present != other.always_present) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (str_a?.hashCode() ?: 0)
      result = result * 37 + (str_b?.hashCode() ?: 0)
      result = result * 37 + (always_present?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  public override fun toString(): String {
    val result = mutableListOf<String>()
    if (str_a != null) result += """str_a=${sanitize(str_a)}"""
    if (str_b != null) result += """str_b=${sanitize(str_b)}"""
    if (always_present != null) result += """always_present=${sanitize(always_present)}"""
    return result.joinToString(prefix = "OneOfMsg{", separator = ", ", postfix = "}")
  }

  public fun copy(
    str_a: String? = this.str_a,
    str_b: String? = this.str_b,
    always_present: String? = this.always_present,
    unknownFields: ByteString = this.unknownFields,
  ): OneOfMsg = OneOfMsg(str_a, str_b, always_present, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<OneOfMsg> = object : ProtoAdapter<OneOfMsg>(
      FieldEncoding.LENGTH_DELIMITED, 
      OneOfMsg::class, 
      "type.googleapis.com/proto3.simple.OneOfMsg", 
      PROTO_3, 
      null, 
      "simple.proto"
    ) {
      public override fun encodedSize(`value`: OneOfMsg): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.str_a)
        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.str_b)
        size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.always_present)
        return size
      }

      public override fun encode(writer: ProtoWriter, `value`: OneOfMsg): Unit {
        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.always_present)
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.str_a)
        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.str_b)
        writer.writeBytes(value.unknownFields)
      }

      public override fun encode(writer: ReverseProtoWriter, `value`: OneOfMsg): Unit {
        writer.writeBytes(value.unknownFields)
        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.str_b)
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.str_a)
        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.always_present)
      }

      public override fun decode(reader: ProtoReader): OneOfMsg {
        var str_a: String? = null
        var str_b: String? = null
        var always_present: String? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> str_a = ProtoAdapter.STRING.decode(reader)
            2 -> str_b = ProtoAdapter.STRING.decode(reader)
            3 -> always_present = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return OneOfMsg(
          str_a = str_a,
          str_b = str_b,
          always_present = always_present,
          unknownFields = unknownFields
        )
      }

      public override fun redact(`value`: OneOfMsg): OneOfMsg = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
