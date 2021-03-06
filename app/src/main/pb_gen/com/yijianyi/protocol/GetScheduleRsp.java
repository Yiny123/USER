// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 2008:1
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
import java.util.List;
import okio.ByteString;

public final class GetScheduleRsp extends Message<GetScheduleRsp, GetScheduleRsp.Builder> {
  public static final ProtoAdapter<GetScheduleRsp> ADAPTER = new ProtoAdapter_GetScheduleRsp();

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.MyScheduleVO#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<MyScheduleVO> scheduleList;

  public GetScheduleRsp(List<MyScheduleVO> scheduleList) {
    this(scheduleList, ByteString.EMPTY);
  }

  public GetScheduleRsp(List<MyScheduleVO> scheduleList, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.scheduleList = Internal.immutableCopyOf("scheduleList", scheduleList);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.scheduleList = Internal.copyOf("scheduleList", scheduleList);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetScheduleRsp)) return false;
    GetScheduleRsp o = (GetScheduleRsp) other;
    return unknownFields().equals(o.unknownFields())
        && scheduleList.equals(o.scheduleList);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + scheduleList.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (!scheduleList.isEmpty()) builder.append(", scheduleList=").append(scheduleList);
    return builder.replace(0, 2, "GetScheduleRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetScheduleRsp, Builder> {
    public List<MyScheduleVO> scheduleList;

    public Builder() {
      scheduleList = Internal.newMutableList();
    }

    public Builder scheduleList(List<MyScheduleVO> scheduleList) {
      Internal.checkElementsNotNull(scheduleList);
      this.scheduleList = scheduleList;
      return this;
    }

    @Override
    public GetScheduleRsp build() {
      return new GetScheduleRsp(scheduleList, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetScheduleRsp extends ProtoAdapter<GetScheduleRsp> {
    ProtoAdapter_GetScheduleRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, GetScheduleRsp.class);
    }

    @Override
    public int encodedSize(GetScheduleRsp value) {
      return MyScheduleVO.ADAPTER.asRepeated().encodedSizeWithTag(1, value.scheduleList)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetScheduleRsp value) throws IOException {
      MyScheduleVO.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.scheduleList);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetScheduleRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.scheduleList.add(MyScheduleVO.ADAPTER.decode(reader)); break;
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
    public GetScheduleRsp redact(GetScheduleRsp value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.scheduleList, MyScheduleVO.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
