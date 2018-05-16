// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: Interface.proto at 47:1
package com.yijianyi.protocol;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * 回包包头
 */
public final class RspHead extends Message<RspHead, RspHead.Builder> {
  public static final ProtoAdapter<RspHead> ADAPTER = new ProtoAdapter_RspHead();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_GUID = "";

  public static final String DEFAULT_SID = "";

  /**
   * 在需要客户端重置GUID的时候返回
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String GUID;

  /**
   * 在需要客户端更换SID的时候保存
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String SID;

  public RspHead(String GUID, String SID) {
    this(GUID, SID, ByteString.EMPTY);
  }

  public RspHead(String GUID, String SID, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.GUID = GUID;
    this.SID = SID;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.GUID = GUID;
    builder.SID = SID;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RspHead)) return false;
    RspHead o = (RspHead) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(GUID, o.GUID)
        && Internal.equals(SID, o.SID);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (GUID != null ? GUID.hashCode() : 0);
      result = result * 37 + (SID != null ? SID.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (GUID != null) builder.append(", GUID=").append(GUID);
    if (SID != null) builder.append(", SID=").append(SID);
    return builder.replace(0, 2, "RspHead{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<RspHead, Builder> {
    public String GUID;

    public String SID;

    public Builder() {
    }

    /**
     * 在需要客户端重置GUID的时候返回
     */
    public Builder GUID(String GUID) {
      this.GUID = GUID;
      return this;
    }

    /**
     * 在需要客户端更换SID的时候保存
     */
    public Builder SID(String SID) {
      this.SID = SID;
      return this;
    }

    @Override
    public RspHead build() {
      return new RspHead(GUID, SID, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_RspHead extends ProtoAdapter<RspHead> {
    ProtoAdapter_RspHead() {
      super(FieldEncoding.LENGTH_DELIMITED, RspHead.class);
    }

    @Override
    public int encodedSize(RspHead value) {
      return (value.GUID != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.GUID) : 0)
          + (value.SID != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.SID) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, RspHead value) throws IOException {
      if (value.GUID != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.GUID);
      if (value.SID != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.SID);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public RspHead decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.GUID(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.SID(ProtoAdapter.STRING.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public RspHead redact(RspHead value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}