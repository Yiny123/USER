// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1235:1
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
import java.util.Map;
import okio.ByteString;

/**
 * 添加订单医疗附加加项
 */
public final class AddOrderPriceReviseReq extends Message<AddOrderPriceReviseReq, AddOrderPriceReviseReq.Builder> {
  public static final ProtoAdapter<AddOrderPriceReviseReq> ADAPTER = new ProtoAdapter_AddOrderPriceReviseReq();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ORDERID = "";

  public static final String DEFAULT_DISCHARGEDTIME = "";

  public static final Integer DEFAULT_HGREBATETYPE = 0;

  public static final Integer DEFAULT_ISTODAY = 0;

  /**
   * 订单id
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orderId;

  /**
   * 服务修改后对应的次数
   */
  @WireField(
      tag = 2,
      keyAdapter = "com.squareup.wire.ProtoAdapter#UINT64",
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Map<Long, Integer> mapPrice;

  /**
   * 预估出院时间	关闭订单服务时传，单纯修改服务项不需要传
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String dischargedTime;

  /**
   * 职工优惠类型 0-无优惠 1-职工 2-职工家属
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer hgRebateType;

  /**
   * 是否修改今日 0-否 1-是
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer istoday;

  public AddOrderPriceReviseReq(String orderId, Map<Long, Integer> mapPrice, String dischargedTime, Integer hgRebateType, Integer istoday) {
    this(orderId, mapPrice, dischargedTime, hgRebateType, istoday, ByteString.EMPTY);
  }

  public AddOrderPriceReviseReq(String orderId, Map<Long, Integer> mapPrice, String dischargedTime, Integer hgRebateType, Integer istoday, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.orderId = orderId;
    this.mapPrice = Internal.immutableCopyOf("mapPrice", mapPrice);
    this.dischargedTime = dischargedTime;
    this.hgRebateType = hgRebateType;
    this.istoday = istoday;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.orderId = orderId;
    builder.mapPrice = Internal.copyOf("mapPrice", mapPrice);
    builder.dischargedTime = dischargedTime;
    builder.hgRebateType = hgRebateType;
    builder.istoday = istoday;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AddOrderPriceReviseReq)) return false;
    AddOrderPriceReviseReq o = (AddOrderPriceReviseReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(orderId, o.orderId)
        && mapPrice.equals(o.mapPrice)
        && Internal.equals(dischargedTime, o.dischargedTime)
        && Internal.equals(hgRebateType, o.hgRebateType)
        && Internal.equals(istoday, o.istoday);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (orderId != null ? orderId.hashCode() : 0);
      result = result * 37 + mapPrice.hashCode();
      result = result * 37 + (dischargedTime != null ? dischargedTime.hashCode() : 0);
      result = result * 37 + (hgRebateType != null ? hgRebateType.hashCode() : 0);
      result = result * 37 + (istoday != null ? istoday.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (orderId != null) builder.append(", orderId=").append(orderId);
    if (!mapPrice.isEmpty()) builder.append(", mapPrice=").append(mapPrice);
    if (dischargedTime != null) builder.append(", dischargedTime=").append(dischargedTime);
    if (hgRebateType != null) builder.append(", hgRebateType=").append(hgRebateType);
    if (istoday != null) builder.append(", istoday=").append(istoday);
    return builder.replace(0, 2, "AddOrderPriceReviseReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<AddOrderPriceReviseReq, Builder> {
    public String orderId;

    public Map<Long, Integer> mapPrice;

    public String dischargedTime;

    public Integer hgRebateType;

    public Integer istoday;

    public Builder() {
      mapPrice = Internal.newMutableMap();
    }

    /**
     * 订单id
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * 服务修改后对应的次数
     */
    public Builder mapPrice(Map<Long, Integer> mapPrice) {
      Internal.checkElementsNotNull(mapPrice);
      this.mapPrice = mapPrice;
      return this;
    }

    /**
     * 预估出院时间	关闭订单服务时传，单纯修改服务项不需要传
     */
    public Builder dischargedTime(String dischargedTime) {
      this.dischargedTime = dischargedTime;
      return this;
    }

    /**
     * 职工优惠类型 0-无优惠 1-职工 2-职工家属
     */
    public Builder hgRebateType(Integer hgRebateType) {
      this.hgRebateType = hgRebateType;
      return this;
    }

    /**
     * 是否修改今日 0-否 1-是
     */
    public Builder istoday(Integer istoday) {
      this.istoday = istoday;
      return this;
    }

    @Override
    public AddOrderPriceReviseReq build() {
      return new AddOrderPriceReviseReq(orderId, mapPrice, dischargedTime, hgRebateType, istoday, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_AddOrderPriceReviseReq extends ProtoAdapter<AddOrderPriceReviseReq> {
    private final ProtoAdapter<Map<Long, Integer>> mapPrice = ProtoAdapter.newMapAdapter(ProtoAdapter.UINT64, ProtoAdapter.UINT32);

    ProtoAdapter_AddOrderPriceReviseReq() {
      super(FieldEncoding.LENGTH_DELIMITED, AddOrderPriceReviseReq.class);
    }

    @Override
    public int encodedSize(AddOrderPriceReviseReq value) {
      return (value.orderId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.orderId) : 0)
          + mapPrice.encodedSizeWithTag(2, value.mapPrice)
          + (value.dischargedTime != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.dischargedTime) : 0)
          + (value.hgRebateType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(4, value.hgRebateType) : 0)
          + (value.istoday != null ? ProtoAdapter.UINT32.encodedSizeWithTag(5, value.istoday) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, AddOrderPriceReviseReq value) throws IOException {
      if (value.orderId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.orderId);
      mapPrice.encodeWithTag(writer, 2, value.mapPrice);
      if (value.dischargedTime != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.dischargedTime);
      if (value.hgRebateType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 4, value.hgRebateType);
      if (value.istoday != null) ProtoAdapter.UINT32.encodeWithTag(writer, 5, value.istoday);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public AddOrderPriceReviseReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.orderId(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.mapPrice.putAll(mapPrice.decode(reader)); break;
          case 3: builder.dischargedTime(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.hgRebateType(ProtoAdapter.UINT32.decode(reader)); break;
          case 5: builder.istoday(ProtoAdapter.UINT32.decode(reader)); break;
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
    public AddOrderPriceReviseReq redact(AddOrderPriceReviseReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}