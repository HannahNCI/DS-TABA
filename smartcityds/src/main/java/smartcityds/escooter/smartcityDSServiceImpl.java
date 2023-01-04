// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: escooter.proto

package smartcityds.escooter;

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
    internal_static_smartcityds_scooterAvailability_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartcityds_scooterAvailability_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartcityds_rentalCost_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartcityds_rentalCost_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartcityds_rentalDuration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartcityds_rentalDuration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartcityds_preciseLocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartcityds_preciseLocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartcityds_scooterSpecific_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartcityds_scooterSpecific_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartcityds_scooterAmount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartcityds_scooterAmount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartcityds_scooterDelete_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartcityds_scooterDelete_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016escooter.proto\022\013smartcityds\"2\n\023scooter" +
      "Availability\022\033\n\023scooterAvailability\030\001 \001(" +
      "\t\" \n\nrentalCost\022\022\n\nrentalCost\030\001 \001(\t\"(\n\016r" +
      "entalDuration\022\026\n\016rentalDuration\030\001 \001(\t\"*\n" +
      "\017preciseLocation\022\027\n\017preciseLocation\030\001 \001(" +
      "\t\"*\n\017scooterSpecific\022\027\n\017scooterSpecific\030" +
      "\001 \001(\t\"&\n\rscooterAmount\022\025\n\rscooterAmount\030" +
      "\001 \001(\t\"&\n\rscooterDelete\022\025\n\rscooterDelete\030" +
      "\001 \001(\t2\226\003\n\013smartcityDS\022X\n\026getScooterAvail" +
      "ability\022\034.smartcityds.preciseLocation\032 ." +
      "smartcityds.scooterAvailability\022R\n\021getRe" +
      "ntalDuration\022 .smartcityds.scooterAvaila" +
      "bility\032\033.smartcityds.rentalDuration\022F\n\rg" +
      "etRentalCost\022\034.smartcityds.preciseLocati" +
      "on\032\027.smartcityds.rentalCost\022F\n\nseeScoote" +
      "r\022\034.smartcityds.scooterSpecific\032\032.smartc" +
      "ityds.scooterAmount\022I\n\rdeleteScooter\022\034.s" +
      "martcityds.scooterSpecific\032\032.smartcityds" +
      ".scooterDeleteB0\n\024smartcityds.escooterB\026" +
      "smartcityDSServiceImplP\001b\006proto3"
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
    internal_static_smartcityds_scooterAvailability_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_smartcityds_scooterAvailability_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartcityds_scooterAvailability_descriptor,
        new java.lang.String[] { "ScooterAvailability", });
    internal_static_smartcityds_rentalCost_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_smartcityds_rentalCost_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartcityds_rentalCost_descriptor,
        new java.lang.String[] { "RentalCost", });
    internal_static_smartcityds_rentalDuration_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_smartcityds_rentalDuration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartcityds_rentalDuration_descriptor,
        new java.lang.String[] { "RentalDuration", });
    internal_static_smartcityds_preciseLocation_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_smartcityds_preciseLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartcityds_preciseLocation_descriptor,
        new java.lang.String[] { "PreciseLocation", });
    internal_static_smartcityds_scooterSpecific_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_smartcityds_scooterSpecific_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartcityds_scooterSpecific_descriptor,
        new java.lang.String[] { "ScooterSpecific", });
    internal_static_smartcityds_scooterAmount_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_smartcityds_scooterAmount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartcityds_scooterAmount_descriptor,
        new java.lang.String[] { "ScooterAmount", });
    internal_static_smartcityds_scooterDelete_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_smartcityds_scooterDelete_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartcityds_scooterDelete_descriptor,
        new java.lang.String[] { "ScooterDelete", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
