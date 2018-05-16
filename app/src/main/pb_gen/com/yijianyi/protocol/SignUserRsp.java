// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 846:1
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
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * saasApp注册信息
 */
public final class SignUserRsp extends Message<SignUserRsp, SignUserRsp.Builder> {
  public static final ProtoAdapter<SignUserRsp> ADAPTER = new ProtoAdapter_SignUserRsp();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_USERID = 0L;

  public static final Boolean DEFAULT_ISCOMPLETE = false;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long userId;

  /**
   * 用户信息是否完善
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean isComplete;

  public SignUserRsp(Long userId, Boolean isComplete) {
    this(userId, isComplete, ByteString.EMPTY);
  }

  public SignUserRsp(Long userId, Boolean isComplete, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.userId = userId;
    this.isComplete = isComplete;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.userId = userId;
    builder.isComplete = isComplete;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof SignUserRsp)) return false;
    SignUserRsp o = (SignUserRsp) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(userId, o.userId)
        && Internal.equals(isComplete, o.isComplete);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (userId != null ? userId.hashCode() : 0);
      result = result * 37 + (isComplete != null ? isComplete.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (userId != null) builder.append(", userId=").append(userId);
    if (isComplete != null) builder.append(", isComplete=").append(isComplete);
    return builder.replace(0, 2, "SignUserRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<SignUserRsp, Builder> {
    public Long userId;

    public Boolean isComplete;

    public Builder() {
    }

    public Builder userId(Long userId) {
      this.userId = userId;
      return this;
    }

    /**
     * 用户信息是否完善
     */
    public Builder isComplete(Boolean isComplete) {
      this.isComplete = isComplete;
      return this;
    }

    @Override
    public SignUserRsp build() {
      return new SignUserRsp(userId, isComplete, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_SignUserRsp extends ProtoAdapter<SignUserRsp> {
    ProtoAdapter_SignUserRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, SignUserRsp.class);
    }

    @Override
    public int encodedSize(SignUserRsp value) {
      return (value.userId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.userId) : 0)
          + (value.isComplete != null ? ProtoAdapter.BOOL.encodedSizeWithTag(2, value.isComplete) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, SignUserRsp value) throws IOException {
      if (value.userId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.userId);
      if (value.isComplete != null) ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.isComplete);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public SignUserRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.userId(ProtoAdapter.UINT64.decode(reader)); break;
          case 2: builder.isComplete(ProtoAdapter.BOOL.decode(reader)); break;
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
    public SignUserRsp redact(SignUserRsp value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}