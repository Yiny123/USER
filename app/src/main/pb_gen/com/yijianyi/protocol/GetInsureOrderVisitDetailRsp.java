// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1804:1
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
 * 获取回访详情（主体）
 */
public final class GetInsureOrderVisitDetailRsp extends Message<GetInsureOrderVisitDetailRsp, GetInsureOrderVisitDetailRsp.Builder> {
  public static final ProtoAdapter<GetInsureOrderVisitDetailRsp> ADAPTER = new ProtoAdapter_GetInsureOrderVisitDetailRsp();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_VISITTIMESTR = "";

  public static final String DEFAULT_VISITSTARTTIMESTR = "";

  public static final String DEFAULT_VISITENDTIMESTR = "";

  public static final String DEFAULT_CREATETIMESTR = "";

  public static final String DEFAULT_FINISHTIMESTR = "";

  public static final String DEFAULT_RELATIONIMGURL = "";

  public static final String DEFAULT_HGIMGURL = "";

  public static final String DEFAULT_RELATIONIMGID = "";

  public static final String DEFAULT_HGIMGID = "";

  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.InsureOrderVisit#ADAPTER"
  )
  public final InsureOrderVisit visit;

  /**
   * 回访时间Str
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String visitTimeStr;

  /**
   * 回访开始时间Str
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String visitStartTimeStr;

  /**
   * 回访结束时间Str
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String visitEndTimeStr;

  /**
   * 创建时间
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String createTimeStr;

  /**
   * 完成时间
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String finishTimeStr;

  /**
   * 家属签名图片url
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String relationImgUrl;

  /**
   * 护工图片url
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String hgImgUrl;

  /**
   * 家属签名图片id
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String relationImgId;

  /**
   * 护工图片id
   */
  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String hgImgId;

  public GetInsureOrderVisitDetailRsp(InsureOrderVisit visit, String visitTimeStr, String visitStartTimeStr, String visitEndTimeStr, String createTimeStr, String finishTimeStr, String relationImgUrl, String hgImgUrl, String relationImgId, String hgImgId) {
    this(visit, visitTimeStr, visitStartTimeStr, visitEndTimeStr, createTimeStr, finishTimeStr, relationImgUrl, hgImgUrl, relationImgId, hgImgId, ByteString.EMPTY);
  }

  public GetInsureOrderVisitDetailRsp(InsureOrderVisit visit, String visitTimeStr, String visitStartTimeStr, String visitEndTimeStr, String createTimeStr, String finishTimeStr, String relationImgUrl, String hgImgUrl, String relationImgId, String hgImgId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.visit = visit;
    this.visitTimeStr = visitTimeStr;
    this.visitStartTimeStr = visitStartTimeStr;
    this.visitEndTimeStr = visitEndTimeStr;
    this.createTimeStr = createTimeStr;
    this.finishTimeStr = finishTimeStr;
    this.relationImgUrl = relationImgUrl;
    this.hgImgUrl = hgImgUrl;
    this.relationImgId = relationImgId;
    this.hgImgId = hgImgId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.visit = visit;
    builder.visitTimeStr = visitTimeStr;
    builder.visitStartTimeStr = visitStartTimeStr;
    builder.visitEndTimeStr = visitEndTimeStr;
    builder.createTimeStr = createTimeStr;
    builder.finishTimeStr = finishTimeStr;
    builder.relationImgUrl = relationImgUrl;
    builder.hgImgUrl = hgImgUrl;
    builder.relationImgId = relationImgId;
    builder.hgImgId = hgImgId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetInsureOrderVisitDetailRsp)) return false;
    GetInsureOrderVisitDetailRsp o = (GetInsureOrderVisitDetailRsp) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(visit, o.visit)
        && Internal.equals(visitTimeStr, o.visitTimeStr)
        && Internal.equals(visitStartTimeStr, o.visitStartTimeStr)
        && Internal.equals(visitEndTimeStr, o.visitEndTimeStr)
        && Internal.equals(createTimeStr, o.createTimeStr)
        && Internal.equals(finishTimeStr, o.finishTimeStr)
        && Internal.equals(relationImgUrl, o.relationImgUrl)
        && Internal.equals(hgImgUrl, o.hgImgUrl)
        && Internal.equals(relationImgId, o.relationImgId)
        && Internal.equals(hgImgId, o.hgImgId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (visit != null ? visit.hashCode() : 0);
      result = result * 37 + (visitTimeStr != null ? visitTimeStr.hashCode() : 0);
      result = result * 37 + (visitStartTimeStr != null ? visitStartTimeStr.hashCode() : 0);
      result = result * 37 + (visitEndTimeStr != null ? visitEndTimeStr.hashCode() : 0);
      result = result * 37 + (createTimeStr != null ? createTimeStr.hashCode() : 0);
      result = result * 37 + (finishTimeStr != null ? finishTimeStr.hashCode() : 0);
      result = result * 37 + (relationImgUrl != null ? relationImgUrl.hashCode() : 0);
      result = result * 37 + (hgImgUrl != null ? hgImgUrl.hashCode() : 0);
      result = result * 37 + (relationImgId != null ? relationImgId.hashCode() : 0);
      result = result * 37 + (hgImgId != null ? hgImgId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (visit != null) builder.append(", visit=").append(visit);
    if (visitTimeStr != null) builder.append(", visitTimeStr=").append(visitTimeStr);
    if (visitStartTimeStr != null) builder.append(", visitStartTimeStr=").append(visitStartTimeStr);
    if (visitEndTimeStr != null) builder.append(", visitEndTimeStr=").append(visitEndTimeStr);
    if (createTimeStr != null) builder.append(", createTimeStr=").append(createTimeStr);
    if (finishTimeStr != null) builder.append(", finishTimeStr=").append(finishTimeStr);
    if (relationImgUrl != null) builder.append(", relationImgUrl=").append(relationImgUrl);
    if (hgImgUrl != null) builder.append(", hgImgUrl=").append(hgImgUrl);
    if (relationImgId != null) builder.append(", relationImgId=").append(relationImgId);
    if (hgImgId != null) builder.append(", hgImgId=").append(hgImgId);
    return builder.replace(0, 2, "GetInsureOrderVisitDetailRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetInsureOrderVisitDetailRsp, Builder> {
    public InsureOrderVisit visit;

    public String visitTimeStr;

    public String visitStartTimeStr;

    public String visitEndTimeStr;

    public String createTimeStr;

    public String finishTimeStr;

    public String relationImgUrl;

    public String hgImgUrl;

    public String relationImgId;

    public String hgImgId;

    public Builder() {
    }

    public Builder visit(InsureOrderVisit visit) {
      this.visit = visit;
      return this;
    }

    /**
     * 回访时间Str
     */
    public Builder visitTimeStr(String visitTimeStr) {
      this.visitTimeStr = visitTimeStr;
      return this;
    }

    /**
     * 回访开始时间Str
     */
    public Builder visitStartTimeStr(String visitStartTimeStr) {
      this.visitStartTimeStr = visitStartTimeStr;
      return this;
    }

    /**
     * 回访结束时间Str
     */
    public Builder visitEndTimeStr(String visitEndTimeStr) {
      this.visitEndTimeStr = visitEndTimeStr;
      return this;
    }

    /**
     * 创建时间
     */
    public Builder createTimeStr(String createTimeStr) {
      this.createTimeStr = createTimeStr;
      return this;
    }

    /**
     * 完成时间
     */
    public Builder finishTimeStr(String finishTimeStr) {
      this.finishTimeStr = finishTimeStr;
      return this;
    }

    /**
     * 家属签名图片url
     */
    public Builder relationImgUrl(String relationImgUrl) {
      this.relationImgUrl = relationImgUrl;
      return this;
    }

    /**
     * 护工图片url
     */
    public Builder hgImgUrl(String hgImgUrl) {
      this.hgImgUrl = hgImgUrl;
      return this;
    }

    /**
     * 家属签名图片id
     */
    public Builder relationImgId(String relationImgId) {
      this.relationImgId = relationImgId;
      return this;
    }

    /**
     * 护工图片id
     */
    public Builder hgImgId(String hgImgId) {
      this.hgImgId = hgImgId;
      return this;
    }

    @Override
    public GetInsureOrderVisitDetailRsp build() {
      return new GetInsureOrderVisitDetailRsp(visit, visitTimeStr, visitStartTimeStr, visitEndTimeStr, createTimeStr, finishTimeStr, relationImgUrl, hgImgUrl, relationImgId, hgImgId, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetInsureOrderVisitDetailRsp extends ProtoAdapter<GetInsureOrderVisitDetailRsp> {
    ProtoAdapter_GetInsureOrderVisitDetailRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, GetInsureOrderVisitDetailRsp.class);
    }

    @Override
    public int encodedSize(GetInsureOrderVisitDetailRsp value) {
      return (value.visit != null ? InsureOrderVisit.ADAPTER.encodedSizeWithTag(1, value.visit) : 0)
          + (value.visitTimeStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.visitTimeStr) : 0)
          + (value.visitStartTimeStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.visitStartTimeStr) : 0)
          + (value.visitEndTimeStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.visitEndTimeStr) : 0)
          + (value.createTimeStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, value.createTimeStr) : 0)
          + (value.finishTimeStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.finishTimeStr) : 0)
          + (value.relationImgUrl != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, value.relationImgUrl) : 0)
          + (value.hgImgUrl != null ? ProtoAdapter.STRING.encodedSizeWithTag(8, value.hgImgUrl) : 0)
          + (value.relationImgId != null ? ProtoAdapter.STRING.encodedSizeWithTag(9, value.relationImgId) : 0)
          + (value.hgImgId != null ? ProtoAdapter.STRING.encodedSizeWithTag(10, value.hgImgId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetInsureOrderVisitDetailRsp value) throws IOException {
      if (value.visit != null) InsureOrderVisit.ADAPTER.encodeWithTag(writer, 1, value.visit);
      if (value.visitTimeStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.visitTimeStr);
      if (value.visitStartTimeStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.visitStartTimeStr);
      if (value.visitEndTimeStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.visitEndTimeStr);
      if (value.createTimeStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 5, value.createTimeStr);
      if (value.finishTimeStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.finishTimeStr);
      if (value.relationImgUrl != null) ProtoAdapter.STRING.encodeWithTag(writer, 7, value.relationImgUrl);
      if (value.hgImgUrl != null) ProtoAdapter.STRING.encodeWithTag(writer, 8, value.hgImgUrl);
      if (value.relationImgId != null) ProtoAdapter.STRING.encodeWithTag(writer, 9, value.relationImgId);
      if (value.hgImgId != null) ProtoAdapter.STRING.encodeWithTag(writer, 10, value.hgImgId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetInsureOrderVisitDetailRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.visit(InsureOrderVisit.ADAPTER.decode(reader)); break;
          case 2: builder.visitTimeStr(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.visitStartTimeStr(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.visitEndTimeStr(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.createTimeStr(ProtoAdapter.STRING.decode(reader)); break;
          case 6: builder.finishTimeStr(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.relationImgUrl(ProtoAdapter.STRING.decode(reader)); break;
          case 8: builder.hgImgUrl(ProtoAdapter.STRING.decode(reader)); break;
          case 9: builder.relationImgId(ProtoAdapter.STRING.decode(reader)); break;
          case 10: builder.hgImgId(ProtoAdapter.STRING.decode(reader)); break;
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
    public GetInsureOrderVisitDetailRsp redact(GetInsureOrderVisitDetailRsp value) {
      Builder builder = value.newBuilder();
      if (builder.visit != null) builder.visit = InsureOrderVisit.ADAPTER.redact(builder.visit);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
