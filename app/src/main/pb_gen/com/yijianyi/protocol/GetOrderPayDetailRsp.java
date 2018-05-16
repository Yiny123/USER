// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 535:1
package com.yijianyi.protocol;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class GetOrderPayDetailRsp extends Message<GetOrderPayDetailRsp, GetOrderPayDetailRsp.Builder> {
  public static final ProtoAdapter<GetOrderPayDetailRsp> ADAPTER = new ProtoAdapter_GetOrderPayDetailRsp();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_PREPAYAMOUNT = "";

  public static final Boolean DEFAULT_HASENTRANCEFEE = false;

  public static final String DEFAULT_ENTRANCEFEE = "";

  public static final String DEFAULT_NEEDPAY = "";

  public static final Boolean DEFAULT_USEPURSE = false;

  public static final String DEFAULT_PURSE = "";

  public static final Long DEFAULT_EXPIRE = 0L;

  public static final String DEFAULT_PAYHINT = "";

  public static final Boolean DEFAULT_NEEDNOTICE = false;

  public static final String DEFAULT_EXTRAADDR = "";

  public static final String DEFAULT_EXTRAADDRDESC = "";

  /**
   * 订单信息
   */
  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.OrderVO#ADAPTER"
  )
  public final OrderVO order;

  /**
   * 预交金
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String prePayAmount;

  /**
   * 是否有门禁卡费用
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean hasEntranceFee;

  /**
   * 门禁卡费用
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String entranceFee;

  /**
   * 所需支付费用
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String needPay;

  /**
   * 使用钱包
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean usePurse;

  /**
   * 钱包余额
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String purse;

  /**
   * 剩余时间（毫秒），如果是小于0，则表示已过期
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long expire;

  /**
   * 支付提示
   */
  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String payHint;

  /**
   * 支付完成是否需要提示
   */
  @WireField(
      tag = 11,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean needNotice;

  /**
   * 支付完成后收费处地址
   */
  @WireField(
      tag = 12,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String extraAddr;

  /**
   * 支付完成后收费处地址描述
   */
  @WireField(
      tag = 13,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String extraAddrDesc;

  public GetOrderPayDetailRsp(OrderVO order, String prePayAmount, Boolean hasEntranceFee, String entranceFee, String needPay, Boolean usePurse, String purse, Long expire, String payHint, Boolean needNotice, String extraAddr, String extraAddrDesc) {
    this(order, prePayAmount, hasEntranceFee, entranceFee, needPay, usePurse, purse, expire, payHint, needNotice, extraAddr, extraAddrDesc, ByteString.EMPTY);
  }

  public GetOrderPayDetailRsp(OrderVO order, String prePayAmount, Boolean hasEntranceFee, String entranceFee, String needPay, Boolean usePurse, String purse, Long expire, String payHint, Boolean needNotice, String extraAddr, String extraAddrDesc, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.order = order;
    this.prePayAmount = prePayAmount;
    this.hasEntranceFee = hasEntranceFee;
    this.entranceFee = entranceFee;
    this.needPay = needPay;
    this.usePurse = usePurse;
    this.purse = purse;
    this.expire = expire;
    this.payHint = payHint;
    this.needNotice = needNotice;
    this.extraAddr = extraAddr;
    this.extraAddrDesc = extraAddrDesc;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.order = order;
    builder.prePayAmount = prePayAmount;
    builder.hasEntranceFee = hasEntranceFee;
    builder.entranceFee = entranceFee;
    builder.needPay = needPay;
    builder.usePurse = usePurse;
    builder.purse = purse;
    builder.expire = expire;
    builder.payHint = payHint;
    builder.needNotice = needNotice;
    builder.extraAddr = extraAddr;
    builder.extraAddrDesc = extraAddrDesc;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetOrderPayDetailRsp)) return false;
    GetOrderPayDetailRsp o = (GetOrderPayDetailRsp) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(order, o.order)
        && Internal.equals(prePayAmount, o.prePayAmount)
        && Internal.equals(hasEntranceFee, o.hasEntranceFee)
        && Internal.equals(entranceFee, o.entranceFee)
        && Internal.equals(needPay, o.needPay)
        && Internal.equals(usePurse, o.usePurse)
        && Internal.equals(purse, o.purse)
        && Internal.equals(expire, o.expire)
        && Internal.equals(payHint, o.payHint)
        && Internal.equals(needNotice, o.needNotice)
        && Internal.equals(extraAddr, o.extraAddr)
        && Internal.equals(extraAddrDesc, o.extraAddrDesc);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (order != null ? order.hashCode() : 0);
      result = result * 37 + (prePayAmount != null ? prePayAmount.hashCode() : 0);
      result = result * 37 + (hasEntranceFee != null ? hasEntranceFee.hashCode() : 0);
      result = result * 37 + (entranceFee != null ? entranceFee.hashCode() : 0);
      result = result * 37 + (needPay != null ? needPay.hashCode() : 0);
      result = result * 37 + (usePurse != null ? usePurse.hashCode() : 0);
      result = result * 37 + (purse != null ? purse.hashCode() : 0);
      result = result * 37 + (expire != null ? expire.hashCode() : 0);
      result = result * 37 + (payHint != null ? payHint.hashCode() : 0);
      result = result * 37 + (needNotice != null ? needNotice.hashCode() : 0);
      result = result * 37 + (extraAddr != null ? extraAddr.hashCode() : 0);
      result = result * 37 + (extraAddrDesc != null ? extraAddrDesc.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (order != null) builder.append(", order=").append(order);
    if (prePayAmount != null) builder.append(", prePayAmount=").append(prePayAmount);
    if (hasEntranceFee != null) builder.append(", hasEntranceFee=").append(hasEntranceFee);
    if (entranceFee != null) builder.append(", entranceFee=").append(entranceFee);
    if (needPay != null) builder.append(", needPay=").append(needPay);
    if (usePurse != null) builder.append(", usePurse=").append(usePurse);
    if (purse != null) builder.append(", purse=").append(purse);
    if (expire != null) builder.append(", expire=").append(expire);
    if (payHint != null) builder.append(", payHint=").append(payHint);
    if (needNotice != null) builder.append(", needNotice=").append(needNotice);
    if (extraAddr != null) builder.append(", extraAddr=").append(extraAddr);
    if (extraAddrDesc != null) builder.append(", extraAddrDesc=").append(extraAddrDesc);
    return builder.replace(0, 2, "GetOrderPayDetailRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetOrderPayDetailRsp, Builder> {
    public OrderVO order;

    public String prePayAmount;

    public Boolean hasEntranceFee;

    public String entranceFee;

    public String needPay;

    public Boolean usePurse;

    public String purse;

    public Long expire;

    public String payHint;

    public Boolean needNotice;

    public String extraAddr;

    public String extraAddrDesc;

    public Builder() {
    }

    /**
     * 订单信息
     */
    public Builder order(OrderVO order) {
      this.order = order;
      return this;
    }

    /**
     * 预交金
     */
    public Builder prePayAmount(String prePayAmount) {
      this.prePayAmount = prePayAmount;
      return this;
    }

    /**
     * 是否有门禁卡费用
     */
    public Builder hasEntranceFee(Boolean hasEntranceFee) {
      this.hasEntranceFee = hasEntranceFee;
      return this;
    }

    /**
     * 门禁卡费用
     */
    public Builder entranceFee(String entranceFee) {
      this.entranceFee = entranceFee;
      return this;
    }

    /**
     * 所需支付费用
     */
    public Builder needPay(String needPay) {
      this.needPay = needPay;
      return this;
    }

    /**
     * 使用钱包
     */
    public Builder usePurse(Boolean usePurse) {
      this.usePurse = usePurse;
      return this;
    }

    /**
     * 钱包余额
     */
    public Builder purse(String purse) {
      this.purse = purse;
      return this;
    }

    /**
     * 剩余时间（毫秒），如果是小于0，则表示已过期
     */
    public Builder expire(Long expire) {
      this.expire = expire;
      return this;
    }

    /**
     * 支付提示
     */
    public Builder payHint(String payHint) {
      this.payHint = payHint;
      return this;
    }

    /**
     * 支付完成是否需要提示
     */
    public Builder needNotice(Boolean needNotice) {
      this.needNotice = needNotice;
      return this;
    }

    /**
     * 支付完成后收费处地址
     */
    public Builder extraAddr(String extraAddr) {
      this.extraAddr = extraAddr;
      return this;
    }

    /**
     * 支付完成后收费处地址描述
     */
    public Builder extraAddrDesc(String extraAddrDesc) {
      this.extraAddrDesc = extraAddrDesc;
      return this;
    }

    @Override
    public GetOrderPayDetailRsp build() {
      return new GetOrderPayDetailRsp(order, prePayAmount, hasEntranceFee, entranceFee, needPay, usePurse, purse, expire, payHint, needNotice, extraAddr, extraAddrDesc, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetOrderPayDetailRsp extends ProtoAdapter<GetOrderPayDetailRsp> {
    ProtoAdapter_GetOrderPayDetailRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, GetOrderPayDetailRsp.class);
    }

    @Override
    public int encodedSize(GetOrderPayDetailRsp value) {
      return (value.order != null ? OrderVO.ADAPTER.encodedSizeWithTag(1, value.order) : 0)
          + (value.prePayAmount != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.prePayAmount) : 0)
          + (value.hasEntranceFee != null ? ProtoAdapter.BOOL.encodedSizeWithTag(3, value.hasEntranceFee) : 0)
          + (value.entranceFee != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.entranceFee) : 0)
          + (value.needPay != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, value.needPay) : 0)
          + (value.usePurse != null ? ProtoAdapter.BOOL.encodedSizeWithTag(6, value.usePurse) : 0)
          + (value.purse != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, value.purse) : 0)
          + (value.expire != null ? ProtoAdapter.INT64.encodedSizeWithTag(9, value.expire) : 0)
          + (value.payHint != null ? ProtoAdapter.STRING.encodedSizeWithTag(10, value.payHint) : 0)
          + (value.needNotice != null ? ProtoAdapter.BOOL.encodedSizeWithTag(11, value.needNotice) : 0)
          + (value.extraAddr != null ? ProtoAdapter.STRING.encodedSizeWithTag(12, value.extraAddr) : 0)
          + (value.extraAddrDesc != null ? ProtoAdapter.STRING.encodedSizeWithTag(13, value.extraAddrDesc) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetOrderPayDetailRsp value) throws IOException {
      if (value.order != null) OrderVO.ADAPTER.encodeWithTag(writer, 1, value.order);
      if (value.prePayAmount != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.prePayAmount);
      if (value.hasEntranceFee != null) ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.hasEntranceFee);
      if (value.entranceFee != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.entranceFee);
      if (value.needPay != null) ProtoAdapter.STRING.encodeWithTag(writer, 5, value.needPay);
      if (value.usePurse != null) ProtoAdapter.BOOL.encodeWithTag(writer, 6, value.usePurse);
      if (value.purse != null) ProtoAdapter.STRING.encodeWithTag(writer, 7, value.purse);
      if (value.expire != null) ProtoAdapter.INT64.encodeWithTag(writer, 9, value.expire);
      if (value.payHint != null) ProtoAdapter.STRING.encodeWithTag(writer, 10, value.payHint);
      if (value.needNotice != null) ProtoAdapter.BOOL.encodeWithTag(writer, 11, value.needNotice);
      if (value.extraAddr != null) ProtoAdapter.STRING.encodeWithTag(writer, 12, value.extraAddr);
      if (value.extraAddrDesc != null) ProtoAdapter.STRING.encodeWithTag(writer, 13, value.extraAddrDesc);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetOrderPayDetailRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.order(OrderVO.ADAPTER.decode(reader)); break;
          case 2: builder.prePayAmount(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.hasEntranceFee(ProtoAdapter.BOOL.decode(reader)); break;
          case 4: builder.entranceFee(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.needPay(ProtoAdapter.STRING.decode(reader)); break;
          case 6: builder.usePurse(ProtoAdapter.BOOL.decode(reader)); break;
          case 7: builder.purse(ProtoAdapter.STRING.decode(reader)); break;
          case 9: builder.expire(ProtoAdapter.INT64.decode(reader)); break;
          case 10: builder.payHint(ProtoAdapter.STRING.decode(reader)); break;
          case 11: builder.needNotice(ProtoAdapter.BOOL.decode(reader)); break;
          case 12: builder.extraAddr(ProtoAdapter.STRING.decode(reader)); break;
          case 13: builder.extraAddrDesc(ProtoAdapter.STRING.decode(reader)); break;
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
    public GetOrderPayDetailRsp redact(GetOrderPayDetailRsp value) {
      Builder builder = value.newBuilder();
      if (builder.order != null) builder.order = OrderVO.ADAPTER.redact(builder.order);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}