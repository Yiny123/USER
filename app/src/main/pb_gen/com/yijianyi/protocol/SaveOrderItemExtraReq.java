// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1173:1
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

public final class SaveOrderItemExtraReq extends Message<SaveOrderItemExtraReq, SaveOrderItemExtraReq.Builder> {
  public static final ProtoAdapter<SaveOrderItemExtraReq> ADAPTER = new ProtoAdapter_SaveOrderItemExtraReq();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ORDERID = "";

  public static final String DEFAULT_STARTDATE = "";

  public static final String DEFAULT_ENDDATE = "";

  /**
   * 订单号
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orderId;

  /**
   * 选择的开始日期
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String startDate;

  /**
   * 选择的结束日期
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String endDate;

  /**
   * 每个套餐修改后对应的次数key-priceId value-次数
   */
  @WireField(
      tag = 4,
      keyAdapter = "com.squareup.wire.ProtoAdapter#UINT64",
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Map<Long, Integer> numMap;

  public SaveOrderItemExtraReq(String orderId, String startDate, String endDate, Map<Long, Integer> numMap) {
    this(orderId, startDate, endDate, numMap, ByteString.EMPTY);
  }

  public SaveOrderItemExtraReq(String orderId, String startDate, String endDate, Map<Long, Integer> numMap, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.orderId = orderId;
    this.startDate = startDate;
    this.endDate = endDate;
    this.numMap = Internal.immutableCopyOf("numMap", numMap);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.orderId = orderId;
    builder.startDate = startDate;
    builder.endDate = endDate;
    builder.numMap = Internal.copyOf("numMap", numMap);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof SaveOrderItemExtraReq)) return false;
    SaveOrderItemExtraReq o = (SaveOrderItemExtraReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(orderId, o.orderId)
        && Internal.equals(startDate, o.startDate)
        && Internal.equals(endDate, o.endDate)
        && numMap.equals(o.numMap);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (orderId != null ? orderId.hashCode() : 0);
      result = result * 37 + (startDate != null ? startDate.hashCode() : 0);
      result = result * 37 + (endDate != null ? endDate.hashCode() : 0);
      result = result * 37 + numMap.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (orderId != null) builder.append(", orderId=").append(orderId);
    if (startDate != null) builder.append(", startDate=").append(startDate);
    if (endDate != null) builder.append(", endDate=").append(endDate);
    if (!numMap.isEmpty()) builder.append(", numMap=").append(numMap);
    return builder.replace(0, 2, "SaveOrderItemExtraReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<SaveOrderItemExtraReq, Builder> {
    public String orderId;

    public String startDate;

    public String endDate;

    public Map<Long, Integer> numMap;

    public Builder() {
      numMap = Internal.newMutableMap();
    }

    /**
     * 订单号
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * 选择的开始日期
     */
    public Builder startDate(String startDate) {
      this.startDate = startDate;
      return this;
    }

    /**
     * 选择的结束日期
     */
    public Builder endDate(String endDate) {
      this.endDate = endDate;
      return this;
    }

    /**
     * 每个套餐修改后对应的次数key-priceId value-次数
     */
    public Builder numMap(Map<Long, Integer> numMap) {
      Internal.checkElementsNotNull(numMap);
      this.numMap = numMap;
      return this;
    }

    @Override
    public SaveOrderItemExtraReq build() {
      return new SaveOrderItemExtraReq(orderId, startDate, endDate, numMap, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_SaveOrderItemExtraReq extends ProtoAdapter<SaveOrderItemExtraReq> {
    private final ProtoAdapter<Map<Long, Integer>> numMap = ProtoAdapter.newMapAdapter(ProtoAdapter.UINT64, ProtoAdapter.UINT32);

    ProtoAdapter_SaveOrderItemExtraReq() {
      super(FieldEncoding.LENGTH_DELIMITED, SaveOrderItemExtraReq.class);
    }

    @Override
    public int encodedSize(SaveOrderItemExtraReq value) {
      return (value.orderId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.orderId) : 0)
          + (value.startDate != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.startDate) : 0)
          + (value.endDate != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.endDate) : 0)
          + numMap.encodedSizeWithTag(4, value.numMap)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, SaveOrderItemExtraReq value) throws IOException {
      if (value.orderId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.orderId);
      if (value.startDate != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.startDate);
      if (value.endDate != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.endDate);
      numMap.encodeWithTag(writer, 4, value.numMap);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public SaveOrderItemExtraReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.orderId(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.startDate(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.endDate(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.numMap.putAll(numMap.decode(reader)); break;
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
    public SaveOrderItemExtraReq redact(SaveOrderItemExtraReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}