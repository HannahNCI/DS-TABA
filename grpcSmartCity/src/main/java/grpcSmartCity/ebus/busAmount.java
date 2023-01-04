// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ebus.proto

package grpcSmartCity.ebus;

/**
 * Protobuf type {@code grpcSmartCity.busAmount}
 */
public  final class busAmount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpcSmartCity.busAmount)
    busAmountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use busAmount.newBuilder() to construct.
  private busAmount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private busAmount() {
    busAmount_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private busAmount(
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

            busAmount_ = s;
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
    return grpcSmartCity.ebus.smartcityDSServiceImpl.internal_static_grpcSmartCity_busAmount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpcSmartCity.ebus.smartcityDSServiceImpl.internal_static_grpcSmartCity_busAmount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpcSmartCity.ebus.busAmount.class, grpcSmartCity.ebus.busAmount.Builder.class);
  }

  public static final int BUSAMOUNT_FIELD_NUMBER = 1;
  private volatile java.lang.Object busAmount_;
  /**
   * <code>string busAmount = 1;</code>
   */
  public java.lang.String getBusAmount() {
    java.lang.Object ref = busAmount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      busAmount_ = s;
      return s;
    }
  }
  /**
   * <code>string busAmount = 1;</code>
   */
  public com.google.protobuf.ByteString
      getBusAmountBytes() {
    java.lang.Object ref = busAmount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      busAmount_ = b;
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
    if (!getBusAmountBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, busAmount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBusAmountBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, busAmount_);
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
    if (!(obj instanceof grpcSmartCity.ebus.busAmount)) {
      return super.equals(obj);
    }
    grpcSmartCity.ebus.busAmount other = (grpcSmartCity.ebus.busAmount) obj;

    boolean result = true;
    result = result && getBusAmount()
        .equals(other.getBusAmount());
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
    hash = (37 * hash) + BUSAMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getBusAmount().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpcSmartCity.ebus.busAmount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpcSmartCity.ebus.busAmount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpcSmartCity.ebus.busAmount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpcSmartCity.ebus.busAmount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpcSmartCity.ebus.busAmount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpcSmartCity.ebus.busAmount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpcSmartCity.ebus.busAmount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpcSmartCity.ebus.busAmount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpcSmartCity.ebus.busAmount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpcSmartCity.ebus.busAmount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpcSmartCity.ebus.busAmount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpcSmartCity.ebus.busAmount parseFrom(
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
  public static Builder newBuilder(grpcSmartCity.ebus.busAmount prototype) {
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
   * Protobuf type {@code grpcSmartCity.busAmount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpcSmartCity.busAmount)
      grpcSmartCity.ebus.busAmountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpcSmartCity.ebus.smartcityDSServiceImpl.internal_static_grpcSmartCity_busAmount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpcSmartCity.ebus.smartcityDSServiceImpl.internal_static_grpcSmartCity_busAmount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpcSmartCity.ebus.busAmount.class, grpcSmartCity.ebus.busAmount.Builder.class);
    }

    // Construct using grpcSmartCity.ebus.busAmount.newBuilder()
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
      busAmount_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpcSmartCity.ebus.smartcityDSServiceImpl.internal_static_grpcSmartCity_busAmount_descriptor;
    }

    @java.lang.Override
    public grpcSmartCity.ebus.busAmount getDefaultInstanceForType() {
      return grpcSmartCity.ebus.busAmount.getDefaultInstance();
    }

    @java.lang.Override
    public grpcSmartCity.ebus.busAmount build() {
      grpcSmartCity.ebus.busAmount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpcSmartCity.ebus.busAmount buildPartial() {
      grpcSmartCity.ebus.busAmount result = new grpcSmartCity.ebus.busAmount(this);
      result.busAmount_ = busAmount_;
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
      if (other instanceof grpcSmartCity.ebus.busAmount) {
        return mergeFrom((grpcSmartCity.ebus.busAmount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpcSmartCity.ebus.busAmount other) {
      if (other == grpcSmartCity.ebus.busAmount.getDefaultInstance()) return this;
      if (!other.getBusAmount().isEmpty()) {
        busAmount_ = other.busAmount_;
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
      grpcSmartCity.ebus.busAmount parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpcSmartCity.ebus.busAmount) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object busAmount_ = "";
    /**
     * <code>string busAmount = 1;</code>
     */
    public java.lang.String getBusAmount() {
      java.lang.Object ref = busAmount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        busAmount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string busAmount = 1;</code>
     */
    public com.google.protobuf.ByteString
        getBusAmountBytes() {
      java.lang.Object ref = busAmount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        busAmount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string busAmount = 1;</code>
     */
    public Builder setBusAmount(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      busAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string busAmount = 1;</code>
     */
    public Builder clearBusAmount() {
      
      busAmount_ = getDefaultInstance().getBusAmount();
      onChanged();
      return this;
    }
    /**
     * <code>string busAmount = 1;</code>
     */
    public Builder setBusAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      busAmount_ = value;
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


    // @@protoc_insertion_point(builder_scope:grpcSmartCity.busAmount)
  }

  // @@protoc_insertion_point(class_scope:grpcSmartCity.busAmount)
  private static final grpcSmartCity.ebus.busAmount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpcSmartCity.ebus.busAmount();
  }

  public static grpcSmartCity.ebus.busAmount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<busAmount>
      PARSER = new com.google.protobuf.AbstractParser<busAmount>() {
    @java.lang.Override
    public busAmount parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new busAmount(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<busAmount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<busAmount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpcSmartCity.ebus.busAmount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
