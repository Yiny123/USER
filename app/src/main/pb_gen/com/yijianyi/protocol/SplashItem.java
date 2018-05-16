// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: CommonData.proto at 57:1
package com.yijianyi.protocol;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * 闪屏信息
 */
public final class SplashItem extends Message<SplashItem, SplashItem.Builder> {
  public static final ProtoAdapter<SplashItem> ADAPTER = new ProtoAdapter_SplashItem();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_ID = 0;

  public static final Long DEFAULT_STARTTIMECD = 0L;

  public static final Long DEFAULT_ENDTIMECD = 0L;

  public static final Boolean DEFAULT_ONLYONETIME = false;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer id;

  @WireField(
      tag = 2,
      adapter = "com.yijianyi.protocol.ImgInfo#ADAPTER"
  )
  public final ImgInfo imgInfo;

  /**
   * 距离开始的相对时间,如果已经开始则为0. 单位：ms毫秒
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long startTimeCD;

  /**
   * 距离结束的相对时间,如果已经结束则为0. 单位：ms毫秒
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long endTimeCD;

  /**
   * 指定闪屏是否只显示一次
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean onlyOneTime;

  public SplashItem(Integer id, ImgInfo imgInfo, Long startTimeCD, Long endTimeCD, Boolean onlyOneTime) {
    this(id, imgInfo, startTimeCD, endTimeCD, onlyOneTime, ByteString.EMPTY);
  }

  public SplashItem(Integer id, ImgInfo imgInfo, Long startTimeCD, Long endTimeCD, Boolean onlyOneTime, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.imgInfo = imgInfo;
    this.startTimeCD = startTimeCD;
    this.endTimeCD = endTimeCD;
    this.onlyOneTime = onlyOneTime;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.imgInfo = imgInfo;
    builder.startTimeCD = startTimeCD;
    builder.endTimeCD = endTimeCD;
    builder.onlyOneTime = onlyOneTime;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof SplashItem)) return false;
    SplashItem o = (SplashItem) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(imgInfo, o.imgInfo)
        && Internal.equals(startTimeCD, o.startTimeCD)
        && Internal.equals(endTimeCD, o.endTimeCD)
        && Internal.equals(onlyOneTime, o.onlyOneTime);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (imgInfo != null ? imgInfo.hashCode() : 0);
      result = result * 37 + (startTimeCD != null ? startTimeCD.hashCode() : 0);
      result = result * 37 + (endTimeCD != null ? endTimeCD.hashCode() : 0);
      result = result * 37 + (onlyOneTime != null ? onlyOneTime.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (id != null) builder.append(", id=").append(id);
    if (imgInfo != null) builder.append(", imgInfo=").append(imgInfo);
    if (startTimeCD != null) builder.append(", startTimeCD=").append(startTimeCD);
    if (endTimeCD != null) builder.append(", endTimeCD=").append(endTimeCD);
    if (onlyOneTime != null) builder.append(", onlyOneTime=").append(onlyOneTime);
    return builder.replace(0, 2, "SplashItem{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<SplashItem, Builder> {
    public Integer id;

    public ImgInfo imgInfo;

    public Long startTimeCD;

    public Long endTimeCD;

    public Boolean onlyOneTime;

    public Builder() {
    }

    public Builder id(Integer id) {
      this.id = id;
      return this;
    }

    public Builder imgInfo(ImgInfo imgInfo) {
      this.imgInfo = imgInfo;
      return this;
    }

    /**
     * 距离开始的相对时间,如果已经开始则为0. 单位：ms毫秒
     */
    public Builder startTimeCD(Long startTimeCD) {
      this.startTimeCD = startTimeCD;
      return this;
    }

    /**
     * 距离结束的相对时间,如果已经结束则为0. 单位：ms毫秒
     */
    public Builder endTimeCD(Long endTimeCD) {
      this.endTimeCD = endTimeCD;
      return this;
    }

    /**
     * 指定闪屏是否只显示一次
     */
    public Builder onlyOneTime(Boolean onlyOneTime) {
      this.onlyOneTime = onlyOneTime;
      return this;
    }

    @Override
    public SplashItem build() {
      return new SplashItem(id, imgInfo, startTimeCD, endTimeCD, onlyOneTime, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_SplashItem extends ProtoAdapter<SplashItem> {
    ProtoAdapter_SplashItem() {
      super(FieldEncoding.LENGTH_DELIMITED, SplashItem.class);
    }

    @Override
    public int encodedSize(SplashItem value) {
      return (value.id != null ? ProtoAdapter.UINT32.encodedSizeWithTag(1, value.id) : 0)
          + (value.imgInfo != null ? ImgInfo.ADAPTER.encodedSizeWithTag(2, value.imgInfo) : 0)
          + (value.startTimeCD != null ? ProtoAdapter.UINT64.encodedSizeWithTag(3, value.startTimeCD) : 0)
          + (value.endTimeCD != null ? ProtoAdapter.UINT64.encodedSizeWithTag(4, value.endTimeCD) : 0)
          + (value.onlyOneTime != null ? ProtoAdapter.BOOL.encodedSizeWithTag(5, value.onlyOneTime) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, SplashItem value) throws IOException {
      if (value.id != null) ProtoAdapter.UINT32.encodeWithTag(writer, 1, value.id);
      if (value.imgInfo != null) ImgInfo.ADAPTER.encodeWithTag(writer, 2, value.imgInfo);
      if (value.startTimeCD != null) ProtoAdapter.UINT64.encodeWithTag(writer, 3, value.startTimeCD);
      if (value.endTimeCD != null) ProtoAdapter.UINT64.encodeWithTag(writer, 4, value.endTimeCD);
      if (value.onlyOneTime != null) ProtoAdapter.BOOL.encodeWithTag(writer, 5, value.onlyOneTime);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public SplashItem decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.UINT32.decode(reader)); break;
          case 2: builder.imgInfo(ImgInfo.ADAPTER.decode(reader)); break;
          case 3: builder.startTimeCD(ProtoAdapter.UINT64.decode(reader)); break;
          case 4: builder.endTimeCD(ProtoAdapter.UINT64.decode(reader)); break;
          case 5: builder.onlyOneTime(ProtoAdapter.BOOL.decode(reader)); break;
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
    public SplashItem redact(SplashItem value) {
      Builder builder = value.newBuilder();
      if (builder.imgInfo != null) builder.imgInfo = ImgInfo.ADAPTER.redact(builder.imgInfo);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}