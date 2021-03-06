// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: SaasModel.proto at 750:1
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

public final class CompanyPriceVO extends Message<CompanyPriceVO, CompanyPriceVO.Builder> {
  public static final ProtoAdapter<CompanyPriceVO> ADAPTER = new ProtoAdapter_CompanyPriceVO();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_PREPAYAMOUNT = "";

  public static final Integer DEFAULT_NUMBER = 0;

  public static final String DEFAULT_PRICEFEESTR = "";

  public static final Integer DEFAULT_PAYNUMBER = 0;

  public static final Integer DEFAULT_SUBJOINGROUPINGTYPE = 0;

  /**
   * 预付金
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String prepayAmount;

  /**
   * 定价
   */
  @WireField(
      tag = 2,
      adapter = "com.yijianyi.protocol.Price#ADAPTER"
  )
  public final Price price;

  /**
   * 数量
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer number;

  /**
   * 价格描述
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String priceFeeStr;

  /**
   * 已经支付的数量
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer payNumber;

  /**
   * 附加项子类型 1-专陪 2-多陪 3-夜陪
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer subjoinGroupingType;

  public CompanyPriceVO(String prepayAmount, Price price, Integer number, String priceFeeStr, Integer payNumber, Integer subjoinGroupingType) {
    this(prepayAmount, price, number, priceFeeStr, payNumber, subjoinGroupingType, ByteString.EMPTY);
  }

  public CompanyPriceVO(String prepayAmount, Price price, Integer number, String priceFeeStr, Integer payNumber, Integer subjoinGroupingType, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.prepayAmount = prepayAmount;
    this.price = price;
    this.number = number;
    this.priceFeeStr = priceFeeStr;
    this.payNumber = payNumber;
    this.subjoinGroupingType = subjoinGroupingType;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.prepayAmount = prepayAmount;
    builder.price = price;
    builder.number = number;
    builder.priceFeeStr = priceFeeStr;
    builder.payNumber = payNumber;
    builder.subjoinGroupingType = subjoinGroupingType;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof CompanyPriceVO)) return false;
    CompanyPriceVO o = (CompanyPriceVO) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(prepayAmount, o.prepayAmount)
        && Internal.equals(price, o.price)
        && Internal.equals(number, o.number)
        && Internal.equals(priceFeeStr, o.priceFeeStr)
        && Internal.equals(payNumber, o.payNumber)
        && Internal.equals(subjoinGroupingType, o.subjoinGroupingType);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (prepayAmount != null ? prepayAmount.hashCode() : 0);
      result = result * 37 + (price != null ? price.hashCode() : 0);
      result = result * 37 + (number != null ? number.hashCode() : 0);
      result = result * 37 + (priceFeeStr != null ? priceFeeStr.hashCode() : 0);
      result = result * 37 + (payNumber != null ? payNumber.hashCode() : 0);
      result = result * 37 + (subjoinGroupingType != null ? subjoinGroupingType.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (prepayAmount != null) builder.append(", prepayAmount=").append(prepayAmount);
    if (price != null) builder.append(", price=").append(price);
    if (number != null) builder.append(", number=").append(number);
    if (priceFeeStr != null) builder.append(", priceFeeStr=").append(priceFeeStr);
    if (payNumber != null) builder.append(", payNumber=").append(payNumber);
    if (subjoinGroupingType != null) builder.append(", subjoinGroupingType=").append(subjoinGroupingType);
    return builder.replace(0, 2, "CompanyPriceVO{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<CompanyPriceVO, Builder> {
    public String prepayAmount;

    public Price price;

    public Integer number;

    public String priceFeeStr;

    public Integer payNumber;

    public Integer subjoinGroupingType;

    public Builder() {
    }

    /**
     * 预付金
     */
    public Builder prepayAmount(String prepayAmount) {
      this.prepayAmount = prepayAmount;
      return this;
    }

    /**
     * 定价
     */
    public Builder price(Price price) {
      this.price = price;
      return this;
    }

    /**
     * 数量
     */
    public Builder number(Integer number) {
      this.number = number;
      return this;
    }

    /**
     * 价格描述
     */
    public Builder priceFeeStr(String priceFeeStr) {
      this.priceFeeStr = priceFeeStr;
      return this;
    }

    /**
     * 已经支付的数量
     */
    public Builder payNumber(Integer payNumber) {
      this.payNumber = payNumber;
      return this;
    }

    /**
     * 附加项子类型 1-专陪 2-多陪 3-夜陪
     */
    public Builder subjoinGroupingType(Integer subjoinGroupingType) {
      this.subjoinGroupingType = subjoinGroupingType;
      return this;
    }

    @Override
    public CompanyPriceVO build() {
      return new CompanyPriceVO(prepayAmount, price, number, priceFeeStr, payNumber, subjoinGroupingType, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_CompanyPriceVO extends ProtoAdapter<CompanyPriceVO> {
    ProtoAdapter_CompanyPriceVO() {
      super(FieldEncoding.LENGTH_DELIMITED, CompanyPriceVO.class);
    }

    @Override
    public int encodedSize(CompanyPriceVO value) {
      return (value.prepayAmount != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.prepayAmount) : 0)
          + (value.price != null ? Price.ADAPTER.encodedSizeWithTag(2, value.price) : 0)
          + (value.number != null ? ProtoAdapter.UINT32.encodedSizeWithTag(3, value.number) : 0)
          + (value.priceFeeStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.priceFeeStr) : 0)
          + (value.payNumber != null ? ProtoAdapter.UINT32.encodedSizeWithTag(5, value.payNumber) : 0)
          + (value.subjoinGroupingType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(6, value.subjoinGroupingType) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, CompanyPriceVO value) throws IOException {
      if (value.prepayAmount != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.prepayAmount);
      if (value.price != null) Price.ADAPTER.encodeWithTag(writer, 2, value.price);
      if (value.number != null) ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.number);
      if (value.priceFeeStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.priceFeeStr);
      if (value.payNumber != null) ProtoAdapter.UINT32.encodeWithTag(writer, 5, value.payNumber);
      if (value.subjoinGroupingType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 6, value.subjoinGroupingType);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public CompanyPriceVO decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.prepayAmount(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.price(Price.ADAPTER.decode(reader)); break;
          case 3: builder.number(ProtoAdapter.UINT32.decode(reader)); break;
          case 4: builder.priceFeeStr(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.payNumber(ProtoAdapter.UINT32.decode(reader)); break;
          case 6: builder.subjoinGroupingType(ProtoAdapter.UINT32.decode(reader)); break;
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
    public CompanyPriceVO redact(CompanyPriceVO value) {
      Builder builder = value.newBuilder();
      if (builder.price != null) builder.price = Price.ADAPTER.redact(builder.price);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
