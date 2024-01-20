// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: code_generation.proto

// Protobuf Java Version: 3.25.1
package example;

/**
 * Protobuf enum {@code example.TestCodeGenEnum}
 */
public enum TestCodeGenEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TEST_CODE_GEN_ENUM_UNSPECIFIED = 0;</code>
   */
  TEST_CODE_GEN_ENUM_UNSPECIFIED(0),
  /**
   * <code>TEST_CODE_GEN_ENUM_ANOTHER = 1;</code>
   */
  TEST_CODE_GEN_ENUM_ANOTHER(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TEST_CODE_GEN_ENUM_UNSPECIFIED = 0;</code>
   */
  public static final int TEST_CODE_GEN_ENUM_UNSPECIFIED_VALUE = 0;
  /**
   * <code>TEST_CODE_GEN_ENUM_ANOTHER = 1;</code>
   */
  public static final int TEST_CODE_GEN_ENUM_ANOTHER_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TestCodeGenEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TestCodeGenEnum forNumber(int value) {
    switch (value) {
      case 0: return TEST_CODE_GEN_ENUM_UNSPECIFIED;
      case 1: return TEST_CODE_GEN_ENUM_ANOTHER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TestCodeGenEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TestCodeGenEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TestCodeGenEnum>() {
          public TestCodeGenEnum findValueByNumber(int number) {
            return TestCodeGenEnum.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return example.CodeGeneration.getDescriptor().getEnumTypes().get(0);
  }

  private static final TestCodeGenEnum[] VALUES = values();

  public static TestCodeGenEnum valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TestCodeGenEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:example.TestCodeGenEnum)
}

