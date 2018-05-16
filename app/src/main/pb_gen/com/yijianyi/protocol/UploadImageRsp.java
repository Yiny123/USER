// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: Interface.proto at 75:1
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

public final class UploadImageRsp extends Message<UploadImageRsp, UploadImageRsp.Builder> {
  public static final ProtoAdapter<UploadImageRsp> ADAPTER = new ProtoAdapter_UploadImageRsp();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_CODE = 0;

  public static final String DEFAULT_MSG = "";

  public static final Long DEFAULT_IMGID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer code;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String msg;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long imgId;

  public UploadImageRsp(Integer code, String msg, Long imgId) {
    this(code, msg, imgId, ByteString.EMPTY);
  }

  public UploadImageRsp(Integer code, String msg, Long imgId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.code = code;
    this.msg = msg;
    this.imgId = imgId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.code = code;
    builder.msg = msg;
    builder.imgId = imgId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof UploadImageRsp)) return false;
    UploadImageRsp o = (UploadImageRsp) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(code, o.code)
        && Internal.equals(msg, o.msg)
        && Internal.equals(imgId, o.imgId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (code != null ? code.hashCode() : 0);
      result = result * 37 + (msg != null ? msg.hashCode() : 0);
      result = result * 37 + (imgId != null ? imgId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (code != null) builder.append(", code=").append(code);
    if (msg != null) builder.append(", msg=").append(msg);
    if (imgId != null) builder.append(", imgId=").append(imgId);
    return builder.replace(0, 2, "UploadImageRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<UploadImageRsp, Builder> {
    public Integer code;

    public String msg;

    public Long imgId;

    public Builder() {
    }

    public Builder code(Integer code) {
      this.code = code;
      return this;
    }

    public Builder msg(String msg) {
      this.msg = msg;
      return this;
    }

    public Builder imgId(Long imgId) {
      this.imgId = imgId;
      return this;
    }

    @Override
    public UploadImageRsp build() {
      return new UploadImageRsp(code, msg, imgId, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_UploadImageRsp extends ProtoAdapter<UploadImageRsp> {
    ProtoAdapter_UploadImageRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, UploadImageRsp.class);
    }

    @Override
    public int encodedSize(UploadImageRsp value) {
      return (value.code != null ? ProtoAdapter.UINT32.encodedSizeWithTag(1, value.code) : 0)
          + (value.msg != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.msg) : 0)
          + (value.imgId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(3, value.imgId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, UploadImageRsp value) throws IOException {
      if (value.code != null) ProtoAdapter.UINT32.encodeWithTag(writer, 1, value.code);
      if (value.msg != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.msg);
      if (value.imgId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 3, value.imgId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public UploadImageRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.code(ProtoAdapter.UINT32.decode(reader)); break;
          case 2: builder.msg(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.imgId(ProtoAdapter.UINT64.decode(reader)); break;
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
    public UploadImageRsp redact(UploadImageRsp value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
