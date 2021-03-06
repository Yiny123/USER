// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 2054:1
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
 * 获取带教记录
 */
public final class GetTeachRecordReq extends Message<GetTeachRecordReq, GetTeachRecordReq.Builder> {
  public static final ProtoAdapter<GetTeachRecordReq> ADAPTER = new ProtoAdapter_GetTeachRecordReq();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_RECORDID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long recordId;

  public GetTeachRecordReq(Long recordId) {
    this(recordId, ByteString.EMPTY);
  }

  public GetTeachRecordReq(Long recordId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.recordId = recordId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.recordId = recordId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetTeachRecordReq)) return false;
    GetTeachRecordReq o = (GetTeachRecordReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(recordId, o.recordId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (recordId != null ? recordId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (recordId != null) builder.append(", recordId=").append(recordId);
    return builder.replace(0, 2, "GetTeachRecordReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetTeachRecordReq, Builder> {
    public Long recordId;

    public Builder() {
    }

    public Builder recordId(Long recordId) {
      this.recordId = recordId;
      return this;
    }

    @Override
    public GetTeachRecordReq build() {
      return new GetTeachRecordReq(recordId, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetTeachRecordReq extends ProtoAdapter<GetTeachRecordReq> {
    ProtoAdapter_GetTeachRecordReq() {
      super(FieldEncoding.LENGTH_DELIMITED, GetTeachRecordReq.class);
    }

    @Override
    public int encodedSize(GetTeachRecordReq value) {
      return (value.recordId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.recordId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetTeachRecordReq value) throws IOException {
      if (value.recordId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.recordId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetTeachRecordReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.recordId(ProtoAdapter.UINT64.decode(reader)); break;
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
    public GetTeachRecordReq redact(GetTeachRecordReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
