// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ecar.proto

package grpcSmartCity.ecar;

/**
 * Protobuf type {@code grpcSmartCity.pluginDelete}
 */
public  final class pluginDelete extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpcSmartCity.pluginDelete)
    pluginDeleteOrBuilder {
private static final long serialVersionUID = 0L;
  // Use pluginDelete.newBuilder() to construct.
  private pluginDelete(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private pluginDelete() {
    pluginDelete_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private pluginDelete(
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

            pluginDelete_ = s;
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
    return grpcSmartCity.ecar.smartcityDSServiceImpl.internal_static_grpcSmartCity_pluginDelete_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpcSmartCity.ecar.smartcityDSServiceImpl.internal_static_grpcSmartCity_pluginDelete_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpcSmartCity.ecar.pluginDelete.class, grpcSmartCity.ecar.pluginDelete.Builder.class);
  }

  public static final int PLUGINDELETE_FIELD_NUMBER = 1;
  private volatile java.lang.Object pluginDelete_;
  /**
   * <code>string pluginDelete = 1;</code>
   */
  public java.lang.String getPluginDelete() {
    java.lang.Object ref = pluginDelete_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pluginDelete_ = s;
      return s;
    }
  }
  /**
   * <code>string pluginDelete = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPluginDeleteBytes() {
    java.lang.Object ref = pluginDelete_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pluginDelete_ = b;
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
    if (!getPluginDeleteBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pluginDelete_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPluginDeleteBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pluginDelete_);
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
    if (!(obj instanceof grpcSmartCity.ecar.pluginDelete)) {
      return super.equals(obj);
    }
    grpcSmartCity.ecar.pluginDelete other = (grpcSmartCity.ecar.pluginDelete) obj;

    boolean result = true;
    result = result && getPluginDelete()
        .equals(other.getPluginDelete());
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
    hash = (37 * hash) + PLUGINDELETE_FIELD_NUMBER;
    hash = (53 * hash) + getPluginDelete().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpcSmartCity.ecar.pluginDelete parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpcSmartCity.ecar.pluginDelete parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpcSmartCity.ecar.pluginDelete parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpcSmartCity.ecar.pluginDelete parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpcSmartCity.ecar.pluginDelete parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpcSmartCity.ecar.pluginDelete parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpcSmartCity.ecar.pluginDelete parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpcSmartCity.ecar.pluginDelete parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpcSmartCity.ecar.pluginDelete parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpcSmartCity.ecar.pluginDelete parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpcSmartCity.ecar.pluginDelete parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpcSmartCity.ecar.pluginDelete parseFrom(
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
  public static Builder newBuilder(grpcSmartCity.ecar.pluginDelete prototype) {
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
   * Protobuf type {@code grpcSmartCity.pluginDelete}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpcSmartCity.pluginDelete)
      grpcSmartCity.ecar.pluginDeleteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpcSmartCity.ecar.smartcityDSServiceImpl.internal_static_grpcSmartCity_pluginDelete_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpcSmartCity.ecar.smartcityDSServiceImpl.internal_static_grpcSmartCity_pluginDelete_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpcSmartCity.ecar.pluginDelete.class, grpcSmartCity.ecar.pluginDelete.Builder.class);
    }

    // Construct using grpcSmartCity.ecar.pluginDelete.newBuilder()
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
      pluginDelete_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpcSmartCity.ecar.smartcityDSServiceImpl.internal_static_grpcSmartCity_pluginDelete_descriptor;
    }

    @java.lang.Override
    public grpcSmartCity.ecar.pluginDelete getDefaultInstanceForType() {
      return grpcSmartCity.ecar.pluginDelete.getDefaultInstance();
    }

    @java.lang.Override
    public grpcSmartCity.ecar.pluginDelete build() {
      grpcSmartCity.ecar.pluginDelete result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpcSmartCity.ecar.pluginDelete buildPartial() {
      grpcSmartCity.ecar.pluginDelete result = new grpcSmartCity.ecar.pluginDelete(this);
      result.pluginDelete_ = pluginDelete_;
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
      if (other instanceof grpcSmartCity.ecar.pluginDelete) {
        return mergeFrom((grpcSmartCity.ecar.pluginDelete)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpcSmartCity.ecar.pluginDelete other) {
      if (other == grpcSmartCity.ecar.pluginDelete.getDefaultInstance()) return this;
      if (!other.getPluginDelete().isEmpty()) {
        pluginDelete_ = other.pluginDelete_;
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
      grpcSmartCity.ecar.pluginDelete parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpcSmartCity.ecar.pluginDelete) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object pluginDelete_ = "";
    /**
     * <code>string pluginDelete = 1;</code>
     */
    public java.lang.String getPluginDelete() {
      java.lang.Object ref = pluginDelete_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pluginDelete_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pluginDelete = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPluginDeleteBytes() {
      java.lang.Object ref = pluginDelete_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pluginDelete_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pluginDelete = 1;</code>
     */
    public Builder setPluginDelete(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pluginDelete_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pluginDelete = 1;</code>
     */
    public Builder clearPluginDelete() {
      
      pluginDelete_ = getDefaultInstance().getPluginDelete();
      onChanged();
      return this;
    }
    /**
     * <code>string pluginDelete = 1;</code>
     */
    public Builder setPluginDeleteBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pluginDelete_ = value;
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


    // @@protoc_insertion_point(builder_scope:grpcSmartCity.pluginDelete)
  }

  // @@protoc_insertion_point(class_scope:grpcSmartCity.pluginDelete)
  private static final grpcSmartCity.ecar.pluginDelete DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpcSmartCity.ecar.pluginDelete();
  }

  public static grpcSmartCity.ecar.pluginDelete getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<pluginDelete>
      PARSER = new com.google.protobuf.AbstractParser<pluginDelete>() {
    @java.lang.Override
    public pluginDelete parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new pluginDelete(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<pluginDelete> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<pluginDelete> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpcSmartCity.ecar.pluginDelete getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

