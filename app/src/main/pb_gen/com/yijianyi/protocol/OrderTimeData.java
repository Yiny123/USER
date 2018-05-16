// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: OrderModel.proto at 400:1
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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class OrderTimeData extends Message<OrderTimeData, OrderTimeData.Builder> {
  public static final ProtoAdapter<OrderTimeData> ADAPTER = new ProtoAdapter_OrderTimeData();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_TIME = "";

  public static final String DEFAULT_SERVICESTARTTIME = "";

  public static final String DEFAULT_SERVICEENDTIME = "";

  public static final Boolean DEFAULT_STATUS = false;

  public static final String DEFAULT_TIMESTR = "";

  public static final String DEFAULT_DATETIME = "";

  /**
   * 用于显示
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String time;

  /**
   * 选中的时间值
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String serviceStartTime;

  /**
   * 选中的时间值
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String serviceEndTime;

  /**
   * 是否可选 true-可选 false-不可选
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean status;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String timeStr;

  /**
   * 日期
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String dateTime;

  public OrderTimeData(String time, String serviceStartTime, String serviceEndTime, Boolean status, String timeStr, String dateTime) {
    this(time, serviceStartTime, serviceEndTime, status, timeStr, dateTime, ByteString.EMPTY);
  }

  public OrderTimeData(String time, String serviceStartTime, String serviceEndTime, Boolean status, String timeStr, String dateTime, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.time = time;
    this.serviceStartTime = serviceStartTime;
    this.serviceEndTime = serviceEndTime;
    this.status = status;
    this.timeStr = timeStr;
    this.dateTime = dateTime;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.time = time;
    builder.serviceStartTime = serviceStartTime;
    builder.serviceEndTime = serviceEndTime;
    builder.status = status;
    builder.timeStr = timeStr;
    builder.dateTime = dateTime;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof OrderTimeData)) return false;
    OrderTimeData o = (OrderTimeData) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(time, o.time)
        && Internal.equals(serviceStartTime, o.serviceStartTime)
        && Internal.equals(serviceEndTime, o.serviceEndTime)
        && Internal.equals(status, o.status)
        && Internal.equals(timeStr, o.timeStr)
        && Internal.equals(dateTime, o.dateTime);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (time != null ? time.hashCode() : 0);
      result = result * 37 + (serviceStartTime != null ? serviceStartTime.hashCode() : 0);
      result = result * 37 + (serviceEndTime != null ? serviceEndTime.hashCode() : 0);
      result = result * 37 + (status != null ? status.hashCode() : 0);
      result = result * 37 + (timeStr != null ? timeStr.hashCode() : 0);
      result = result * 37 + (dateTime != null ? dateTime.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (time != null) builder.append(", time=").append(time);
    if (serviceStartTime != null) builder.append(", serviceStartTime=").append(serviceStartTime);
    if (serviceEndTime != null) builder.append(", serviceEndTime=").append(serviceEndTime);
    if (status != null) builder.append(", status=").append(status);
    if (timeStr != null) builder.append(", timeStr=").append(timeStr);
    if (dateTime != null) builder.append(", dateTime=").append(dateTime);
    return builder.replace(0, 2, "OrderTimeData{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<OrderTimeData, Builder> {
    public String time;

    public String serviceStartTime;

    public String serviceEndTime;

    public Boolean status;

    public String timeStr;

    public String dateTime;

    public Builder() {
    }

    /**
     * 用于显示
     */
    public Builder time(String time) {
      this.time = time;
      return this;
    }

    /**
     * 选中的时间值
     */
    public Builder serviceStartTime(String serviceStartTime) {
      this.serviceStartTime = serviceStartTime;
      return this;
    }

    /**
     * 选中的时间值
     */
    public Builder serviceEndTime(String serviceEndTime) {
      this.serviceEndTime = serviceEndTime;
      return this;
    }

    /**
     * 是否可选 true-可选 false-不可选
     */
    public Builder status(Boolean status) {
      this.status = status;
      return this;
    }

    public Builder timeStr(String timeStr) {
      this.timeStr = timeStr;
      return this;
    }

    /**
     * 日期
     */
    public Builder dateTime(String dateTime) {
      this.dateTime = dateTime;
      return this;
    }

    @Override
    public OrderTimeData build() {
      return new OrderTimeData(time, serviceStartTime, serviceEndTime, status, timeStr, dateTime, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_OrderTimeData extends ProtoAdapter<OrderTimeData> {
    ProtoAdapter_OrderTimeData() {
      super(FieldEncoding.LENGTH_DELIMITED, OrderTimeData.class);
    }

    @Override
    public int encodedSize(OrderTimeData value) {
      return (value.time != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.time) : 0)
          + (value.serviceStartTime != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.serviceStartTime) : 0)
          + (value.serviceEndTime != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.serviceEndTime) : 0)
          + (value.status != null ? ProtoAdapter.BOOL.encodedSizeWithTag(4, value.status) : 0)
          + (value.timeStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, value.timeStr) : 0)
          + (value.dateTime != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.dateTime) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, OrderTimeData value) throws IOException {
      if (value.time != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.time);
      if (value.serviceStartTime != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.serviceStartTime);
      if (value.serviceEndTime != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.serviceEndTime);
      if (value.status != null) ProtoAdapter.BOOL.encodeWithTag(writer, 4, value.status);
      if (value.timeStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 5, value.timeStr);
      if (value.dateTime != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.dateTime);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public OrderTimeData decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.time(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.serviceStartTime(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.serviceEndTime(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.status(ProtoAdapter.BOOL.decode(reader)); break;
          case 5: builder.timeStr(ProtoAdapter.STRING.decode(reader)); break;
          case 6: builder.dateTime(ProtoAdapter.STRING.decode(reader)); break;
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
    public OrderTimeData redact(OrderTimeData value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}