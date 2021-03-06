// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: OrderModel.proto at 643:1
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
import okio.ByteString;

/**
 * 订单列表VO
 */
public final class OrderListVO extends Message<OrderListVO, OrderListVO.Builder> {
  public static final ProtoAdapter<OrderListVO> ADAPTER = new ProtoAdapter_OrderListVO();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ORDERID = "";

  public static final Integer DEFAULT_STATUS = 0;

  public static final String DEFAULT_STATUSSTR = "";

  public static final String DEFAULT_KINSNAME = "";

  public static final String DEFAULT_CREATETIME = "";

  public static final Integer DEFAULT_ORDERTYPE = 0;

  public static final String DEFAULT_KFPHONE = "";

  public static final String DEFAULT_ACTIONSTR = "";

  public static final String DEFAULT_SERVICEITEM = "";

  public static final Integer DEFAULT_SERVICETYPE = 0;

  public static final Integer DEFAULT_CONDITION = 0;

  public static final String DEFAULT_CONDITIONSTR = "";

  public static final String DEFAULT_ADDRDETAIL = "";

  public static final Long DEFAULT_PRICEID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orderId;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer status;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String statusStr;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String kinsName;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String createTime;

  /**
   * 订单类型 1-机构订单 2-居家订单 3-长护险订单
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer orderType;

  /**
   * 催单电话
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String kfPhone;

  /**
   * 操作描述
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String actionStr;

  /**
   * 服务项目
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String serviceItem;

  /**
   * 服务类型
   */
  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer serviceType;

  /**
   * 订单流转状态（不同于status）-1-已取消 0-待接单 1-待支付 2-待发放 3-已发放 4-待指派 5-已指派 6-待服务 7-服务中8-待结算  9-待评价 10-已完成
   */
  @WireField(
      tag = 11,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer condition;

  @WireField(
      tag = 12,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String conditionStr;

  /**
   * 地址
   */
  @WireField(
      tag = 13,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String addrDetail;

  @WireField(
      tag = 14,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long priceId;

  public OrderListVO(String orderId, Integer status, String statusStr, String kinsName, String createTime, Integer orderType, String kfPhone, String actionStr, String serviceItem, Integer serviceType, Integer condition, String conditionStr, String addrDetail, Long priceId) {
    this(orderId, status, statusStr, kinsName, createTime, orderType, kfPhone, actionStr, serviceItem, serviceType, condition, conditionStr, addrDetail, priceId, ByteString.EMPTY);
  }

  public OrderListVO(String orderId, Integer status, String statusStr, String kinsName, String createTime, Integer orderType, String kfPhone, String actionStr, String serviceItem, Integer serviceType, Integer condition, String conditionStr, String addrDetail, Long priceId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.orderId = orderId;
    this.status = status;
    this.statusStr = statusStr;
    this.kinsName = kinsName;
    this.createTime = createTime;
    this.orderType = orderType;
    this.kfPhone = kfPhone;
    this.actionStr = actionStr;
    this.serviceItem = serviceItem;
    this.serviceType = serviceType;
    this.condition = condition;
    this.conditionStr = conditionStr;
    this.addrDetail = addrDetail;
    this.priceId = priceId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.orderId = orderId;
    builder.status = status;
    builder.statusStr = statusStr;
    builder.kinsName = kinsName;
    builder.createTime = createTime;
    builder.orderType = orderType;
    builder.kfPhone = kfPhone;
    builder.actionStr = actionStr;
    builder.serviceItem = serviceItem;
    builder.serviceType = serviceType;
    builder.condition = condition;
    builder.conditionStr = conditionStr;
    builder.addrDetail = addrDetail;
    builder.priceId = priceId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof OrderListVO)) return false;
    OrderListVO o = (OrderListVO) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(orderId, o.orderId)
        && Internal.equals(status, o.status)
        && Internal.equals(statusStr, o.statusStr)
        && Internal.equals(kinsName, o.kinsName)
        && Internal.equals(createTime, o.createTime)
        && Internal.equals(orderType, o.orderType)
        && Internal.equals(kfPhone, o.kfPhone)
        && Internal.equals(actionStr, o.actionStr)
        && Internal.equals(serviceItem, o.serviceItem)
        && Internal.equals(serviceType, o.serviceType)
        && Internal.equals(condition, o.condition)
        && Internal.equals(conditionStr, o.conditionStr)
        && Internal.equals(addrDetail, o.addrDetail)
        && Internal.equals(priceId, o.priceId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (orderId != null ? orderId.hashCode() : 0);
      result = result * 37 + (status != null ? status.hashCode() : 0);
      result = result * 37 + (statusStr != null ? statusStr.hashCode() : 0);
      result = result * 37 + (kinsName != null ? kinsName.hashCode() : 0);
      result = result * 37 + (createTime != null ? createTime.hashCode() : 0);
      result = result * 37 + (orderType != null ? orderType.hashCode() : 0);
      result = result * 37 + (kfPhone != null ? kfPhone.hashCode() : 0);
      result = result * 37 + (actionStr != null ? actionStr.hashCode() : 0);
      result = result * 37 + (serviceItem != null ? serviceItem.hashCode() : 0);
      result = result * 37 + (serviceType != null ? serviceType.hashCode() : 0);
      result = result * 37 + (condition != null ? condition.hashCode() : 0);
      result = result * 37 + (conditionStr != null ? conditionStr.hashCode() : 0);
      result = result * 37 + (addrDetail != null ? addrDetail.hashCode() : 0);
      result = result * 37 + (priceId != null ? priceId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (orderId != null) builder.append(", orderId=").append(orderId);
    if (status != null) builder.append(", status=").append(status);
    if (statusStr != null) builder.append(", statusStr=").append(statusStr);
    if (kinsName != null) builder.append(", kinsName=").append(kinsName);
    if (createTime != null) builder.append(", createTime=").append(createTime);
    if (orderType != null) builder.append(", orderType=").append(orderType);
    if (kfPhone != null) builder.append(", kfPhone=").append(kfPhone);
    if (actionStr != null) builder.append(", actionStr=").append(actionStr);
    if (serviceItem != null) builder.append(", serviceItem=").append(serviceItem);
    if (serviceType != null) builder.append(", serviceType=").append(serviceType);
    if (condition != null) builder.append(", condition=").append(condition);
    if (conditionStr != null) builder.append(", conditionStr=").append(conditionStr);
    if (addrDetail != null) builder.append(", addrDetail=").append(addrDetail);
    if (priceId != null) builder.append(", priceId=").append(priceId);
    return builder.replace(0, 2, "OrderListVO{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<OrderListVO, Builder> {
    public String orderId;

    public Integer status;

    public String statusStr;

    public String kinsName;

    public String createTime;

    public Integer orderType;

    public String kfPhone;

    public String actionStr;

    public String serviceItem;

    public Integer serviceType;

    public Integer condition;

    public String conditionStr;

    public String addrDetail;

    public Long priceId;

    public Builder() {
    }

    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    public Builder status(Integer status) {
      this.status = status;
      return this;
    }

    public Builder statusStr(String statusStr) {
      this.statusStr = statusStr;
      return this;
    }

    public Builder kinsName(String kinsName) {
      this.kinsName = kinsName;
      return this;
    }

    public Builder createTime(String createTime) {
      this.createTime = createTime;
      return this;
    }

    /**
     * 订单类型 1-机构订单 2-居家订单 3-长护险订单
     */
    public Builder orderType(Integer orderType) {
      this.orderType = orderType;
      return this;
    }

    /**
     * 催单电话
     */
    public Builder kfPhone(String kfPhone) {
      this.kfPhone = kfPhone;
      return this;
    }

    /**
     * 操作描述
     */
    public Builder actionStr(String actionStr) {
      this.actionStr = actionStr;
      return this;
    }

    /**
     * 服务项目
     */
    public Builder serviceItem(String serviceItem) {
      this.serviceItem = serviceItem;
      return this;
    }

    /**
     * 服务类型
     */
    public Builder serviceType(Integer serviceType) {
      this.serviceType = serviceType;
      return this;
    }

    /**
     * 订单流转状态（不同于status）-1-已取消 0-待接单 1-待支付 2-待发放 3-已发放 4-待指派 5-已指派 6-待服务 7-服务中8-待结算  9-待评价 10-已完成
     */
    public Builder condition(Integer condition) {
      this.condition = condition;
      return this;
    }

    public Builder conditionStr(String conditionStr) {
      this.conditionStr = conditionStr;
      return this;
    }

    /**
     * 地址
     */
    public Builder addrDetail(String addrDetail) {
      this.addrDetail = addrDetail;
      return this;
    }

    public Builder priceId(Long priceId) {
      this.priceId = priceId;
      return this;
    }

    @Override
    public OrderListVO build() {
      return new OrderListVO(orderId, status, statusStr, kinsName, createTime, orderType, kfPhone, actionStr, serviceItem, serviceType, condition, conditionStr, addrDetail, priceId, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_OrderListVO extends ProtoAdapter<OrderListVO> {
    ProtoAdapter_OrderListVO() {
      super(FieldEncoding.LENGTH_DELIMITED, OrderListVO.class);
    }

    @Override
    public int encodedSize(OrderListVO value) {
      return (value.orderId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.orderId) : 0)
          + (value.status != null ? ProtoAdapter.INT32.encodedSizeWithTag(2, value.status) : 0)
          + (value.statusStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.statusStr) : 0)
          + (value.kinsName != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.kinsName) : 0)
          + (value.createTime != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, value.createTime) : 0)
          + (value.orderType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(6, value.orderType) : 0)
          + (value.kfPhone != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, value.kfPhone) : 0)
          + (value.actionStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(8, value.actionStr) : 0)
          + (value.serviceItem != null ? ProtoAdapter.STRING.encodedSizeWithTag(9, value.serviceItem) : 0)
          + (value.serviceType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(10, value.serviceType) : 0)
          + (value.condition != null ? ProtoAdapter.INT32.encodedSizeWithTag(11, value.condition) : 0)
          + (value.conditionStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(12, value.conditionStr) : 0)
          + (value.addrDetail != null ? ProtoAdapter.STRING.encodedSizeWithTag(13, value.addrDetail) : 0)
          + (value.priceId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(14, value.priceId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, OrderListVO value) throws IOException {
      if (value.orderId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.orderId);
      if (value.status != null) ProtoAdapter.INT32.encodeWithTag(writer, 2, value.status);
      if (value.statusStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.statusStr);
      if (value.kinsName != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.kinsName);
      if (value.createTime != null) ProtoAdapter.STRING.encodeWithTag(writer, 5, value.createTime);
      if (value.orderType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 6, value.orderType);
      if (value.kfPhone != null) ProtoAdapter.STRING.encodeWithTag(writer, 7, value.kfPhone);
      if (value.actionStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 8, value.actionStr);
      if (value.serviceItem != null) ProtoAdapter.STRING.encodeWithTag(writer, 9, value.serviceItem);
      if (value.serviceType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 10, value.serviceType);
      if (value.condition != null) ProtoAdapter.INT32.encodeWithTag(writer, 11, value.condition);
      if (value.conditionStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 12, value.conditionStr);
      if (value.addrDetail != null) ProtoAdapter.STRING.encodeWithTag(writer, 13, value.addrDetail);
      if (value.priceId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 14, value.priceId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public OrderListVO decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.orderId(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.status(ProtoAdapter.INT32.decode(reader)); break;
          case 3: builder.statusStr(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.kinsName(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.createTime(ProtoAdapter.STRING.decode(reader)); break;
          case 6: builder.orderType(ProtoAdapter.UINT32.decode(reader)); break;
          case 7: builder.kfPhone(ProtoAdapter.STRING.decode(reader)); break;
          case 8: builder.actionStr(ProtoAdapter.STRING.decode(reader)); break;
          case 9: builder.serviceItem(ProtoAdapter.STRING.decode(reader)); break;
          case 10: builder.serviceType(ProtoAdapter.UINT32.decode(reader)); break;
          case 11: builder.condition(ProtoAdapter.INT32.decode(reader)); break;
          case 12: builder.conditionStr(ProtoAdapter.STRING.decode(reader)); break;
          case 13: builder.addrDetail(ProtoAdapter.STRING.decode(reader)); break;
          case 14: builder.priceId(ProtoAdapter.UINT64.decode(reader)); break;
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
    public OrderListVO redact(OrderListVO value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
