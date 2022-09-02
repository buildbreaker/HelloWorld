// Code generated by Wire protocol buffer compiler, do not edit.
// Source: proto3.simple.Enum in simple.proto
package proto3.simple

import com.squareup.wire.EnumAdapter
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireEnum
import kotlin.Int
import kotlin.jvm.JvmField
import kotlin.jvm.JvmStatic

/**
 *  Enum doc comment
 */
public enum class Enum(
  public override val `value`: Int,
) : WireEnum {
  /**
   *  Default/unspecified
   */
  UNSPECIFIED(0),
  /**
   *  Numero Uno!
   */
  FIRST_VALUE(1),
  ;

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<Enum> = object : EnumAdapter<Enum>(
      Enum::class, 
      PROTO_3, 
      Enum.UNSPECIFIED
    ) {
      public override fun fromValue(`value`: Int): Enum? = Enum.fromValue(value)
    }

    @JvmStatic
    public fun fromValue(`value`: Int): Enum? = when (value) {
      0 -> UNSPECIFIED
      1 -> FIRST_VALUE
      else -> null
    }
  }
}