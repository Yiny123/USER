// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 70:1
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
 * 获取闪屏配置
 */
public final class GetSplashScreenRsp extends Message<GetSplashScreenRsp, GetSplashScreenRsp.Builder> {
  public static final ProtoAdapter<GetSplashScreenRsp> ADAPTER = new ProtoAdapter_GetSplashScreenRsp();

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.SplashScreenModel#ADAPTER"
  )
  public final SplashScreenModel splashScreenModel;

  public GetSplashScreenRsp(SplashScreenModel splashScreenModel) {
    this(splashScreenModel, ByteString.EMPTY);
  }

  public GetSplashScreenRsp(SplashScreenModel splashScreenModel, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.splashScreenModel = splashScreenModel;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.splashScreenModel = splashScreenModel;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetSplashScreenRsp)) return false;
    GetSplashScreenRsp o = (GetSplashScreenRsp) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(splashScreenModel, o.splashScreenModel);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (splashScreenModel != null ? splashScreenModel.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (splashScreenModel != null) builder.append(", splashScreenModel=").append(splashScreenModel);
    return builder.replace(0, 2, "GetSplashScreenRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetSplashScreenRsp, Builder> {
    public SplashScreenModel splashScreenModel;

    public Builder() {
    }

    public Builder splashScreenModel(SplashScreenModel splashScreenModel) {
      this.splashScreenModel = splashScreenModel;
      return this;
    }

    @Override
    public GetSplashScreenRsp build() {
      return new GetSplashScreenRsp(splashScreenModel, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetSplashScreenRsp extends ProtoAdapter<GetSplashScreenRsp> {
    ProtoAdapter_GetSplashScreenRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, GetSplashScreenRsp.class);
    }

    @Override
    public int encodedSize(GetSplashScreenRsp value) {
      return (value.splashScreenModel != null ? SplashScreenModel.ADAPTER.encodedSizeWithTag(1, value.splashScreenModel) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetSplashScreenRsp value) throws IOException {
      if (value.splashScreenModel != null) SplashScreenModel.ADAPTER.encodeWithTag(writer, 1, value.splashScreenModel);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetSplashScreenRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.splashScreenModel(SplashScreenModel.ADAPTER.decode(reader)); break;
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
    public GetSplashScreenRsp redact(GetSplashScreenRsp value) {
      Builder builder = value.newBuilder();
      if (builder.splashScreenModel != null) builder.splashScreenModel = SplashScreenModel.ADAPTER.redact(builder.splashScreenModel);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
