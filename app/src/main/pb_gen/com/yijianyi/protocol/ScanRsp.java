// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1212:1
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

public final class ScanRsp extends Message<ScanRsp, ScanRsp.Builder> {
  public static final ProtoAdapter<ScanRsp> ADAPTER = new ProtoAdapter_ScanRsp();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_YJYURL = "";

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String yjyUrl;

  public ScanRsp(String yjyUrl) {
    this(yjyUrl, ByteString.EMPTY);
  }

  public ScanRsp(String yjyUrl, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.yjyUrl = yjyUrl;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.yjyUrl = yjyUrl;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ScanRsp)) return false;
    ScanRsp o = (ScanRsp) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(yjyUrl, o.yjyUrl);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (yjyUrl != null ? yjyUrl.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (yjyUrl != null) builder.append(", yjyUrl=").append(yjyUrl);
    return builder.replace(0, 2, "ScanRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<ScanRsp, Builder> {
    public String yjyUrl;

    public Builder() {
    }

    public Builder yjyUrl(String yjyUrl) {
      this.yjyUrl = yjyUrl;
      return this;
    }

    @Override
    public ScanRsp build() {
      return new ScanRsp(yjyUrl, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_ScanRsp extends ProtoAdapter<ScanRsp> {
    ProtoAdapter_ScanRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, ScanRsp.class);
    }

    @Override
    public int encodedSize(ScanRsp value) {
      return (value.yjyUrl != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.yjyUrl) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, ScanRsp value) throws IOException {
      if (value.yjyUrl != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.yjyUrl);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public ScanRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 2: builder.yjyUrl(ProtoAdapter.STRING.decode(reader)); break;
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
    public ScanRsp redact(ScanRsp value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
