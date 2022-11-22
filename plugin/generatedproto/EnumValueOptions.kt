// Code generated by Wire protocol buffer compiler, do not edit.
// Source: google.protobuf.EnumValueOptions in descriptor.proto
package com.google.protobuf.compiler

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.immutableCopyOf
import com.squareup.wire.`internal`.redactElements
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
import kotlin.collections.List
import kotlin.jvm.JvmField
import okio.ByteString

public class EnumValueOptions(
  /**
   *  Is this enum value deprecated?
   *  Depending on the target platform, this can emit Deprecated annotations
   *  for the enum value, or it will be completely ignored; in the very least,
   *  this is a formalization for deprecating enum values.
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
  )
  public val deprecated: Boolean? = null,
  uninterpreted_option: List<UninterpretedOption> = emptyList(),
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<EnumValueOptions, Nothing>(ADAPTER, unknownFields) {
  /**
   *  The parser stores options it doesn't recognize here. See above.
   */
  @field:WireField(
    tag = 999,
    adapter = "com.google.protobuf.UninterpretedOption#ADAPTER",
    label = WireField.Label.REPEATED,
    jsonName = "uninterpretedOption",
  )
  public val uninterpreted_option: List<UninterpretedOption> =
      immutableCopyOf("uninterpreted_option", uninterpreted_option)

  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  public override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is EnumValueOptions) return false
    if (unknownFields != other.unknownFields) return false
    if (deprecated != other.deprecated) return false
    if (uninterpreted_option != other.uninterpreted_option) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (deprecated?.hashCode() ?: 0)
      result = result * 37 + uninterpreted_option.hashCode()
      super.hashCode = result
    }
    return result
  }

  public override fun toString(): String {
    val result = mutableListOf<String>()
    if (deprecated != null) result += """deprecated=$deprecated"""
    if (uninterpreted_option.isNotEmpty()) result +=
        """uninterpreted_option=$uninterpreted_option"""
    return result.joinToString(prefix = "EnumValueOptions{", separator = ", ", postfix = "}")
  }

  public fun copy(
    deprecated: Boolean? = this.deprecated,
    uninterpreted_option: List<UninterpretedOption> = this.uninterpreted_option,
    unknownFields: ByteString = this.unknownFields,
  ): EnumValueOptions = EnumValueOptions(deprecated, uninterpreted_option, unknownFields)

  public companion object {
    public const val DEFAULT_DEPRECATED: Boolean = false

    @JvmField
    public val ADAPTER: ProtoAdapter<EnumValueOptions> = object : ProtoAdapter<EnumValueOptions>(
      FieldEncoding.LENGTH_DELIMITED, 
      EnumValueOptions::class, 
      "type.googleapis.com/google.protobuf.EnumValueOptions", 
      PROTO_2, 
      null, 
      "descriptor.proto"
    ) {
      public override fun encodedSize(`value`: EnumValueOptions): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.BOOL.encodedSizeWithTag(1, value.deprecated)
        size += UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999,
            value.uninterpreted_option)
        return size
      }

      public override fun encode(writer: ProtoWriter, `value`: EnumValueOptions): Unit {
        ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.deprecated)
        UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999,
            value.uninterpreted_option)
        writer.writeBytes(value.unknownFields)
      }

      public override fun encode(writer: ReverseProtoWriter, `value`: EnumValueOptions): Unit {
        writer.writeBytes(value.unknownFields)
        UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999,
            value.uninterpreted_option)
        ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.deprecated)
      }

      public override fun decode(reader: ProtoReader): EnumValueOptions {
        var deprecated: Boolean? = null
        val uninterpreted_option = mutableListOf<UninterpretedOption>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> deprecated = ProtoAdapter.BOOL.decode(reader)
            999 -> uninterpreted_option.add(UninterpretedOption.ADAPTER.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return EnumValueOptions(
          deprecated = deprecated,
          uninterpreted_option = uninterpreted_option,
          unknownFields = unknownFields
        )
      }

      public override fun redact(`value`: EnumValueOptions): EnumValueOptions = value.copy(
        uninterpreted_option =
            value.uninterpreted_option.redactElements(UninterpretedOption.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}