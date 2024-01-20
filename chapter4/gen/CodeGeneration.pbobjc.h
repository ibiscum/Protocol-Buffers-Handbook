// Generated by the protocol buffer compiler.  DO NOT EDIT!
// clang-format off
// source: code_generation.proto

// This CPP symbol can be defined to use imports that match up to the framework
// imports needed when using CocoaPods.
#if !defined(GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS)
 #define GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS 0
#endif

#if GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS
 #import <Protobuf/GPBProtocolBuffers.h>
#else
 #import "GPBProtocolBuffers.h"
#endif

#if GOOGLE_PROTOBUF_OBJC_VERSION < 30007
#error This file was generated by a newer version of protoc which is incompatible with your Protocol Buffer library sources.
#endif
#if 30007 < GOOGLE_PROTOBUF_OBJC_MIN_SUPPORTED_VERSION
#error This file was generated by an older version of protoc which is incompatible with your Protocol Buffer library sources.
#endif

// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

CF_EXTERN_C_BEGIN

NS_ASSUME_NONNULL_BEGIN

#pragma mark - Enum TestCodeGenEnum

typedef GPB_ENUM(TestCodeGenEnum) {
  /**
   * Value used if any message's field encounters a value that is not defined
   * by this enum. The message will also have C functions to get/set the rawValue
   * of the field.
   **/
  TestCodeGenEnum_GPBUnrecognizedEnumeratorValue = kGPBUnrecognizedEnumeratorValue,
  TestCodeGenEnum_TestCodeGenEnumUnspecified = 0,
  TestCodeGenEnum_TestCodeGenEnumAnother = 1,
};

GPBEnumDescriptor *TestCodeGenEnum_EnumDescriptor(void);

/**
 * Checks to see if the given value is defined by the enum or was not known at
 * the time this source was generated.
 **/
BOOL TestCodeGenEnum_IsValidValue(int32_t value);

#pragma mark - CodeGenerationRoot

/**
 * Exposes the extension registry for this file.
 *
 * The base class provides:
 * @code
 *   + (GPBExtensionRegistry *)extensionRegistry;
 * @endcode
 * which is a @c GPBExtensionRegistry that includes all the extensions defined by
 * this file and all files that it depends on.
 **/
GPB_FINAL @interface CodeGenerationRoot : GPBRootObject
@end

#pragma mark - TestCodeGenMessage

typedef GPB_ENUM(TestCodeGenMessage_FieldNumber) {
  TestCodeGenMessage_FieldNumber_Double_p = 1,
  TestCodeGenMessage_FieldNumber_Float_p = 2,
  TestCodeGenMessage_FieldNumber_Int32 = 3,
  TestCodeGenMessage_FieldNumber_Int64 = 4,
  TestCodeGenMessage_FieldNumber_Uint32 = 5,
  TestCodeGenMessage_FieldNumber_Uint64 = 6,
  TestCodeGenMessage_FieldNumber_Sint32 = 7,
  TestCodeGenMessage_FieldNumber_Sint64 = 8,
  TestCodeGenMessage_FieldNumber_Fixed32 = 9,
  TestCodeGenMessage_FieldNumber_Fixed64 = 10,
  TestCodeGenMessage_FieldNumber_Sfixed32 = 11,
  TestCodeGenMessage_FieldNumber_Sfixed64 = 12,
  TestCodeGenMessage_FieldNumber_Bool_p = 13,
  TestCodeGenMessage_FieldNumber_String = 14,
  TestCodeGenMessage_FieldNumber_Bytes = 15,
  TestCodeGenMessage_FieldNumber_Map = 16,
  TestCodeGenMessage_FieldNumber_RepeatedArray = 17,
  TestCodeGenMessage_FieldNumber_AnEnum = 18,
  TestCodeGenMessage_FieldNumber_OrABoolean = 19,
  TestCodeGenMessage_FieldNumber_Duration = 20,
};

typedef GPB_ENUM(TestCodeGenMessage_TestCodeGenOneof_OneOfCase) {
  TestCodeGenMessage_TestCodeGenOneof_OneOfCase_GPBUnsetOneOfCase = 0,
  TestCodeGenMessage_TestCodeGenOneof_OneOfCase_AnEnum = 18,
  TestCodeGenMessage_TestCodeGenOneof_OneOfCase_OrABoolean = 19,
};

GPB_FINAL @interface TestCodeGenMessage : GPBMessage

@property(nonatomic, readwrite) double double_p;

@property(nonatomic, readwrite) float float_p;

@property(nonatomic, readwrite) int32_t int32;

@property(nonatomic, readwrite) int64_t int64;

@property(nonatomic, readwrite) uint32_t uint32;

@property(nonatomic, readwrite) uint64_t uint64;

@property(nonatomic, readwrite) int32_t sint32;

@property(nonatomic, readwrite) int64_t sint64;

@property(nonatomic, readwrite) uint32_t fixed32;

@property(nonatomic, readwrite) uint64_t fixed64;

@property(nonatomic, readwrite) int32_t sfixed32;

@property(nonatomic, readwrite) int64_t sfixed64;

@property(nonatomic, readwrite) BOOL bool_p;

@property(nonatomic, readwrite, copy, null_resettable) NSString *string;

@property(nonatomic, readwrite, copy, null_resettable) NSData *bytes;

@property(nonatomic, readwrite, strong, null_resettable) GPBStringInt32Dictionary *map;
/** The number of items in @c map without causing the container to be created. */
@property(nonatomic, readonly) NSUInteger map_Count;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSString*> *repeatedArray;
/** The number of items in @c repeatedArray without causing the container to be created. */
@property(nonatomic, readonly) NSUInteger repeatedArray_Count;

@property(nonatomic, readonly) TestCodeGenMessage_TestCodeGenOneof_OneOfCase testCodeGenOneofOneOfCase;

@property(nonatomic, readwrite) TestCodeGenEnum anEnum;

@property(nonatomic, readwrite) BOOL orABoolean;

@property(nonatomic, readwrite, strong, null_resettable) GPBDuration *duration;
/** Test to see if @c duration has been set. */
@property(nonatomic, readwrite) BOOL hasDuration;

@end

/**
 * Fetches the raw value of a @c TestCodeGenMessage's @c anEnum property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t TestCodeGenMessage_AnEnum_RawValue(TestCodeGenMessage *message);
/**
 * Sets the raw value of an @c TestCodeGenMessage's @c anEnum property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetTestCodeGenMessage_AnEnum_RawValue(TestCodeGenMessage *message, int32_t value);

/**
 * Clears whatever value was set for the oneof 'testCodeGenOneof'.
 **/
void TestCodeGenMessage_ClearTestCodeGenOneofOneOfCase(TestCodeGenMessage *message);

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)

// clang-format on