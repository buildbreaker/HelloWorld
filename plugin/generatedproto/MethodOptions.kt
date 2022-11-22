// Code generated by Wire protocol buffer compiler, do not edit.
// Source: google.protobuf.MethodOptions in descriptor.proto
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

public class MethodOptions(
  /**
   *  Is this method deprecated?
   *  Depending on the target platform, this can emit Deprecated annotations
   *  for the method, or it will be completely ignored; in the very least,
   *  this is a formalization for deprecating methods.
   */
  @field:WireField(
    tag = 33,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
  )
  public val deprecated: Boolean? = null,
  @field:WireField(
    tag = 34,
    adapter = "com.google.protobuf.MethodOptions${'$'}IdempotencyLevel#ADAPTER",
    jsonName = "idempotencyLevel",
  )
  public val idempotency_level: IdempotencyLevel? = null,
  uninterpreted_option: List<UninterpretedOption> = emptyList(),
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<MethodOptions, Nothing>(ADAPTER, unknownFields) {
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
    if (other !is MethodOptions) return false
    if (unknownFields != other.unknownFields) return false
    if (deprecated != other.deprecated) return false
    if (idempotency_level != other.idempotency_level) return false
    if (uninterpreted_option != other.uninterpreted_option) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (deprecated?.hashCode() ?: 0)
      result = result * 37 + (idempotency_level?.hashCode() ?: 0)
      result = result * 37 + uninterpreted_option.hashCode()
      super.hashCode = result
    }
    return result
  }

  public override fun toString(): String {
    val result = mutableListOf<String>()
    if (deprecated != null) result += """deprecated=$deprecated"""
    if (idempotency_level != null) result += """idempotency_level=$idempotency_level"""
    if (uninterpreted_option.isNotEmpty()) result +=
        """uninterpreted_option=$uninterpreted_option"""
    return result.joinToString(prefix = "MethodOptions{", separator = ", ", postfix = "}")
  }

  public fun copy(
    deprecated: Boolean? = this.deprecated,
    idempotency_level: IdempotencyLevel? = this.idempotency_level,
    uninterpreted_option: List<UninterpretedOption> = this.uninterpreted_option,
    unknownFields: ByteString = this.unknownFields,
  ): MethodOptions = MethodOptions(deprecated, idempotency_level, uninterpreted_option,
      unknownFields)

  public companion object {
    public const val DEFAULT_DEPRECATED: Boolean = false

    @JvmField
    public val DEFAULT_IDEMPOTENCY_LEVEL: IdempotencyLevel = IdempotencyLevel.IDEMPOTENCY_UNKNOWN

    @JvmField
    public val ADAPTER: ProtoAdapter<MethodOptions> = object : ProtoAdapter<MethodOptions>(
      FieldEncoding.LENGTH_DELIMITED, 
      MethodOptions::class, 
      "type.googleapis.com/google.protobuf.MethodOptions", 
      PROTO_2, 
      null, 
      "descriptor.proto"
    ) {
      public override fun encodedSize(`value`: MethodOptions): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.BOOL.encodedSizeWithTag(33, value.deprecated)
        size += IdempotencyLevel.ADAPTER.encodedSizeWithTag(34, value.idempotency_level)
        size += UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999,
            value.uninterpreted_option)
        return size
      }

      public override fun encode(writer: ProtoWriter, `value`: MethodOptions): Unit {
        ProtoAdapter.BOOL.encodeWithTag(writer, 33, value.deprecated)
        IdempotencyLevel.ADAPTER.encodeWithTag(writer, 34, value.idempotency_level)
        UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999,
            value.uninterpreted_option)
        writer.writeBytes(value.unknownFields)
      }

      public override fun encode(writer: ReverseProtoWriter, `value`: MethodOptions): Unit {
        writer.writeBytes(value.unknownFields)
        UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999,
            value.uninterpreted_option)
        IdempotencyLevel.ADAPTER.encodeWithTag(writer, 34, value.idempotency_level)
        ProtoAdapter.BOOL.encodeWithTag(writer, 33, value.deprecated)
      }

      public override fun decode(reader: ProtoReader): MethodOptions {
        var deprecated: Boolean? = null
        var idempotency_level: IdempotencyLevel? = null
        val uninterpreted_option = mutableListOf<UninterpretedOption>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            33 -> deprecated = ProtoAdapter.BOOL.decode(reader)
            34 -> try {
              idempotency_level = IdempotencyLevel.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            999 -> uninterpreted_option.add(UninterpretedOption.ADAPTER.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return MethodOptions(
          deprecated = deprecated,
          idempotency_level = idempotency_level,
          uninterpreted_option = uninterpreted_option,
          unknownFields = unknownFields
        )
      }

      public override fun redact(`value`: MethodOptions): MethodOptions = value.copy(
        uninterpreted_option =
            value.uninterpreted_option.redactElements(UninterpretedOption.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }

  /**
   *  Is this method side-effect-free (or safe in HTTP parlance), or idempotent,
   *  or neither? HTTP based RPC implementation may choose GET verb for safe
   *  methods, and PUT verb for idempotent methods instead of the default POST.
   */
  public enum class IdempotencyLevel(
    public override val `value`: Int,
  ) : WireEnum {
    IDEMPOTENCY_UNKNOWN(0),
    /**
     *  implies idempotent
     */
    NO_SIDE_EFFECTS(1),
    /**
     *  idempotent, but may have side effects
     */
    IDEMPOTENT(2),
    ;

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<IdempotencyLevel> = object : EnumAdapter<IdempotencyLevel>(
        IdempotencyLevel::class, 
        PROTO_2, 
        IdempotencyLevel.IDEMPOTENCY_UNKNOWN
      ) {
        public override fun fromValue(`value`: Int): IdempotencyLevel? =
            IdempotencyLevel.fromValue(value)
      }

      @JvmStatic
      public fun fromValue(`value`: Int): IdempotencyLevel? = when (value) {
        0 -> IDEMPOTENCY_UNKNOWN
        1 -> NO_SIDE_EFFECTS
        2 -> IDEMPOTENT
        else -> null
      }
    }
  }
}
