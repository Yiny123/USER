// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 592:1
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

/**
 * 获取长护险申请进度详情
 */
public final class GetInsureReq extends Message<GetInsureReq, GetInsureReq.Builder> {
  public static final ProtoAdapter<GetInsureReq> ADAPTER = new ProtoAdapter_GetInsureReq();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_INSURENO = "";

  public static final Integer DEFAULT_ASSESSTYPE = 0;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String insureNO;

  /**
   * 获取adl评分的类型：0：护士评估adl  1：用户自评 adl
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer assessType;

  public GetInsureReq(String insureNO, Integer assessType) {
    this(insureNO, assessType, ByteString.EMPTY);
  }

  public GetInsureReq(String insureNO, Integer assessType, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.insureNO = insureNO;
    this.assessType = assessType;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.insureNO = insureNO;
    builder.assessType = assessType;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetInsureReq)) return false;
    GetInsureReq o = (GetInsureReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(insureNO, o.insureNO)
        && Internal.equals(assessType, o.assessType);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (insureNO != null ? insureNO.hashCode() : 0);
      result = result * 37 + (assessType != null ? assessType.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (insureNO != null) builder.append(", insureNO=").append(insureNO);
    if (assessType != null) builder.append(", assessType=").append(assessType);
    return builder.replace(0, 2, "GetInsureReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetInsureReq, Builder> {
    public String insureNO;

    public Integer assessType;

    public Builder() {
    }

    public Builder insureNO(String insureNO) {
      this.insureNO = insureNO;
      return this;
    }

    /**
     * 获取adl评分的类型：0：护士评估adl  1：用户自评 adl
     */
    public Builder assessType(Integer assessType) {
      this.assessType = assessType;
      return this;
    }

    @Override
    public GetInsureReq build() {
      return new GetInsureReq(insureNO, assessType, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetInsureReq extends ProtoAdapter<GetInsureReq> {
    ProtoAdapter_GetInsureReq() {
      super(FieldEncoding.LENGTH_DELIMITED, GetInsureReq.class);
    }

    @Override
    public int encodedSize(GetInsureReq value) {
      return (value.insureNO != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.insureNO) : 0)
          + (value.assessType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(2, value.assessType) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetInsureReq value) throws IOException {
      if (value.insureNO != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.insureNO);
      if (value.assessType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 2, value.assessType);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetInsureReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.insureNO(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.assessType(ProtoAdapter.UINT32.decode(reader)); break;
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
    public GetInsureReq redact(GetInsureReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
