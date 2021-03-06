// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1745:1
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
import java.util.Map;
import okio.ByteString;

public final class AddInsureOrderTendReqVo extends Message<AddInsureOrderTendReqVo, AddInsureOrderTendReqVo.Builder> {
  public static final ProtoAdapter<AddInsureOrderTendReqVo> ADAPTER = new ProtoAdapter_AddInsureOrderTendReqVo();

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      keyAdapter = "com.squareup.wire.ProtoAdapter#UINT64",
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final Map<Long, String> messageStr;

  public AddInsureOrderTendReqVo(Map<Long, String> messageStr) {
    this(messageStr, ByteString.EMPTY);
  }

  public AddInsureOrderTendReqVo(Map<Long, String> messageStr, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.messageStr = Internal.immutableCopyOf("messageStr", messageStr);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.messageStr = Internal.copyOf("messageStr", messageStr);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AddInsureOrderTendReqVo)) return false;
    AddInsureOrderTendReqVo o = (AddInsureOrderTendReqVo) other;
    return unknownFields().equals(o.unknownFields())
        && messageStr.equals(o.messageStr);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + messageStr.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (!messageStr.isEmpty()) builder.append(", messageStr=").append(messageStr);
    return builder.replace(0, 2, "AddInsureOrderTendReqVo{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<AddInsureOrderTendReqVo, Builder> {
    public Map<Long, String> messageStr;

    public Builder() {
      messageStr = Internal.newMutableMap();
    }

    public Builder messageStr(Map<Long, String> messageStr) {
      Internal.checkElementsNotNull(messageStr);
      this.messageStr = messageStr;
      return this;
    }

    @Override
    public AddInsureOrderTendReqVo build() {
      return new AddInsureOrderTendReqVo(messageStr, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_AddInsureOrderTendReqVo extends ProtoAdapter<AddInsureOrderTendReqVo> {
    private final ProtoAdapter<Map<Long, String>> messageStr = ProtoAdapter.newMapAdapter(ProtoAdapter.UINT64, ProtoAdapter.STRING);

    ProtoAdapter_AddInsureOrderTendReqVo() {
      super(FieldEncoding.LENGTH_DELIMITED, AddInsureOrderTendReqVo.class);
    }

    @Override
    public int encodedSize(AddInsureOrderTendReqVo value) {
      return messageStr.encodedSizeWithTag(1, value.messageStr)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, AddInsureOrderTendReqVo value) throws IOException {
      messageStr.encodeWithTag(writer, 1, value.messageStr);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public AddInsureOrderTendReqVo decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.messageStr.putAll(messageStr.decode(reader)); break;
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
    public AddInsureOrderTendReqVo redact(AddInsureOrderTendReqVo value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
