// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ecar.proto

package com.smartcityDS;

public final class Ecar {
  private Ecar() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cityName_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cityName_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_preciseLocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_preciseLocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_numberofchargingPoints_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_numberofchargingPoints_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chargingDuration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chargingDuration_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\necar.proto\"\034\n\010cityName\022\020\n\010cityName\030\001 \001" +
      "(\t\"*\n\017preciseLocation\022\027\n\017preciseLocation" +
      "\030\001 \001(\t\"8\n\026numberofchargingPoints\022\036\n\026numb" +
      "erofchargingPoints\030\001 \001(\t\",\n\020chargingDura" +
      "tion\022\030\n\020chargingDuration\030\001 \001(\t2\206\001\n\006plugi" +
      "n\022@\n\023getAvailabilePoints\022\020.preciseLocati" +
      "on\032\027.numberofchargingPoints\022:\n\023getChargi" +
      "ngDuration\022\020.preciseLocation\032\021.chargingD" +
      "urationB\023\n\017com.smartcityDSP\001b\006proto3"
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
    internal_static_cityName_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cityName_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cityName_descriptor,
        new java.lang.String[] { "CityName", });
    internal_static_preciseLocation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_preciseLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_preciseLocation_descriptor,
        new java.lang.String[] { "PreciseLocation", });
    internal_static_numberofchargingPoints_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_numberofchargingPoints_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_numberofchargingPoints_descriptor,
        new java.lang.String[] { "NumberofchargingPoints", });
    internal_static_chargingDuration_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_chargingDuration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chargingDuration_descriptor,
        new java.lang.String[] { "ChargingDuration", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
