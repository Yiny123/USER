// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: OrderModel.proto at 462:1
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
 * 每个月服务信息
 */
public final class OrderItemInfo extends Message<OrderItemInfo, OrderItemInfo.Builder> {
  public static final ProtoAdapter<OrderItemInfo> ADAPTER = new ProtoAdapter_OrderItemInfo();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_SERVETIME = "";

  public static final String DEFAULT_FEESTR = "";

  public static final String DEFAULT_PAIDFEE = "";

  public static final String DEFAULT_NEEDFEE = "";

  /**
   * 开始时间 - 结束时间
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String serveTime;

  /**
   * 消费金额
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String feeStr;

  /**
   * 已缴金额
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String paidFee;

  /**
   * 需缴费用
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String needFee;

  public OrderItemInfo(String serveTime, String feeStr, String paidFee, String needFee) {
    this(serveTime, feeStr, paidFee, needFee, ByteString.EMPTY);
  }

  public OrderItemInfo(String serveTime, String feeStr, String paidFee, String needFee, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.serveTime = serveTime;
    this.feeStr = feeStr;
    this.paidFee = paidFee;
    this.needFee = needFee;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.serveTime = serveTime;
    builder.feeStr = feeStr;
    builder.paidFee = paidFee;
    builder.needFee = needFee;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof OrderItemInfo)) return false;
    OrderItemInfo o = (OrderItemInfo) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(serveTime, o.serveTime)
        && Internal.equals(feeStr, o.feeStr)
        && Internal.equals(paidFee, o.paidFee)
        && Internal.equals(needFee, o.needFee);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (serveTime != null ? serveTime.hashCode() : 0);
      result = result * 37 + (feeStr != null ? feeStr.hashCode() : 0);
      result = result * 37 + (paidFee != null ? paidFee.hashCode() : 0);
      result = result * 37 + (needFee != null ? needFee.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (serveTime != null) builder.append(", serveTime=").append(serveTime);
    if (feeStr != null) builder.append(", feeStr=").append(feeStr);
    if (paidFee != null) builder.append(", paidFee=").append(paidFee);
    if (needFee != null) builder.append(", needFee=").append(needFee);
    return builder.replace(0, 2, "OrderItemInfo{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<OrderItemInfo, Builder> {
    public String serveTime;

    public String feeStr;

    public String paidFee;

    public String needFee;

    public Builder() {
    }

    /**
     * 开始时间 - 结束时间
     */
    public Builder serveTime(String serveTime) {
      this.serveTime = serveTime;
      return this;
    }

    /**
     * 消费金额
     */
    public Builder feeStr(String feeStr) {
      this.feeStr = feeStr;
      return this;
    }

    /**
     * 已缴金额
     */
    public Builder paidFee(String paidFee) {
      this.paidFee = paidFee;
      return this;
    }

    /**
     * 需缴费用
     */
    public Builder needFee(String needFee) {
      this.needFee = needFee;
      return this;
    }

    @Override
    public OrderItemInfo build() {
      return new OrderItemInfo(serveTime, feeStr, paidFee, needFee, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_OrderItemInfo extends ProtoAdapter<OrderItemInfo> {
    ProtoAdapter_OrderItemInfo() {
      super(FieldEncoding.LENGTH_DELIMITED, OrderItemInfo.class);
    }

    @Override
    public int encodedSize(OrderItemInfo value) {
      return (value.serveTime != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.serveTime) : 0)
          + (value.feeStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.feeStr) : 0)
          + (value.paidFee != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.paidFee) : 0)
          + (value.needFee != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.needFee) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, OrderItemInfo value) throws IOException {
      if (value.serveTime != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.serveTime);
      if (value.feeStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.feeStr);
      if (value.paidFee != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.paidFee);
      if (value.needFee != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.needFee);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public OrderItemInfo decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.serveTime(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.feeStr(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.paidFee(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.needFee(ProtoAdapter.STRING.decode(reader)); break;
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
    public OrderItemInfo redact(OrderItemInfo value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
