// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: SaasModel.proto at 741:1
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

public final class OrgTagVO extends Message<OrgTagVO, OrgTagVO.Builder> {
  public static final ProtoAdapter<OrgTagVO> ADAPTER = new ProtoAdapter_OrgTagVO();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_TAGNAME = "";

  public static final Integer DEFAULT_COLOR = 0;

  public static final String DEFAULT_COLORSTR = "";

  public static final Integer DEFAULT_ORDER = 0;

  public static final Long DEFAULT_ORGID = 0L;

  public static final String DEFAULT_ORGNAME = "";

  /**
   * 标签名
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String tagName;

  /**
   * 标签颜色 1 #FFC362 2 #2BD6BD 3 #FD6565 4 #333333 5 #48A0DC
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer color;

  /**
   * 颜色字符串   eg:#FFC362
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String colorStr;

  /**
   * 排序字段
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer order;

  /**
   * 机构id
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long orgId;

  /**
   * 机构名
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orgName;

  public OrgTagVO(String tagName, Integer color, String colorStr, Integer order, Long orgId, String orgName) {
    this(tagName, color, colorStr, order, orgId, orgName, ByteString.EMPTY);
  }

  public OrgTagVO(String tagName, Integer color, String colorStr, Integer order, Long orgId, String orgName, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.tagName = tagName;
    this.color = color;
    this.colorStr = colorStr;
    this.order = order;
    this.orgId = orgId;
    this.orgName = orgName;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.tagName = tagName;
    builder.color = color;
    builder.colorStr = colorStr;
    builder.order = order;
    builder.orgId = orgId;
    builder.orgName = orgName;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof OrgTagVO)) return false;
    OrgTagVO o = (OrgTagVO) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(tagName, o.tagName)
        && Internal.equals(color, o.color)
        && Internal.equals(colorStr, o.colorStr)
        && Internal.equals(order, o.order)
        && Internal.equals(orgId, o.orgId)
        && Internal.equals(orgName, o.orgName);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (tagName != null ? tagName.hashCode() : 0);
      result = result * 37 + (color != null ? color.hashCode() : 0);
      result = result * 37 + (colorStr != null ? colorStr.hashCode() : 0);
      result = result * 37 + (order != null ? order.hashCode() : 0);
      result = result * 37 + (orgId != null ? orgId.hashCode() : 0);
      result = result * 37 + (orgName != null ? orgName.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (tagName != null) builder.append(", tagName=").append(tagName);
    if (color != null) builder.append(", color=").append(color);
    if (colorStr != null) builder.append(", colorStr=").append(colorStr);
    if (order != null) builder.append(", order=").append(order);
    if (orgId != null) builder.append(", orgId=").append(orgId);
    if (orgName != null) builder.append(", orgName=").append(orgName);
    return builder.replace(0, 2, "OrgTagVO{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<OrgTagVO, Builder> {
    public String tagName;

    public Integer color;

    public String colorStr;

    public Integer order;

    public Long orgId;

    public String orgName;

    public Builder() {
    }

    /**
     * 标签名
     */
    public Builder tagName(String tagName) {
      this.tagName = tagName;
      return this;
    }

    /**
     * 标签颜色 1 #FFC362 2 #2BD6BD 3 #FD6565 4 #333333 5 #48A0DC
     */
    public Builder color(Integer color) {
      this.color = color;
      return this;
    }

    /**
     * 颜色字符串   eg:#FFC362
     */
    public Builder colorStr(String colorStr) {
      this.colorStr = colorStr;
      return this;
    }

    /**
     * 排序字段
     */
    public Builder order(Integer order) {
      this.order = order;
      return this;
    }

    /**
     * 机构id
     */
    public Builder orgId(Long orgId) {
      this.orgId = orgId;
      return this;
    }

    /**
     * 机构名
     */
    public Builder orgName(String orgName) {
      this.orgName = orgName;
      return this;
    }

    @Override
    public OrgTagVO build() {
      return new OrgTagVO(tagName, color, colorStr, order, orgId, orgName, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_OrgTagVO extends ProtoAdapter<OrgTagVO> {
    ProtoAdapter_OrgTagVO() {
      super(FieldEncoding.LENGTH_DELIMITED, OrgTagVO.class);
    }

    @Override
    public int encodedSize(OrgTagVO value) {
      return (value.tagName != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.tagName) : 0)
          + (value.color != null ? ProtoAdapter.UINT32.encodedSizeWithTag(2, value.color) : 0)
          + (value.colorStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.colorStr) : 0)
          + (value.order != null ? ProtoAdapter.UINT32.encodedSizeWithTag(4, value.order) : 0)
          + (value.orgId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(5, value.orgId) : 0)
          + (value.orgName != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.orgName) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, OrgTagVO value) throws IOException {
      if (value.tagName != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.tagName);
      if (value.color != null) ProtoAdapter.UINT32.encodeWithTag(writer, 2, value.color);
      if (value.colorStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.colorStr);
      if (value.order != null) ProtoAdapter.UINT32.encodeWithTag(writer, 4, value.order);
      if (value.orgId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 5, value.orgId);
      if (value.orgName != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.orgName);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public OrgTagVO decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.tagName(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.color(ProtoAdapter.UINT32.decode(reader)); break;
          case 3: builder.colorStr(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.order(ProtoAdapter.UINT32.decode(reader)); break;
          case 5: builder.orgId(ProtoAdapter.UINT64.decode(reader)); break;
          case 6: builder.orgName(ProtoAdapter.STRING.decode(reader)); break;
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
    public OrgTagVO redact(OrgTagVO value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
