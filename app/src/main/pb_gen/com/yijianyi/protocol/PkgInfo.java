// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: Comm.proto at 54:1
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

public final class PkgInfo extends Message<PkgInfo, PkgInfo.Builder> {
  public static final ProtoAdapter<PkgInfo> ADAPTER = new ProtoAdapter_PkgInfo();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_PKGNAME = "";

  public static final String DEFAULT_SIGNINFO = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String pkgName;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String signInfo;

  public PkgInfo(String pkgName, String signInfo) {
    this(pkgName, signInfo, ByteString.EMPTY);
  }

  public PkgInfo(String pkgName, String signInfo, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.pkgName = pkgName;
    this.signInfo = signInfo;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.pkgName = pkgName;
    builder.signInfo = signInfo;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof PkgInfo)) return false;
    PkgInfo o = (PkgInfo) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(pkgName, o.pkgName)
        && Internal.equals(signInfo, o.signInfo);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (pkgName != null ? pkgName.hashCode() : 0);
      result = result * 37 + (signInfo != null ? signInfo.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (pkgName != null) builder.append(", pkgName=").append(pkgName);
    if (signInfo != null) builder.append(", signInfo=").append(signInfo);
    return builder.replace(0, 2, "PkgInfo{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<PkgInfo, Builder> {
    public String pkgName;

    public String signInfo;

    public Builder() {
    }

    public Builder pkgName(String pkgName) {
      this.pkgName = pkgName;
      return this;
    }

    public Builder signInfo(String signInfo) {
      this.signInfo = signInfo;
      return this;
    }

    @Override
    public PkgInfo build() {
      return new PkgInfo(pkgName, signInfo, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_PkgInfo extends ProtoAdapter<PkgInfo> {
    ProtoAdapter_PkgInfo() {
      super(FieldEncoding.LENGTH_DELIMITED, PkgInfo.class);
    }

    @Override
    public int encodedSize(PkgInfo value) {
      return (value.pkgName != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.pkgName) : 0)
          + (value.signInfo != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.signInfo) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, PkgInfo value) throws IOException {
      if (value.pkgName != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.pkgName);
      if (value.signInfo != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.signInfo);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public PkgInfo decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.pkgName(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.signInfo(ProtoAdapter.STRING.decode(reader)); break;
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
    public PkgInfo redact(PkgInfo value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
