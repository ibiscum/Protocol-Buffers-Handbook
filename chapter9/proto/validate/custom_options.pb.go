// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
// 	protoc        v4.25.1
// source: proto/validate/custom_options.proto

package validate

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	descriptorpb "google.golang.org/protobuf/types/descriptorpb"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type FieldConstraints_Type int32

const (
	FieldConstraints_TYPE_UNSPECIFIED FieldConstraints_Type = 0
	FieldConstraints_TYPE_EMAIL       FieldConstraints_Type = 1
	FieldConstraints_TYPE_PHONE       FieldConstraints_Type = 2
)

// Enum value maps for FieldConstraints_Type.
var (
	FieldConstraints_Type_name = map[int32]string{
		0: "TYPE_UNSPECIFIED",
		1: "TYPE_EMAIL",
		2: "TYPE_PHONE",
	}
	FieldConstraints_Type_value = map[string]int32{
		"TYPE_UNSPECIFIED": 0,
		"TYPE_EMAIL":       1,
		"TYPE_PHONE":       2,
	}
)

func (x FieldConstraints_Type) Enum() *FieldConstraints_Type {
	p := new(FieldConstraints_Type)
	*p = x
	return p
}

func (x FieldConstraints_Type) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (FieldConstraints_Type) Descriptor() protoreflect.EnumDescriptor {
	return file_proto_validate_custom_options_proto_enumTypes[0].Descriptor()
}

func (FieldConstraints_Type) Type() protoreflect.EnumType {
	return &file_proto_validate_custom_options_proto_enumTypes[0]
}

func (x FieldConstraints_Type) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Do not use.
func (x *FieldConstraints_Type) UnmarshalJSON(b []byte) error {
	num, err := protoimpl.X.UnmarshalJSONEnum(x.Descriptor(), b)
	if err != nil {
		return err
	}
	*x = FieldConstraints_Type(num)
	return nil
}

// Deprecated: Use FieldConstraints_Type.Descriptor instead.
func (FieldConstraints_Type) EnumDescriptor() ([]byte, []int) {
	return file_proto_validate_custom_options_proto_rawDescGZIP(), []int{0, 0}
}

type FieldConstraints struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Name *string                `protobuf:"bytes,1,opt,name=name" json:"name,omitempty"`
	Type *FieldConstraints_Type `protobuf:"varint,2,opt,name=type,enum=validate.FieldConstraints_Type" json:"type,omitempty"`
}

func (x *FieldConstraints) Reset() {
	*x = FieldConstraints{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_validate_custom_options_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *FieldConstraints) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*FieldConstraints) ProtoMessage() {}

func (x *FieldConstraints) ProtoReflect() protoreflect.Message {
	mi := &file_proto_validate_custom_options_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use FieldConstraints.ProtoReflect.Descriptor instead.
func (*FieldConstraints) Descriptor() ([]byte, []int) {
	return file_proto_validate_custom_options_proto_rawDescGZIP(), []int{0}
}

func (x *FieldConstraints) GetName() string {
	if x != nil && x.Name != nil {
		return *x.Name
	}
	return ""
}

func (x *FieldConstraints) GetType() FieldConstraints_Type {
	if x != nil && x.Type != nil {
		return *x.Type
	}
	return FieldConstraints_TYPE_UNSPECIFIED
}

var file_proto_validate_custom_options_proto_extTypes = []protoimpl.ExtensionInfo{
	{
		ExtendedType:  (*descriptorpb.MessageOptions)(nil),
		ExtensionType: (*FieldConstraints)(nil),
		Field:         1188,
		Name:          "validate.field",
		Tag:           "bytes,1188,opt,name=field",
		Filename:      "proto/validate/custom_options.proto",
	},
}

// Extension fields to descriptorpb.MessageOptions.
var (
	// optional validate.FieldConstraints field = 1188;
	E_Field = &file_proto_validate_custom_options_proto_extTypes[0]
)

var File_proto_validate_custom_options_proto protoreflect.FileDescriptor

var file_proto_validate_custom_options_proto_rawDesc = []byte{
	0x0a, 0x23, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65,
	0x2f, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x5f, 0x6f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x08, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x1a,
	0x20, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66,
	0x2f, 0x64, 0x65, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x22, 0x99, 0x01, 0x0a, 0x10, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x43, 0x6f, 0x6e, 0x73, 0x74,
	0x72, 0x61, 0x69, 0x6e, 0x74, 0x73, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x33, 0x0a, 0x04, 0x74, 0x79,
	0x70, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x1f, 0x2e, 0x76, 0x61, 0x6c, 0x69, 0x64,
	0x61, 0x74, 0x65, 0x2e, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x43, 0x6f, 0x6e, 0x73, 0x74, 0x72, 0x61,
	0x69, 0x6e, 0x74, 0x73, 0x2e, 0x54, 0x79, 0x70, 0x65, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65, 0x22,
	0x3c, 0x0a, 0x04, 0x54, 0x79, 0x70, 0x65, 0x12, 0x14, 0x0a, 0x10, 0x54, 0x59, 0x50, 0x45, 0x5f,
	0x55, 0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x0e, 0x0a,
	0x0a, 0x54, 0x59, 0x50, 0x45, 0x5f, 0x45, 0x4d, 0x41, 0x49, 0x4c, 0x10, 0x01, 0x12, 0x0e, 0x0a,
	0x0a, 0x54, 0x59, 0x50, 0x45, 0x5f, 0x50, 0x48, 0x4f, 0x4e, 0x45, 0x10, 0x02, 0x3a, 0x52, 0x0a,
	0x05, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x12, 0x1f, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65,
	0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x18, 0xa4, 0x09, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1a,
	0x2e, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2e, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x43,
	0x6f, 0x6e, 0x73, 0x74, 0x72, 0x61, 0x69, 0x6e, 0x74, 0x73, 0x52, 0x05, 0x66, 0x69, 0x65, 0x6c,
	0x64, 0x42, 0x4e, 0x5a, 0x4c, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f,
	0x50, 0x61, 0x63, 0x6b, 0x74, 0x50, 0x75, 0x62, 0x6c, 0x69, 0x73, 0x68, 0x69, 0x6e, 0x67, 0x2f,
	0x50, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x6f, 0x6c, 0x2d, 0x42, 0x75, 0x66, 0x66, 0x65, 0x72, 0x73,
	0x2d, 0x48, 0x61, 0x6e, 0x64, 0x62, 0x6f, 0x6f, 0x6b, 0x2f, 0x63, 0x68, 0x61, 0x70, 0x74, 0x65,
	0x72, 0x39, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74,
	0x65,
}

var (
	file_proto_validate_custom_options_proto_rawDescOnce sync.Once
	file_proto_validate_custom_options_proto_rawDescData = file_proto_validate_custom_options_proto_rawDesc
)

func file_proto_validate_custom_options_proto_rawDescGZIP() []byte {
	file_proto_validate_custom_options_proto_rawDescOnce.Do(func() {
		file_proto_validate_custom_options_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_validate_custom_options_proto_rawDescData)
	})
	return file_proto_validate_custom_options_proto_rawDescData
}

var file_proto_validate_custom_options_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_proto_validate_custom_options_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_proto_validate_custom_options_proto_goTypes = []interface{}{
	(FieldConstraints_Type)(0),          // 0: validate.FieldConstraints.Type
	(*FieldConstraints)(nil),            // 1: validate.FieldConstraints
	(*descriptorpb.MessageOptions)(nil), // 2: google.protobuf.MessageOptions
}
var file_proto_validate_custom_options_proto_depIdxs = []int32{
	0, // 0: validate.FieldConstraints.type:type_name -> validate.FieldConstraints.Type
	2, // 1: validate.field:extendee -> google.protobuf.MessageOptions
	1, // 2: validate.field:type_name -> validate.FieldConstraints
	3, // [3:3] is the sub-list for method output_type
	3, // [3:3] is the sub-list for method input_type
	2, // [2:3] is the sub-list for extension type_name
	1, // [1:2] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_proto_validate_custom_options_proto_init() }
func file_proto_validate_custom_options_proto_init() {
	if File_proto_validate_custom_options_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_validate_custom_options_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*FieldConstraints); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_proto_validate_custom_options_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   1,
			NumExtensions: 1,
			NumServices:   0,
		},
		GoTypes:           file_proto_validate_custom_options_proto_goTypes,
		DependencyIndexes: file_proto_validate_custom_options_proto_depIdxs,
		EnumInfos:         file_proto_validate_custom_options_proto_enumTypes,
		MessageInfos:      file_proto_validate_custom_options_proto_msgTypes,
		ExtensionInfos:    file_proto_validate_custom_options_proto_extTypes,
	}.Build()
	File_proto_validate_custom_options_proto = out.File
	file_proto_validate_custom_options_proto_rawDesc = nil
	file_proto_validate_custom_options_proto_goTypes = nil
	file_proto_validate_custom_options_proto_depIdxs = nil
}
