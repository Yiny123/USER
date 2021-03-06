// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 423:1
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
import java.util.List;
import okio.ByteString;

/**
 * 获取用户订单列表Rsp
 */
public final class GetOrderListRsp extends Message<GetOrderListRsp, GetOrderListRsp.Builder> {
  public static final ProtoAdapter<GetOrderListRsp> ADAPTER = new ProtoAdapter_GetOrderListRsp();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_COUNT = 0;

  /**
   * 未交预交金订单列表
   */
  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.OrderVO#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<OrderVO> orderList;

  /**
   * 订单总数
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer count;

  public GetOrderListRsp(List<OrderVO> orderList, Integer count) {
    this(orderList, count, ByteString.EMPTY);
  }

  public GetOrderListRsp(List<OrderVO> orderList, Integer count, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.orderList = Internal.immutableCopyOf("orderList", orderList);
    this.count = count;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.orderList = Internal.copyOf("orderList", orderList);
    builder.count = count;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetOrderListRsp)) return false;
    GetOrderListRsp o = (GetOrderListRsp) other;
    return unknownFields().equals(o.unknownFields())
        && orderList.equals(o.orderList)
        && Internal.equals(count, o.count);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + orderList.hashCode();
      result = result * 37 + (count != null ? count.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (!orderList.isEmpty()) builder.append(", orderList=").append(orderList);
    if (count != null) builder.append(", count=").append(count);
    return builder.replace(0, 2, "GetOrderListRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetOrderListRsp, Builder> {
    public List<OrderVO> orderList;

    public Integer count;

    public Builder() {
      orderList = Internal.newMutableList();
    }

    /**
     * 未交预交金订单列表
     */
    public Builder orderList(List<OrderVO> orderList) {
      Internal.checkElementsNotNull(orderList);
      this.orderList = orderList;
      return this;
    }

    /**
     * 订单总数
     */
    public Builder count(Integer count) {
      this.count = count;
      return this;
    }

    @Override
    public GetOrderListRsp build() {
      return new GetOrderListRsp(orderList, count, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetOrderListRsp extends ProtoAdapter<GetOrderListRsp> {
    ProtoAdapter_GetOrderListRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, GetOrderListRsp.class);
    }

    @Override
    public int encodedSize(GetOrderListRsp value) {
      return OrderVO.ADAPTER.asRepeated().encodedSizeWithTag(1, value.orderList)
          + (value.count != null ? ProtoAdapter.UINT32.encodedSizeWithTag(2, value.count) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetOrderListRsp value) throws IOException {
      OrderVO.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.orderList);
      if (value.count != null) ProtoAdapter.UINT32.encodeWithTag(writer, 2, value.count);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetOrderListRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.orderList.add(OrderVO.ADAPTER.decode(reader)); break;
          case 2: builder.count(ProtoAdapter.UINT32.decode(reader)); break;
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
    public GetOrderListRsp redact(GetOrderListRsp value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.orderList, OrderVO.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
