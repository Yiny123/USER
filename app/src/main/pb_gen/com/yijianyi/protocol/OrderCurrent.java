// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: OrderModel.proto at 322:1
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
 * 当前订单
 */
public final class OrderCurrent extends Message<OrderCurrent, OrderCurrent.Builder> {
  public static final ProtoAdapter<OrderCurrent> ADAPTER = new ProtoAdapter_OrderCurrent();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ORDERID = "";

  public static final String DEFAULT_SERVICEADDR = "";

  public static final String DEFAULT_SERVICENAME = "";

  public static final Integer DEFAULT_DAYNUM = 0;

  public static final Long DEFAULT_TOTALFEE = 0L;

  public static final String DEFAULT_TOTALFEESTR = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orderId;

  /**
   * 服务地址
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String serviceAddr;

  /**
   * 服务项目
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String serviceName;

  /**
   * 服务时长(天数)
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer dayNum;

  /**
   * 消费金额
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long totalFee;

  /**
   * 转化后的消费金额
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String totalFeeStr;

  public OrderCurrent(String orderId, String serviceAddr, String serviceName, Integer dayNum, Long totalFee, String totalFeeStr) {
    this(orderId, serviceAddr, serviceName, dayNum, totalFee, totalFeeStr, ByteString.EMPTY);
  }

  public OrderCurrent(String orderId, String serviceAddr, String serviceName, Integer dayNum, Long totalFee, String totalFeeStr, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.orderId = orderId;
    this.serviceAddr = serviceAddr;
    this.serviceName = serviceName;
    this.dayNum = dayNum;
    this.totalFee = totalFee;
    this.totalFeeStr = totalFeeStr;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.orderId = orderId;
    builder.serviceAddr = serviceAddr;
    builder.serviceName = serviceName;
    builder.dayNum = dayNum;
    builder.totalFee = totalFee;
    builder.totalFeeStr = totalFeeStr;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof OrderCurrent)) return false;
    OrderCurrent o = (OrderCurrent) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(orderId, o.orderId)
        && Internal.equals(serviceAddr, o.serviceAddr)
        && Internal.equals(serviceName, o.serviceName)
        && Internal.equals(dayNum, o.dayNum)
        && Internal.equals(totalFee, o.totalFee)
        && Internal.equals(totalFeeStr, o.totalFeeStr);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (orderId != null ? orderId.hashCode() : 0);
      result = result * 37 + (serviceAddr != null ? serviceAddr.hashCode() : 0);
      result = result * 37 + (serviceName != null ? serviceName.hashCode() : 0);
      result = result * 37 + (dayNum != null ? dayNum.hashCode() : 0);
      result = result * 37 + (totalFee != null ? totalFee.hashCode() : 0);
      result = result * 37 + (totalFeeStr != null ? totalFeeStr.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (orderId != null) builder.append(", orderId=").append(orderId);
    if (serviceAddr != null) builder.append(", serviceAddr=").append(serviceAddr);
    if (serviceName != null) builder.append(", serviceName=").append(serviceName);
    if (dayNum != null) builder.append(", dayNum=").append(dayNum);
    if (totalFee != null) builder.append(", totalFee=").append(totalFee);
    if (totalFeeStr != null) builder.append(", totalFeeStr=").append(totalFeeStr);
    return builder.replace(0, 2, "OrderCurrent{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<OrderCurrent, Builder> {
    public String orderId;

    public String serviceAddr;

    public String serviceName;

    public Integer dayNum;

    public Long totalFee;

    public String totalFeeStr;

    public Builder() {
    }

    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * 服务地址
     */
    public Builder serviceAddr(String serviceAddr) {
      this.serviceAddr = serviceAddr;
      return this;
    }

    /**
     * 服务项目
     */
    public Builder serviceName(String serviceName) {
      this.serviceName = serviceName;
      return this;
    }

    /**
     * 服务时长(天数)
     */
    public Builder dayNum(Integer dayNum) {
      this.dayNum = dayNum;
      return this;
    }

    /**
     * 消费金额
     */
    public Builder totalFee(Long totalFee) {
      this.totalFee = totalFee;
      return this;
    }

    /**
     * 转化后的消费金额
     */
    public Builder totalFeeStr(String totalFeeStr) {
      this.totalFeeStr = totalFeeStr;
      return this;
    }

    @Override
    public OrderCurrent build() {
      return new OrderCurrent(orderId, serviceAddr, serviceName, dayNum, totalFee, totalFeeStr, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_OrderCurrent extends ProtoAdapter<OrderCurrent> {
    ProtoAdapter_OrderCurrent() {
      super(FieldEncoding.LENGTH_DELIMITED, OrderCurrent.class);
    }

    @Override
    public int encodedSize(OrderCurrent value) {
      return (value.orderId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.orderId) : 0)
          + (value.serviceAddr != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.serviceAddr) : 0)
          + (value.serviceName != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.serviceName) : 0)
          + (value.dayNum != null ? ProtoAdapter.UINT32.encodedSizeWithTag(4, value.dayNum) : 0)
          + (value.totalFee != null ? ProtoAdapter.UINT64.encodedSizeWithTag(5, value.totalFee) : 0)
          + (value.totalFeeStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.totalFeeStr) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, OrderCurrent value) throws IOException {
      if (value.orderId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.orderId);
      if (value.serviceAddr != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.serviceAddr);
      if (value.serviceName != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.serviceName);
      if (value.dayNum != null) ProtoAdapter.UINT32.encodeWithTag(writer, 4, value.dayNum);
      if (value.totalFee != null) ProtoAdapter.UINT64.encodeWithTag(writer, 5, value.totalFee);
      if (value.totalFeeStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.totalFeeStr);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public OrderCurrent decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.orderId(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.serviceAddr(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.serviceName(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.dayNum(ProtoAdapter.UINT32.decode(reader)); break;
          case 5: builder.totalFee(ProtoAdapter.UINT64.decode(reader)); break;
          case 6: builder.totalFeeStr(ProtoAdapter.STRING.decode(reader)); break;
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
    public OrderCurrent redact(OrderCurrent value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
