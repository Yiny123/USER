// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1796:1
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

/**
 * 删除回访记录
 */
public final class DeleteInsureOrderVisitReq extends Message<DeleteInsureOrderVisitReq, DeleteInsureOrderVisitReq.Builder> {
  public static final ProtoAdapter<DeleteInsureOrderVisitReq> ADAPTER = new ProtoAdapter_DeleteInsureOrderVisitReq();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ORDERID = "";

  public static final Long DEFAULT_VISITID = 0L;

  /**
   * 订单id
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orderId;

  /**
   * 回访id
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long visitId;

  public DeleteInsureOrderVisitReq(String orderId, Long visitId) {
    this(orderId, visitId, ByteString.EMPTY);
  }

  public DeleteInsureOrderVisitReq(String orderId, Long visitId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.orderId = orderId;
    this.visitId = visitId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.orderId = orderId;
    builder.visitId = visitId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof DeleteInsureOrderVisitReq)) return false;
    DeleteInsureOrderVisitReq o = (DeleteInsureOrderVisitReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(orderId, o.orderId)
        && Internal.equals(visitId, o.visitId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (orderId != null ? orderId.hashCode() : 0);
      result = result * 37 + (visitId != null ? visitId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (orderId != null) builder.append(", orderId=").append(orderId);
    if (visitId != null) builder.append(", visitId=").append(visitId);
    return builder.replace(0, 2, "DeleteInsureOrderVisitReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<DeleteInsureOrderVisitReq, Builder> {
    public String orderId;

    public Long visitId;

    public Builder() {
    }

    /**
     * 订单id
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * 回访id
     */
    public Builder visitId(Long visitId) {
      this.visitId = visitId;
      return this;
    }

    @Override
    public DeleteInsureOrderVisitReq build() {
      return new DeleteInsureOrderVisitReq(orderId, visitId, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_DeleteInsureOrderVisitReq extends ProtoAdapter<DeleteInsureOrderVisitReq> {
    ProtoAdapter_DeleteInsureOrderVisitReq() {
      super(FieldEncoding.LENGTH_DELIMITED, DeleteInsureOrderVisitReq.class);
    }

    @Override
    public int encodedSize(DeleteInsureOrderVisitReq value) {
      return (value.orderId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.orderId) : 0)
          + (value.visitId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(2, value.visitId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, DeleteInsureOrderVisitReq value) throws IOException {
      if (value.orderId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.orderId);
      if (value.visitId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 2, value.visitId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public DeleteInsureOrderVisitReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.orderId(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.visitId(ProtoAdapter.UINT64.decode(reader)); break;
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
    public DeleteInsureOrderVisitReq redact(DeleteInsureOrderVisitReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
