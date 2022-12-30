// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ecar.proto

package grpcSmartCity.ecar;

/**
 * Protobuf type {@code grpcSmartCity.pluginAvailability}
 */
public  final class pluginAvailability extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpcSmartCity.pluginAvailability)
    pluginAvailabilityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use pluginAvailability.newBuilder() to construct.
  private pluginAvailability(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private pluginAvailability() {
    pluginAvailability_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private pluginAvailability(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            pluginAvailability_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpcSmartCity.ecar.smartcityDSServiceImpl.internal_static_grpcSmartCity_pluginAvailability_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpcSmartCity.ecar.smartcityDSServiceImpl.internal_static_grpcSmartCity_pluginAvailability_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpcSmartCity.ecar.pluginAvailability.class, grpcSmartCity.ecar.pluginAvailability.Builder.class);
  }

  public static final int PLUGINAVAILABILITY_FIELD_NUMBER = 1;
  private volatile java.lang.Object pluginAvailability_;
  /**
   * <code>string pluginAvailability = 1;</code>
   */
  public java.lang.String getPluginAvailability() {
    java.lang.Object ref = pluginAvailability_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pluginAvailability_ = s;
      return s;
    }
  }
  /**
   * <code>string pluginAvailability = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPluginAvailabilityBytes() {
    java.lang.Object ref = pluginAvailability_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pluginAvailability_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getPluginAvailabilityBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pluginAvailability_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPluginAvailabilityBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pluginAvailability_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof grpcSmartCity.ecar.pluginAvailability)) {
      return super.equals(obj);
    }
    grpcSmartCity.ecar.pluginAvailability other = (grpcSmartCity.ecar.pluginAvailability) obj;

    boolean result = true;
    result = result && getPluginAvailability()
        .equals(other.getPluginAvailability());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PLUGINAVAILABILITY_FIELD_NUMBER;
    hash = (53 * hash) + getPluginAvailability().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpcSmartCity.ecar.pluginAvailability parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpcSmartCity.ecar.pluginAvailability parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpcSmartCity.ecar.pluginAvailability parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpcSmartCity.ecar.pluginAvailability parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpcSmartCity.ecar.pluginAvailability parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpcSmartCity.ecar.pluginAvailability parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpcSmartCity.ecar.pluginAvailability parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpcSmartCity.ecar.pluginAvailability parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpcSmartCity.ecar.pluginAvailability parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpcSmartCity.ecar.pluginAvailability parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpcSmartCity.ecar.pluginAvailability parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpcSmartCity.ecar.pluginAvailability parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(grpcSmartCity.ecar.pluginAvailability prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpcSmartCity.pluginAvailability}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpcSmartCity.pluginAvailability)
      grpcSmartCity.ecar.pluginAvailabilityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpcSmartCity.ecar.smartcityDSServiceImpl.internal_static_grpcSmartCity_pluginAvailability_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpcSmartCity.ecar.smartcityDSServiceImpl.internal_static_grpcSmartCity_pluginAvailability_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpcSmartCity.ecar.pluginAvailability.class, grpcSmartCity.ecar.pluginAvailability.Builder.class);
    }

    // Construct using grpcSmartCity.ecar.pluginAvailability.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      pluginAvailability_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpcSmartCity.ecar.smartcityDSServiceImpl.internal_static_grpcSmartCity_pluginAvailability_descriptor;
    }

    @java.lang.Override
    public grpcSmartCity.ecar.pluginAvailability getDefaultInstanceForType() {
      return grpcSmartCity.ecar.pluginAvailability.getDefaultInstance();
    }

    @java.lang.Override
    public grpcSmartCity.ecar.pluginAvailability build() {
      grpcSmartCity.ecar.pluginAvailability result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpcSmartCity.ecar.pluginAvailability buildPartial() {
      grpcSmartCity.ecar.pluginAvailability result = new grpcSmartCity.ecar.pluginAvailability(this);
      result.pluginAvailability_ = pluginAvailability_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpcSmartCity.ecar.pluginAvailability) {
        return mergeFrom((grpcSmartCity.ecar.pluginAvailability)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpcSmartCity.ecar.pluginAvailability other) {
      if (other == grpcSmartCity.ecar.pluginAvailability.getDefaultInstance()) return this;
      if (!other.getPluginAvailability().isEmpty()) {
        pluginAvailability_ = other.pluginAvailability_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      grpcSmartCity.ecar.pluginAvailability parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpcSmartCity.ecar.pluginAvailability) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object pluginAvailability_ = "";
    /**
     * <code>string pluginAvailability = 1;</code>
     */
    public java.lang.String getPluginAvailability() {
      java.lang.Object ref = pluginAvailability_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pluginAvailability_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pluginAvailability = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPluginAvailabilityBytes() {
      java.lang.Object ref = pluginAvailability_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pluginAvailability_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pluginAvailability = 1;</code>
     */
    public Builder setPluginAvailability(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pluginAvailability_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pluginAvailability = 1;</code>
     */
    public Builder clearPluginAvailability() {
      
      pluginAvailability_ = getDefaultInstance().getPluginAvailability();
      onChanged();
      return this;
    }
    /**
     * <code>string pluginAvailability = 1;</code>
     */
    public Builder setPluginAvailabilityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pluginAvailability_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpcSmartCity.pluginAvailability)
  }

  // @@protoc_insertion_point(class_scope:grpcSmartCity.pluginAvailability)
  private static final grpcSmartCity.ecar.pluginAvailability DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpcSmartCity.ecar.pluginAvailability();
  }

  public static grpcSmartCity.ecar.pluginAvailability getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<pluginAvailability>
      PARSER = new com.google.protobuf.AbstractParser<pluginAvailability>() {
    @java.lang.Override
    public pluginAvailability parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new pluginAvailability(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<pluginAvailability> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<pluginAvailability> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpcSmartCity.ecar.pluginAvailability getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

