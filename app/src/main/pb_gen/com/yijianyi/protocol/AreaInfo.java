// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: Area.proto at 6:1
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

public final class AreaInfo extends Message<AreaInfo, AreaInfo.Builder> {
  public static final ProtoAdapter<AreaInfo> ADAPTER = new ProtoAdapter_AreaInfo();

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.ProvinceInfo#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<ProvinceInfo> provinceList;

  public AreaInfo(List<ProvinceInfo> provinceList) {
    this(provinceList, ByteString.EMPTY);
  }

  public AreaInfo(List<ProvinceInfo> provinceList, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.provinceList = Internal.immutableCopyOf("provinceList", provinceList);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.provinceList = Internal.copyOf("provinceList", provinceList);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AreaInfo)) return false;
    AreaInfo o = (AreaInfo) other;
    return unknownFields().equals(o.unknownFields())
        && provinceList.equals(o.provinceList);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + provinceList.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (!provinceList.isEmpty()) builder.append(", provinceList=").append(provinceList);
    return builder.replace(0, 2, "AreaInfo{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<AreaInfo, Builder> {
    public List<ProvinceInfo> provinceList;

    public Builder() {
      provinceList = Internal.newMutableList();
    }

    public Builder provinceList(List<ProvinceInfo> provinceList) {
      Internal.checkElementsNotNull(provinceList);
      this.provinceList = provinceList;
      return this;
    }

    @Override
    public AreaInfo build() {
      return new AreaInfo(provinceList, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_AreaInfo extends ProtoAdapter<AreaInfo> {
    ProtoAdapter_AreaInfo() {
      super(FieldEncoding.LENGTH_DELIMITED, AreaInfo.class);
    }

    @Override
    public int encodedSize(AreaInfo value) {
      return ProvinceInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, value.provinceList)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, AreaInfo value) throws IOException {
      ProvinceInfo.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.provinceList);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public AreaInfo decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.provinceList.add(ProvinceInfo.ADAPTER.decode(reader)); break;
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
    public AreaInfo redact(AreaInfo value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.provinceList, ProvinceInfo.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
