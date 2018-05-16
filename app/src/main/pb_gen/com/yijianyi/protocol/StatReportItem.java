// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: CommonData.proto at 93:1
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
 * 上报数据类型
 */
public final class StatReportItem extends Message<StatReportItem, StatReportItem.Builder> {
  public static final ProtoAdapter<StatReportItem> ADAPTER = new ProtoAdapter_StatReportItem();

  private static final long serialVersionUID = 0L;

  public static final STAT_TYPE DEFAULT_TYPE = STAT_TYPE.ST_DEFAULT;

  public static final Integer DEFAULT_VERSION = 0;

  public static final ByteString DEFAULT_DATA = ByteString.EMPTY;

  /**
   * 上报类型
   */
  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.STAT_TYPE#ADAPTER"
  )
  public final STAT_TYPE type;

  /**
   * 版本号
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer version;

  /**
   * 请求数据
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#BYTES"
  )
  public final ByteString data;

  public StatReportItem(STAT_TYPE type, Integer version, ByteString data) {
    this(type, version, data, ByteString.EMPTY);
  }

  public StatReportItem(STAT_TYPE type, Integer version, ByteString data, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.type = type;
    this.version = version;
    this.data = data;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.type = type;
    builder.version = version;
    builder.data = data;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof StatReportItem)) return false;
    StatReportItem o = (StatReportItem) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(type, o.type)
        && Internal.equals(version, o.version)
        && Internal.equals(data, o.data);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (type != null ? type.hashCode() : 0);
      result = result * 37 + (version != null ? version.hashCode() : 0);
      result = result * 37 + (data != null ? data.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (type != null) builder.append(", type=").append(type);
    if (version != null) builder.append(", version=").append(version);
    if (data != null) builder.append(", data=").append(data);
    return builder.replace(0, 2, "StatReportItem{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<StatReportItem, Builder> {
    public STAT_TYPE type;

    public Integer version;

    public ByteString data;

    public Builder() {
    }

    /**
     * 上报类型
     */
    public Builder type(STAT_TYPE type) {
      this.type = type;
      return this;
    }

    /**
     * 版本号
     */
    public Builder version(Integer version) {
      this.version = version;
      return this;
    }

    /**
     * 请求数据
     */
    public Builder data(ByteString data) {
      this.data = data;
      return this;
    }

    @Override
    public StatReportItem build() {
      return new StatReportItem(type, version, data, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_StatReportItem extends ProtoAdapter<StatReportItem> {
    ProtoAdapter_StatReportItem() {
      super(FieldEncoding.LENGTH_DELIMITED, StatReportItem.class);
    }

    @Override
    public int encodedSize(StatReportItem value) {
      return (value.type != null ? STAT_TYPE.ADAPTER.encodedSizeWithTag(1, value.type) : 0)
          + (value.version != null ? ProtoAdapter.UINT32.encodedSizeWithTag(2, value.version) : 0)
          + (value.data != null ? ProtoAdapter.BYTES.encodedSizeWithTag(3, value.data) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, StatReportItem value) throws IOException {
      if (value.type != null) STAT_TYPE.ADAPTER.encodeWithTag(writer, 1, value.type);
      if (value.version != null) ProtoAdapter.UINT32.encodeWithTag(writer, 2, value.version);
      if (value.data != null) ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.data);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public StatReportItem decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: {
            try {
              builder.type(STAT_TYPE.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 2: builder.version(ProtoAdapter.UINT32.decode(reader)); break;
          case 3: builder.data(ProtoAdapter.BYTES.decode(reader)); break;
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
    public StatReportItem redact(StatReportItem value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}