// Code generated by Wire protocol buffer compiler, do not edit.
// Source: google.protobuf.EnumValueDescriptorProto in descriptor.proto
package com.google.protobuf.compiler

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
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
 *  Describes a value within an enum.
 */
public class EnumValueDescriptorProto(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
  )
  public val name: String? = null,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
  )
  public val number: Int? = null,
  @field:WireField(
    tag = 3,
    adapter = "com.google.protobuf.EnumValueOptions#ADAPTER",
  )
  public val options: EnumValueOptions? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<EnumValueDescriptorProto, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  public override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is EnumValueDescriptorProto) return false
    if (unknownFields != other.unknownFields) return false
    if (name != other.name) return false
    if (number != other.number) return false
    if (options != other.options) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (name?.hashCode() ?: 0)
      result = result * 37 + (number?.hashCode() ?: 0)
      result = result * 37 + (options?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  public override fun toString(): String {
    val result = mutableListOf<String>()
    if (name != null) result += """name=${sanitize(name)}"""
    if (number != null) result += """number=$number"""
    if (options != null) result += """options=$options"""
    return result.joinToString(prefix = "EnumValueDescriptorProto{", separator = ", ", postfix =
        "}")
  }

  public fun copy(
    name: String? = this.name,
    number: Int? = this.number,
    options: EnumValueOptions? = this.options,
    unknownFields: ByteString = this.unknownFields,
  ): EnumValueDescriptorProto = EnumValueDescriptorProto(name, number, options, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<EnumValueDescriptorProto> = object :
        ProtoAdapter<EnumValueDescriptorProto>(
      FieldEncoding.LENGTH_DELIMITED, 
      EnumValueDescriptorProto::class, 
      "type.googleapis.com/google.protobuf.EnumValueDescriptorProto", 
      PROTO_2, 
      null, 
      "descriptor.proto"
    ) {
      public override fun encodedSize(`value`: EnumValueDescriptorProto): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.name)
        size += ProtoAdapter.INT32.encodedSizeWithTag(2, value.number)
        size += EnumValueOptions.ADAPTER.encodedSizeWithTag(3, value.options)
        return size
      }

      public override fun encode(writer: ProtoWriter, `value`: EnumValueDescriptorProto): Unit {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name)
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.number)
        EnumValueOptions.ADAPTER.encodeWithTag(writer, 3, value.options)
        writer.writeBytes(value.unknownFields)
      }

      public override fun encode(writer: ReverseProtoWriter, `value`: EnumValueDescriptorProto):
          Unit {
        writer.writeBytes(value.unknownFields)
        EnumValueOptions.ADAPTER.encodeWithTag(writer, 3, value.options)
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.number)
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name)
      }

      public override fun decode(reader: ProtoReader): EnumValueDescriptorProto {
        var name: String? = null
        var number: Int? = null
        var options: EnumValueOptions? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> name = ProtoAdapter.STRING.decode(reader)
            2 -> number = ProtoAdapter.INT32.decode(reader)
            3 -> options = EnumValueOptions.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return EnumValueDescriptorProto(
          name = name,
          number = number,
          options = options,
          unknownFields = unknownFields
        )
      }

      public override fun redact(`value`: EnumValueDescriptorProto): EnumValueDescriptorProto =
          value.copy(
        options = value.options?.let(EnumValueOptions.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}