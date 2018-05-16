// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1429:1
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
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

/**
 * 获取订单夜陪服务信息
 */
public final class OrderItemNightRsp extends Message<OrderItemNightRsp, OrderItemNightRsp.Builder> {
  public static final ProtoAdapter<OrderItemNightRsp> ADAPTER = new ProtoAdapter_OrderItemNightRsp();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_NIGHTHGSTATUS = 0;

  public static final Long DEFAULT_NIGHTNUMBER = 0L;

  public static final Long DEFAULT_ORGID = 0L;

  public static final Long DEFAULT_BRANCHID = 0L;

  public static final Integer DEFAULT_WORKTYPE = 0;

  /**
   * 夜陪服务
   */
  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.PriceVO#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<PriceVO> priceVOList;

  /**
   * 夜陪服务项
   */
  @WireField(
      tag = 2,
      adapter = "com.yijianyi.protocol.OrderItemNightVO#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<OrderItemNightVO> orderItemNightVOList;

  /**
   * 判断是否有未指派的 0-不需要 1-需要
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer nightHgStatus;

  /**
   * 夜陪数量
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long nightNumber;

  /**
   * 机构id
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long orgId;

  /**
   * 科室id
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long branchId;

  /**
   * 0-不区分 1-多陪 2-专陪
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer workType;

  public OrderItemNightRsp(List<PriceVO> priceVOList, List<OrderItemNightVO> orderItemNightVOList, Integer nightHgStatus, Long nightNumber, Long orgId, Long branchId, Integer workType) {
    this(priceVOList, orderItemNightVOList, nightHgStatus, nightNumber, orgId, branchId, workType, ByteString.EMPTY);
  }

  public OrderItemNightRsp(List<PriceVO> priceVOList, List<OrderItemNightVO> orderItemNightVOList, Integer nightHgStatus, Long nightNumber, Long orgId, Long branchId, Integer workType, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.priceVOList = Internal.immutableCopyOf("priceVOList", priceVOList);
    this.orderItemNightVOList = Internal.immutableCopyOf("orderItemNightVOList", orderItemNightVOList);
    this.nightHgStatus = nightHgStatus;
    this.nightNumber = nightNumber;
    this.orgId = orgId;
    this.branchId = branchId;
    this.workType = workType;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.priceVOList = Internal.copyOf("priceVOList", priceVOList);
    builder.orderItemNightVOList = Internal.copyOf("orderItemNightVOList", orderItemNightVOList);
    builder.nightHgStatus = nightHgStatus;
    builder.nightNumber = nightNumber;
    builder.orgId = orgId;
    builder.branchId = branchId;
    builder.workType = workType;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof OrderItemNightRsp)) return false;
    OrderItemNightRsp o = (OrderItemNightRsp) other;
    return unknownFields().equals(o.unknownFields())
        && priceVOList.equals(o.priceVOList)
        && orderItemNightVOList.equals(o.orderItemNightVOList)
        && Internal.equals(nightHgStatus, o.nightHgStatus)
        && Internal.equals(nightNumber, o.nightNumber)
        && Internal.equals(orgId, o.orgId)
        && Internal.equals(branchId, o.branchId)
        && Internal.equals(workType, o.workType);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + priceVOList.hashCode();
      result = result * 37 + orderItemNightVOList.hashCode();
      result = result * 37 + (nightHgStatus != null ? nightHgStatus.hashCode() : 0);
      result = result * 37 + (nightNumber != null ? nightNumber.hashCode() : 0);
      result = result * 37 + (orgId != null ? orgId.hashCode() : 0);
      result = result * 37 + (branchId != null ? branchId.hashCode() : 0);
      result = result * 37 + (workType != null ? workType.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (!priceVOList.isEmpty()) builder.append(", priceVOList=").append(priceVOList);
    if (!orderItemNightVOList.isEmpty()) builder.append(", orderItemNightVOList=").append(orderItemNightVOList);
    if (nightHgStatus != null) builder.append(", nightHgStatus=").append(nightHgStatus);
    if (nightNumber != null) builder.append(", nightNumber=").append(nightNumber);
    if (orgId != null) builder.append(", orgId=").append(orgId);
    if (branchId != null) builder.append(", branchId=").append(branchId);
    if (workType != null) builder.append(", workType=").append(workType);
    return builder.replace(0, 2, "OrderItemNightRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<OrderItemNightRsp, Builder> {
    public List<PriceVO> priceVOList;

    public List<OrderItemNightVO> orderItemNightVOList;

    public Integer nightHgStatus;

    public Long nightNumber;

    public Long orgId;

    public Long branchId;

    public Integer workType;

    public Builder() {
      priceVOList = Internal.newMutableList();
      orderItemNightVOList = Internal.newMutableList();
    }

    /**
     * 夜陪服务
     */
    public Builder priceVOList(List<PriceVO> priceVOList) {
      Internal.checkElementsNotNull(priceVOList);
      this.priceVOList = priceVOList;
      return this;
    }

    /**
     * 夜陪服务项
     */
    public Builder orderItemNightVOList(List<OrderItemNightVO> orderItemNightVOList) {
      Internal.checkElementsNotNull(orderItemNightVOList);
      this.orderItemNightVOList = orderItemNightVOList;
      return this;
    }

    /**
     * 判断是否有未指派的 0-不需要 1-需要
     */
    public Builder nightHgStatus(Integer nightHgStatus) {
      this.nightHgStatus = nightHgStatus;
      return this;
    }

    /**
     * 夜陪数量
     */
    public Builder nightNumber(Long nightNumber) {
      this.nightNumber = nightNumber;
      return this;
    }

    /**
     * 机构id
     */
    public Builder orgId(Long orgId) {
      this.orgId = orgId;
      return this;
    }

    /**
     * 科室id
     */
    public Builder branchId(Long branchId) {
      this.branchId = branchId;
      return this;
    }

    /**
     * 0-不区分 1-多陪 2-专陪
     */
    public Builder workType(Integer workType) {
      this.workType = workType;
      return this;
    }

    @Override
    public OrderItemNightRsp build() {
      return new OrderItemNightRsp(priceVOList, orderItemNightVOList, nightHgStatus, nightNumber, orgId, branchId, workType, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_OrderItemNightRsp extends ProtoAdapter<OrderItemNightRsp> {
    ProtoAdapter_OrderItemNightRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, OrderItemNightRsp.class);
    }

    @Override
    public int encodedSize(OrderItemNightRsp value) {
      return PriceVO.ADAPTER.asRepeated().encodedSizeWithTag(1, value.priceVOList)
          + OrderItemNightVO.ADAPTER.asRepeated().encodedSizeWithTag(2, value.orderItemNightVOList)
          + (value.nightHgStatus != null ? ProtoAdapter.UINT32.encodedSizeWithTag(3, value.nightHgStatus) : 0)
          + (value.nightNumber != null ? ProtoAdapter.UINT64.encodedSizeWithTag(4, value.nightNumber) : 0)
          + (value.orgId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(5, value.orgId) : 0)
          + (value.branchId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(6, value.branchId) : 0)
          + (value.workType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(7, value.workType) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, OrderItemNightRsp value) throws IOException {
      PriceVO.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.priceVOList);
      OrderItemNightVO.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.orderItemNightVOList);
      if (value.nightHgStatus != null) ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.nightHgStatus);
      if (value.nightNumber != null) ProtoAdapter.UINT64.encodeWithTag(writer, 4, value.nightNumber);
      if (value.orgId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 5, value.orgId);
      if (value.branchId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 6, value.branchId);
      if (value.workType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 7, value.workType);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public OrderItemNightRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.priceVOList.add(PriceVO.ADAPTER.decode(reader)); break;
          case 2: builder.orderItemNightVOList.add(OrderItemNightVO.ADAPTER.decode(reader)); break;
          case 3: builder.nightHgStatus(ProtoAdapter.UINT32.decode(reader)); break;
          case 4: builder.nightNumber(ProtoAdapter.UINT64.decode(reader)); break;
          case 5: builder.orgId(ProtoAdapter.UINT64.decode(reader)); break;
          case 6: builder.branchId(ProtoAdapter.UINT64.decode(reader)); break;
          case 7: builder.workType(ProtoAdapter.UINT32.decode(reader)); break;
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
    public OrderItemNightRsp redact(OrderItemNightRsp value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.priceVOList, PriceVO.ADAPTER);
      Internal.redactElements(builder.orderItemNightVOList, OrderItemNightVO.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
