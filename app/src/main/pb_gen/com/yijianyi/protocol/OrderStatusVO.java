// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: OrderModel.proto at 831:1
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
 * 客户端订单状态流转信息
 */
public final class OrderStatusVO extends Message<OrderStatusVO, OrderStatusVO.Builder> {
  public static final ProtoAdapter<OrderStatusVO> ADAPTER = new ProtoAdapter_OrderStatusVO();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_STATUSSTR = "";

  public static final Boolean DEFAULT_ISLIGHT = false;

  /**
   * 状态信息
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String statusStr;

  /**
   * 是否亮起
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean isLight;

  public OrderStatusVO(String statusStr, Boolean isLight) {
    this(statusStr, isLight, ByteString.EMPTY);
  }

  public OrderStatusVO(String statusStr, Boolean isLight, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.statusStr = statusStr;
    this.isLight = isLight;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.statusStr = statusStr;
    builder.isLight = isLight;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof OrderStatusVO)) return false;
    OrderStatusVO o = (OrderStatusVO) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(statusStr, o.statusStr)
        && Internal.equals(isLight, o.isLight);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (statusStr != null ? statusStr.hashCode() : 0);
      result = result * 37 + (isLight != null ? isLight.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (statusStr != null) builder.append(", statusStr=").append(statusStr);
    if (isLight != null) builder.append(", isLight=").append(isLight);
    return builder.replace(0, 2, "OrderStatusVO{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<OrderStatusVO, Builder> {
    public String statusStr;

    public Boolean isLight;

    public Builder() {
    }

    /**
     * 状态信息
     */
    public Builder statusStr(String statusStr) {
      this.statusStr = statusStr;
      return this;
    }

    /**
     * 是否亮起
     */
    public Builder isLight(Boolean isLight) {
      this.isLight = isLight;
      return this;
    }

    @Override
    public OrderStatusVO build() {
      return new OrderStatusVO(statusStr, isLight, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_OrderStatusVO extends ProtoAdapter<OrderStatusVO> {
    ProtoAdapter_OrderStatusVO() {
      super(FieldEncoding.LENGTH_DELIMITED, OrderStatusVO.class);
    }

    @Override
    public int encodedSize(OrderStatusVO value) {
      return (value.statusStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.statusStr) : 0)
          + (value.isLight != null ? ProtoAdapter.BOOL.encodedSizeWithTag(2, value.isLight) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, OrderStatusVO value) throws IOException {
      if (value.statusStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.statusStr);
      if (value.isLight != null) ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.isLight);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public OrderStatusVO decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.statusStr(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.isLight(ProtoAdapter.BOOL.decode(reader)); break;
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
    public OrderStatusVO redact(OrderStatusVO value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
