// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 48:1
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

public final class AppVersionCheckReq extends Message<AppVersionCheckReq, AppVersionCheckReq.Builder> {
  public static final ProtoAdapter<AppVersionCheckReq> ADAPTER = new ProtoAdapter_AppVersionCheckReq();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_VERSION = 0;

  public static final Integer DEFAULT_APPTYPE = 0;

  public static final Integer DEFAULT_PLATFORM = 0;

  /**
   * 当前运行的app版本
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer version;

  /**
   * app类型  用户端-1 企业端-2
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer appType;

  /**
   * 系统平台 ios-1, android - 2
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer platform;

  public AppVersionCheckReq(Integer version, Integer appType, Integer platform) {
    this(version, appType, platform, ByteString.EMPTY);
  }

  public AppVersionCheckReq(Integer version, Integer appType, Integer platform, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.version = version;
    this.appType = appType;
    this.platform = platform;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.version = version;
    builder.appType = appType;
    builder.platform = platform;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AppVersionCheckReq)) return false;
    AppVersionCheckReq o = (AppVersionCheckReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(version, o.version)
        && Internal.equals(appType, o.appType)
        && Internal.equals(platform, o.platform);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (version != null ? version.hashCode() : 0);
      result = result * 37 + (appType != null ? appType.hashCode() : 0);
      result = result * 37 + (platform != null ? platform.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (version != null) builder.append(", version=").append(version);
    if (appType != null) builder.append(", appType=").append(appType);
    if (platform != null) builder.append(", platform=").append(platform);
    return builder.replace(0, 2, "AppVersionCheckReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<AppVersionCheckReq, Builder> {
    public Integer version;

    public Integer appType;

    public Integer platform;

    public Builder() {
    }

    /**
     * 当前运行的app版本
     */
    public Builder version(Integer version) {
      this.version = version;
      return this;
    }

    /**
     * app类型  用户端-1 企业端-2
     */
    public Builder appType(Integer appType) {
      this.appType = appType;
      return this;
    }

    /**
     * 系统平台 ios-1, android - 2
     */
    public Builder platform(Integer platform) {
      this.platform = platform;
      return this;
    }

    @Override
    public AppVersionCheckReq build() {
      return new AppVersionCheckReq(version, appType, platform, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_AppVersionCheckReq extends ProtoAdapter<AppVersionCheckReq> {
    ProtoAdapter_AppVersionCheckReq() {
      super(FieldEncoding.LENGTH_DELIMITED, AppVersionCheckReq.class);
    }

    @Override
    public int encodedSize(AppVersionCheckReq value) {
      return (value.version != null ? ProtoAdapter.UINT32.encodedSizeWithTag(1, value.version) : 0)
          + (value.appType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(2, value.appType) : 0)
          + (value.platform != null ? ProtoAdapter.UINT32.encodedSizeWithTag(3, value.platform) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, AppVersionCheckReq value) throws IOException {
      if (value.version != null) ProtoAdapter.UINT32.encodeWithTag(writer, 1, value.version);
      if (value.appType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 2, value.appType);
      if (value.platform != null) ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.platform);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public AppVersionCheckReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.version(ProtoAdapter.UINT32.decode(reader)); break;
          case 2: builder.appType(ProtoAdapter.UINT32.decode(reader)); break;
          case 3: builder.platform(ProtoAdapter.UINT32.decode(reader)); break;
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
    public AppVersionCheckReq redact(AppVersionCheckReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
