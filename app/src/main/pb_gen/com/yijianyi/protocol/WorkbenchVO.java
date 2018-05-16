// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: Model.proto at 273:1
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
 * 企业端工作台
 */
public final class WorkbenchVO extends Message<WorkbenchVO, WorkbenchVO.Builder> {
  public static final ProtoAdapter<WorkbenchVO> ADAPTER = new ProtoAdapter_WorkbenchVO();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_NUM = "";

  public static final String DEFAULT_DESC = "";

  public static final String DEFAULT_NATIVEURL = "";

  /**
   * 数据
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String num;

  /**
   * 数据简介
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String desc;

  /**
   * 跳转url
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String nativeUrl;

  public WorkbenchVO(String num, String desc, String nativeUrl) {
    this(num, desc, nativeUrl, ByteString.EMPTY);
  }

  public WorkbenchVO(String num, String desc, String nativeUrl, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.num = num;
    this.desc = desc;
    this.nativeUrl = nativeUrl;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.num = num;
    builder.desc = desc;
    builder.nativeUrl = nativeUrl;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof WorkbenchVO)) return false;
    WorkbenchVO o = (WorkbenchVO) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(num, o.num)
        && Internal.equals(desc, o.desc)
        && Internal.equals(nativeUrl, o.nativeUrl);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (num != null ? num.hashCode() : 0);
      result = result * 37 + (desc != null ? desc.hashCode() : 0);
      result = result * 37 + (nativeUrl != null ? nativeUrl.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (num != null) builder.append(", num=").append(num);
    if (desc != null) builder.append(", desc=").append(desc);
    if (nativeUrl != null) builder.append(", nativeUrl=").append(nativeUrl);
    return builder.replace(0, 2, "WorkbenchVO{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<WorkbenchVO, Builder> {
    public String num;

    public String desc;

    public String nativeUrl;

    public Builder() {
    }

    /**
     * 数据
     */
    public Builder num(String num) {
      this.num = num;
      return this;
    }

    /**
     * 数据简介
     */
    public Builder desc(String desc) {
      this.desc = desc;
      return this;
    }

    /**
     * 跳转url
     */
    public Builder nativeUrl(String nativeUrl) {
      this.nativeUrl = nativeUrl;
      return this;
    }

    @Override
    public WorkbenchVO build() {
      return new WorkbenchVO(num, desc, nativeUrl, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_WorkbenchVO extends ProtoAdapter<WorkbenchVO> {
    ProtoAdapter_WorkbenchVO() {
      super(FieldEncoding.LENGTH_DELIMITED, WorkbenchVO.class);
    }

    @Override
    public int encodedSize(WorkbenchVO value) {
      return (value.num != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.num) : 0)
          + (value.desc != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.desc) : 0)
          + (value.nativeUrl != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.nativeUrl) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, WorkbenchVO value) throws IOException {
      if (value.num != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.num);
      if (value.desc != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.desc);
      if (value.nativeUrl != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.nativeUrl);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public WorkbenchVO decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.num(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.desc(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.nativeUrl(ProtoAdapter.STRING.decode(reader)); break;
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
    public WorkbenchVO redact(WorkbenchVO value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
