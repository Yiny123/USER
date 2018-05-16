// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 638:1
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

/**
 * 获取长护险补贴明细
 */
public final class GetInsureAccountDetailReq extends Message<GetInsureAccountDetailReq, GetInsureAccountDetailReq.Builder> {
  public static final ProtoAdapter<GetInsureAccountDetailReq> ADAPTER = new ProtoAdapter_GetInsureAccountDetailReq();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ORDERID = "";

  public static final String DEFAULT_IDCARD = "";

  public static final Integer DEFAULT_TABTYPE = 0;

  public static final Integer DEFAULT_PAGENO = 0;

  public static final Integer DEFAULT_PAGESIZE = 0;

  /**
   * 如果从订单详情进入获取明细需此参数
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orderId;

  /**
   * 如果从长护险资格人进入获取明细需此参数
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String idcard;

  /**
   * 0-全部 1-支出 2-收入
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer tabType;

  /**
   * 页码 从1开始
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer pageNo;

  /**
   * 每页条目数
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer pageSize;

  public GetInsureAccountDetailReq(String orderId, String idcard, Integer tabType, Integer pageNo, Integer pageSize) {
    this(orderId, idcard, tabType, pageNo, pageSize, ByteString.EMPTY);
  }

  public GetInsureAccountDetailReq(String orderId, String idcard, Integer tabType, Integer pageNo, Integer pageSize, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.orderId = orderId;
    this.idcard = idcard;
    this.tabType = tabType;
    this.pageNo = pageNo;
    this.pageSize = pageSize;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.orderId = orderId;
    builder.idcard = idcard;
    builder.tabType = tabType;
    builder.pageNo = pageNo;
    builder.pageSize = pageSize;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetInsureAccountDetailReq)) return false;
    GetInsureAccountDetailReq o = (GetInsureAccountDetailReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(orderId, o.orderId)
        && Internal.equals(idcard, o.idcard)
        && Internal.equals(tabType, o.tabType)
        && Internal.equals(pageNo, o.pageNo)
        && Internal.equals(pageSize, o.pageSize);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (orderId != null ? orderId.hashCode() : 0);
      result = result * 37 + (idcard != null ? idcard.hashCode() : 0);
      result = result * 37 + (tabType != null ? tabType.hashCode() : 0);
      result = result * 37 + (pageNo != null ? pageNo.hashCode() : 0);
      result = result * 37 + (pageSize != null ? pageSize.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (orderId != null) builder.append(", orderId=").append(orderId);
    if (idcard != null) builder.append(", idcard=").append(idcard);
    if (tabType != null) builder.append(", tabType=").append(tabType);
    if (pageNo != null) builder.append(", pageNo=").append(pageNo);
    if (pageSize != null) builder.append(", pageSize=").append(pageSize);
    return builder.replace(0, 2, "GetInsureAccountDetailReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetInsureAccountDetailReq, Builder> {
    public String orderId;

    public String idcard;

    public Integer tabType;

    public Integer pageNo;

    public Integer pageSize;

    public Builder() {
    }

    /**
     * 如果从订单详情进入获取明细需此参数
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * 如果从长护险资格人进入获取明细需此参数
     */
    public Builder idcard(String idcard) {
      this.idcard = idcard;
      return this;
    }

    /**
     * 0-全部 1-支出 2-收入
     */
    public Builder tabType(Integer tabType) {
      this.tabType = tabType;
      return this;
    }

    /**
     * 页码 从1开始
     */
    public Builder pageNo(Integer pageNo) {
      this.pageNo = pageNo;
      return this;
    }

    /**
     * 每页条目数
     */
    public Builder pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    @Override
    public GetInsureAccountDetailReq build() {
      return new GetInsureAccountDetailReq(orderId, idcard, tabType, pageNo, pageSize, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetInsureAccountDetailReq extends ProtoAdapter<GetInsureAccountDetailReq> {
    ProtoAdapter_GetInsureAccountDetailReq() {
      super(FieldEncoding.LENGTH_DELIMITED, GetInsureAccountDetailReq.class);
    }

    @Override
    public int encodedSize(GetInsureAccountDetailReq value) {
      return (value.orderId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.orderId) : 0)
          + (value.idcard != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.idcard) : 0)
          + (value.tabType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(3, value.tabType) : 0)
          + (value.pageNo != null ? ProtoAdapter.UINT32.encodedSizeWithTag(4, value.pageNo) : 0)
          + (value.pageSize != null ? ProtoAdapter.UINT32.encodedSizeWithTag(5, value.pageSize) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetInsureAccountDetailReq value) throws IOException {
      if (value.orderId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.orderId);
      if (value.idcard != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.idcard);
      if (value.tabType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.tabType);
      if (value.pageNo != null) ProtoAdapter.UINT32.encodeWithTag(writer, 4, value.pageNo);
      if (value.pageSize != null) ProtoAdapter.UINT32.encodeWithTag(writer, 5, value.pageSize);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetInsureAccountDetailReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.orderId(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.idcard(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.tabType(ProtoAdapter.UINT32.decode(reader)); break;
          case 4: builder.pageNo(ProtoAdapter.UINT32.decode(reader)); break;
          case 5: builder.pageSize(ProtoAdapter.UINT32.decode(reader)); break;
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
    public GetInsureAccountDetailReq redact(GetInsureAccountDetailReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}