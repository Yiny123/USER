// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1828:1
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
 * 获取质控信息
 */
public final class GetInsureOrderVisitQualityReq extends Message<GetInsureOrderVisitQualityReq, GetInsureOrderVisitQualityReq.Builder> {
  public static final ProtoAdapter<GetInsureOrderVisitQualityReq> ADAPTER = new ProtoAdapter_GetInsureOrderVisitQualityReq();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ORDERID = "";

  public static final Long DEFAULT_VISITID = 0L;

  public static final Long DEFAULT_VISITQUALITYID = 0L;

  /**
   * 订单id
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orderId;

  /**
   * 回访id
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long visitId;

  /**
   * 质控id
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long visitQualityId;

  public GetInsureOrderVisitQualityReq(String orderId, Long visitId, Long visitQualityId) {
    this(orderId, visitId, visitQualityId, ByteString.EMPTY);
  }

  public GetInsureOrderVisitQualityReq(String orderId, Long visitId, Long visitQualityId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.orderId = orderId;
    this.visitId = visitId;
    this.visitQualityId = visitQualityId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.orderId = orderId;
    builder.visitId = visitId;
    builder.visitQualityId = visitQualityId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetInsureOrderVisitQualityReq)) return false;
    GetInsureOrderVisitQualityReq o = (GetInsureOrderVisitQualityReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(orderId, o.orderId)
        && Internal.equals(visitId, o.visitId)
        && Internal.equals(visitQualityId, o.visitQualityId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (orderId != null ? orderId.hashCode() : 0);
      result = result * 37 + (visitId != null ? visitId.hashCode() : 0);
      result = result * 37 + (visitQualityId != null ? visitQualityId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (orderId != null) builder.append(", orderId=").append(orderId);
    if (visitId != null) builder.append(", visitId=").append(visitId);
    if (visitQualityId != null) builder.append(", visitQualityId=").append(visitQualityId);
    return builder.replace(0, 2, "GetInsureOrderVisitQualityReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetInsureOrderVisitQualityReq, Builder> {
    public String orderId;

    public Long visitId;

    public Long visitQualityId;

    public Builder() {
    }

    /**
     * 订单id
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * 回访id
     */
    public Builder visitId(Long visitId) {
      this.visitId = visitId;
      return this;
    }

    /**
     * 质控id
     */
    public Builder visitQualityId(Long visitQualityId) {
      this.visitQualityId = visitQualityId;
      return this;
    }

    @Override
    public GetInsureOrderVisitQualityReq build() {
      return new GetInsureOrderVisitQualityReq(orderId, visitId, visitQualityId, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetInsureOrderVisitQualityReq extends ProtoAdapter<GetInsureOrderVisitQualityReq> {
    ProtoAdapter_GetInsureOrderVisitQualityReq() {
      super(FieldEncoding.LENGTH_DELIMITED, GetInsureOrderVisitQualityReq.class);
    }

    @Override
    public int encodedSize(GetInsureOrderVisitQualityReq value) {
      return (value.orderId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.orderId) : 0)
          + (value.visitId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(2, value.visitId) : 0)
          + (value.visitQualityId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(3, value.visitQualityId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetInsureOrderVisitQualityReq value) throws IOException {
      if (value.orderId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.orderId);
      if (value.visitId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 2, value.visitId);
      if (value.visitQualityId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 3, value.visitQualityId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetInsureOrderVisitQualityReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.orderId(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.visitId(ProtoAdapter.UINT64.decode(reader)); break;
          case 3: builder.visitQualityId(ProtoAdapter.UINT64.decode(reader)); break;
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
    public GetInsureOrderVisitQualityReq redact(GetInsureOrderVisitQualityReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
