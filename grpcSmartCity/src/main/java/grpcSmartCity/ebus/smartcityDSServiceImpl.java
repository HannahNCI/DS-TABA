// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ebus.proto

package grpcSmartCity.ebus;

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
    internal_static_grpcSmartCity_busNumber_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcSmartCity_busNumber_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcSmartCity_busTimetable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcSmartCity_busTimetable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcSmartCity_busNumberofSeats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcSmartCity_busNumberofSeats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcSmartCity_busNumberofUsb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcSmartCity_busNumberofUsb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcSmartCity_busSpecific_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcSmartCity_busSpecific_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcSmartCity_busAmount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcSmartCity_busAmount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcSmartCity_busDelete_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcSmartCity_busDelete_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nebus.proto\022\rgrpcSmartCity\"\036\n\tbusNumber" +
      "\022\021\n\tbusNumber\030\001 \001(\t\"$\n\014busTimetable\022\024\n\014b" +
      "usTimetable\030\001 \001(\t\",\n\020busNumberofSeats\022\030\n" +
      "\020busNumberofSeats\030\001 \001(\t\"(\n\016busNumberofUs" +
      "b\022\026\n\016busNumberofUsb\030\001 \001(\t\"\"\n\013busSpecific" +
      "\022\023\n\013busSpecific\030\001 \001(\t\"\036\n\tbusAmount\022\021\n\tbu" +
      "sAmount\030\001 \001(\t\"\036\n\tbusDelete\022\021\n\tbusDelete\030" +
      "\001 \001(\t2\357\002\n\013smartcityDS\022E\n\014getTimetable\022\030." +
      "grpcSmartCity.busNumber\032\033.grpcSmartCity." +
      "busTimetable\022M\n\020getNumberofSeats\022\030.grpcS" +
      "martCity.busNumber\032\037.grpcSmartCity.busNu" +
      "mberofSeats\022I\n\016getNumberofUsb\022\030.grpcSmar" +
      "tCity.busNumber\032\035.grpcSmartCity.busNumbe" +
      "rofUsb\022>\n\006seeBus\022\032.grpcSmartCity.busSpec" +
      "ific\032\030.grpcSmartCity.busAmount\022?\n\tdelete" +
      "Bus\022\030.grpcSmartCity.busNumber\032\030.grpcSmar" +
      "tCity.busDeleteB.\n\022grpcSmartCity.ebusB\026s" +
      "martcityDSServiceImplP\001b\006proto3"
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
    internal_static_grpcSmartCity_busNumber_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpcSmartCity_busNumber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcSmartCity_busNumber_descriptor,
        new java.lang.String[] { "BusNumber", });
    internal_static_grpcSmartCity_busTimetable_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpcSmartCity_busTimetable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcSmartCity_busTimetable_descriptor,
        new java.lang.String[] { "BusTimetable", });
    internal_static_grpcSmartCity_busNumberofSeats_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_grpcSmartCity_busNumberofSeats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcSmartCity_busNumberofSeats_descriptor,
        new java.lang.String[] { "BusNumberofSeats", });
    internal_static_grpcSmartCity_busNumberofUsb_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_grpcSmartCity_busNumberofUsb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcSmartCity_busNumberofUsb_descriptor,
        new java.lang.String[] { "BusNumberofUsb", });
    internal_static_grpcSmartCity_busSpecific_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_grpcSmartCity_busSpecific_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcSmartCity_busSpecific_descriptor,
        new java.lang.String[] { "BusSpecific", });
    internal_static_grpcSmartCity_busAmount_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_grpcSmartCity_busAmount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcSmartCity_busAmount_descriptor,
        new java.lang.String[] { "BusAmount", });
    internal_static_grpcSmartCity_busDelete_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_grpcSmartCity_busDelete_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcSmartCity_busDelete_descriptor,
        new java.lang.String[] { "BusDelete", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
