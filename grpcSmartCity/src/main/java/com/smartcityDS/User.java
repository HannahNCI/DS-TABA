// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.smartcityDS;

public final class User {
  private User() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LoginRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LoginRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_APIResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_APIResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\"2\n\014LoginRequest\022\020\n\010username" +
      "\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\"<\n\013APIResponse\022" +
      "\027\n\017responsemessage\030\001 \001(\t\022\024\n\014responseCode" +
      "\030\002 \001(\005\"\007\n\005Empty2L\n\004user\022$\n\005login\022\r.Login" +
      "Request\032\014.APIResponse\022\036\n\006logout\022\006.Empty\032" +
      "\014.APIResponseB\023\n\017com.smartcityDSP\001b\006prot" +
      "o3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_LoginRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LoginRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LoginRequest_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_APIResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_APIResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_APIResponse_descriptor,
        new java.lang.String[] { "Responsemessage", "ResponseCode", });
    internal_static_Empty_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Empty_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}