// Code generated by Wire protocol buffer compiler, do not edit.
// Source: google.protobuf.FieldOptions in descriptor.proto
package com.google.protobuf.compiler

import com.squareup.wire.EnumAdapter
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireEnum
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
import kotlin.jvm.JvmStatic
import okio.ByteString

public class FieldOptions(
  /**
   *  The ctype option instructs the C++ code generator to use a different
   *  representation of the field than it normally would.  See the specific
   *  options below.  This option is not yet implemented in the open source
   *  release -- sorry, we'll try to include it in a future version!
   */
  @field:WireField(
    tag = 1,
    adapter = "com.google.protobuf.FieldOptions${'$'}CType#ADAPTER",
  )
  public val ctype: CType? = null,
  /**
   *  The packed option can be enabled for repeated primitive fields to enable
   *  a more efficient representation on the wire. Rather than repeatedly
   *  writing the tag and type for each element, the entire array is encoded as
   *  a single length-delimited blob. In proto3, only explicit setting it to
   *  false will avoid using packed encoding.
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
  )
  public val packed: Boolean? = null,
  /**
   *  The jstype option determines the JavaScript type used for values of the
   *  field.  The option is permitted only for 64 bit integral and fixed types
   *  (int64, uint64, sint64, fixed64, sfixed64).  A field with jstype JS_STRING
   *  is represented as JavaScript string, which avoids loss of precision that
   *  can happen when a large value is converted to a floating point JavaScript.
   *  Specifying JS_NUMBER for the jstype causes the generated JavaScript code to
   *  use the JavaScript "number" type.  The behavior of the default option
   *  JS_NORMAL is implementation dependent.
   *
   *  This option is an enum to permit additional types to be added, e.g.
   *  goog.math.Integer.
   */
  @field:WireField(
    tag = 6,
    adapter = "com.google.protobuf.FieldOptions${'$'}JSType#ADAPTER",
  )
  public val jstype: JSType? = null,
  /**
   *  Should this field be parsed lazily?  Lazy applies only to message-type
   *  fields.  It means that when the outer message is initially parsed, the
   *  inner message's contents will not be parsed but instead stored in encoded
   *  form.  The inner message will actually be parsed when it is first accessed.
   *
   *  This is only a hint.  Implementations are free to choose whether to use
   *  eager or lazy parsing regardless of the value of this option.  However,
   *  setting this option true suggests that the protocol author believes that
   *  using lazy parsing on this field is worth the additional bookkeeping
   *  overhead typically needed to implement it.
   *
   *  This option does not affect the public interface of any generated code;
   *  all method signatures remain the same.  Furthermore, thread-safety of the
   *  interface is not affected by this option; const methods remain safe to
   *  call from multiple threads concurrently, while non-const methods continue
   *  to require exclusive access.
   *
   *
   *  Note that implementations may choose not to check required fields within
   *  a lazy sub-message.  That is, calling IsInitialized() on the outer message
   *  may return true even if the inner message has missing required fields.
   *  This is necessary because otherwise the inner message would have to be
   *  parsed in order to perform the check, defeating the purpose of lazy
   *  parsing.  An implementation which chooses not to check required fields
   *  must be consistent about it.  That is, for any particular sub-message, the
   *  implementation must either *always* check its required fields, or *never*
   *  check its required fields, regardless of whether or not the message has
   *  been parsed.
   */
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
  )
  public val lazy: Boolean? = null,
  /**
   *  Is this field deprecated?
   *  Depending on the target platform, this can emit Deprecated annotations
   *  for accessors, or it will be completely ignored; in the very least, this
   *  is a formalization for deprecating fields.
   */
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
  )
  public val deprecated: Boolean? = null,
  /**
   *  For Google-internal migration only. Do not use.
   */
  @field:WireField(
    tag = 10,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
  )
  public val weak: Boolean? = null,
  uninterpreted_option: List<UninterpretedOption> = emptyList(),
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<FieldOptions, Nothing>(ADAPTER, unknownFields) {
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
    if (other !is FieldOptions) return false
    if (unknownFields != other.unknownFields) return false
    if (ctype != other.ctype) return false
    if (packed != other.packed) return false
    if (jstype != other.jstype) return false
    if (lazy != other.lazy) return false
    if (deprecated != other.deprecated) return false
    if (weak != other.weak) return false
    if (uninterpreted_option != other.uninterpreted_option) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (ctype?.hashCode() ?: 0)
      result = result * 37 + (packed?.hashCode() ?: 0)
      result = result * 37 + (jstype?.hashCode() ?: 0)
      result = result * 37 + (lazy?.hashCode() ?: 0)
      result = result * 37 + (deprecated?.hashCode() ?: 0)
      result = result * 37 + (weak?.hashCode() ?: 0)
      result = result * 37 + uninterpreted_option.hashCode()
      super.hashCode = result
    }
    return result
  }

  public override fun toString(): String {
    val result = mutableListOf<String>()
    if (ctype != null) result += """ctype=$ctype"""
    if (packed != null) result += """packed=$packed"""
    if (jstype != null) result += """jstype=$jstype"""
    if (lazy != null) result += """lazy=$lazy"""
    if (deprecated != null) result += """deprecated=$deprecated"""
    if (weak != null) result += """weak=$weak"""
    if (uninterpreted_option.isNotEmpty()) result +=
        """uninterpreted_option=$uninterpreted_option"""
    return result.joinToString(prefix = "FieldOptions{", separator = ", ", postfix = "}")
  }

  public fun copy(
    ctype: CType? = this.ctype,
    packed: Boolean? = this.packed,
    jstype: JSType? = this.jstype,
    lazy: Boolean? = this.lazy,
    deprecated: Boolean? = this.deprecated,
    weak: Boolean? = this.weak,
    uninterpreted_option: List<UninterpretedOption> = this.uninterpreted_option,
    unknownFields: ByteString = this.unknownFields,
  ): FieldOptions = FieldOptions(ctype, packed, jstype, lazy, deprecated, weak,
      uninterpreted_option, unknownFields)

  public companion object {
    @JvmField
    public val DEFAULT_CTYPE: CType = CType.STRING

    @JvmField
    public val DEFAULT_JSTYPE: JSType = JSType.JS_NORMAL

    public const val DEFAULT_LAZY: Boolean = false

    public const val DEFAULT_DEPRECATED: Boolean = false

    public const val DEFAULT_WEAK: Boolean = false

    @JvmField
    public val ADAPTER: ProtoAdapter<FieldOptions> = object : ProtoAdapter<FieldOptions>(
      FieldEncoding.LENGTH_DELIMITED, 
      FieldOptions::class, 
      "type.googleapis.com/google.protobuf.FieldOptions", 
      PROTO_2, 
      null, 
      "descriptor.proto"
    ) {
      public override fun encodedSize(`value`: FieldOptions): Int {
        var size = value.unknownFields.size
        size += CType.ADAPTER.encodedSizeWithTag(1, value.ctype)
        size += ProtoAdapter.BOOL.encodedSizeWithTag(2, value.packed)
        size += JSType.ADAPTER.encodedSizeWithTag(6, value.jstype)
        size += ProtoAdapter.BOOL.encodedSizeWithTag(5, value.lazy)
        size += ProtoAdapter.BOOL.encodedSizeWithTag(3, value.deprecated)
        size += ProtoAdapter.BOOL.encodedSizeWithTag(10, value.weak)
        size += UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999,
            value.uninterpreted_option)
        return size
      }

      public override fun encode(writer: ProtoWriter, `value`: FieldOptions): Unit {
        CType.ADAPTER.encodeWithTag(writer, 1, value.ctype)
        ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.packed)
        JSType.ADAPTER.encodeWithTag(writer, 6, value.jstype)
        ProtoAdapter.BOOL.encodeWithTag(writer, 5, value.lazy)
        ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.deprecated)
        ProtoAdapter.BOOL.encodeWithTag(writer, 10, value.weak)
        UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999,
            value.uninterpreted_option)
        writer.writeBytes(value.unknownFields)
      }

      public override fun encode(writer: ReverseProtoWriter, `value`: FieldOptions): Unit {
        writer.writeBytes(value.unknownFields)
        UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999,
            value.uninterpreted_option)
        ProtoAdapter.BOOL.encodeWithTag(writer, 10, value.weak)
        ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.deprecated)
        ProtoAdapter.BOOL.encodeWithTag(writer, 5, value.lazy)
        JSType.ADAPTER.encodeWithTag(writer, 6, value.jstype)
        ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.packed)
        CType.ADAPTER.encodeWithTag(writer, 1, value.ctype)
      }

      public override fun decode(reader: ProtoReader): FieldOptions {
        var ctype: CType? = null
        var packed: Boolean? = null
        var jstype: JSType? = null
        var lazy: Boolean? = null
        var deprecated: Boolean? = null
        var weak: Boolean? = null
        val uninterpreted_option = mutableListOf<UninterpretedOption>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> try {
              ctype = CType.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            2 -> packed = ProtoAdapter.BOOL.decode(reader)
            6 -> try {
              jstype = JSType.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            5 -> lazy = ProtoAdapter.BOOL.decode(reader)
            3 -> deprecated = ProtoAdapter.BOOL.decode(reader)
            10 -> weak = ProtoAdapter.BOOL.decode(reader)
            999 -> uninterpreted_option.add(UninterpretedOption.ADAPTER.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return FieldOptions(
          ctype = ctype,
          packed = packed,
          jstype = jstype,
          lazy = lazy,
          deprecated = deprecated,
          weak = weak,
          uninterpreted_option = uninterpreted_option,
          unknownFields = unknownFields
        )
      }

      public override fun redact(`value`: FieldOptions): FieldOptions = value.copy(
        uninterpreted_option =
            value.uninterpreted_option.redactElements(UninterpretedOption.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }

  public enum class CType(
    public override val `value`: Int,
  ) : WireEnum {
    /**
     *  Default mode.
     */
    STRING(0),
    CORD(1),
    STRING_PIECE(2),
    ;

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<CType> = object : EnumAdapter<CType>(
        CType::class, 
        PROTO_2, 
        CType.STRING
      ) {
        public override fun fromValue(`value`: Int): CType? = CType.fromValue(value)
      }

      @JvmStatic
      public fun fromValue(`value`: Int): CType? = when (value) {
        0 -> STRING
        1 -> CORD
        2 -> STRING_PIECE
        else -> null
      }
    }
  }

  public enum class JSType(
    public override val `value`: Int,
  ) : WireEnum {
    /**
     *  Use the default type.
     */
    JS_NORMAL(0),
    /**
     *  Use JavaScript strings.
     */
    JS_STRING(1),
    /**
     *  Use JavaScript numbers.
     */
    JS_NUMBER(2),
    ;

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<JSType> = object : EnumAdapter<JSType>(
        JSType::class, 
        PROTO_2, 
        JSType.JS_NORMAL
      ) {
        public override fun fromValue(`value`: Int): JSType? = JSType.fromValue(value)
      }

      @JvmStatic
      public fun fromValue(`value`: Int): JSType? = when (value) {
        0 -> JS_NORMAL
        1 -> JS_STRING
        2 -> JS_NUMBER
        else -> null
      }
    }
  }
}