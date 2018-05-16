// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1922:1
package com.yijianyi.protocol;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * 查看护工信息
 */
public final class GetHGInfoByOrderReq extends Message<GetHGInfoByOrderReq, GetHGInfoByOrderReq.Builder> {
  public static final ProtoAdapter<GetHGInfoByOrderReq> ADAPTER = new ProtoAdapter_GetHGInfoByOrderReq();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ORDERID = "";

  public static final Integer DEFAULT_HGTYPE = 0;

  public static final Long DEFAULT_HGID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orderId;

  /**
   * 1-护工 2-护士
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer hgType;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long hgId;

  public GetHGInfoByOrderReq(String orderId, Integer hgType, Long hgId) {
    this(orderId, hgType, hgId, ByteString.EMPTY);
  }

  public GetHGInfoByOrderReq(String orderId, Integer hgType, Long hgId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.orderId = orderId;
    this.hgType = hgType;
    this.hgId = hgId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.orderId = orderId;
    builder.hgType = hgType;
    builder.hgId = hgId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetHGInfoByOrderReq)) return false;
    GetHGInfoByOrderReq o = (GetHGInfoByOrderReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(orderId, o.orderId)
        && Internal.equals(hgType, o.hgType)
        && Internal.equals(hgId, o.hgId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (orderId != null ? orderId.hashCode() : 0);
      result = result * 37 + (hgType != null ? hgType.hashCode() : 0);
      result = result * 37 + (hgId != null ? hgId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (orderId != null) builder.append(", orderId=").append(orderId);
    if (hgType != null) builder.append(", hgType=").append(hgType);
    if (hgId != null) builder.append(", hgId=").append(hgId);
    return builder.replace(0, 2, "GetHGInfoByOrderReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetHGInfoByOrderReq, Builder> {
    public String orderId;

    public Integer hgType;

    public Long hgId;

    public Builder() {
    }

    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * 1-护工 2-护士
     */
    public Builder hgType(Integer hgType) {
      this.hgType = hgType;
      return this;
    }

    public Builder hgId(Long hgId) {
      this.hgId = hgId;
      return this;
    }

    @Override
    public GetHGInfoByOrderReq build() {
      return new GetHGInfoByOrderReq(orderId, hgType, hgId, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetHGInfoByOrderReq extends ProtoAdapter<GetHGInfoByOrderReq> {
    ProtoAdapter_GetHGInfoByOrderReq() {
      super(FieldEncoding.LENGTH_DELIMITED, GetHGInfoByOrderReq.class);
    }

    @Override
    public int encodedSize(GetHGInfoByOrderReq value) {
      return (value.orderId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.orderId) : 0)
          + (value.hgType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(2, value.hgType) : 0)
          + (value.hgId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(3, value.hgId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetHGInfoByOrderReq value) throws IOException {
      if (value.orderId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.orderId);
      if (value.hgType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 2, value.hgType);
      if (value.hgId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 3, value.hgId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetHGInfoByOrderReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.orderId(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.hgType(ProtoAdapter.UINT32.decode(reader)); break;
          case 3: builder.hgId(ProtoAdapter.UINT64.decode(reader)); break;
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
    public GetHGInfoByOrderReq redact(GetHGInfoByOrderReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
