// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1692:1
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

public final class GetOrderTendDetailRsp extends Message<GetOrderTendDetailRsp, GetOrderTendDetailRsp.Builder> {
  public static final ProtoAdapter<GetOrderTendDetailRsp> ADAPTER = new ProtoAdapter_GetOrderTendDetailRsp();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ORDERID = "";

  public static final Long DEFAULT_ORDERTENDID = 0L;

  public static final String DEFAULT_TITLE = "";

  public static final String DEFAULT_TIMESTR = "";

  public static final String DEFAULT_HGNAME = "";

  public static final String DEFAULT_STATUSSTR = "";

  public static final Integer DEFAULT_STATUS = 0;

  public static final String DEFAULT_TENDDETIAL = "";

  public static final String DEFAULT_REJECTREASON = "";

  public static final String DEFAULT_CREATETIMESTR = "";

  public static final Integer DEFAULT_WORDNUM = 0;

  /**
   * 订单id
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orderId;

  /**
   * 自照计划id
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long orderTendId;

  /**
   * 标题
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String title;

  /**
   * 生效时间
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String timeStr;

  /**
   * 制定护士
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String hgName;

  /**
   * 审核状态
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String statusStr;

  /**
   * 审核状态 状态 0-草稿 1-待审核 2-执行中 3-已完成 4-审核不通过
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer status;

  /**
   * 内容
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String tendDetial;

  /**
   * 驳回理由
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String rejectReason;

  @WireField(
      tag = 10,
      adapter = "com.yijianyi.protocol.InsureOrderTendDetailBO#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<InsureOrderTendDetailBO> detailBOList;

  /**
   * 创建时间
   */
  @WireField(
      tag = 11,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String createTimeStr;

  /**
   * 总字数
   */
  @WireField(
      tag = 12,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer wordNum;

  public GetOrderTendDetailRsp(String orderId, Long orderTendId, String title, String timeStr, String hgName, String statusStr, Integer status, String tendDetial, String rejectReason, List<InsureOrderTendDetailBO> detailBOList, String createTimeStr, Integer wordNum) {
    this(orderId, orderTendId, title, timeStr, hgName, statusStr, status, tendDetial, rejectReason, detailBOList, createTimeStr, wordNum, ByteString.EMPTY);
  }

  public GetOrderTendDetailRsp(String orderId, Long orderTendId, String title, String timeStr, String hgName, String statusStr, Integer status, String tendDetial, String rejectReason, List<InsureOrderTendDetailBO> detailBOList, String createTimeStr, Integer wordNum, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.orderId = orderId;
    this.orderTendId = orderTendId;
    this.title = title;
    this.timeStr = timeStr;
    this.hgName = hgName;
    this.statusStr = statusStr;
    this.status = status;
    this.tendDetial = tendDetial;
    this.rejectReason = rejectReason;
    this.detailBOList = Internal.immutableCopyOf("detailBOList", detailBOList);
    this.createTimeStr = createTimeStr;
    this.wordNum = wordNum;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.orderId = orderId;
    builder.orderTendId = orderTendId;
    builder.title = title;
    builder.timeStr = timeStr;
    builder.hgName = hgName;
    builder.statusStr = statusStr;
    builder.status = status;
    builder.tendDetial = tendDetial;
    builder.rejectReason = rejectReason;
    builder.detailBOList = Internal.copyOf("detailBOList", detailBOList);
    builder.createTimeStr = createTimeStr;
    builder.wordNum = wordNum;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetOrderTendDetailRsp)) return false;
    GetOrderTendDetailRsp o = (GetOrderTendDetailRsp) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(orderId, o.orderId)
        && Internal.equals(orderTendId, o.orderTendId)
        && Internal.equals(title, o.title)
        && Internal.equals(timeStr, o.timeStr)
        && Internal.equals(hgName, o.hgName)
        && Internal.equals(statusStr, o.statusStr)
        && Internal.equals(status, o.status)
        && Internal.equals(tendDetial, o.tendDetial)
        && Internal.equals(rejectReason, o.rejectReason)
        && detailBOList.equals(o.detailBOList)
        && Internal.equals(createTimeStr, o.createTimeStr)
        && Internal.equals(wordNum, o.wordNum);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (orderId != null ? orderId.hashCode() : 0);
      result = result * 37 + (orderTendId != null ? orderTendId.hashCode() : 0);
      result = result * 37 + (title != null ? title.hashCode() : 0);
      result = result * 37 + (timeStr != null ? timeStr.hashCode() : 0);
      result = result * 37 + (hgName != null ? hgName.hashCode() : 0);
      result = result * 37 + (statusStr != null ? statusStr.hashCode() : 0);
      result = result * 37 + (status != null ? status.hashCode() : 0);
      result = result * 37 + (tendDetial != null ? tendDetial.hashCode() : 0);
      result = result * 37 + (rejectReason != null ? rejectReason.hashCode() : 0);
      result = result * 37 + detailBOList.hashCode();
      result = result * 37 + (createTimeStr != null ? createTimeStr.hashCode() : 0);
      result = result * 37 + (wordNum != null ? wordNum.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (orderId != null) builder.append(", orderId=").append(orderId);
    if (orderTendId != null) builder.append(", orderTendId=").append(orderTendId);
    if (title != null) builder.append(", title=").append(title);
    if (timeStr != null) builder.append(", timeStr=").append(timeStr);
    if (hgName != null) builder.append(", hgName=").append(hgName);
    if (statusStr != null) builder.append(", statusStr=").append(statusStr);
    if (status != null) builder.append(", status=").append(status);
    if (tendDetial != null) builder.append(", tendDetial=").append(tendDetial);
    if (rejectReason != null) builder.append(", rejectReason=").append(rejectReason);
    if (!detailBOList.isEmpty()) builder.append(", detailBOList=").append(detailBOList);
    if (createTimeStr != null) builder.append(", createTimeStr=").append(createTimeStr);
    if (wordNum != null) builder.append(", wordNum=").append(wordNum);
    return builder.replace(0, 2, "GetOrderTendDetailRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetOrderTendDetailRsp, Builder> {
    public String orderId;

    public Long orderTendId;

    public String title;

    public String timeStr;

    public String hgName;

    public String statusStr;

    public Integer status;

    public String tendDetial;

    public String rejectReason;

    public List<InsureOrderTendDetailBO> detailBOList;

    public String createTimeStr;

    public Integer wordNum;

    public Builder() {
      detailBOList = Internal.newMutableList();
    }

    /**
     * 订单id
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * 自照计划id
     */
    public Builder orderTendId(Long orderTendId) {
      this.orderTendId = orderTendId;
      return this;
    }

    /**
     * 标题
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * 生效时间
     */
    public Builder timeStr(String timeStr) {
      this.timeStr = timeStr;
      return this;
    }

    /**
     * 制定护士
     */
    public Builder hgName(String hgName) {
      this.hgName = hgName;
      return this;
    }

    /**
     * 审核状态
     */
    public Builder statusStr(String statusStr) {
      this.statusStr = statusStr;
      return this;
    }

    /**
     * 审核状态 状态 0-草稿 1-待审核 2-执行中 3-已完成 4-审核不通过
     */
    public Builder status(Integer status) {
      this.status = status;
      return this;
    }

    /**
     * 内容
     */
    public Builder tendDetial(String tendDetial) {
      this.tendDetial = tendDetial;
      return this;
    }

    /**
     * 驳回理由
     */
    public Builder rejectReason(String rejectReason) {
      this.rejectReason = rejectReason;
      return this;
    }

    public Builder detailBOList(List<InsureOrderTendDetailBO> detailBOList) {
      Internal.checkElementsNotNull(detailBOList);
      this.detailBOList = detailBOList;
      return this;
    }

    /**
     * 创建时间
     */
    public Builder createTimeStr(String createTimeStr) {
      this.createTimeStr = createTimeStr;
      return this;
    }

    /**
     * 总字数
     */
    public Builder wordNum(Integer wordNum) {
      this.wordNum = wordNum;
      return this;
    }

    @Override
    public GetOrderTendDetailRsp build() {
      return new GetOrderTendDetailRsp(orderId, orderTendId, title, timeStr, hgName, statusStr, status, tendDetial, rejectReason, detailBOList, createTimeStr, wordNum, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetOrderTendDetailRsp extends ProtoAdapter<GetOrderTendDetailRsp> {
    ProtoAdapter_GetOrderTendDetailRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, GetOrderTendDetailRsp.class);
    }

    @Override
    public int encodedSize(GetOrderTendDetailRsp value) {
      return (value.orderId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.orderId) : 0)
          + (value.orderTendId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(2, value.orderTendId) : 0)
          + (value.title != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.title) : 0)
          + (value.timeStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.timeStr) : 0)
          + (value.hgName != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, value.hgName) : 0)
          + (value.statusStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.statusStr) : 0)
          + (value.status != null ? ProtoAdapter.UINT32.encodedSizeWithTag(7, value.status) : 0)
          + (value.tendDetial != null ? ProtoAdapter.STRING.encodedSizeWithTag(8, value.tendDetial) : 0)
          + (value.rejectReason != null ? ProtoAdapter.STRING.encodedSizeWithTag(9, value.rejectReason) : 0)
          + InsureOrderTendDetailBO.ADAPTER.asRepeated().encodedSizeWithTag(10, value.detailBOList)
          + (value.createTimeStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(11, value.createTimeStr) : 0)
          + (value.wordNum != null ? ProtoAdapter.UINT32.encodedSizeWithTag(12, value.wordNum) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetOrderTendDetailRsp value) throws IOException {
      if (value.orderId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.orderId);
      if (value.orderTendId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 2, value.orderTendId);
      if (value.title != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.title);
      if (value.timeStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.timeStr);
      if (value.hgName != null) ProtoAdapter.STRING.encodeWithTag(writer, 5, value.hgName);
      if (value.statusStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.statusStr);
      if (value.status != null) ProtoAdapter.UINT32.encodeWithTag(writer, 7, value.status);
      if (value.tendDetial != null) ProtoAdapter.STRING.encodeWithTag(writer, 8, value.tendDetial);
      if (value.rejectReason != null) ProtoAdapter.STRING.encodeWithTag(writer, 9, value.rejectReason);
      InsureOrderTendDetailBO.ADAPTER.asRepeated().encodeWithTag(writer, 10, value.detailBOList);
      if (value.createTimeStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 11, value.createTimeStr);
      if (value.wordNum != null) ProtoAdapter.UINT32.encodeWithTag(writer, 12, value.wordNum);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetOrderTendDetailRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.orderId(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.orderTendId(ProtoAdapter.UINT64.decode(reader)); break;
          case 3: builder.title(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.timeStr(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.hgName(ProtoAdapter.STRING.decode(reader)); break;
          case 6: builder.statusStr(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.status(ProtoAdapter.UINT32.decode(reader)); break;
          case 8: builder.tendDetial(ProtoAdapter.STRING.decode(reader)); break;
          case 9: builder.rejectReason(ProtoAdapter.STRING.decode(reader)); break;
          case 10: builder.detailBOList.add(InsureOrderTendDetailBO.ADAPTER.decode(reader)); break;
          case 11: builder.createTimeStr(ProtoAdapter.STRING.decode(reader)); break;
          case 12: builder.wordNum(ProtoAdapter.UINT32.decode(reader)); break;
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
    public GetOrderTendDetailRsp redact(GetOrderTendDetailRsp value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.detailBOList, InsureOrderTendDetailBO.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}