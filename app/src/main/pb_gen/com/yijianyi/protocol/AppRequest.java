// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: Interface.proto at 37:1
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

public final class AppRequest extends Message<AppRequest, AppRequest.Builder> {
  public static final ProtoAdapter<AppRequest> ADAPTER = new ProtoAdapter_AppRequest();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_REQUESTID = 0;

  public static final Integer DEFAULT_VERSION = 0;

  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.ReqHead#ADAPTER"
  )
  public final ReqHead head;

  /**
   * lbs原始信息
   */
  @WireField(
      tag = 2,
      adapter = "com.yijianyi.protocol.LbsData#ADAPTER"
  )
  public final LbsData gpsInfo;

  /**
   * 请求序列号，需要在Response中返回
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer requestId;

  /**
   * 表明当前协议的版本号
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer version;

  @WireField(
      tag = 5,
      adapter = "com.yijianyi.protocol.RequestItem#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<RequestItem> reqs;

  public AppRequest(ReqHead head, LbsData gpsInfo, Integer requestId, Integer version, List<RequestItem> reqs) {
    this(head, gpsInfo, requestId, version, reqs, ByteString.EMPTY);
  }

  public AppRequest(ReqHead head, LbsData gpsInfo, Integer requestId, Integer version, List<RequestItem> reqs, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.head = head;
    this.gpsInfo = gpsInfo;
    this.requestId = requestId;
    this.version = version;
    this.reqs = Internal.immutableCopyOf("reqs", reqs);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.head = head;
    builder.gpsInfo = gpsInfo;
    builder.requestId = requestId;
    builder.version = version;
    builder.reqs = Internal.copyOf("reqs", reqs);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AppRequest)) return false;
    AppRequest o = (AppRequest) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(head, o.head)
        && Internal.equals(gpsInfo, o.gpsInfo)
        && Internal.equals(requestId, o.requestId)
        && Internal.equals(version, o.version)
        && reqs.equals(o.reqs);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (head != null ? head.hashCode() : 0);
      result = result * 37 + (gpsInfo != null ? gpsInfo.hashCode() : 0);
      result = result * 37 + (requestId != null ? requestId.hashCode() : 0);
      result = result * 37 + (version != null ? version.hashCode() : 0);
      result = result * 37 + reqs.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (head != null) builder.append(", head=").append(head);
    if (gpsInfo != null) builder.append(", gpsInfo=").append(gpsInfo);
    if (requestId != null) builder.append(", requestId=").append(requestId);
    if (version != null) builder.append(", version=").append(version);
    if (!reqs.isEmpty()) builder.append(", reqs=").append(reqs);
    return builder.replace(0, 2, "AppRequest{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<AppRequest, Builder> {
    public ReqHead head;

    public LbsData gpsInfo;

    public Integer requestId;

    public Integer version;

    public List<RequestItem> reqs;

    public Builder() {
      reqs = Internal.newMutableList();
    }

    public Builder head(ReqHead head) {
      this.head = head;
      return this;
    }

    /**
     * lbs原始信息
     */
    public Builder gpsInfo(LbsData gpsInfo) {
      this.gpsInfo = gpsInfo;
      return this;
    }

    /**
     * 请求序列号，需要在Response中返回
     */
    public Builder requestId(Integer requestId) {
      this.requestId = requestId;
      return this;
    }

    /**
     * 表明当前协议的版本号
     */
    public Builder version(Integer version) {
      this.version = version;
      return this;
    }

    public Builder reqs(List<RequestItem> reqs) {
      Internal.checkElementsNotNull(reqs);
      this.reqs = reqs;
      return this;
    }

    @Override
    public AppRequest build() {
      return new AppRequest(head, gpsInfo, requestId, version, reqs, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_AppRequest extends ProtoAdapter<AppRequest> {
    ProtoAdapter_AppRequest() {
      super(FieldEncoding.LENGTH_DELIMITED, AppRequest.class);
    }

    @Override
    public int encodedSize(AppRequest value) {
      return (value.head != null ? ReqHead.ADAPTER.encodedSizeWithTag(1, value.head) : 0)
          + (value.gpsInfo != null ? LbsData.ADAPTER.encodedSizeWithTag(2, value.gpsInfo) : 0)
          + (value.requestId != null ? ProtoAdapter.UINT32.encodedSizeWithTag(3, value.requestId) : 0)
          + (value.version != null ? ProtoAdapter.UINT32.encodedSizeWithTag(4, value.version) : 0)
          + RequestItem.ADAPTER.asRepeated().encodedSizeWithTag(5, value.reqs)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, AppRequest value) throws IOException {
      if (value.head != null) ReqHead.ADAPTER.encodeWithTag(writer, 1, value.head);
      if (value.gpsInfo != null) LbsData.ADAPTER.encodeWithTag(writer, 2, value.gpsInfo);
      if (value.requestId != null) ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.requestId);
      if (value.version != null) ProtoAdapter.UINT32.encodeWithTag(writer, 4, value.version);
      RequestItem.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.reqs);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public AppRequest decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.head(ReqHead.ADAPTER.decode(reader)); break;
          case 2: builder.gpsInfo(LbsData.ADAPTER.decode(reader)); break;
          case 3: builder.requestId(ProtoAdapter.UINT32.decode(reader)); break;
          case 4: builder.version(ProtoAdapter.UINT32.decode(reader)); break;
          case 5: builder.reqs.add(RequestItem.ADAPTER.decode(reader)); break;
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
    public AppRequest redact(AppRequest value) {
      Builder builder = value.newBuilder();
      if (builder.head != null) builder.head = ReqHead.ADAPTER.redact(builder.head);
      if (builder.gpsInfo != null) builder.gpsInfo = LbsData.ADAPTER.redact(builder.gpsInfo);
      Internal.redactElements(builder.reqs, RequestItem.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
