// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: Comm.proto at 39:1
package com.yijianyi.protocol;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class YUA extends Message<YUA, YUA.Builder> {
  public static final ProtoAdapter<YUA> ADAPTER = new ProtoAdapter_YUA();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_SOFTNAME = "";

  public static final String DEFAULT_VERSION = "";

  public static final String DEFAULT_BUILDNO = "";

  public static final String DEFAULT_VERSIONNAME = "";

  public static final String DEFAULT_PLATFORM = "";

  public static final String DEFAULT_OSVERSION = "";

  public static final Integer DEFAULT_WIDTH = 0;

  public static final Integer DEFAULT_HEIGHT = 0;

  public static final Double DEFAULT_SIZE = 0.0d;

  public static final String DEFAULT_DEVICENAME = "";

  public static final String DEFAULT_CHANNEL = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String softName;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String version;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String buildNo;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String versionName;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String platform;

  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String OSversion;

  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer width;

  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer height;

  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
  )
  public final Double size;

  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String DeviceName;

  @WireField(
      tag = 11,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String channel;

  public YUA(String softName, String version, String buildNo, String versionName, String platform, String OSversion, Integer width, Integer height, Double size, String DeviceName, String channel) {
    this(softName, version, buildNo, versionName, platform, OSversion, width, height, size, DeviceName, channel, ByteString.EMPTY);
  }

  public YUA(String softName, String version, String buildNo, String versionName, String platform, String OSversion, Integer width, Integer height, Double size, String DeviceName, String channel, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.softName = softName;
    this.version = version;
    this.buildNo = buildNo;
    this.versionName = versionName;
    this.platform = platform;
    this.OSversion = OSversion;
    this.width = width;
    this.height = height;
    this.size = size;
    this.DeviceName = DeviceName;
    this.channel = channel;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.softName = softName;
    builder.version = version;
    builder.buildNo = buildNo;
    builder.versionName = versionName;
    builder.platform = platform;
    builder.OSversion = OSversion;
    builder.width = width;
    builder.height = height;
    builder.size = size;
    builder.DeviceName = DeviceName;
    builder.channel = channel;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof YUA)) return false;
    YUA o = (YUA) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(softName, o.softName)
        && Internal.equals(version, o.version)
        && Internal.equals(buildNo, o.buildNo)
        && Internal.equals(versionName, o.versionName)
        && Internal.equals(platform, o.platform)
        && Internal.equals(OSversion, o.OSversion)
        && Internal.equals(width, o.width)
        && Internal.equals(height, o.height)
        && Internal.equals(size, o.size)
        && Internal.equals(DeviceName, o.DeviceName)
        && Internal.equals(channel, o.channel);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (softName != null ? softName.hashCode() : 0);
      result = result * 37 + (version != null ? version.hashCode() : 0);
      result = result * 37 + (buildNo != null ? buildNo.hashCode() : 0);
      result = result * 37 + (versionName != null ? versionName.hashCode() : 0);
      result = result * 37 + (platform != null ? platform.hashCode() : 0);
      result = result * 37 + (OSversion != null ? OSversion.hashCode() : 0);
      result = result * 37 + (width != null ? width.hashCode() : 0);
      result = result * 37 + (height != null ? height.hashCode() : 0);
      result = result * 37 + (size != null ? size.hashCode() : 0);
      result = result * 37 + (DeviceName != null ? DeviceName.hashCode() : 0);
      result = result * 37 + (channel != null ? channel.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (softName != null) builder.append(", softName=").append(softName);
    if (version != null) builder.append(", version=").append(version);
    if (buildNo != null) builder.append(", buildNo=").append(buildNo);
    if (versionName != null) builder.append(", versionName=").append(versionName);
    if (platform != null) builder.append(", platform=").append(platform);
    if (OSversion != null) builder.append(", OSversion=").append(OSversion);
    if (width != null) builder.append(", width=").append(width);
    if (height != null) builder.append(", height=").append(height);
    if (size != null) builder.append(", size=").append(size);
    if (DeviceName != null) builder.append(", DeviceName=").append(DeviceName);
    if (channel != null) builder.append(", channel=").append(channel);
    return builder.replace(0, 2, "YUA{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<YUA, Builder> {
    public String softName;

    public String version;

    public String buildNo;

    public String versionName;

    public String platform;

    public String OSversion;

    public Integer width;

    public Integer height;

    public Double size;

    public String DeviceName;

    public String channel;

    public Builder() {
    }

    public Builder softName(String softName) {
      this.softName = softName;
      return this;
    }

    public Builder version(String version) {
      this.version = version;
      return this;
    }

    public Builder buildNo(String buildNo) {
      this.buildNo = buildNo;
      return this;
    }

    public Builder versionName(String versionName) {
      this.versionName = versionName;
      return this;
    }

    public Builder platform(String platform) {
      this.platform = platform;
      return this;
    }

    public Builder OSversion(String OSversion) {
      this.OSversion = OSversion;
      return this;
    }

    public Builder width(Integer width) {
      this.width = width;
      return this;
    }

    public Builder height(Integer height) {
      this.height = height;
      return this;
    }

    public Builder size(Double size) {
      this.size = size;
      return this;
    }

    public Builder DeviceName(String DeviceName) {
      this.DeviceName = DeviceName;
      return this;
    }

    public Builder channel(String channel) {
      this.channel = channel;
      return this;
    }

    @Override
    public YUA build() {
      return new YUA(softName, version, buildNo, versionName, platform, OSversion, width, height, size, DeviceName, channel, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_YUA extends ProtoAdapter<YUA> {
    ProtoAdapter_YUA() {
      super(FieldEncoding.LENGTH_DELIMITED, YUA.class);
    }

    @Override
    public int encodedSize(YUA value) {
      return (value.softName != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.softName) : 0)
          + (value.version != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.version) : 0)
          + (value.buildNo != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.buildNo) : 0)
          + (value.versionName != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.versionName) : 0)
          + (value.platform != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, value.platform) : 0)
          + (value.OSversion != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.OSversion) : 0)
          + (value.width != null ? ProtoAdapter.UINT32.encodedSizeWithTag(7, value.width) : 0)
          + (value.height != null ? ProtoAdapter.UINT32.encodedSizeWithTag(8, value.height) : 0)
          + (value.size != null ? ProtoAdapter.DOUBLE.encodedSizeWithTag(9, value.size) : 0)
          + (value.DeviceName != null ? ProtoAdapter.STRING.encodedSizeWithTag(10, value.DeviceName) : 0)
          + (value.channel != null ? ProtoAdapter.STRING.encodedSizeWithTag(11, value.channel) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, YUA value) throws IOException {
      if (value.softName != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.softName);
      if (value.version != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.version);
      if (value.buildNo != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.buildNo);
      if (value.versionName != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.versionName);
      if (value.platform != null) ProtoAdapter.STRING.encodeWithTag(writer, 5, value.platform);
      if (value.OSversion != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.OSversion);
      if (value.width != null) ProtoAdapter.UINT32.encodeWithTag(writer, 7, value.width);
      if (value.height != null) ProtoAdapter.UINT32.encodeWithTag(writer, 8, value.height);
      if (value.size != null) ProtoAdapter.DOUBLE.encodeWithTag(writer, 9, value.size);
      if (value.DeviceName != null) ProtoAdapter.STRING.encodeWithTag(writer, 10, value.DeviceName);
      if (value.channel != null) ProtoAdapter.STRING.encodeWithTag(writer, 11, value.channel);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public YUA decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.softName(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.version(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.buildNo(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.versionName(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.platform(ProtoAdapter.STRING.decode(reader)); break;
          case 6: builder.OSversion(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.width(ProtoAdapter.UINT32.decode(reader)); break;
          case 8: builder.height(ProtoAdapter.UINT32.decode(reader)); break;
          case 9: builder.size(ProtoAdapter.DOUBLE.decode(reader)); break;
          case 10: builder.DeviceName(ProtoAdapter.STRING.decode(reader)); break;
          case 11: builder.channel(ProtoAdapter.STRING.decode(reader)); break;
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
    public YUA redact(YUA value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
