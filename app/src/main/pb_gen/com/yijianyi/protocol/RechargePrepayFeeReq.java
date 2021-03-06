// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1250:1
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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * 充值预付款
 */
public final class RechargePrepayFeeReq extends Message<RechargePrepayFeeReq, RechargePrepayFeeReq.Builder> {
  public static final ProtoAdapter<RechargePrepayFeeReq> ADAPTER = new ProtoAdapter_RechargePrepayFeeReq();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_PREPAYFEE = "";

  public static final String DEFAULT_ORDERID = "";

  public static final Integer DEFAULT_PAYTYPE = 0;

  /**
   * 充值金额
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String prepayFee;

  /**
   * 订单id
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orderId;

  /**
   * 支付方式 5-现金支付
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer payType;

  public RechargePrepayFeeReq(String prepayFee, String orderId, Integer payType) {
    this(prepayFee, orderId, payType, ByteString.EMPTY);
  }

  public RechargePrepayFeeReq(String prepayFee, String orderId, Integer payType, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.prepayFee = prepayFee;
    this.orderId = orderId;
    this.payType = payType;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.prepayFee = prepayFee;
    builder.orderId = orderId;
    builder.payType = payType;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RechargePrepayFeeReq)) return false;
    RechargePrepayFeeReq o = (RechargePrepayFeeReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(prepayFee, o.prepayFee)
        && Internal.equals(orderId, o.orderId)
        && Internal.equals(payType, o.payType);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (prepayFee != null ? prepayFee.hashCode() : 0);
      result = result * 37 + (orderId != null ? orderId.hashCode() : 0);
      result = result * 37 + (payType != null ? payType.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (prepayFee != null) builder.append(", prepayFee=").append(prepayFee);
    if (orderId != null) builder.append(", orderId=").append(orderId);
    if (payType != null) builder.append(", payType=").append(payType);
    return builder.replace(0, 2, "RechargePrepayFeeReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<RechargePrepayFeeReq, Builder> {
    public String prepayFee;

    public String orderId;

    public Integer payType;

    public Builder() {
    }

    /**
     * 充值金额
     */
    public Builder prepayFee(String prepayFee) {
      this.prepayFee = prepayFee;
      return this;
    }

    /**
     * 订单id
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * 支付方式 5-现金支付
     */
    public Builder payType(Integer payType) {
      this.payType = payType;
      return this;
    }

    @Override
    public RechargePrepayFeeReq build() {
      return new RechargePrepayFeeReq(prepayFee, orderId, payType, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_RechargePrepayFeeReq extends ProtoAdapter<RechargePrepayFeeReq> {
    ProtoAdapter_RechargePrepayFeeReq() {
      super(FieldEncoding.LENGTH_DELIMITED, RechargePrepayFeeReq.class);
    }

    @Override
    public int encodedSize(RechargePrepayFeeReq value) {
      return (value.prepayFee != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.prepayFee) : 0)
          + (value.orderId != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.orderId) : 0)
          + (value.payType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(3, value.payType) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, RechargePrepayFeeReq value) throws IOException {
      if (value.prepayFee != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.prepayFee);
      if (value.orderId != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.orderId);
      if (value.payType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.payType);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public RechargePrepayFeeReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.prepayFee(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.orderId(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.payType(ProtoAdapter.UINT32.decode(reader)); break;
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
    public RechargePrepayFeeReq redact(RechargePrepayFeeReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
