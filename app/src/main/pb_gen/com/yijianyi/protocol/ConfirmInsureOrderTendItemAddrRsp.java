// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1973:1
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
 * 每日确认服务第一次进入设置服务地址
 */
public final class ConfirmInsureOrderTendItemAddrRsp extends Message<ConfirmInsureOrderTendItemAddrRsp, ConfirmInsureOrderTendItemAddrRsp.Builder> {
  public static final ProtoAdapter<ConfirmInsureOrderTendItemAddrRsp> ADAPTER = new ProtoAdapter_ConfirmInsureOrderTendItemAddrRsp();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ORDERID = "";

  public static final Long DEFAULT_ITEMID = 0L;

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

  public ConfirmInsureOrderTendItemAddrRsp(String orderId, Long itemId) {
    this(orderId, itemId, ByteString.EMPTY);
  }

  public ConfirmInsureOrderTendItemAddrRsp(String orderId, Long itemId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.orderId = orderId;
    this.itemId = itemId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.orderId = orderId;
    builder.itemId = itemId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ConfirmInsureOrderTendItemAddrRsp)) return false;
    ConfirmInsureOrderTendItemAddrRsp o = (ConfirmInsureOrderTendItemAddrRsp) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(orderId, o.orderId)
        && Internal.equals(itemId, o.itemId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (orderId != null ? orderId.hashCode() : 0);
      result = result * 37 + (itemId != null ? itemId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (orderId != null) builder.append(", orderId=").append(orderId);
    if (itemId != null) builder.append(", itemId=").append(itemId);
    return builder.replace(0, 2, "ConfirmInsureOrderTendItemAddrRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<ConfirmInsureOrderTendItemAddrRsp, Builder> {
    public String orderId;

    public Long itemId;

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

    @Override
    public ConfirmInsureOrderTendItemAddrRsp build() {
      return new ConfirmInsureOrderTendItemAddrRsp(orderId, itemId, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_ConfirmInsureOrderTendItemAddrRsp extends ProtoAdapter<ConfirmInsureOrderTendItemAddrRsp> {
    ProtoAdapter_ConfirmInsureOrderTendItemAddrRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, ConfirmInsureOrderTendItemAddrRsp.class);
    }

    @Override
    public int encodedSize(ConfirmInsureOrderTendItemAddrRsp value) {
      return (value.orderId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.orderId) : 0)
          + (value.itemId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(2, value.itemId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, ConfirmInsureOrderTendItemAddrRsp value) throws IOException {
      if (value.orderId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.orderId);
      if (value.itemId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 2, value.itemId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public ConfirmInsureOrderTendItemAddrRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.orderId(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.itemId(ProtoAdapter.UINT64.decode(reader)); break;
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
    public ConfirmInsureOrderTendItemAddrRsp redact(ConfirmInsureOrderTendItemAddrRsp value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
