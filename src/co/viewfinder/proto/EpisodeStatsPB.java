// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EpisodeStats.proto

package co.viewfinder.proto;

public final class EpisodeStatsPB {
  private EpisodeStatsPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface EpisodeStatsOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 hidden_photos = 5;
    /**
     * <code>required int32 hidden_photos = 5;</code>
     */
    boolean hasHiddenPhotos();
    /**
     * <code>required int32 hidden_photos = 5;</code>
     */
    int getHiddenPhotos();

    // required int32 posted_photos = 1;
    /**
     * <code>required int32 posted_photos = 1;</code>
     */
    boolean hasPostedPhotos();
    /**
     * <code>required int32 posted_photos = 1;</code>
     */
    int getPostedPhotos();

    // required int32 quarantined_photos = 4;
    /**
     * <code>required int32 quarantined_photos = 4;</code>
     */
    boolean hasQuarantinedPhotos();
    /**
     * <code>required int32 quarantined_photos = 4;</code>
     */
    int getQuarantinedPhotos();

    // required int32 removed_photos = 2;
    /**
     * <code>required int32 removed_photos = 2;</code>
     */
    boolean hasRemovedPhotos();
    /**
     * <code>required int32 removed_photos = 2;</code>
     */
    int getRemovedPhotos();

    // required int32 unshared_photos = 3;
    /**
     * <code>required int32 unshared_photos = 3;</code>
     */
    boolean hasUnsharedPhotos();
    /**
     * <code>required int32 unshared_photos = 3;</code>
     */
    int getUnsharedPhotos();
  }
  /**
   * Protobuf type {@code EpisodeStats}
   */
  public static final class EpisodeStats extends
      com.google.protobuf.GeneratedMessage
      implements EpisodeStatsOrBuilder {
    // Use EpisodeStats.newBuilder() to construct.
    private EpisodeStats(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private EpisodeStats(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final EpisodeStats defaultInstance;
    public static EpisodeStats getDefaultInstance() {
      return defaultInstance;
    }

    public EpisodeStats getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private EpisodeStats(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000002;
              postedPhotos_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000008;
              removedPhotos_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000010;
              unsharedPhotos_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000004;
              quarantinedPhotos_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000001;
              hiddenPhotos_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return co.viewfinder.proto.EpisodeStatsPB.internal_static_EpisodeStats_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return co.viewfinder.proto.EpisodeStatsPB.internal_static_EpisodeStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              co.viewfinder.proto.EpisodeStatsPB.EpisodeStats.class, co.viewfinder.proto.EpisodeStatsPB.EpisodeStats.Builder.class);
    }

    public static com.google.protobuf.Parser<EpisodeStats> PARSER =
        new com.google.protobuf.AbstractParser<EpisodeStats>() {
      public EpisodeStats parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EpisodeStats(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<EpisodeStats> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 hidden_photos = 5;
    public static final int HIDDEN_PHOTOS_FIELD_NUMBER = 5;
    private int hiddenPhotos_;
    /**
     * <code>required int32 hidden_photos = 5;</code>
     */
    public boolean hasHiddenPhotos() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 hidden_photos = 5;</code>
     */
    public int getHiddenPhotos() {
      return hiddenPhotos_;
    }

    // required int32 posted_photos = 1;
    public static final int POSTED_PHOTOS_FIELD_NUMBER = 1;
    private int postedPhotos_;
    /**
     * <code>required int32 posted_photos = 1;</code>
     */
    public boolean hasPostedPhotos() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 posted_photos = 1;</code>
     */
    public int getPostedPhotos() {
      return postedPhotos_;
    }

    // required int32 quarantined_photos = 4;
    public static final int QUARANTINED_PHOTOS_FIELD_NUMBER = 4;
    private int quarantinedPhotos_;
    /**
     * <code>required int32 quarantined_photos = 4;</code>
     */
    public boolean hasQuarantinedPhotos() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 quarantined_photos = 4;</code>
     */
    public int getQuarantinedPhotos() {
      return quarantinedPhotos_;
    }

    // required int32 removed_photos = 2;
    public static final int REMOVED_PHOTOS_FIELD_NUMBER = 2;
    private int removedPhotos_;
    /**
     * <code>required int32 removed_photos = 2;</code>
     */
    public boolean hasRemovedPhotos() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int32 removed_photos = 2;</code>
     */
    public int getRemovedPhotos() {
      return removedPhotos_;
    }

    // required int32 unshared_photos = 3;
    public static final int UNSHARED_PHOTOS_FIELD_NUMBER = 3;
    private int unsharedPhotos_;
    /**
     * <code>required int32 unshared_photos = 3;</code>
     */
    public boolean hasUnsharedPhotos() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required int32 unshared_photos = 3;</code>
     */
    public int getUnsharedPhotos() {
      return unsharedPhotos_;
    }

    private void initFields() {
      hiddenPhotos_ = 0;
      postedPhotos_ = 0;
      quarantinedPhotos_ = 0;
      removedPhotos_ = 0;
      unsharedPhotos_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasHiddenPhotos()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPostedPhotos()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasQuarantinedPhotos()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRemovedPhotos()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUnsharedPhotos()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(1, postedPhotos_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(2, removedPhotos_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(3, unsharedPhotos_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(4, quarantinedPhotos_);
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(5, hiddenPhotos_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, postedPhotos_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, removedPhotos_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, unsharedPhotos_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, quarantinedPhotos_);
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, hiddenPhotos_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static co.viewfinder.proto.EpisodeStatsPB.EpisodeStats parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static co.viewfinder.proto.EpisodeStatsPB.EpisodeStats parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static co.viewfinder.proto.EpisodeStatsPB.EpisodeStats parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static co.viewfinder.proto.EpisodeStatsPB.EpisodeStats parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static co.viewfinder.proto.EpisodeStatsPB.EpisodeStats parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static co.viewfinder.proto.EpisodeStatsPB.EpisodeStats parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static co.viewfinder.proto.EpisodeStatsPB.EpisodeStats parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static co.viewfinder.proto.EpisodeStatsPB.EpisodeStats parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static co.viewfinder.proto.EpisodeStatsPB.EpisodeStats parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static co.viewfinder.proto.EpisodeStatsPB.EpisodeStats parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(co.viewfinder.proto.EpisodeStatsPB.EpisodeStats prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code EpisodeStats}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements co.viewfinder.proto.EpisodeStatsPB.EpisodeStatsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return co.viewfinder.proto.EpisodeStatsPB.internal_static_EpisodeStats_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return co.viewfinder.proto.EpisodeStatsPB.internal_static_EpisodeStats_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                co.viewfinder.proto.EpisodeStatsPB.EpisodeStats.class, co.viewfinder.proto.EpisodeStatsPB.EpisodeStats.Builder.class);
      }

      // Construct using co.viewfinder.proto.EpisodeStatsPB.EpisodeStats.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        hiddenPhotos_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        postedPhotos_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        quarantinedPhotos_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        removedPhotos_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        unsharedPhotos_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return co.viewfinder.proto.EpisodeStatsPB.internal_static_EpisodeStats_descriptor;
      }

      public co.viewfinder.proto.EpisodeStatsPB.EpisodeStats getDefaultInstanceForType() {
        return co.viewfinder.proto.EpisodeStatsPB.EpisodeStats.getDefaultInstance();
      }

      public co.viewfinder.proto.EpisodeStatsPB.EpisodeStats build() {
        co.viewfinder.proto.EpisodeStatsPB.EpisodeStats result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public co.viewfinder.proto.EpisodeStatsPB.EpisodeStats buildPartial() {
        co.viewfinder.proto.EpisodeStatsPB.EpisodeStats result = new co.viewfinder.proto.EpisodeStatsPB.EpisodeStats(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.hiddenPhotos_ = hiddenPhotos_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.postedPhotos_ = postedPhotos_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.quarantinedPhotos_ = quarantinedPhotos_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.removedPhotos_ = removedPhotos_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.unsharedPhotos_ = unsharedPhotos_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof co.viewfinder.proto.EpisodeStatsPB.EpisodeStats) {
          return mergeFrom((co.viewfinder.proto.EpisodeStatsPB.EpisodeStats)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(co.viewfinder.proto.EpisodeStatsPB.EpisodeStats other) {
        if (other == co.viewfinder.proto.EpisodeStatsPB.EpisodeStats.getDefaultInstance()) return this;
        if (other.hasHiddenPhotos()) {
          setHiddenPhotos(other.getHiddenPhotos());
        }
        if (other.hasPostedPhotos()) {
          setPostedPhotos(other.getPostedPhotos());
        }
        if (other.hasQuarantinedPhotos()) {
          setQuarantinedPhotos(other.getQuarantinedPhotos());
        }
        if (other.hasRemovedPhotos()) {
          setRemovedPhotos(other.getRemovedPhotos());
        }
        if (other.hasUnsharedPhotos()) {
          setUnsharedPhotos(other.getUnsharedPhotos());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasHiddenPhotos()) {
          
          return false;
        }
        if (!hasPostedPhotos()) {
          
          return false;
        }
        if (!hasQuarantinedPhotos()) {
          
          return false;
        }
        if (!hasRemovedPhotos()) {
          
          return false;
        }
        if (!hasUnsharedPhotos()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        co.viewfinder.proto.EpisodeStatsPB.EpisodeStats parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (co.viewfinder.proto.EpisodeStatsPB.EpisodeStats) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 hidden_photos = 5;
      private int hiddenPhotos_ ;
      /**
       * <code>required int32 hidden_photos = 5;</code>
       */
      public boolean hasHiddenPhotos() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 hidden_photos = 5;</code>
       */
      public int getHiddenPhotos() {
        return hiddenPhotos_;
      }
      /**
       * <code>required int32 hidden_photos = 5;</code>
       */
      public Builder setHiddenPhotos(int value) {
        bitField0_ |= 0x00000001;
        hiddenPhotos_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 hidden_photos = 5;</code>
       */
      public Builder clearHiddenPhotos() {
        bitField0_ = (bitField0_ & ~0x00000001);
        hiddenPhotos_ = 0;
        onChanged();
        return this;
      }

      // required int32 posted_photos = 1;
      private int postedPhotos_ ;
      /**
       * <code>required int32 posted_photos = 1;</code>
       */
      public boolean hasPostedPhotos() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 posted_photos = 1;</code>
       */
      public int getPostedPhotos() {
        return postedPhotos_;
      }
      /**
       * <code>required int32 posted_photos = 1;</code>
       */
      public Builder setPostedPhotos(int value) {
        bitField0_ |= 0x00000002;
        postedPhotos_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 posted_photos = 1;</code>
       */
      public Builder clearPostedPhotos() {
        bitField0_ = (bitField0_ & ~0x00000002);
        postedPhotos_ = 0;
        onChanged();
        return this;
      }

      // required int32 quarantined_photos = 4;
      private int quarantinedPhotos_ ;
      /**
       * <code>required int32 quarantined_photos = 4;</code>
       */
      public boolean hasQuarantinedPhotos() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 quarantined_photos = 4;</code>
       */
      public int getQuarantinedPhotos() {
        return quarantinedPhotos_;
      }
      /**
       * <code>required int32 quarantined_photos = 4;</code>
       */
      public Builder setQuarantinedPhotos(int value) {
        bitField0_ |= 0x00000004;
        quarantinedPhotos_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 quarantined_photos = 4;</code>
       */
      public Builder clearQuarantinedPhotos() {
        bitField0_ = (bitField0_ & ~0x00000004);
        quarantinedPhotos_ = 0;
        onChanged();
        return this;
      }

      // required int32 removed_photos = 2;
      private int removedPhotos_ ;
      /**
       * <code>required int32 removed_photos = 2;</code>
       */
      public boolean hasRemovedPhotos() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required int32 removed_photos = 2;</code>
       */
      public int getRemovedPhotos() {
        return removedPhotos_;
      }
      /**
       * <code>required int32 removed_photos = 2;</code>
       */
      public Builder setRemovedPhotos(int value) {
        bitField0_ |= 0x00000008;
        removedPhotos_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 removed_photos = 2;</code>
       */
      public Builder clearRemovedPhotos() {
        bitField0_ = (bitField0_ & ~0x00000008);
        removedPhotos_ = 0;
        onChanged();
        return this;
      }

      // required int32 unshared_photos = 3;
      private int unsharedPhotos_ ;
      /**
       * <code>required int32 unshared_photos = 3;</code>
       */
      public boolean hasUnsharedPhotos() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required int32 unshared_photos = 3;</code>
       */
      public int getUnsharedPhotos() {
        return unsharedPhotos_;
      }
      /**
       * <code>required int32 unshared_photos = 3;</code>
       */
      public Builder setUnsharedPhotos(int value) {
        bitField0_ |= 0x00000010;
        unsharedPhotos_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 unshared_photos = 3;</code>
       */
      public Builder clearUnsharedPhotos() {
        bitField0_ = (bitField0_ & ~0x00000010);
        unsharedPhotos_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:EpisodeStats)
    }

    static {
      defaultInstance = new EpisodeStats(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:EpisodeStats)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_EpisodeStats_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_EpisodeStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022EpisodeStats.proto\"\211\001\n\014EpisodeStats\022\025\n" +
      "\rhidden_photos\030\005 \002(\005\022\025\n\rposted_photos\030\001 " +
      "\002(\005\022\032\n\022quarantined_photos\030\004 \002(\005\022\026\n\016remov" +
      "ed_photos\030\002 \002(\005\022\027\n\017unshared_photos\030\003 \002(\005" +
      "B%\n\023co.viewfinder.protoB\016EpisodeStatsPB"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_EpisodeStats_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_EpisodeStats_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_EpisodeStats_descriptor,
              new java.lang.String[] { "HiddenPhotos", "PostedPhotos", "QuarantinedPhotos", "RemovedPhotos", "UnsharedPhotos", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
