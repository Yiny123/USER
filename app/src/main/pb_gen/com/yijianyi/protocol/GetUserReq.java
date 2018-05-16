// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1082:1
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
 * 获取用户信息
 */
public final class GetUserReq extends Message<GetUserReq, GetUserReq.Builder> {
  public static final ProtoAdapter<GetUserReq> ADAPTER = new ProtoAdapter_GetUserReq();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_USERID = 0L;

  /**
   * 用户id
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long userId;

  public GetUserReq(Long userId) {
    this(userId, ByteString.EMPTY);
  }

  public GetUserReq(Long userId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.userId = userId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.userId = userId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetUserReq)) return false;
    GetUserReq o = (GetUserReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(userId, o.userId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (userId != null ? userId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (userId != null) builder.append(", userId=").append(userId);
    return builder.replace(0, 2, "GetUserReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetUserReq, Builder> {
    public Long userId;

    public Builder() {
    }

    /**
     * 用户id
     */
    public Builder userId(Long userId) {
      this.userId = userId;
      return this;
    }

    @Override
    public GetUserReq build() {
      return new GetUserReq(userId, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetUserReq extends ProtoAdapter<GetUserReq> {
    ProtoAdapter_GetUserReq() {
      super(FieldEncoding.LENGTH_DELIMITED, GetUserReq.class);
    }

    @Override
    public int encodedSize(GetUserReq value) {
      return (value.userId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.userId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetUserReq value) throws IOException {
      if (value.userId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.userId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetUserReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.userId(ProtoAdapter.UINT64.decode(reader)); break;
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
    public GetUserReq redact(GetUserReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
