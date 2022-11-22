// Code generated by Wire protocol buffer compiler, do not edit.
// Source: google.protobuf.MessageOptions in descriptor.proto
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

public class MessageOptions(
  /**
   *  Set true to use the old proto1 MessageSet wire format for extensions.
   *  This is provided for backwards-compatibility with the MessageSet wire
   *  format.  You should not use this for any other reason:  It's less
   *  efficient, has fewer features, and is more complicated.
   *
   *  The message must be defined exactly as follows:
   *    message Foo {
   *      option message_set_wire_format = true;
   *      extensions 4 to max;
   *    }
   *  Note that the message cannot have any defined fields; MessageSets only
   *  have extensions.
   *
   *  All extensions of your type must be singular messages; e.g. they cannot
   *  be int32s, enums, or repeated messages.
   *
   *  Because this is an option, the above two restrictions are not enforced by
   *  the protocol compiler.
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
    jsonName = "messageSetWireFormat",
  )
  public val message_set_wire_format: Boolean? = null,
  /**
   *  Disables the generation of the standard "descriptor()" accessor, which can
   *  conflict with a field of the same name.  This is meant to make migration
   *  from proto1 easier; new code should avoid fields named "descriptor".
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
    jsonName = "noStandardDescriptorAccessor",
  )
  public val no_standard_descriptor_accessor: Boolean? = null,
  /**
   *  Is this message deprecated?
   *  Depending on the target platform, this can emit Deprecated annotations
   *  for the message, or it will be completely ignored; in the very least,
   *  this is a formalization for deprecating messages.
   */
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
  )
  public val deprecated: Boolean? = null,
  /**
   *  Whether the message is an automatically generated map entry type for the
   *  maps field.
   *
   *  For maps fields:
   *      map<KeyType, ValueType> map_field = 1;
   *  The parsed descriptor looks like:
   *      message MapFieldEntry {
   *          option map_entry = true;
   *          optional KeyType key = 1;
   *          optional ValueType value = 2;
   *      }
   *      repeated MapFieldEntry map_field = 1;
   *
   *  Implementations may choose not to generate the map_entry=true message, but
   *  use a native map in the target language to hold the keys and values.
   *  The reflection APIs in such implementations still need to work as
   *  if the field is a repeated message field.
   *
   *  NOTE: Do not set the option in .proto files. Always use the maps syntax
   *  instead. The option should only be implicitly set by the proto compiler
   *  parser.
   */
  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
    jsonName = "mapEntry",
  )
  public val map_entry: Boolean? = null,
  uninterpreted_option: List<UninterpretedOption> = emptyList(),
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<MessageOptions, Nothing>(ADAPTER, unknownFields) {
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
    if (other !is MessageOptions) return false
    if (unknownFields != other.unknownFields) return false
    if (message_set_wire_format != other.message_set_wire_format) return false
    if (no_standard_descriptor_accessor != other.no_standard_descriptor_accessor) return false
    if (deprecated != other.deprecated) return false
    if (map_entry != other.map_entry) return false
    if (uninterpreted_option != other.uninterpreted_option) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (message_set_wire_format?.hashCode() ?: 0)
      result = result * 37 + (no_standard_descriptor_accessor?.hashCode() ?: 0)
      result = result * 37 + (deprecated?.hashCode() ?: 0)
      result = result * 37 + (map_entry?.hashCode() ?: 0)
      result = result * 37 + uninterpreted_option.hashCode()
      super.hashCode = result
    }
    return result
  }

  public override fun toString(): String {
    val result = mutableListOf<String>()
    if (message_set_wire_format != null) result +=
        """message_set_wire_format=$message_set_wire_format"""
    if (no_standard_descriptor_accessor != null) result +=
        """no_standard_descriptor_accessor=$no_standard_descriptor_accessor"""
    if (deprecated != null) result += """deprecated=$deprecated"""
    if (map_entry != null) result += """map_entry=$map_entry"""
    if (uninterpreted_option.isNotEmpty()) result +=
        """uninterpreted_option=$uninterpreted_option"""
    return result.joinToString(prefix = "MessageOptions{", separator = ", ", postfix = "}")
  }

  public fun copy(
    message_set_wire_format: Boolean? = this.message_set_wire_format,
    no_standard_descriptor_accessor: Boolean? = this.no_standard_descriptor_accessor,
    deprecated: Boolean? = this.deprecated,
    map_entry: Boolean? = this.map_entry,
    uninterpreted_option: List<UninterpretedOption> = this.uninterpreted_option,
    unknownFields: ByteString = this.unknownFields,
  ): MessageOptions = MessageOptions(message_set_wire_format, no_standard_descriptor_accessor,
      deprecated, map_entry, uninterpreted_option, unknownFields)

  public companion object {
    public const val DEFAULT_MESSAGE_SET_WIRE_FORMAT: Boolean = false

    public const val DEFAULT_NO_STANDARD_DESCRIPTOR_ACCESSOR: Boolean = false

    public const val DEFAULT_DEPRECATED: Boolean = false

    @JvmField
    public val ADAPTER: ProtoAdapter<MessageOptions> = object : ProtoAdapter<MessageOptions>(
      FieldEncoding.LENGTH_DELIMITED, 
      MessageOptions::class, 
      "type.googleapis.com/google.protobuf.MessageOptions", 
      PROTO_2, 
      null, 
      "descriptor.proto"
    ) {
      public override fun encodedSize(`value`: MessageOptions): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.BOOL.encodedSizeWithTag(1, value.message_set_wire_format)
        size += ProtoAdapter.BOOL.encodedSizeWithTag(2, value.no_standard_descriptor_accessor)
        size += ProtoAdapter.BOOL.encodedSizeWithTag(3, value.deprecated)
        size += ProtoAdapter.BOOL.encodedSizeWithTag(7, value.map_entry)
        size += UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999,
            value.uninterpreted_option)
        return size
      }

      public override fun encode(writer: ProtoWriter, `value`: MessageOptions): Unit {
        ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.message_set_wire_format)
        ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.no_standard_descriptor_accessor)
        ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.deprecated)
        ProtoAdapter.BOOL.encodeWithTag(writer, 7, value.map_entry)
        UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999,
            value.uninterpreted_option)
        writer.writeBytes(value.unknownFields)
      }

      public override fun encode(writer: ReverseProtoWriter, `value`: MessageOptions): Unit {
        writer.writeBytes(value.unknownFields)
        UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999,
            value.uninterpreted_option)
        ProtoAdapter.BOOL.encodeWithTag(writer, 7, value.map_entry)
        ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.deprecated)
        ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.no_standard_descriptor_accessor)
        ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.message_set_wire_format)
      }

      public override fun decode(reader: ProtoReader): MessageOptions {
        var message_set_wire_format: Boolean? = null
        var no_standard_descriptor_accessor: Boolean? = null
        var deprecated: Boolean? = null
        var map_entry: Boolean? = null
        val uninterpreted_option = mutableListOf<UninterpretedOption>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> message_set_wire_format = ProtoAdapter.BOOL.decode(reader)
            2 -> no_standard_descriptor_accessor = ProtoAdapter.BOOL.decode(reader)
            3 -> deprecated = ProtoAdapter.BOOL.decode(reader)
            7 -> map_entry = ProtoAdapter.BOOL.decode(reader)
            999 -> uninterpreted_option.add(UninterpretedOption.ADAPTER.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return MessageOptions(
          message_set_wire_format = message_set_wire_format,
          no_standard_descriptor_accessor = no_standard_descriptor_accessor,
          deprecated = deprecated,
          map_entry = map_entry,
          uninterpreted_option = uninterpreted_option,
          unknownFields = unknownFields
        )
      }

      public override fun redact(`value`: MessageOptions): MessageOptions = value.copy(
        uninterpreted_option =
            value.uninterpreted_option.redactElements(UninterpretedOption.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
