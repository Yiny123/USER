// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 928:1
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
public final class AddOrderPriceReq extends Message<AddOrderPriceReq, AddOrderPriceReq.Builder> {
  public static final ProtoAdapter<AddOrderPriceReq> ADAPTER = new ProtoAdapter_AddOrderPriceReq();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ORDERID = "";

  public static final String DEFAULT_SERVICETIME = "";

  public static final String DEFAULT_DISCHARGEDTIME = "";

  /**
   * 订单id
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orderId;

  /**
   * 服务时间
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String serviceTime;

  /**
   * 服务修改后对应的次数
   */
  @WireField(
      tag = 3,
      keyAdapter = "com.squareup.wire.ProtoAdapter#UINT64",
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Map<Long, Integer> mapPrice;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String dischargedTime;

  public AddOrderPriceReq(String orderId, String serviceTime, Map<Long, Integer> mapPrice, String dischargedTime) {
    this(orderId, serviceTime, mapPrice, dischargedTime, ByteString.EMPTY);
  }

  public AddOrderPriceReq(String orderId, String serviceTime, Map<Long, Integer> mapPrice, String dischargedTime, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.orderId = orderId;
    this.serviceTime = serviceTime;
    this.mapPrice = Internal.immutableCopyOf("mapPrice", mapPrice);
    this.dischargedTime = dischargedTime;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.orderId = orderId;
    builder.serviceTime = serviceTime;
    builder.mapPrice = Internal.copyOf("mapPrice", mapPrice);
    builder.dischargedTime = dischargedTime;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AddOrderPriceReq)) return false;
    AddOrderPriceReq o = (AddOrderPriceReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(orderId, o.orderId)
        && Internal.equals(serviceTime, o.serviceTime)
        && mapPrice.equals(o.mapPrice)
        && Internal.equals(dischargedTime, o.dischargedTime);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (orderId != null ? orderId.hashCode() : 0);
      result = result * 37 + (serviceTime != null ? serviceTime.hashCode() : 0);
      result = result * 37 + mapPrice.hashCode();
      result = result * 37 + (dischargedTime != null ? dischargedTime.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (orderId != null) builder.append(", orderId=").append(orderId);
    if (serviceTime != null) builder.append(", serviceTime=").append(serviceTime);
    if (!mapPrice.isEmpty()) builder.append(", mapPrice=").append(mapPrice);
    if (dischargedTime != null) builder.append(", dischargedTime=").append(dischargedTime);
    return builder.replace(0, 2, "AddOrderPriceReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<AddOrderPriceReq, Builder> {
    public String orderId;

    public String serviceTime;

    public Map<Long, Integer> mapPrice;

    public String dischargedTime;

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
     * 服务时间
     */
    public Builder serviceTime(String serviceTime) {
      this.serviceTime = serviceTime;
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

    public Builder dischargedTime(String dischargedTime) {
      this.dischargedTime = dischargedTime;
      return this;
    }

    @Override
    public AddOrderPriceReq build() {
      return new AddOrderPriceReq(orderId, serviceTime, mapPrice, dischargedTime, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_AddOrderPriceReq extends ProtoAdapter<AddOrderPriceReq> {
    private final ProtoAdapter<Map<Long, Integer>> mapPrice = ProtoAdapter.newMapAdapter(ProtoAdapter.UINT64, ProtoAdapter.UINT32);

    ProtoAdapter_AddOrderPriceReq() {
      super(FieldEncoding.LENGTH_DELIMITED, AddOrderPriceReq.class);
    }

    @Override
    public int encodedSize(AddOrderPriceReq value) {
      return (value.orderId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.orderId) : 0)
          + (value.serviceTime != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.serviceTime) : 0)
          + mapPrice.encodedSizeWithTag(3, value.mapPrice)
          + (value.dischargedTime != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.dischargedTime) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, AddOrderPriceReq value) throws IOException {
      if (value.orderId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.orderId);
      if (value.serviceTime != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.serviceTime);
      mapPrice.encodeWithTag(writer, 3, value.mapPrice);
      if (value.dischargedTime != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.dischargedTime);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public AddOrderPriceReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.orderId(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.serviceTime(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.mapPrice.putAll(mapPrice.decode(reader)); break;
          case 4: builder.dischargedTime(ProtoAdapter.STRING.decode(reader)); break;
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
    public AddOrderPriceReq redact(AddOrderPriceReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}