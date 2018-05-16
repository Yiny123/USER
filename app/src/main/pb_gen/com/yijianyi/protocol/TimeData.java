// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: OrderModel.proto at 387:1
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
 * 下单时间
 */
public final class TimeData extends Message<TimeData, TimeData.Builder> {
  public static final ProtoAdapter<TimeData> ADAPTER = new ProtoAdapter_TimeData();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_DAYSTR = "";

  public static final String DEFAULT_ALIAS = "";

  /**
   * 日期字段
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String dayStr;

  /**
   * 别名
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String alias;

  @WireField(
      tag = 3,
      adapter = "com.yijianyi.protocol.DayTimeData#ADAPTER"
  )
  public final DayTimeData dayTimeData;

  public TimeData(String dayStr, String alias, DayTimeData dayTimeData) {
    this(dayStr, alias, dayTimeData, ByteString.EMPTY);
  }

  public TimeData(String dayStr, String alias, DayTimeData dayTimeData, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.dayStr = dayStr;
    this.alias = alias;
    this.dayTimeData = dayTimeData;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.dayStr = dayStr;
    builder.alias = alias;
    builder.dayTimeData = dayTimeData;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof TimeData)) return false;
    TimeData o = (TimeData) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(dayStr, o.dayStr)
        && Internal.equals(alias, o.alias)
        && Internal.equals(dayTimeData, o.dayTimeData);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (dayStr != null ? dayStr.hashCode() : 0);
      result = result * 37 + (alias != null ? alias.hashCode() : 0);
      result = result * 37 + (dayTimeData != null ? dayTimeData.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (dayStr != null) builder.append(", dayStr=").append(dayStr);
    if (alias != null) builder.append(", alias=").append(alias);
    if (dayTimeData != null) builder.append(", dayTimeData=").append(dayTimeData);
    return builder.replace(0, 2, "TimeData{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<TimeData, Builder> {
    public String dayStr;

    public String alias;

    public DayTimeData dayTimeData;

    public Builder() {
    }

    /**
     * 日期字段
     */
    public Builder dayStr(String dayStr) {
      this.dayStr = dayStr;
      return this;
    }

    /**
     * 别名
     */
    public Builder alias(String alias) {
      this.alias = alias;
      return this;
    }

    public Builder dayTimeData(DayTimeData dayTimeData) {
      this.dayTimeData = dayTimeData;
      return this;
    }

    @Override
    public TimeData build() {
      return new TimeData(dayStr, alias, dayTimeData, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_TimeData extends ProtoAdapter<TimeData> {
    ProtoAdapter_TimeData() {
      super(FieldEncoding.LENGTH_DELIMITED, TimeData.class);
    }

    @Override
    public int encodedSize(TimeData value) {
      return (value.dayStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.dayStr) : 0)
          + (value.alias != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.alias) : 0)
          + (value.dayTimeData != null ? DayTimeData.ADAPTER.encodedSizeWithTag(3, value.dayTimeData) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, TimeData value) throws IOException {
      if (value.dayStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.dayStr);
      if (value.alias != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.alias);
      if (value.dayTimeData != null) DayTimeData.ADAPTER.encodeWithTag(writer, 3, value.dayTimeData);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public TimeData decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.dayStr(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.alias(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.dayTimeData(DayTimeData.ADAPTER.decode(reader)); break;
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
    public TimeData redact(TimeData value) {
      Builder builder = value.newBuilder();
      if (builder.dayTimeData != null) builder.dayTimeData = DayTimeData.ADAPTER.redact(builder.dayTimeData);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
