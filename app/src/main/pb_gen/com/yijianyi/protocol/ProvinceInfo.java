// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: Area.proto at 10:1
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

public final class ProvinceInfo extends Message<ProvinceInfo, ProvinceInfo.Builder> {
  public static final ProtoAdapter<ProvinceInfo> ADAPTER = new ProtoAdapter_ProvinceInfo();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_PROVINCEID = 0;

  public static final String DEFAULT_PROVINCENAME = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer provinceId;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String provinceName;

  @WireField(
      tag = 3,
      adapter = "com.yijianyi.protocol.CityInfo#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<CityInfo> cityList;

  public ProvinceInfo(Integer provinceId, String provinceName, List<CityInfo> cityList) {
    this(provinceId, provinceName, cityList, ByteString.EMPTY);
  }

  public ProvinceInfo(Integer provinceId, String provinceName, List<CityInfo> cityList, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.provinceId = provinceId;
    this.provinceName = provinceName;
    this.cityList = Internal.immutableCopyOf("cityList", cityList);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.provinceId = provinceId;
    builder.provinceName = provinceName;
    builder.cityList = Internal.copyOf("cityList", cityList);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ProvinceInfo)) return false;
    ProvinceInfo o = (ProvinceInfo) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(provinceId, o.provinceId)
        && Internal.equals(provinceName, o.provinceName)
        && cityList.equals(o.cityList);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (provinceId != null ? provinceId.hashCode() : 0);
      result = result * 37 + (provinceName != null ? provinceName.hashCode() : 0);
      result = result * 37 + cityList.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (provinceId != null) builder.append(", provinceId=").append(provinceId);
    if (provinceName != null) builder.append(", provinceName=").append(provinceName);
    if (!cityList.isEmpty()) builder.append(", cityList=").append(cityList);
    return builder.replace(0, 2, "ProvinceInfo{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<ProvinceInfo, Builder> {
    public Integer provinceId;

    public String provinceName;

    public List<CityInfo> cityList;

    public Builder() {
      cityList = Internal.newMutableList();
    }

    public Builder provinceId(Integer provinceId) {
      this.provinceId = provinceId;
      return this;
    }

    public Builder provinceName(String provinceName) {
      this.provinceName = provinceName;
      return this;
    }

    public Builder cityList(List<CityInfo> cityList) {
      Internal.checkElementsNotNull(cityList);
      this.cityList = cityList;
      return this;
    }

    @Override
    public ProvinceInfo build() {
      return new ProvinceInfo(provinceId, provinceName, cityList, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_ProvinceInfo extends ProtoAdapter<ProvinceInfo> {
    ProtoAdapter_ProvinceInfo() {
      super(FieldEncoding.LENGTH_DELIMITED, ProvinceInfo.class);
    }

    @Override
    public int encodedSize(ProvinceInfo value) {
      return (value.provinceId != null ? ProtoAdapter.UINT32.encodedSizeWithTag(1, value.provinceId) : 0)
          + (value.provinceName != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.provinceName) : 0)
          + CityInfo.ADAPTER.asRepeated().encodedSizeWithTag(3, value.cityList)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, ProvinceInfo value) throws IOException {
      if (value.provinceId != null) ProtoAdapter.UINT32.encodeWithTag(writer, 1, value.provinceId);
      if (value.provinceName != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.provinceName);
      CityInfo.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.cityList);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public ProvinceInfo decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.provinceId(ProtoAdapter.UINT32.decode(reader)); break;
          case 2: builder.provinceName(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.cityList.add(CityInfo.ADAPTER.decode(reader)); break;
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
    public ProvinceInfo redact(ProvinceInfo value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.cityList, CityInfo.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
