// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: code_generation.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package example;

@kotlin.jvm.JvmName("-initializetestCodeGenMessage")
public inline fun testCodeGenMessage(block: example.TestCodeGenMessageKt.Dsl.() -> kotlin.Unit): example.TestCodeGenMessage =
  example.TestCodeGenMessageKt.Dsl._create(example.TestCodeGenMessage.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `example.TestCodeGenMessage`
 */
public object TestCodeGenMessageKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: example.TestCodeGenMessage.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: example.TestCodeGenMessage.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): example.TestCodeGenMessage = _builder.build()

    /**
     * `double double = 1;`
     */
    public var double: kotlin.Double
      @JvmName("getDouble")
      get() = _builder.getDouble()
      @JvmName("setDouble")
      set(value) {
        _builder.setDouble(value)
      }
    /**
     * `double double = 1;`
     */
    public fun clearDouble() {
      _builder.clearDouble()
    }

    /**
     * `float float = 2;`
     */
    public var float: kotlin.Float
      @JvmName("getFloat")
      get() = _builder.getFloat()
      @JvmName("setFloat")
      set(value) {
        _builder.setFloat(value)
      }
    /**
     * `float float = 2;`
     */
    public fun clearFloat() {
      _builder.clearFloat()
    }

    /**
     * `int32 int32 = 3;`
     */
    public var int32: kotlin.Int
      @JvmName("getInt32")
      get() = _builder.getInt32()
      @JvmName("setInt32")
      set(value) {
        _builder.setInt32(value)
      }
    /**
     * `int32 int32 = 3;`
     */
    public fun clearInt32() {
      _builder.clearInt32()
    }

    /**
     * `int64 int64 = 4;`
     */
    public var int64: kotlin.Long
      @JvmName("getInt64")
      get() = _builder.getInt64()
      @JvmName("setInt64")
      set(value) {
        _builder.setInt64(value)
      }
    /**
     * `int64 int64 = 4;`
     */
    public fun clearInt64() {
      _builder.clearInt64()
    }

    /**
     * `uint32 uint32 = 5;`
     */
    public var uint32: kotlin.Int
      @JvmName("getUint32")
      get() = _builder.getUint32()
      @JvmName("setUint32")
      set(value) {
        _builder.setUint32(value)
      }
    /**
     * `uint32 uint32 = 5;`
     */
    public fun clearUint32() {
      _builder.clearUint32()
    }

    /**
     * `uint64 uint64 = 6;`
     */
    public var uint64: kotlin.Long
      @JvmName("getUint64")
      get() = _builder.getUint64()
      @JvmName("setUint64")
      set(value) {
        _builder.setUint64(value)
      }
    /**
     * `uint64 uint64 = 6;`
     */
    public fun clearUint64() {
      _builder.clearUint64()
    }

    /**
     * `sint32 sint32 = 7;`
     */
    public var sint32: kotlin.Int
      @JvmName("getSint32")
      get() = _builder.getSint32()
      @JvmName("setSint32")
      set(value) {
        _builder.setSint32(value)
      }
    /**
     * `sint32 sint32 = 7;`
     */
    public fun clearSint32() {
      _builder.clearSint32()
    }

    /**
     * `sint64 sint64 = 8;`
     */
    public var sint64: kotlin.Long
      @JvmName("getSint64")
      get() = _builder.getSint64()
      @JvmName("setSint64")
      set(value) {
        _builder.setSint64(value)
      }
    /**
     * `sint64 sint64 = 8;`
     */
    public fun clearSint64() {
      _builder.clearSint64()
    }

    /**
     * `fixed32 fixed32 = 9;`
     */
    public var fixed32: kotlin.Int
      @JvmName("getFixed32")
      get() = _builder.getFixed32()
      @JvmName("setFixed32")
      set(value) {
        _builder.setFixed32(value)
      }
    /**
     * `fixed32 fixed32 = 9;`
     */
    public fun clearFixed32() {
      _builder.clearFixed32()
    }

    /**
     * `fixed64 fixed64 = 10;`
     */
    public var fixed64: kotlin.Long
      @JvmName("getFixed64")
      get() = _builder.getFixed64()
      @JvmName("setFixed64")
      set(value) {
        _builder.setFixed64(value)
      }
    /**
     * `fixed64 fixed64 = 10;`
     */
    public fun clearFixed64() {
      _builder.clearFixed64()
    }

    /**
     * `sfixed32 sfixed32 = 11;`
     */
    public var sfixed32: kotlin.Int
      @JvmName("getSfixed32")
      get() = _builder.getSfixed32()
      @JvmName("setSfixed32")
      set(value) {
        _builder.setSfixed32(value)
      }
    /**
     * `sfixed32 sfixed32 = 11;`
     */
    public fun clearSfixed32() {
      _builder.clearSfixed32()
    }

    /**
     * `sfixed64 sfixed64 = 12;`
     */
    public var sfixed64: kotlin.Long
      @JvmName("getSfixed64")
      get() = _builder.getSfixed64()
      @JvmName("setSfixed64")
      set(value) {
        _builder.setSfixed64(value)
      }
    /**
     * `sfixed64 sfixed64 = 12;`
     */
    public fun clearSfixed64() {
      _builder.clearSfixed64()
    }

    /**
     * `bool bool = 13;`
     */
    public var bool: kotlin.Boolean
      @JvmName("getBool")
      get() = _builder.getBool()
      @JvmName("setBool")
      set(value) {
        _builder.setBool(value)
      }
    /**
     * `bool bool = 13;`
     */
    public fun clearBool() {
      _builder.clearBool()
    }

    /**
     * `string string = 14;`
     */
    public var string: kotlin.String
      @JvmName("getString")
      get() = _builder.getString()
      @JvmName("setString")
      set(value) {
        _builder.setString(value)
      }
    /**
     * `string string = 14;`
     */
    public fun clearString() {
      _builder.clearString()
    }

    /**
     * `bytes bytes = 15;`
     */
    public var bytes: com.google.protobuf.ByteString
      @JvmName("getBytes")
      get() = _builder.getBytes()
      @JvmName("setBytes")
      set(value) {
        _builder.setBytes(value)
      }
    /**
     * `bytes bytes = 15;`
     */
    public fun clearBytes() {
      _builder.clearBytes()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class MapProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `map<string, int32> map = 16;`
     */
     public val map: com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Int, MapProxy>
      @kotlin.jvm.JvmSynthetic
      @JvmName("getMapMap")
      get() = com.google.protobuf.kotlin.DslMap(
        _builder.getMapMap()
      )
    /**
     * `map<string, int32> map = 16;`
     */
    @JvmName("putMap")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Int, MapProxy>
      .put(key: kotlin.String, value: kotlin.Int) {
         _builder.putMap(key, value)
       }
    /**
     * `map<string, int32> map = 16;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("setMap")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Int, MapProxy>
      .set(key: kotlin.String, value: kotlin.Int) {
         put(key, value)
       }
    /**
     * `map<string, int32> map = 16;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("removeMap")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Int, MapProxy>
      .remove(key: kotlin.String) {
         _builder.removeMap(key)
       }
    /**
     * `map<string, int32> map = 16;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("putAllMap")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Int, MapProxy>
      .putAll(map: kotlin.collections.Map<kotlin.String, kotlin.Int>) {
         _builder.putAllMap(map)
       }
    /**
     * `map<string, int32> map = 16;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("clearMap")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.Int, MapProxy>
      .clear() {
         _builder.clearMap()
       }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class RepeatedProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated string repeated = 17;`
     * @return A list containing the repeated.
     */
    public val repeated: com.google.protobuf.kotlin.DslList<kotlin.String, RepeatedProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getRepeatedList()
      )
    /**
     * `repeated string repeated = 17;`
     * @param value The repeated to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addRepeated")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, RepeatedProxy>.add(value: kotlin.String) {
      _builder.addRepeated(value)
    }
    /**
     * `repeated string repeated = 17;`
     * @param value The repeated to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignRepeated")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, RepeatedProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * `repeated string repeated = 17;`
     * @param values The repeated to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllRepeated")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, RepeatedProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllRepeated(values)
    }
    /**
     * `repeated string repeated = 17;`
     * @param values The repeated to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllRepeated")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, RepeatedProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * `repeated string repeated = 17;`
     * @param index The index to set the value at.
     * @param value The repeated to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setRepeated")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, RepeatedProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setRepeated(index, value)
    }/**
     * `repeated string repeated = 17;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearRepeated")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, RepeatedProxy>.clear() {
      _builder.clearRepeated()
    }
    /**
     * `.example.TestCodeGenEnum an_enum = 18;`
     */
    public var anEnum: example.TestCodeGenEnum
      @JvmName("getAnEnum")
      get() = _builder.getAnEnum()
      @JvmName("setAnEnum")
      set(value) {
        _builder.setAnEnum(value)
      }
    public var anEnumValue: kotlin.Int
      @JvmName("getAnEnumValue")
      get() = _builder.getAnEnumValue()
      @JvmName("setAnEnumValue")
      set(value) {
        _builder.setAnEnumValue(value)
      }
    /**
     * `.example.TestCodeGenEnum an_enum = 18;`
     */
    public fun clearAnEnum() {
      _builder.clearAnEnum()
    }
    /**
     * `.example.TestCodeGenEnum an_enum = 18;`
     * @return Whether the anEnum field is set.
     */
    public fun hasAnEnum(): kotlin.Boolean {
      return _builder.hasAnEnum()
    }

    /**
     * `bool or_a_boolean = 19;`
     */
    public var orABoolean: kotlin.Boolean
      @JvmName("getOrABoolean")
      get() = _builder.getOrABoolean()
      @JvmName("setOrABoolean")
      set(value) {
        _builder.setOrABoolean(value)
      }
    /**
     * `bool or_a_boolean = 19;`
     */
    public fun clearOrABoolean() {
      _builder.clearOrABoolean()
    }
    /**
     * `bool or_a_boolean = 19;`
     * @return Whether the orABoolean field is set.
     */
    public fun hasOrABoolean(): kotlin.Boolean {
      return _builder.hasOrABoolean()
    }

    /**
     * `.google.protobuf.Duration duration = 20;`
     */
    public var duration: com.google.protobuf.Duration
      @JvmName("getDuration")
      get() = _builder.getDuration()
      @JvmName("setDuration")
      set(value) {
        _builder.setDuration(value)
      }
    /**
     * `.google.protobuf.Duration duration = 20;`
     */
    public fun clearDuration() {
      _builder.clearDuration()
    }
    /**
     * `.google.protobuf.Duration duration = 20;`
     * @return Whether the duration field is set.
     */
    public fun hasDuration(): kotlin.Boolean {
      return _builder.hasDuration()
    }
    public val testCodeGenOneofCase: example.TestCodeGenMessage.TestCodeGenOneofCase
      @JvmName("getTestCodeGenOneofCase")
      get() = _builder.getTestCodeGenOneofCase()

    public fun clearTestCodeGenOneof() {
      _builder.clearTestCodeGenOneof()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun example.TestCodeGenMessage.copy(block: `example`.TestCodeGenMessageKt.Dsl.() -> kotlin.Unit): example.TestCodeGenMessage =
  `example`.TestCodeGenMessageKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val example.TestCodeGenMessageOrBuilder.durationOrNull: com.google.protobuf.Duration?
  get() = if (hasDuration()) getDuration() else null

