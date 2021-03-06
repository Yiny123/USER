// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 251:1
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

/**
 * 充值配置项
 */
public final class GetRechargeSettingRsp extends Message<GetRechargeSettingRsp, GetRechargeSettingRsp.Builder> {
  public static final ProtoAdapter<GetRechargeSettingRsp> ADAPTER = new ProtoAdapter_GetRechargeSettingRsp();

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.RechargeSetting#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<RechargeSetting> rsList;

  public GetRechargeSettingRsp(List<RechargeSetting> rsList) {
    this(rsList, ByteString.EMPTY);
  }

  public GetRechargeSettingRsp(List<RechargeSetting> rsList, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.rsList = Internal.immutableCopyOf("rsList", rsList);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.rsList = Internal.copyOf("rsList", rsList);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetRechargeSettingRsp)) return false;
    GetRechargeSettingRsp o = (GetRechargeSettingRsp) other;
    return unknownFields().equals(o.unknownFields())
        && rsList.equals(o.rsList);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + rsList.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (!rsList.isEmpty()) builder.append(", rsList=").append(rsList);
    return builder.replace(0, 2, "GetRechargeSettingRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetRechargeSettingRsp, Builder> {
    public List<RechargeSetting> rsList;

    public Builder() {
      rsList = Internal.newMutableList();
    }

    public Builder rsList(List<RechargeSetting> rsList) {
      Internal.checkElementsNotNull(rsList);
      this.rsList = rsList;
      return this;
    }

    @Override
    public GetRechargeSettingRsp build() {
      return new GetRechargeSettingRsp(rsList, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetRechargeSettingRsp extends ProtoAdapter<GetRechargeSettingRsp> {
    ProtoAdapter_GetRechargeSettingRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, GetRechargeSettingRsp.class);
    }

    @Override
    public int encodedSize(GetRechargeSettingRsp value) {
      return RechargeSetting.ADAPTER.asRepeated().encodedSizeWithTag(1, value.rsList)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetRechargeSettingRsp value) throws IOException {
      RechargeSetting.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.rsList);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetRechargeSettingRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.rsList.add(RechargeSetting.ADAPTER.decode(reader)); break;
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
    public GetRechargeSettingRsp redact(GetRechargeSettingRsp value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.rsList, RechargeSetting.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
