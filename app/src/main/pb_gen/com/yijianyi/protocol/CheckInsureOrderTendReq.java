// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1750:1
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
 * 审核照护计划
 */
public final class CheckInsureOrderTendReq extends Message<CheckInsureOrderTendReq, CheckInsureOrderTendReq.Builder> {
  public static final ProtoAdapter<CheckInsureOrderTendReq> ADAPTER = new ProtoAdapter_CheckInsureOrderTendReq();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_TYPE = 0;

  public static final Long DEFAULT_ORDERTENDID = 0L;

  public static final String DEFAULT_REJECTREASON = "";

  /**
   * 1-通过 2-不通过
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer type;

  /**
   * 计划id
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long orderTendId;

  /**
   * 驳回理由
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String rejectReason;

  public CheckInsureOrderTendReq(Integer type, Long orderTendId, String rejectReason) {
    this(type, orderTendId, rejectReason, ByteString.EMPTY);
  }

  public CheckInsureOrderTendReq(Integer type, Long orderTendId, String rejectReason, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.type = type;
    this.orderTendId = orderTendId;
    this.rejectReason = rejectReason;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.type = type;
    builder.orderTendId = orderTendId;
    builder.rejectReason = rejectReason;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof CheckInsureOrderTendReq)) return false;
    CheckInsureOrderTendReq o = (CheckInsureOrderTendReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(type, o.type)
        && Internal.equals(orderTendId, o.orderTendId)
        && Internal.equals(rejectReason, o.rejectReason);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (type != null ? type.hashCode() : 0);
      result = result * 37 + (orderTendId != null ? orderTendId.hashCode() : 0);
      result = result * 37 + (rejectReason != null ? rejectReason.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (type != null) builder.append(", type=").append(type);
    if (orderTendId != null) builder.append(", orderTendId=").append(orderTendId);
    if (rejectReason != null) builder.append(", rejectReason=").append(rejectReason);
    return builder.replace(0, 2, "CheckInsureOrderTendReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<CheckInsureOrderTendReq, Builder> {
    public Integer type;

    public Long orderTendId;

    public String rejectReason;

    public Builder() {
    }

    /**
     * 1-通过 2-不通过
     */
    public Builder type(Integer type) {
      this.type = type;
      return this;
    }

    /**
     * 计划id
     */
    public Builder orderTendId(Long orderTendId) {
      this.orderTendId = orderTendId;
      return this;
    }

    /**
     * 驳回理由
     */
    public Builder rejectReason(String rejectReason) {
      this.rejectReason = rejectReason;
      return this;
    }

    @Override
    public CheckInsureOrderTendReq build() {
      return new CheckInsureOrderTendReq(type, orderTendId, rejectReason, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_CheckInsureOrderTendReq extends ProtoAdapter<CheckInsureOrderTendReq> {
    ProtoAdapter_CheckInsureOrderTendReq() {
      super(FieldEncoding.LENGTH_DELIMITED, CheckInsureOrderTendReq.class);
    }

    @Override
    public int encodedSize(CheckInsureOrderTendReq value) {
      return (value.type != null ? ProtoAdapter.UINT32.encodedSizeWithTag(1, value.type) : 0)
          + (value.orderTendId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(2, value.orderTendId) : 0)
          + (value.rejectReason != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.rejectReason) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, CheckInsureOrderTendReq value) throws IOException {
      if (value.type != null) ProtoAdapter.UINT32.encodeWithTag(writer, 1, value.type);
      if (value.orderTendId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 2, value.orderTendId);
      if (value.rejectReason != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.rejectReason);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public CheckInsureOrderTendReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.type(ProtoAdapter.UINT32.decode(reader)); break;
          case 2: builder.orderTendId(ProtoAdapter.UINT64.decode(reader)); break;
          case 3: builder.rejectReason(ProtoAdapter.STRING.decode(reader)); break;
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
    public CheckInsureOrderTendReq redact(CheckInsureOrderTendReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
