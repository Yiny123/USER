// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1463:1
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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * 切换督导的值班状态
 */
public final class UpdateOndutyReq extends Message<UpdateOndutyReq, UpdateOndutyReq.Builder> {
  public static final ProtoAdapter<UpdateOndutyReq> ADAPTER = new ProtoAdapter_UpdateOndutyReq();

  private static final long serialVersionUID = 0L;

  public static final Boolean DEFAULT_ONDUTY = false;

  /**
   * 是否值班中 0-未值班 1-值班中
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean onduty;

  public UpdateOndutyReq(Boolean onduty) {
    this(onduty, ByteString.EMPTY);
  }

  public UpdateOndutyReq(Boolean onduty, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.onduty = onduty;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.onduty = onduty;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof UpdateOndutyReq)) return false;
    UpdateOndutyReq o = (UpdateOndutyReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(onduty, o.onduty);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (onduty != null ? onduty.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (onduty != null) builder.append(", onduty=").append(onduty);
    return builder.replace(0, 2, "UpdateOndutyReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<UpdateOndutyReq, Builder> {
    public Boolean onduty;

    public Builder() {
    }

    /**
     * 是否值班中 0-未值班 1-值班中
     */
    public Builder onduty(Boolean onduty) {
      this.onduty = onduty;
      return this;
    }

    @Override
    public UpdateOndutyReq build() {
      return new UpdateOndutyReq(onduty, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_UpdateOndutyReq extends ProtoAdapter<UpdateOndutyReq> {
    ProtoAdapter_UpdateOndutyReq() {
      super(FieldEncoding.LENGTH_DELIMITED, UpdateOndutyReq.class);
    }

    @Override
    public int encodedSize(UpdateOndutyReq value) {
      return (value.onduty != null ? ProtoAdapter.BOOL.encodedSizeWithTag(1, value.onduty) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, UpdateOndutyReq value) throws IOException {
      if (value.onduty != null) ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.onduty);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public UpdateOndutyReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.onduty(ProtoAdapter.BOOL.decode(reader)); break;
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
    public UpdateOndutyReq redact(UpdateOndutyReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
