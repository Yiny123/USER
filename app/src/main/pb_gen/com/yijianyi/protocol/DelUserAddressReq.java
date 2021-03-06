// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 104:1
package com.yijianyi.protocol;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * 删除用户地址消息体
 */
public final class DelUserAddressReq extends Message<DelUserAddressReq, DelUserAddressReq.Builder> {
  public static final ProtoAdapter<DelUserAddressReq> ADAPTER = new ProtoAdapter_DelUserAddressReq();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_ADDRID = 0L;

  public static final Long DEFAULT_USERID = 0L;

  /**
   * 消息id
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long addrId;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long userId;

  public DelUserAddressReq(Long addrId, Long userId) {
    this(addrId, userId, ByteString.EMPTY);
  }

  public DelUserAddressReq(Long addrId, Long userId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.addrId = addrId;
    this.userId = userId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.addrId = addrId;
    builder.userId = userId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof DelUserAddressReq)) return false;
    DelUserAddressReq o = (DelUserAddressReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(addrId, o.addrId)
        && Internal.equals(userId, o.userId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (addrId != null ? addrId.hashCode() : 0);
      result = result * 37 + (userId != null ? userId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (addrId != null) builder.append(", addrId=").append(addrId);
    if (userId != null) builder.append(", userId=").append(userId);
    return builder.replace(0, 2, "DelUserAddressReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<DelUserAddressReq, Builder> {
    public Long addrId;

    public Long userId;

    public Builder() {
    }

    /**
     * 消息id
     */
    public Builder addrId(Long addrId) {
      this.addrId = addrId;
      return this;
    }

    public Builder userId(Long userId) {
      this.userId = userId;
      return this;
    }

    @Override
    public DelUserAddressReq build() {
      return new DelUserAddressReq(addrId, userId, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_DelUserAddressReq extends ProtoAdapter<DelUserAddressReq> {
    ProtoAdapter_DelUserAddressReq() {
      super(FieldEncoding.LENGTH_DELIMITED, DelUserAddressReq.class);
    }

    @Override
    public int encodedSize(DelUserAddressReq value) {
      return (value.addrId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.addrId) : 0)
          + (value.userId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(2, value.userId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, DelUserAddressReq value) throws IOException {
      if (value.addrId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.addrId);
      if (value.userId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 2, value.userId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public DelUserAddressReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.addrId(ProtoAdapter.UINT64.decode(reader)); break;
          case 2: builder.userId(ProtoAdapter.UINT64.decode(reader)); break;
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
    public DelUserAddressReq redact(DelUserAddressReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
