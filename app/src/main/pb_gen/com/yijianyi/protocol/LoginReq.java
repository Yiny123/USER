// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 25:1
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
 * 短信登陆
 */
public final class LoginReq extends Message<LoginReq, LoginReq.Builder> {
  public static final ProtoAdapter<LoginReq> ADAPTER = new ProtoAdapter_LoginReq();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_PHONE = "";

  public static final String DEFAULT_CODE = "";

  public static final Source DEFAULT_SOURCE = Source.USER;

  public static final String DEFAULT_JPUSHID = "";

  /**
   * 手机号
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String phone;

  /**
   * 验证码
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String code;

  /**
   * 来源标识
   */
  @WireField(
      tag = 3,
      adapter = "com.yijianyi.protocol.Source#ADAPTER"
  )
  public final Source source;

  /**
   * 极光推送ID(IOS才有)
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String jpushId;

  public LoginReq(String phone, String code, Source source, String jpushId) {
    this(phone, code, source, jpushId, ByteString.EMPTY);
  }

  public LoginReq(String phone, String code, Source source, String jpushId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.phone = phone;
    this.code = code;
    this.source = source;
    this.jpushId = jpushId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.phone = phone;
    builder.code = code;
    builder.source = source;
    builder.jpushId = jpushId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof LoginReq)) return false;
    LoginReq o = (LoginReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(phone, o.phone)
        && Internal.equals(code, o.code)
        && Internal.equals(source, o.source)
        && Internal.equals(jpushId, o.jpushId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (phone != null ? phone.hashCode() : 0);
      result = result * 37 + (code != null ? code.hashCode() : 0);
      result = result * 37 + (source != null ? source.hashCode() : 0);
      result = result * 37 + (jpushId != null ? jpushId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (phone != null) builder.append(", phone=").append(phone);
    if (code != null) builder.append(", code=").append(code);
    if (source != null) builder.append(", source=").append(source);
    if (jpushId != null) builder.append(", jpushId=").append(jpushId);
    return builder.replace(0, 2, "LoginReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<LoginReq, Builder> {
    public String phone;

    public String code;

    public Source source;

    public String jpushId;

    public Builder() {
    }

    /**
     * 手机号
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * 验证码
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * 来源标识
     */
    public Builder source(Source source) {
      this.source = source;
      return this;
    }

    /**
     * 极光推送ID(IOS才有)
     */
    public Builder jpushId(String jpushId) {
      this.jpushId = jpushId;
      return this;
    }

    @Override
    public LoginReq build() {
      return new LoginReq(phone, code, source, jpushId, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_LoginReq extends ProtoAdapter<LoginReq> {
    ProtoAdapter_LoginReq() {
      super(FieldEncoding.LENGTH_DELIMITED, LoginReq.class);
    }

    @Override
    public int encodedSize(LoginReq value) {
      return (value.phone != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.phone) : 0)
          + (value.code != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.code) : 0)
          + (value.source != null ? Source.ADAPTER.encodedSizeWithTag(3, value.source) : 0)
          + (value.jpushId != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.jpushId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, LoginReq value) throws IOException {
      if (value.phone != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.phone);
      if (value.code != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.code);
      if (value.source != null) Source.ADAPTER.encodeWithTag(writer, 3, value.source);
      if (value.jpushId != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.jpushId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public LoginReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.phone(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.code(ProtoAdapter.STRING.decode(reader)); break;
          case 3: {
            try {
              builder.source(Source.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 4: builder.jpushId(ProtoAdapter.STRING.decode(reader)); break;
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
    public LoginReq redact(LoginReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
