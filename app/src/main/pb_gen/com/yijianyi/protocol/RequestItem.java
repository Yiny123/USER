// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: Interface.proto at 31:1
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

public final class RequestItem extends Message<RequestItem, RequestItem.Builder> {
  public static final ProtoAdapter<RequestItem> ADAPTER = new ProtoAdapter_RequestItem();

  private static final long serialVersionUID = 0L;

  public static final APP_COMMAND DEFAULT_COMMAND = APP_COMMAND.DEFAULT;

  public static final Integer DEFAULT_ENCRYPT = 0;

  public static final ByteString DEFAULT_BINBODY = ByteString.EMPTY;

  /**
   * 服务端命令号
   */
  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.APP_COMMAND#ADAPTER"
  )
  public final APP_COMMAND command;

  /**
   * 加密方式[1:未加密，2：DES加密]
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer encrypt;

  /**
   * 请求数据
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#BYTES"
  )
  public final ByteString binBody;

  public RequestItem(APP_COMMAND command, Integer encrypt, ByteString binBody) {
    this(command, encrypt, binBody, ByteString.EMPTY);
  }

  public RequestItem(APP_COMMAND command, Integer encrypt, ByteString binBody, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.command = command;
    this.encrypt = encrypt;
    this.binBody = binBody;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.command = command;
    builder.encrypt = encrypt;
    builder.binBody = binBody;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RequestItem)) return false;
    RequestItem o = (RequestItem) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(command, o.command)
        && Internal.equals(encrypt, o.encrypt)
        && Internal.equals(binBody, o.binBody);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (command != null ? command.hashCode() : 0);
      result = result * 37 + (encrypt != null ? encrypt.hashCode() : 0);
      result = result * 37 + (binBody != null ? binBody.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (command != null) builder.append(", command=").append(command);
    if (encrypt != null) builder.append(", encrypt=").append(encrypt);
    if (binBody != null) builder.append(", binBody=").append(binBody);
    return builder.replace(0, 2, "RequestItem{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<RequestItem, Builder> {
    public APP_COMMAND command;

    public Integer encrypt;

    public ByteString binBody;

    public Builder() {
    }

    /**
     * 服务端命令号
     */
    public Builder command(APP_COMMAND command) {
      this.command = command;
      return this;
    }

    /**
     * 加密方式[1:未加密，2：DES加密]
     */
    public Builder encrypt(Integer encrypt) {
      this.encrypt = encrypt;
      return this;
    }

    /**
     * 请求数据
     */
    public Builder binBody(ByteString binBody) {
      this.binBody = binBody;
      return this;
    }

    @Override
    public RequestItem build() {
      return new RequestItem(command, encrypt, binBody, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_RequestItem extends ProtoAdapter<RequestItem> {
    ProtoAdapter_RequestItem() {
      super(FieldEncoding.LENGTH_DELIMITED, RequestItem.class);
    }

    @Override
    public int encodedSize(RequestItem value) {
      return (value.command != null ? APP_COMMAND.ADAPTER.encodedSizeWithTag(1, value.command) : 0)
          + (value.encrypt != null ? ProtoAdapter.UINT32.encodedSizeWithTag(2, value.encrypt) : 0)
          + (value.binBody != null ? ProtoAdapter.BYTES.encodedSizeWithTag(3, value.binBody) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, RequestItem value) throws IOException {
      if (value.command != null) APP_COMMAND.ADAPTER.encodeWithTag(writer, 1, value.command);
      if (value.encrypt != null) ProtoAdapter.UINT32.encodeWithTag(writer, 2, value.encrypt);
      if (value.binBody != null) ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.binBody);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public RequestItem decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: {
            try {
              builder.command(APP_COMMAND.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 2: builder.encrypt(ProtoAdapter.UINT32.decode(reader)); break;
          case 3: builder.binBody(ProtoAdapter.BYTES.decode(reader)); break;
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
    public RequestItem redact(RequestItem value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}