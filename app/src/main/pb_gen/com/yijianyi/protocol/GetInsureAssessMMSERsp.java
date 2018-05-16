// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 790:1
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
 * 	获取MMSE评估
 */
public final class GetInsureAssessMMSERsp extends Message<GetInsureAssessMMSERsp, GetInsureAssessMMSERsp.Builder> {
  public static final ProtoAdapter<GetInsureAssessMMSERsp> ADAPTER = new ProtoAdapter_GetInsureAssessMMSERsp();

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.InsureAssessMMSE#ADAPTER"
  )
  public final InsureAssessMMSE mmse;

  public GetInsureAssessMMSERsp(InsureAssessMMSE mmse) {
    this(mmse, ByteString.EMPTY);
  }

  public GetInsureAssessMMSERsp(InsureAssessMMSE mmse, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.mmse = mmse;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.mmse = mmse;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetInsureAssessMMSERsp)) return false;
    GetInsureAssessMMSERsp o = (GetInsureAssessMMSERsp) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(mmse, o.mmse);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (mmse != null ? mmse.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (mmse != null) builder.append(", mmse=").append(mmse);
    return builder.replace(0, 2, "GetInsureAssessMMSERsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetInsureAssessMMSERsp, Builder> {
    public InsureAssessMMSE mmse;

    public Builder() {
    }

    public Builder mmse(InsureAssessMMSE mmse) {
      this.mmse = mmse;
      return this;
    }

    @Override
    public GetInsureAssessMMSERsp build() {
      return new GetInsureAssessMMSERsp(mmse, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetInsureAssessMMSERsp extends ProtoAdapter<GetInsureAssessMMSERsp> {
    ProtoAdapter_GetInsureAssessMMSERsp() {
      super(FieldEncoding.LENGTH_DELIMITED, GetInsureAssessMMSERsp.class);
    }

    @Override
    public int encodedSize(GetInsureAssessMMSERsp value) {
      return (value.mmse != null ? InsureAssessMMSE.ADAPTER.encodedSizeWithTag(1, value.mmse) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetInsureAssessMMSERsp value) throws IOException {
      if (value.mmse != null) InsureAssessMMSE.ADAPTER.encodeWithTag(writer, 1, value.mmse);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetInsureAssessMMSERsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.mmse(InsureAssessMMSE.ADAPTER.decode(reader)); break;
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
    public GetInsureAssessMMSERsp redact(GetInsureAssessMMSERsp value) {
      Builder builder = value.newBuilder();
      if (builder.mmse != null) builder.mmse = InsureAssessMMSE.ADAPTER.redact(builder.mmse);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}