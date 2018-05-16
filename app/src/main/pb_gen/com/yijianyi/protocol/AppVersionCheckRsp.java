// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 55:1
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
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * App版本检测
 */
public final class AppVersionCheckRsp extends Message<AppVersionCheckRsp, AppVersionCheckRsp.Builder> {
  public static final ProtoAdapter<AppVersionCheckRsp> ADAPTER = new ProtoAdapter_AppVersionCheckRsp();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_VERSION = 0;

  public static final String DEFAULT_NAME = "";

  public static final Integer DEFAULT_REMINDLEVEL = 0;

  public static final String DEFAULT_SOURCELINK = "";

  public static final Long DEFAULT_PUBLISHTIME = 0L;

  public static final Integer DEFAULT_ISNEWVERSION = 0;

  /**
   * 版本号
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer version;

  /**
   * 版本名
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String name;

  /**
   * 提醒等级
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer remindLevel;

  /**
   * 更新地址
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String sourceLink;

  /**
   * 发布时间
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long publishTime;

  /**
   * 是否有新版本
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer isNewVersion;

  public AppVersionCheckRsp(Integer version, String name, Integer remindLevel, String sourceLink, Long publishTime, Integer isNewVersion) {
    this(version, name, remindLevel, sourceLink, publishTime, isNewVersion, ByteString.EMPTY);
  }

  public AppVersionCheckRsp(Integer version, String name, Integer remindLevel, String sourceLink, Long publishTime, Integer isNewVersion, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.version = version;
    this.name = name;
    this.remindLevel = remindLevel;
    this.sourceLink = sourceLink;
    this.publishTime = publishTime;
    this.isNewVersion = isNewVersion;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.version = version;
    builder.name = name;
    builder.remindLevel = remindLevel;
    builder.sourceLink = sourceLink;
    builder.publishTime = publishTime;
    builder.isNewVersion = isNewVersion;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AppVersionCheckRsp)) return false;
    AppVersionCheckRsp o = (AppVersionCheckRsp) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(version, o.version)
        && Internal.equals(name, o.name)
        && Internal.equals(remindLevel, o.remindLevel)
        && Internal.equals(sourceLink, o.sourceLink)
        && Internal.equals(publishTime, o.publishTime)
        && Internal.equals(isNewVersion, o.isNewVersion);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (version != null ? version.hashCode() : 0);
      result = result * 37 + (name != null ? name.hashCode() : 0);
      result = result * 37 + (remindLevel != null ? remindLevel.hashCode() : 0);
      result = result * 37 + (sourceLink != null ? sourceLink.hashCode() : 0);
      result = result * 37 + (publishTime != null ? publishTime.hashCode() : 0);
      result = result * 37 + (isNewVersion != null ? isNewVersion.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (version != null) builder.append(", version=").append(version);
    if (name != null) builder.append(", name=").append(name);
    if (remindLevel != null) builder.append(", remindLevel=").append(remindLevel);
    if (sourceLink != null) builder.append(", sourceLink=").append(sourceLink);
    if (publishTime != null) builder.append(", publishTime=").append(publishTime);
    if (isNewVersion != null) builder.append(", isNewVersion=").append(isNewVersion);
    return builder.replace(0, 2, "AppVersionCheckRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<AppVersionCheckRsp, Builder> {
    public Integer version;

    public String name;

    public Integer remindLevel;

    public String sourceLink;

    public Long publishTime;

    public Integer isNewVersion;

    public Builder() {
    }

    /**
     * 版本号
     */
    public Builder version(Integer version) {
      this.version = version;
      return this;
    }

    /**
     * 版本名
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * 提醒等级
     */
    public Builder remindLevel(Integer remindLevel) {
      this.remindLevel = remindLevel;
      return this;
    }

    /**
     * 更新地址
     */
    public Builder sourceLink(String sourceLink) {
      this.sourceLink = sourceLink;
      return this;
    }

    /**
     * 发布时间
     */
    public Builder publishTime(Long publishTime) {
      this.publishTime = publishTime;
      return this;
    }

    /**
     * 是否有新版本
     */
    public Builder isNewVersion(Integer isNewVersion) {
      this.isNewVersion = isNewVersion;
      return this;
    }

    @Override
    public AppVersionCheckRsp build() {
      return new AppVersionCheckRsp(version, name, remindLevel, sourceLink, publishTime, isNewVersion, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_AppVersionCheckRsp extends ProtoAdapter<AppVersionCheckRsp> {
    ProtoAdapter_AppVersionCheckRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, AppVersionCheckRsp.class);
    }

    @Override
    public int encodedSize(AppVersionCheckRsp value) {
      return (value.version != null ? ProtoAdapter.UINT32.encodedSizeWithTag(1, value.version) : 0)
          + (value.name != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.name) : 0)
          + (value.remindLevel != null ? ProtoAdapter.UINT32.encodedSizeWithTag(3, value.remindLevel) : 0)
          + (value.sourceLink != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.sourceLink) : 0)
          + (value.publishTime != null ? ProtoAdapter.UINT64.encodedSizeWithTag(5, value.publishTime) : 0)
          + (value.isNewVersion != null ? ProtoAdapter.UINT32.encodedSizeWithTag(6, value.isNewVersion) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, AppVersionCheckRsp value) throws IOException {
      if (value.version != null) ProtoAdapter.UINT32.encodeWithTag(writer, 1, value.version);
      if (value.name != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.name);
      if (value.remindLevel != null) ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.remindLevel);
      if (value.sourceLink != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.sourceLink);
      if (value.publishTime != null) ProtoAdapter.UINT64.encodeWithTag(writer, 5, value.publishTime);
      if (value.isNewVersion != null) ProtoAdapter.UINT32.encodeWithTag(writer, 6, value.isNewVersion);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public AppVersionCheckRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.version(ProtoAdapter.UINT32.decode(reader)); break;
          case 2: builder.name(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.remindLevel(ProtoAdapter.UINT32.decode(reader)); break;
          case 4: builder.sourceLink(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.publishTime(ProtoAdapter.UINT64.decode(reader)); break;
          case 6: builder.isNewVersion(ProtoAdapter.UINT32.decode(reader)); break;
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
    public AppVersionCheckRsp redact(AppVersionCheckRsp value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
