// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1979:1
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
 * 确认长护险订单每日明细
 */
public final class ConfirmInsureOrderTendItemDetailReq extends Message<ConfirmInsureOrderTendItemDetailReq, ConfirmInsureOrderTendItemDetailReq.Builder> {
  public static final ProtoAdapter<ConfirmInsureOrderTendItemDetailReq> ADAPTER = new ProtoAdapter_ConfirmInsureOrderTendItemDetailReq();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ORDERID = "";

  public static final Long DEFAULT_ITEMID = 0L;

  public static final Integer DEFAULT_STATUS = 0;

  public static final Long DEFAULT_ITEMDETAILID = 0L;

  /**
   * 订单id
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orderId;

  /**
   * 明细id
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long itemId;

  /**
   * 操作类型 0-无操作 1-全部 2-单条
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer status;

  /**
   * 明细详情id
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long itemDetailId;

  public ConfirmInsureOrderTendItemDetailReq(String orderId, Long itemId, Integer status, Long itemDetailId) {
    this(orderId, itemId, status, itemDetailId, ByteString.EMPTY);
  }

  public ConfirmInsureOrderTendItemDetailReq(String orderId, Long itemId, Integer status, Long itemDetailId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.orderId = orderId;
    this.itemId = itemId;
    this.status = status;
    this.itemDetailId = itemDetailId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.orderId = orderId;
    builder.itemId = itemId;
    builder.status = status;
    builder.itemDetailId = itemDetailId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ConfirmInsureOrderTendItemDetailReq)) return false;
    ConfirmInsureOrderTendItemDetailReq o = (ConfirmInsureOrderTendItemDetailReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(orderId, o.orderId)
        && Internal.equals(itemId, o.itemId)
        && Internal.equals(status, o.status)
        && Internal.equals(itemDetailId, o.itemDetailId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (orderId != null ? orderId.hashCode() : 0);
      result = result * 37 + (itemId != null ? itemId.hashCode() : 0);
      result = result * 37 + (status != null ? status.hashCode() : 0);
      result = result * 37 + (itemDetailId != null ? itemDetailId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (orderId != null) builder.append(", orderId=").append(orderId);
    if (itemId != null) builder.append(", itemId=").append(itemId);
    if (status != null) builder.append(", status=").append(status);
    if (itemDetailId != null) builder.append(", itemDetailId=").append(itemDetailId);
    return builder.replace(0, 2, "ConfirmInsureOrderTendItemDetailReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<ConfirmInsureOrderTendItemDetailReq, Builder> {
    public String orderId;

    public Long itemId;

    public Integer status;

    public Long itemDetailId;

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
     * 明细id
     */
    public Builder itemId(Long itemId) {
      this.itemId = itemId;
      return this;
    }

    /**
     * 操作类型 0-无操作 1-全部 2-单条
     */
    public Builder status(Integer status) {
      this.status = status;
      return this;
    }

    /**
     * 明细详情id
     */
    public Builder itemDetailId(Long itemDetailId) {
      this.itemDetailId = itemDetailId;
      return this;
    }

    @Override
    public ConfirmInsureOrderTendItemDetailReq build() {
      return new ConfirmInsureOrderTendItemDetailReq(orderId, itemId, status, itemDetailId, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_ConfirmInsureOrderTendItemDetailReq extends ProtoAdapter<ConfirmInsureOrderTendItemDetailReq> {
    ProtoAdapter_ConfirmInsureOrderTendItemDetailReq() {
      super(FieldEncoding.LENGTH_DELIMITED, ConfirmInsureOrderTendItemDetailReq.class);
    }

    @Override
    public int encodedSize(ConfirmInsureOrderTendItemDetailReq value) {
      return (value.orderId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.orderId) : 0)
          + (value.itemId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(2, value.itemId) : 0)
          + (value.status != null ? ProtoAdapter.UINT32.encodedSizeWithTag(3, value.status) : 0)
          + (value.itemDetailId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(4, value.itemDetailId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, ConfirmInsureOrderTendItemDetailReq value) throws IOException {
      if (value.orderId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.orderId);
      if (value.itemId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 2, value.itemId);
      if (value.status != null) ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.status);
      if (value.itemDetailId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 4, value.itemDetailId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public ConfirmInsureOrderTendItemDetailReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.orderId(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.itemId(ProtoAdapter.UINT64.decode(reader)); break;
          case 3: builder.status(ProtoAdapter.UINT32.decode(reader)); break;
          case 4: builder.itemDetailId(ProtoAdapter.UINT64.decode(reader)); break;
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
    public ConfirmInsureOrderTendItemDetailReq redact(ConfirmInsureOrderTendItemDetailReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
