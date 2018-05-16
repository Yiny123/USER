// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 245:1
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
 * 删除亲属请求体
 */
public final class DelKinsfolkReq extends Message<DelKinsfolkReq, DelKinsfolkReq.Builder> {
  public static final ProtoAdapter<DelKinsfolkReq> ADAPTER = new ProtoAdapter_DelKinsfolkReq();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_KINSID = 0L;

  public static final Long DEFAULT_USERID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long kinsId;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long userId;

  public DelKinsfolkReq(Long kinsId, Long userId) {
    this(kinsId, userId, ByteString.EMPTY);
  }

  public DelKinsfolkReq(Long kinsId, Long userId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.kinsId = kinsId;
    this.userId = userId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.kinsId = kinsId;
    builder.userId = userId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof DelKinsfolkReq)) return false;
    DelKinsfolkReq o = (DelKinsfolkReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(kinsId, o.kinsId)
        && Internal.equals(userId, o.userId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (kinsId != null ? kinsId.hashCode() : 0);
      result = result * 37 + (userId != null ? userId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (kinsId != null) builder.append(", kinsId=").append(kinsId);
    if (userId != null) builder.append(", userId=").append(userId);
    return builder.replace(0, 2, "DelKinsfolkReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<DelKinsfolkReq, Builder> {
    public Long kinsId;

    public Long userId;

    public Builder() {
    }

    public Builder kinsId(Long kinsId) {
      this.kinsId = kinsId;
      return this;
    }

    public Builder userId(Long userId) {
      this.userId = userId;
      return this;
    }

    @Override
    public DelKinsfolkReq build() {
      return new DelKinsfolkReq(kinsId, userId, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_DelKinsfolkReq extends ProtoAdapter<DelKinsfolkReq> {
    ProtoAdapter_DelKinsfolkReq() {
      super(FieldEncoding.LENGTH_DELIMITED, DelKinsfolkReq.class);
    }

    @Override
    public int encodedSize(DelKinsfolkReq value) {
      return (value.kinsId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.kinsId) : 0)
          + (value.userId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(2, value.userId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, DelKinsfolkReq value) throws IOException {
      if (value.kinsId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.kinsId);
      if (value.userId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 2, value.userId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public DelKinsfolkReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.kinsId(ProtoAdapter.UINT64.decode(reader)); break;
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
    public DelKinsfolkReq redact(DelKinsfolkReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
