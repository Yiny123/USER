// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1354:1
package com.yijianyi.protocol;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * 通过his用住院号获取用户信息
 */
public final class GetUserInfoByOrgNOReq extends Message<GetUserInfoByOrgNOReq, GetUserInfoByOrgNOReq.Builder> {
  public static final ProtoAdapter<GetUserInfoByOrgNOReq> ADAPTER = new ProtoAdapter_GetUserInfoByOrgNOReq();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ORGNO = "";

  public static final Long DEFAULT_ORGID = 0L;

  /**
   * 住院号
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orgNO;

  /**
   * 机构id
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long orgId;

  public GetUserInfoByOrgNOReq(String orgNO, Long orgId) {
    this(orgNO, orgId, ByteString.EMPTY);
  }

  public GetUserInfoByOrgNOReq(String orgNO, Long orgId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.orgNO = orgNO;
    this.orgId = orgId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.orgNO = orgNO;
    builder.orgId = orgId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetUserInfoByOrgNOReq)) return false;
    GetUserInfoByOrgNOReq o = (GetUserInfoByOrgNOReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(orgNO, o.orgNO)
        && Internal.equals(orgId, o.orgId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (orgNO != null ? orgNO.hashCode() : 0);
      result = result * 37 + (orgId != null ? orgId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (orgNO != null) builder.append(", orgNO=").append(orgNO);
    if (orgId != null) builder.append(", orgId=").append(orgId);
    return builder.replace(0, 2, "GetUserInfoByOrgNOReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetUserInfoByOrgNOReq, Builder> {
    public String orgNO;

    public Long orgId;

    public Builder() {
    }

    /**
     * 住院号
     */
    public Builder orgNO(String orgNO) {
      this.orgNO = orgNO;
      return this;
    }

    /**
     * 机构id
     */
    public Builder orgId(Long orgId) {
      this.orgId = orgId;
      return this;
    }

    @Override
    public GetUserInfoByOrgNOReq build() {
      return new GetUserInfoByOrgNOReq(orgNO, orgId, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetUserInfoByOrgNOReq extends ProtoAdapter<GetUserInfoByOrgNOReq> {
    ProtoAdapter_GetUserInfoByOrgNOReq() {
      super(FieldEncoding.LENGTH_DELIMITED, GetUserInfoByOrgNOReq.class);
    }

    @Override
    public int encodedSize(GetUserInfoByOrgNOReq value) {
      return (value.orgNO != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.orgNO) : 0)
          + (value.orgId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(2, value.orgId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetUserInfoByOrgNOReq value) throws IOException {
      if (value.orgNO != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.orgNO);
      if (value.orgId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 2, value.orgId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetUserInfoByOrgNOReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.orgNO(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.orgId(ProtoAdapter.UINT64.decode(reader)); break;
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
    public GetUserInfoByOrgNOReq redact(GetUserInfoByOrgNOReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}