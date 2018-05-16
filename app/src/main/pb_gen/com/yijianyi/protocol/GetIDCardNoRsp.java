// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 307:1
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
 * 获取身份证号码的响应协议
 */
public final class GetIDCardNoRsp extends Message<GetIDCardNoRsp, GetIDCardNoRsp.Builder> {
  public static final ProtoAdapter<GetIDCardNoRsp> ADAPTER = new ProtoAdapter_GetIDCardNoRsp();

  private static final long serialVersionUID = 0L;

  /**
   * 身份证信息
   */
  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.IDCardInfo#ADAPTER"
  )
  public final IDCardInfo idInfo;

  public GetIDCardNoRsp(IDCardInfo idInfo) {
    this(idInfo, ByteString.EMPTY);
  }

  public GetIDCardNoRsp(IDCardInfo idInfo, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.idInfo = idInfo;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.idInfo = idInfo;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetIDCardNoRsp)) return false;
    GetIDCardNoRsp o = (GetIDCardNoRsp) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(idInfo, o.idInfo);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (idInfo != null ? idInfo.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (idInfo != null) builder.append(", idInfo=").append(idInfo);
    return builder.replace(0, 2, "GetIDCardNoRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetIDCardNoRsp, Builder> {
    public IDCardInfo idInfo;

    public Builder() {
    }

    /**
     * 身份证信息
     */
    public Builder idInfo(IDCardInfo idInfo) {
      this.idInfo = idInfo;
      return this;
    }

    @Override
    public GetIDCardNoRsp build() {
      return new GetIDCardNoRsp(idInfo, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetIDCardNoRsp extends ProtoAdapter<GetIDCardNoRsp> {
    ProtoAdapter_GetIDCardNoRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, GetIDCardNoRsp.class);
    }

    @Override
    public int encodedSize(GetIDCardNoRsp value) {
      return (value.idInfo != null ? IDCardInfo.ADAPTER.encodedSizeWithTag(1, value.idInfo) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetIDCardNoRsp value) throws IOException {
      if (value.idInfo != null) IDCardInfo.ADAPTER.encodeWithTag(writer, 1, value.idInfo);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetIDCardNoRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.idInfo(IDCardInfo.ADAPTER.decode(reader)); break;
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
    public GetIDCardNoRsp redact(GetIDCardNoRsp value) {
      Builder builder = value.newBuilder();
      if (builder.idInfo != null) builder.idInfo = IDCardInfo.ADAPTER.redact(builder.idInfo);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
