// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: Interface.proto at 16:1
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
 * 返回错误信息
 */
public final class AppError extends Message<AppError, AppError.Builder> {
  public static final ProtoAdapter<AppError> ADAPTER = new ProtoAdapter_AppError();

  private static final long serialVersionUID = 0L;

  public static final APP_ERROR_CODE DEFAULT_ERRORCODE = APP_ERROR_CODE.AEC_SUCCESS;

  public static final String DEFAULT_MSG = "";

  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.APP_ERROR_CODE#ADAPTER"
  )
  public final APP_ERROR_CODE errorCode;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String msg;

  public AppError(APP_ERROR_CODE errorCode, String msg) {
    this(errorCode, msg, ByteString.EMPTY);
  }

  public AppError(APP_ERROR_CODE errorCode, String msg, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.errorCode = errorCode;
    this.msg = msg;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.errorCode = errorCode;
    builder.msg = msg;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AppError)) return false;
    AppError o = (AppError) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(errorCode, o.errorCode)
        && Internal.equals(msg, o.msg);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (errorCode != null ? errorCode.hashCode() : 0);
      result = result * 37 + (msg != null ? msg.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (errorCode != null) builder.append(", errorCode=").append(errorCode);
    if (msg != null) builder.append(", msg=").append(msg);
    return builder.replace(0, 2, "AppError{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<AppError, Builder> {
    public APP_ERROR_CODE errorCode;

    public String msg;

    public Builder() {
    }

    public Builder errorCode(APP_ERROR_CODE errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    public Builder msg(String msg) {
      this.msg = msg;
      return this;
    }

    @Override
    public AppError build() {
      return new AppError(errorCode, msg, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_AppError extends ProtoAdapter<AppError> {
    ProtoAdapter_AppError() {
      super(FieldEncoding.LENGTH_DELIMITED, AppError.class);
    }

    @Override
    public int encodedSize(AppError value) {
      return (value.errorCode != null ? APP_ERROR_CODE.ADAPTER.encodedSizeWithTag(1, value.errorCode) : 0)
          + (value.msg != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.msg) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, AppError value) throws IOException {
      if (value.errorCode != null) APP_ERROR_CODE.ADAPTER.encodeWithTag(writer, 1, value.errorCode);
      if (value.msg != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.msg);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public AppError decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: {
            try {
              builder.errorCode(APP_ERROR_CODE.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 2: builder.msg(ProtoAdapter.STRING.decode(reader)); break;
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
    public AppError redact(AppError value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
