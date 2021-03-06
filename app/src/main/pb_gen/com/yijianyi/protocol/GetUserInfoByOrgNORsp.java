// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1358:1
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

public final class GetUserInfoByOrgNORsp extends Message<GetUserInfoByOrgNORsp, GetUserInfoByOrgNORsp.Builder> {
  public static final ProtoAdapter<GetUserInfoByOrgNORsp> ADAPTER = new ProtoAdapter_GetUserInfoByOrgNORsp();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_RSPFLAG = 0;

  public static final String DEFAULT_ERRORMSG = "";

  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.HospitalBra#ADAPTER"
  )
  public final HospitalBra bra;

  /**
   * 0-成功返回 1-第三方系统异常，可以直接去下单页 10-格式错误，提示报错 11-未查询到用户信息
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer rspFlag;

  /**
   * 错误提示
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String errorMsg;

  public GetUserInfoByOrgNORsp(HospitalBra bra, Integer rspFlag, String errorMsg) {
    this(bra, rspFlag, errorMsg, ByteString.EMPTY);
  }

  public GetUserInfoByOrgNORsp(HospitalBra bra, Integer rspFlag, String errorMsg, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.bra = bra;
    this.rspFlag = rspFlag;
    this.errorMsg = errorMsg;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.bra = bra;
    builder.rspFlag = rspFlag;
    builder.errorMsg = errorMsg;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetUserInfoByOrgNORsp)) return false;
    GetUserInfoByOrgNORsp o = (GetUserInfoByOrgNORsp) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(bra, o.bra)
        && Internal.equals(rspFlag, o.rspFlag)
        && Internal.equals(errorMsg, o.errorMsg);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (bra != null ? bra.hashCode() : 0);
      result = result * 37 + (rspFlag != null ? rspFlag.hashCode() : 0);
      result = result * 37 + (errorMsg != null ? errorMsg.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (bra != null) builder.append(", bra=").append(bra);
    if (rspFlag != null) builder.append(", rspFlag=").append(rspFlag);
    if (errorMsg != null) builder.append(", errorMsg=").append(errorMsg);
    return builder.replace(0, 2, "GetUserInfoByOrgNORsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetUserInfoByOrgNORsp, Builder> {
    public HospitalBra bra;

    public Integer rspFlag;

    public String errorMsg;

    public Builder() {
    }

    public Builder bra(HospitalBra bra) {
      this.bra = bra;
      return this;
    }

    /**
     * 0-成功返回 1-第三方系统异常，可以直接去下单页 10-格式错误，提示报错 11-未查询到用户信息
     */
    public Builder rspFlag(Integer rspFlag) {
      this.rspFlag = rspFlag;
      return this;
    }

    /**
     * 错误提示
     */
    public Builder errorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
      return this;
    }

    @Override
    public GetUserInfoByOrgNORsp build() {
      return new GetUserInfoByOrgNORsp(bra, rspFlag, errorMsg, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetUserInfoByOrgNORsp extends ProtoAdapter<GetUserInfoByOrgNORsp> {
    ProtoAdapter_GetUserInfoByOrgNORsp() {
      super(FieldEncoding.LENGTH_DELIMITED, GetUserInfoByOrgNORsp.class);
    }

    @Override
    public int encodedSize(GetUserInfoByOrgNORsp value) {
      return (value.bra != null ? HospitalBra.ADAPTER.encodedSizeWithTag(1, value.bra) : 0)
          + (value.rspFlag != null ? ProtoAdapter.UINT32.encodedSizeWithTag(2, value.rspFlag) : 0)
          + (value.errorMsg != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.errorMsg) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetUserInfoByOrgNORsp value) throws IOException {
      if (value.bra != null) HospitalBra.ADAPTER.encodeWithTag(writer, 1, value.bra);
      if (value.rspFlag != null) ProtoAdapter.UINT32.encodeWithTag(writer, 2, value.rspFlag);
      if (value.errorMsg != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.errorMsg);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetUserInfoByOrgNORsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.bra(HospitalBra.ADAPTER.decode(reader)); break;
          case 2: builder.rspFlag(ProtoAdapter.UINT32.decode(reader)); break;
          case 3: builder.errorMsg(ProtoAdapter.STRING.decode(reader)); break;
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
    public GetUserInfoByOrgNORsp redact(GetUserInfoByOrgNORsp value) {
      Builder builder = value.newBuilder();
      if (builder.bra != null) builder.bra = HospitalBra.ADAPTER.redact(builder.bra);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
