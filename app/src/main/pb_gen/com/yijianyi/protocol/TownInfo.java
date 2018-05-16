// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: Area.proto at 27:1
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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class TownInfo extends Message<TownInfo, TownInfo.Builder> {
  public static final ProtoAdapter<TownInfo> ADAPTER = new ProtoAdapter_TownInfo();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_TOWNID = 0;

  public static final String DEFAULT_TOWNNAME = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer townId;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String townName;

  public TownInfo(Integer townId, String townName) {
    this(townId, townName, ByteString.EMPTY);
  }

  public TownInfo(Integer townId, String townName, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.townId = townId;
    this.townName = townName;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.townId = townId;
    builder.townName = townName;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof TownInfo)) return false;
    TownInfo o = (TownInfo) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(townId, o.townId)
        && Internal.equals(townName, o.townName);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (townId != null ? townId.hashCode() : 0);
      result = result * 37 + (townName != null ? townName.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (townId != null) builder.append(", townId=").append(townId);
    if (townName != null) builder.append(", townName=").append(townName);
    return builder.replace(0, 2, "TownInfo{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<TownInfo, Builder> {
    public Integer townId;

    public String townName;

    public Builder() {
    }

    public Builder townId(Integer townId) {
      this.townId = townId;
      return this;
    }

    public Builder townName(String townName) {
      this.townName = townName;
      return this;
    }

    @Override
    public TownInfo build() {
      return new TownInfo(townId, townName, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_TownInfo extends ProtoAdapter<TownInfo> {
    ProtoAdapter_TownInfo() {
      super(FieldEncoding.LENGTH_DELIMITED, TownInfo.class);
    }

    @Override
    public int encodedSize(TownInfo value) {
      return (value.townId != null ? ProtoAdapter.UINT32.encodedSizeWithTag(1, value.townId) : 0)
          + (value.townName != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.townName) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, TownInfo value) throws IOException {
      if (value.townId != null) ProtoAdapter.UINT32.encodeWithTag(writer, 1, value.townId);
      if (value.townName != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.townName);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public TownInfo decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.townId(ProtoAdapter.UINT32.decode(reader)); break;
          case 2: builder.townName(ProtoAdapter.STRING.decode(reader)); break;
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
    public TownInfo redact(TownInfo value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}