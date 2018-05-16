// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 95:1
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

public final class SetDefaultUserAddressReq extends Message<SetDefaultUserAddressReq, SetDefaultUserAddressReq.Builder> {
  public static final ProtoAdapter<SetDefaultUserAddressReq> ADAPTER = new ProtoAdapter_SetDefaultUserAddressReq();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_ADDRID = 0L;

  /**
   * 地址id
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long addrId;

  public SetDefaultUserAddressReq(Long addrId) {
    this(addrId, ByteString.EMPTY);
  }

  public SetDefaultUserAddressReq(Long addrId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.addrId = addrId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.addrId = addrId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof SetDefaultUserAddressReq)) return false;
    SetDefaultUserAddressReq o = (SetDefaultUserAddressReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(addrId, o.addrId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (addrId != null ? addrId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (addrId != null) builder.append(", addrId=").append(addrId);
    return builder.replace(0, 2, "SetDefaultUserAddressReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<SetDefaultUserAddressReq, Builder> {
    public Long addrId;

    public Builder() {
    }

    /**
     * 地址id
     */
    public Builder addrId(Long addrId) {
      this.addrId = addrId;
      return this;
    }

    @Override
    public SetDefaultUserAddressReq build() {
      return new SetDefaultUserAddressReq(addrId, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_SetDefaultUserAddressReq extends ProtoAdapter<SetDefaultUserAddressReq> {
    ProtoAdapter_SetDefaultUserAddressReq() {
      super(FieldEncoding.LENGTH_DELIMITED, SetDefaultUserAddressReq.class);
    }

    @Override
    public int encodedSize(SetDefaultUserAddressReq value) {
      return (value.addrId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.addrId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, SetDefaultUserAddressReq value) throws IOException {
      if (value.addrId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.addrId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public SetDefaultUserAddressReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.addrId(ProtoAdapter.UINT64.decode(reader)); break;
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
    public SetDefaultUserAddressReq redact(SetDefaultUserAddressReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}