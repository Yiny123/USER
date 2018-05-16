// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 657:1
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
 * 	获取日程表
 */
public final class GetScheduleListReq extends Message<GetScheduleListReq, GetScheduleListReq.Builder> {
  public static final ProtoAdapter<GetScheduleListReq> ADAPTER = new ProtoAdapter_GetScheduleListReq();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_TIME = "";

  public static final Integer DEFAULT_PAGESIZE = 0;

  public static final Integer DEFAULT_PAGENUM = 0;

  /**
   * 查询时间 （yyyy-MM-dd）
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String time;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer pageSize;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer pageNum;

  public GetScheduleListReq(String time, Integer pageSize, Integer pageNum) {
    this(time, pageSize, pageNum, ByteString.EMPTY);
  }

  public GetScheduleListReq(String time, Integer pageSize, Integer pageNum, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.time = time;
    this.pageSize = pageSize;
    this.pageNum = pageNum;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.time = time;
    builder.pageSize = pageSize;
    builder.pageNum = pageNum;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetScheduleListReq)) return false;
    GetScheduleListReq o = (GetScheduleListReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(time, o.time)
        && Internal.equals(pageSize, o.pageSize)
        && Internal.equals(pageNum, o.pageNum);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (time != null ? time.hashCode() : 0);
      result = result * 37 + (pageSize != null ? pageSize.hashCode() : 0);
      result = result * 37 + (pageNum != null ? pageNum.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (time != null) builder.append(", time=").append(time);
    if (pageSize != null) builder.append(", pageSize=").append(pageSize);
    if (pageNum != null) builder.append(", pageNum=").append(pageNum);
    return builder.replace(0, 2, "GetScheduleListReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetScheduleListReq, Builder> {
    public String time;

    public Integer pageSize;

    public Integer pageNum;

    public Builder() {
    }

    /**
     * 查询时间 （yyyy-MM-dd）
     */
    public Builder time(String time) {
      this.time = time;
      return this;
    }

    public Builder pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    public Builder pageNum(Integer pageNum) {
      this.pageNum = pageNum;
      return this;
    }

    @Override
    public GetScheduleListReq build() {
      return new GetScheduleListReq(time, pageSize, pageNum, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetScheduleListReq extends ProtoAdapter<GetScheduleListReq> {
    ProtoAdapter_GetScheduleListReq() {
      super(FieldEncoding.LENGTH_DELIMITED, GetScheduleListReq.class);
    }

    @Override
    public int encodedSize(GetScheduleListReq value) {
      return (value.time != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.time) : 0)
          + (value.pageSize != null ? ProtoAdapter.UINT32.encodedSizeWithTag(2, value.pageSize) : 0)
          + (value.pageNum != null ? ProtoAdapter.UINT32.encodedSizeWithTag(3, value.pageNum) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetScheduleListReq value) throws IOException {
      if (value.time != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.time);
      if (value.pageSize != null) ProtoAdapter.UINT32.encodeWithTag(writer, 2, value.pageSize);
      if (value.pageNum != null) ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.pageNum);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetScheduleListReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.time(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.pageSize(ProtoAdapter.UINT32.decode(reader)); break;
          case 3: builder.pageNum(ProtoAdapter.UINT32.decode(reader)); break;
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
    public GetScheduleListReq redact(GetScheduleListReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
