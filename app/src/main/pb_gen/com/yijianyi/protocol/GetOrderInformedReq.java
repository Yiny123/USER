// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 898:1
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
 * 获取订单知情书
 */
public final class GetOrderInformedReq extends Message<GetOrderInformedReq, GetOrderInformedReq.Builder> {
  public static final ProtoAdapter<GetOrderInformedReq> ADAPTER = new ProtoAdapter_GetOrderInformedReq();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ORDERID = "";

  /**
   * 订单OrderId
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orderId;

  public GetOrderInformedReq(String orderId) {
    this(orderId, ByteString.EMPTY);
  }

  public GetOrderInformedReq(String orderId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.orderId = orderId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.orderId = orderId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetOrderInformedReq)) return false;
    GetOrderInformedReq o = (GetOrderInformedReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(orderId, o.orderId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (orderId != null ? orderId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (orderId != null) builder.append(", orderId=").append(orderId);
    return builder.replace(0, 2, "GetOrderInformedReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetOrderInformedReq, Builder> {
    public String orderId;

    public Builder() {
    }

    /**
     * 订单OrderId
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    @Override
    public GetOrderInformedReq build() {
      return new GetOrderInformedReq(orderId, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetOrderInformedReq extends ProtoAdapter<GetOrderInformedReq> {
    ProtoAdapter_GetOrderInformedReq() {
      super(FieldEncoding.LENGTH_DELIMITED, GetOrderInformedReq.class);
    }

    @Override
    public int encodedSize(GetOrderInformedReq value) {
      return (value.orderId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.orderId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetOrderInformedReq value) throws IOException {
      if (value.orderId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.orderId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetOrderInformedReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.orderId(ProtoAdapter.STRING.decode(reader)); break;
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
    public GetOrderInformedReq redact(GetOrderInformedReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
