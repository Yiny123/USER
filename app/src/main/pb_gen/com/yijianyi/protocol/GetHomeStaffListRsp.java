// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 2092:1
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
import java.util.List;
import okio.ByteString;

public final class GetHomeStaffListRsp extends Message<GetHomeStaffListRsp, GetHomeStaffListRsp.Builder> {
  public static final ProtoAdapter<GetHomeStaffListRsp> ADAPTER = new ProtoAdapter_GetHomeStaffListRsp();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_COUNT = 0;

  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.InsureHGListVO#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<InsureHGListVO> staffList;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer count;

  public GetHomeStaffListRsp(List<InsureHGListVO> staffList, Integer count) {
    this(staffList, count, ByteString.EMPTY);
  }

  public GetHomeStaffListRsp(List<InsureHGListVO> staffList, Integer count, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.staffList = Internal.immutableCopyOf("staffList", staffList);
    this.count = count;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.staffList = Internal.copyOf("staffList", staffList);
    builder.count = count;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetHomeStaffListRsp)) return false;
    GetHomeStaffListRsp o = (GetHomeStaffListRsp) other;
    return unknownFields().equals(o.unknownFields())
        && staffList.equals(o.staffList)
        && Internal.equals(count, o.count);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + staffList.hashCode();
      result = result * 37 + (count != null ? count.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (!staffList.isEmpty()) builder.append(", staffList=").append(staffList);
    if (count != null) builder.append(", count=").append(count);
    return builder.replace(0, 2, "GetHomeStaffListRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetHomeStaffListRsp, Builder> {
    public List<InsureHGListVO> staffList;

    public Integer count;

    public Builder() {
      staffList = Internal.newMutableList();
    }

    public Builder staffList(List<InsureHGListVO> staffList) {
      Internal.checkElementsNotNull(staffList);
      this.staffList = staffList;
      return this;
    }

    public Builder count(Integer count) {
      this.count = count;
      return this;
    }

    @Override
    public GetHomeStaffListRsp build() {
      return new GetHomeStaffListRsp(staffList, count, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetHomeStaffListRsp extends ProtoAdapter<GetHomeStaffListRsp> {
    ProtoAdapter_GetHomeStaffListRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, GetHomeStaffListRsp.class);
    }

    @Override
    public int encodedSize(GetHomeStaffListRsp value) {
      return InsureHGListVO.ADAPTER.asRepeated().encodedSizeWithTag(1, value.staffList)
          + (value.count != null ? ProtoAdapter.UINT32.encodedSizeWithTag(2, value.count) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetHomeStaffListRsp value) throws IOException {
      InsureHGListVO.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.staffList);
      if (value.count != null) ProtoAdapter.UINT32.encodeWithTag(writer, 2, value.count);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetHomeStaffListRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.staffList.add(InsureHGListVO.ADAPTER.decode(reader)); break;
          case 2: builder.count(ProtoAdapter.UINT32.decode(reader)); break;
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
    public GetHomeStaffListRsp redact(GetHomeStaffListRsp value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.staffList, InsureHGListVO.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}