// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ecar.proto

package grpcSmartCity.ecar;

public final class smartcityDSServiceImpl {
  private smartcityDSServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcSmartCity_pluginAvailability_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcSmartCity_pluginAvailability_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcSmartCity_preciseLocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcSmartCity_preciseLocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcSmartCity_chargingDuration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcSmartCity_chargingDuration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcSmartCity_pluginSpecific_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcSmartCity_pluginSpecific_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcSmartCity_pluginAmount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcSmartCity_pluginAmount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcSmartCity_pluginDelete_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcSmartCity_pluginDelete_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\necar.proto\022\rgrpcSmartCity\"0\n\022pluginAva" +
      "ilability\022\032\n\022pluginAvailability\030\001 \001(\t\"*\n" +
      "\017preciseLocation\022\027\n\017preciseLocation\030\001 \001(" +
      "\t\",\n\020chargingDuration\022\030\n\020chargingDuratio" +
      "n\030\001 \001(\t\"(\n\016pluginSpecific\022\026\n\016pluginSpeci" +
      "fic\030\001 \001(\t\"$\n\014pluginAmount\022\024\n\014pluginAmoun" +
      "t\030\001 \001(\t\"$\n\014pluginDelete\022\024\n\014pluginDelete\030" +
      "\001 \001(\t2\331\002\n\013smartcityDS\022Z\n\025getpluginAvaila" +
      "bility\022\036.grpcSmartCity.preciseLocation\032!" +
      ".grpcSmartCity.pluginAvailability\022Y\n\023get" +
      "ChargingDuration\022!.grpcSmartCity.pluginA" +
      "vailability\032\037.grpcSmartCity.chargingDura" +
      "tion\022G\n\tseePlugin\022\035.grpcSmartCity.plugin" +
      "Specific\032\033.grpcSmartCity.pluginAmount\022J\n" +
      "\014deletePlugin\022\035.grpcSmartCity.pluginSpec" +
      "ific\032\033.grpcSmartCity.pluginDeleteB.\n\022grp" +
      "cSmartCity.ecarB\026smartcityDSServiceImplP" +
      "\001b\006proto3"
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
    internal_static_grpcSmartCity_pluginAvailability_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpcSmartCity_pluginAvailability_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcSmartCity_pluginAvailability_descriptor,
        new java.lang.String[] { "PluginAvailability", });
    internal_static_grpcSmartCity_preciseLocation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpcSmartCity_preciseLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcSmartCity_preciseLocation_descriptor,
        new java.lang.String[] { "PreciseLocation", });
    internal_static_grpcSmartCity_chargingDuration_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_grpcSmartCity_chargingDuration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcSmartCity_chargingDuration_descriptor,
        new java.lang.String[] { "ChargingDuration", });
    internal_static_grpcSmartCity_pluginSpecific_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_grpcSmartCity_pluginSpecific_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcSmartCity_pluginSpecific_descriptor,
        new java.lang.String[] { "PluginSpecific", });
    internal_static_grpcSmartCity_pluginAmount_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_grpcSmartCity_pluginAmount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcSmartCity_pluginAmount_descriptor,
        new java.lang.String[] { "PluginAmount", });
    internal_static_grpcSmartCity_pluginDelete_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_grpcSmartCity_pluginDelete_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcSmartCity_pluginDelete_descriptor,
        new java.lang.String[] { "PluginDelete", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
