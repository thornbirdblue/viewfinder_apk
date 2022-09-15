// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SystemMessage.proto

package co.viewfinder.proto;

public final class SystemMessagePB {
  private SystemMessagePB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SystemMessageOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional string title = 1;
    /**
     * <code>optional string title = 1;</code>
     */
    boolean hasTitle();
    /**
     * <code>optional string title = 1;</code>
     */
    java.lang.String getTitle();
    /**
     * <code>optional string title = 1;</code>
     */
    com.google.protobuf.ByteString
        getTitleBytes();

    // optional string body = 2;
    /**
     * <code>optional string body = 2;</code>
     */
    boolean hasBody();
    /**
     * <code>optional string body = 2;</code>
     */
    java.lang.String getBody();
    /**
     * <code>optional string body = 2;</code>
     */
    com.google.protobuf.ByteString
        getBodyBytes();

    // optional string link = 3;
    /**
     * <code>optional string link = 3;</code>
     */
    boolean hasLink();
    /**
     * <code>optional string link = 3;</code>
     */
    java.lang.String getLink();
    /**
     * <code>optional string link = 3;</code>
     */
    com.google.protobuf.ByteString
        getLinkBytes();

    // optional string identifier = 4;
    /**
     * <code>optional string identifier = 4;</code>
     */
    boolean hasIdentifier();
    /**
     * <code>optional string identifier = 4;</code>
     */
    java.lang.String getIdentifier();
    /**
     * <code>optional string identifier = 4;</code>
     */
    com.google.protobuf.ByteString
        getIdentifierBytes();

    // optional .SystemMessage.Severity severity = 5 [default = UNKNOWN];
    /**
     * <code>optional .SystemMessage.Severity severity = 5 [default = UNKNOWN];</code>
     */
    boolean hasSeverity();
    /**
     * <code>optional .SystemMessage.Severity severity = 5 [default = UNKNOWN];</code>
     */
    co.viewfinder.proto.SystemMessagePB.SystemMessage.Severity getSeverity();
  }
  /**
   * Protobuf type {@code SystemMessage}
   */
  public static final class SystemMessage extends
      com.google.protobuf.GeneratedMessage
      implements SystemMessageOrBuilder {
    // Use SystemMessage.newBuilder() to construct.
    private SystemMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SystemMessage(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SystemMessage defaultInstance;
    public static SystemMessage getDefaultInstance() {
      return defaultInstance;
    }

    public SystemMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private SystemMessage(
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
            case 10: {
              bitField0_ |= 0x00000001;
              title_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              body_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              link_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              identifier_ = input.readBytes();
              break;
            }
            case 40: {
              int rawValue = input.readEnum();
              co.viewfinder.proto.SystemMessagePB.SystemMessage.Severity value = co.viewfinder.proto.SystemMessagePB.SystemMessage.Severity.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(5, rawValue);
              } else {
                bitField0_ |= 0x00000010;
                severity_ = value;
              }
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
      return co.viewfinder.proto.SystemMessagePB.internal_static_SystemMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return co.viewfinder.proto.SystemMessagePB.internal_static_SystemMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              co.viewfinder.proto.SystemMessagePB.SystemMessage.class, co.viewfinder.proto.SystemMessagePB.SystemMessage.Builder.class);
    }

    public static com.google.protobuf.Parser<SystemMessage> PARSER =
        new com.google.protobuf.AbstractParser<SystemMessage>() {
      public SystemMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SystemMessage(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<SystemMessage> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code SystemMessage.Severity}
     */
    public enum Severity
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>SILENT = 0;</code>
       */
      SILENT(0, 0),
      /**
       * <code>INFO = 1;</code>
       */
      INFO(1, 1),
      /**
       * <code>ATTENTION = 2;</code>
       */
      ATTENTION(2, 2),
      /**
       * <code>DISABLE_NETWORK = 3;</code>
       */
      DISABLE_NETWORK(3, 3),
      /**
       * <code>UNKNOWN = 4;</code>
       */
      UNKNOWN(4, 4),
      ;

      /**
       * <code>SILENT = 0;</code>
       */
      public static final int SILENT_VALUE = 0;
      /**
       * <code>INFO = 1;</code>
       */
      public static final int INFO_VALUE = 1;
      /**
       * <code>ATTENTION = 2;</code>
       */
      public static final int ATTENTION_VALUE = 2;
      /**
       * <code>DISABLE_NETWORK = 3;</code>
       */
      public static final int DISABLE_NETWORK_VALUE = 3;
      /**
       * <code>UNKNOWN = 4;</code>
       */
      public static final int UNKNOWN_VALUE = 4;


      public final int getNumber() { return value; }

      public static Severity valueOf(int value) {
        switch (value) {
          case 0: return SILENT;
          case 1: return INFO;
          case 2: return ATTENTION;
          case 3: return DISABLE_NETWORK;
          case 4: return UNKNOWN;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Severity>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<Severity>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Severity>() {
              public Severity findValueByNumber(int number) {
                return Severity.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return co.viewfinder.proto.SystemMessagePB.SystemMessage.getDescriptor().getEnumTypes().get(0);
      }

      private static final Severity[] VALUES = values();

      public static Severity valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private Severity(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:SystemMessage.Severity)
    }

    private int bitField0_;
    // optional string title = 1;
    public static final int TITLE_FIELD_NUMBER = 1;
    private java.lang.Object title_;
    /**
     * <code>optional string title = 1;</code>
     */
    public boolean hasTitle() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string title = 1;</code>
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          title_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string title = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string body = 2;
    public static final int BODY_FIELD_NUMBER = 2;
    private java.lang.Object body_;
    /**
     * <code>optional string body = 2;</code>
     */
    public boolean hasBody() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string body = 2;</code>
     */
    public java.lang.String getBody() {
      java.lang.Object ref = body_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          body_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string body = 2;</code>
     */
    public com.google.protobuf.ByteString
        getBodyBytes() {
      java.lang.Object ref = body_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        body_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string link = 3;
    public static final int LINK_FIELD_NUMBER = 3;
    private java.lang.Object link_;
    /**
     * <code>optional string link = 3;</code>
     */
    public boolean hasLink() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string link = 3;</code>
     */
    public java.lang.String getLink() {
      java.lang.Object ref = link_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          link_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string link = 3;</code>
     */
    public com.google.protobuf.ByteString
        getLinkBytes() {
      java.lang.Object ref = link_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        link_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string identifier = 4;
    public static final int IDENTIFIER_FIELD_NUMBER = 4;
    private java.lang.Object identifier_;
    /**
     * <code>optional string identifier = 4;</code>
     */
    public boolean hasIdentifier() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string identifier = 4;</code>
     */
    public java.lang.String getIdentifier() {
      java.lang.Object ref = identifier_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          identifier_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string identifier = 4;</code>
     */
    public com.google.protobuf.ByteString
        getIdentifierBytes() {
      java.lang.Object ref = identifier_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        identifier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional .SystemMessage.Severity severity = 5 [default = UNKNOWN];
    public static final int SEVERITY_FIELD_NUMBER = 5;
    private co.viewfinder.proto.SystemMessagePB.SystemMessage.Severity severity_;
    /**
     * <code>optional .SystemMessage.Severity severity = 5 [default = UNKNOWN];</code>
     */
    public boolean hasSeverity() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional .SystemMessage.Severity severity = 5 [default = UNKNOWN];</code>
     */
    public co.viewfinder.proto.SystemMessagePB.SystemMessage.Severity getSeverity() {
      return severity_;
    }

    private void initFields() {
      title_ = "";
      body_ = "";
      link_ = "";
      identifier_ = "";
      severity_ = co.viewfinder.proto.SystemMessagePB.SystemMessage.Severity.UNKNOWN;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getTitleBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getBodyBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getLinkBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getIdentifierBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeEnum(5, severity_.getNumber());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getTitleBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getBodyBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getLinkBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getIdentifierBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, severity_.getNumber());
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

    public static co.viewfinder.proto.SystemMessagePB.SystemMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static co.viewfinder.proto.SystemMessagePB.SystemMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static co.viewfinder.proto.SystemMessagePB.SystemMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static co.viewfinder.proto.SystemMessagePB.SystemMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static co.viewfinder.proto.SystemMessagePB.SystemMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static co.viewfinder.proto.SystemMessagePB.SystemMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static co.viewfinder.proto.SystemMessagePB.SystemMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static co.viewfinder.proto.SystemMessagePB.SystemMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static co.viewfinder.proto.SystemMessagePB.SystemMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static co.viewfinder.proto.SystemMessagePB.SystemMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(co.viewfinder.proto.SystemMessagePB.SystemMessage prototype) {
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
     * Protobuf type {@code SystemMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements co.viewfinder.proto.SystemMessagePB.SystemMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return co.viewfinder.proto.SystemMessagePB.internal_static_SystemMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return co.viewfinder.proto.SystemMessagePB.internal_static_SystemMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                co.viewfinder.proto.SystemMessagePB.SystemMessage.class, co.viewfinder.proto.SystemMessagePB.SystemMessage.Builder.class);
      }

      // Construct using co.viewfinder.proto.SystemMessagePB.SystemMessage.newBuilder()
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
        title_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        body_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        link_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        identifier_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        severity_ = co.viewfinder.proto.SystemMessagePB.SystemMessage.Severity.UNKNOWN;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return co.viewfinder.proto.SystemMessagePB.internal_static_SystemMessage_descriptor;
      }

      public co.viewfinder.proto.SystemMessagePB.SystemMessage getDefaultInstanceForType() {
        return co.viewfinder.proto.SystemMessagePB.SystemMessage.getDefaultInstance();
      }

      public co.viewfinder.proto.SystemMessagePB.SystemMessage build() {
        co.viewfinder.proto.SystemMessagePB.SystemMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public co.viewfinder.proto.SystemMessagePB.SystemMessage buildPartial() {
        co.viewfinder.proto.SystemMessagePB.SystemMessage result = new co.viewfinder.proto.SystemMessagePB.SystemMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.title_ = title_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.body_ = body_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.link_ = link_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.identifier_ = identifier_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.severity_ = severity_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof co.viewfinder.proto.SystemMessagePB.SystemMessage) {
          return mergeFrom((co.viewfinder.proto.SystemMessagePB.SystemMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(co.viewfinder.proto.SystemMessagePB.SystemMessage other) {
        if (other == co.viewfinder.proto.SystemMessagePB.SystemMessage.getDefaultInstance()) return this;
        if (other.hasTitle()) {
          bitField0_ |= 0x00000001;
          title_ = other.title_;
          onChanged();
        }
        if (other.hasBody()) {
          bitField0_ |= 0x00000002;
          body_ = other.body_;
          onChanged();
        }
        if (other.hasLink()) {
          bitField0_ |= 0x00000004;
          link_ = other.link_;
          onChanged();
        }
        if (other.hasIdentifier()) {
          bitField0_ |= 0x00000008;
          identifier_ = other.identifier_;
          onChanged();
        }
        if (other.hasSeverity()) {
          setSeverity(other.getSeverity());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        co.viewfinder.proto.SystemMessagePB.SystemMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (co.viewfinder.proto.SystemMessagePB.SystemMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string title = 1;
      private java.lang.Object title_ = "";
      /**
       * <code>optional string title = 1;</code>
       */
      public boolean hasTitle() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string title = 1;</code>
       */
      public java.lang.String getTitle() {
        java.lang.Object ref = title_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          title_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string title = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTitleBytes() {
        java.lang.Object ref = title_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          title_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string title = 1;</code>
       */
      public Builder setTitle(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        title_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string title = 1;</code>
       */
      public Builder clearTitle() {
        bitField0_ = (bitField0_ & ~0x00000001);
        title_ = getDefaultInstance().getTitle();
        onChanged();
        return this;
      }
      /**
       * <code>optional string title = 1;</code>
       */
      public Builder setTitleBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        title_ = value;
        onChanged();
        return this;
      }

      // optional string body = 2;
      private java.lang.Object body_ = "";
      /**
       * <code>optional string body = 2;</code>
       */
      public boolean hasBody() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string body = 2;</code>
       */
      public java.lang.String getBody() {
        java.lang.Object ref = body_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          body_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string body = 2;</code>
       */
      public com.google.protobuf.ByteString
          getBodyBytes() {
        java.lang.Object ref = body_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          body_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string body = 2;</code>
       */
      public Builder setBody(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        body_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string body = 2;</code>
       */
      public Builder clearBody() {
        bitField0_ = (bitField0_ & ~0x00000002);
        body_ = getDefaultInstance().getBody();
        onChanged();
        return this;
      }
      /**
       * <code>optional string body = 2;</code>
       */
      public Builder setBodyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        body_ = value;
        onChanged();
        return this;
      }

      // optional string link = 3;
      private java.lang.Object link_ = "";
      /**
       * <code>optional string link = 3;</code>
       */
      public boolean hasLink() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string link = 3;</code>
       */
      public java.lang.String getLink() {
        java.lang.Object ref = link_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          link_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string link = 3;</code>
       */
      public com.google.protobuf.ByteString
          getLinkBytes() {
        java.lang.Object ref = link_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          link_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string link = 3;</code>
       */
      public Builder setLink(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        link_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string link = 3;</code>
       */
      public Builder clearLink() {
        bitField0_ = (bitField0_ & ~0x00000004);
        link_ = getDefaultInstance().getLink();
        onChanged();
        return this;
      }
      /**
       * <code>optional string link = 3;</code>
       */
      public Builder setLinkBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        link_ = value;
        onChanged();
        return this;
      }

      // optional string identifier = 4;
      private java.lang.Object identifier_ = "";
      /**
       * <code>optional string identifier = 4;</code>
       */
      public boolean hasIdentifier() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string identifier = 4;</code>
       */
      public java.lang.String getIdentifier() {
        java.lang.Object ref = identifier_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          identifier_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string identifier = 4;</code>
       */
      public com.google.protobuf.ByteString
          getIdentifierBytes() {
        java.lang.Object ref = identifier_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          identifier_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string identifier = 4;</code>
       */
      public Builder setIdentifier(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        identifier_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string identifier = 4;</code>
       */
      public Builder clearIdentifier() {
        bitField0_ = (bitField0_ & ~0x00000008);
        identifier_ = getDefaultInstance().getIdentifier();
        onChanged();
        return this;
      }
      /**
       * <code>optional string identifier = 4;</code>
       */
      public Builder setIdentifierBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        identifier_ = value;
        onChanged();
        return this;
      }

      // optional .SystemMessage.Severity severity = 5 [default = UNKNOWN];
      private co.viewfinder.proto.SystemMessagePB.SystemMessage.Severity severity_ = co.viewfinder.proto.SystemMessagePB.SystemMessage.Severity.UNKNOWN;
      /**
       * <code>optional .SystemMessage.Severity severity = 5 [default = UNKNOWN];</code>
       */
      public boolean hasSeverity() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional .SystemMessage.Severity severity = 5 [default = UNKNOWN];</code>
       */
      public co.viewfinder.proto.SystemMessagePB.SystemMessage.Severity getSeverity() {
        return severity_;
      }
      /**
       * <code>optional .SystemMessage.Severity severity = 5 [default = UNKNOWN];</code>
       */
      public Builder setSeverity(co.viewfinder.proto.SystemMessagePB.SystemMessage.Severity value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        severity_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .SystemMessage.Severity severity = 5 [default = UNKNOWN];</code>
       */
      public Builder clearSeverity() {
        bitField0_ = (bitField0_ & ~0x00000010);
        severity_ = co.viewfinder.proto.SystemMessagePB.SystemMessage.Severity.UNKNOWN;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:SystemMessage)
    }

    static {
      defaultInstance = new SystemMessage(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:SystemMessage)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_SystemMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_SystemMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023SystemMessage.proto\"\325\001\n\rSystemMessage\022" +
      "\r\n\005title\030\001 \001(\t\022\014\n\004body\030\002 \001(\t\022\014\n\004link\030\003 \001" +
      "(\t\022\022\n\nidentifier\030\004 \001(\t\0222\n\010severity\030\005 \001(\016" +
      "2\027.SystemMessage.Severity:\007UNKNOWN\"Q\n\010Se" +
      "verity\022\n\n\006SILENT\020\000\022\010\n\004INFO\020\001\022\r\n\tATTENTIO" +
      "N\020\002\022\023\n\017DISABLE_NETWORK\020\003\022\013\n\007UNKNOWN\020\004B&\n" +
      "\023co.viewfinder.protoB\017SystemMessagePB"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_SystemMessage_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_SystemMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_SystemMessage_descriptor,
              new java.lang.String[] { "Title", "Body", "Link", "Identifier", "Severity", });
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
