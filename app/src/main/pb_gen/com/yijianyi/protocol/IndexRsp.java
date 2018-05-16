// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 463:1
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

public final class IndexRsp extends Message<IndexRsp, IndexRsp.Builder> {
  public static final ProtoAdapter<IndexRsp> ADAPTER = new ProtoAdapter_IndexRsp();

  private static final long serialVersionUID = 0L;

  /**
   * 当前订单
   */
  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.OrderCurrent#ADAPTER"
  )
  public final OrderCurrent orderCur;

  public IndexRsp(OrderCurrent orderCur) {
    this(orderCur, ByteString.EMPTY);
  }

  public IndexRsp(OrderCurrent orderCur, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.orderCur = orderCur;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.orderCur = orderCur;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof IndexRsp)) return false;
    IndexRsp o = (IndexRsp) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(orderCur, o.orderCur);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (orderCur != null ? orderCur.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (orderCur != null) builder.append(", orderCur=").append(orderCur);
    return builder.replace(0, 2, "IndexRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<IndexRsp, Builder> {
    public OrderCurrent orderCur;

    public Builder() {
    }

    /**
     * 当前订单
     */
    public Builder orderCur(OrderCurrent orderCur) {
      this.orderCur = orderCur;
      return this;
    }

    @Override
    public IndexRsp build() {
      return new IndexRsp(orderCur, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_IndexRsp extends ProtoAdapter<IndexRsp> {
    ProtoAdapter_IndexRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, IndexRsp.class);
    }

    @Override
    public int encodedSize(IndexRsp value) {
      return (value.orderCur != null ? OrderCurrent.ADAPTER.encodedSizeWithTag(1, value.orderCur) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, IndexRsp value) throws IOException {
      if (value.orderCur != null) OrderCurrent.ADAPTER.encodeWithTag(writer, 1, value.orderCur);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public IndexRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.orderCur(OrderCurrent.ADAPTER.decode(reader)); break;
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
    public IndexRsp redact(IndexRsp value) {
      Builder builder = value.newBuilder();
      if (builder.orderCur != null) builder.orderCur = OrderCurrent.ADAPTER.redact(builder.orderCur);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
