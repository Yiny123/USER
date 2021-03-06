// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: OrderModel.proto at 881:1
package com.yijianyi.protocol;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

/**
 * 带教记录
 */
public final class InsureOrderTeachRecord extends Message<InsureOrderTeachRecord, InsureOrderTeachRecord.Builder> {
  public static final ProtoAdapter<InsureOrderTeachRecord> ADAPTER = new ProtoAdapter_InsureOrderTeachRecord();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_ID = 0L;

  public static final Long DEFAULT_STARTTIME = 0L;

  public static final Long DEFAULT_ENDTIME = 0L;

  public static final Double DEFAULT_TRAINTIME = 0.0d;

  public static final Double DEFAULT_EXERCISETIME = 0.0d;

  public static final Integer DEFAULT_SELFPRAISE = 0;

  public static final Integer DEFAULT_HGPRAISE = 0;

  public static final String DEFAULT_REMARK = "";

  public static final String DEFAULT_SELFSIGN = "";

  public static final String DEFAULT_HGSIGN = "";

  public static final Long DEFAULT_CREATESTAFFID = 0L;

  public static final String DEFAULT_CREATESTAFFNAME = "";

  public static final Long DEFAULT_CREATETIME = 0L;

  public static final String DEFAULT_ORDERID = "";

  public static final Long DEFAULT_SUBSIDY = 0L;

  public static final Long DEFAULT_PRICEID = 0L;

  public static final String DEFAULT_TEACHTIMESTR = "";

  public static final String DEFAULT_CREATETIMESTR = "";

  public static final String DEFAULT_SELFSIGNURL = "";

  public static final String DEFAULT_HGSIGNURL = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long id;

  /**
   * 带教开始时间
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long startTime;

  /**
   * 带教结束时间
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long endTime;

  /**
   * 培训时长
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
  )
  public final Double trainTime;

  /**
   * 练习时长
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
  )
  public final Double exerciseTime;

  /**
   * 培训内容
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> trainContent;

  /**
   * 考核内容
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> exerciseContent;

  /**
   * 带教对象自我评价 0-无 1-已经掌握 2-要求重新带教
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer selfPraise;

  /**
   * 带教人员评价 0-无 1-已经掌握 2-需要重新带教
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer hgPraise;

  /**
   * 备注
   */
  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String remark;

  /**
   * 图片集合（多个用逗号个开）
   */
  @WireField(
      tag = 11,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> pics;

  /**
   * 带教对象签名
   */
  @WireField(
      tag = 12,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String selfSign;

  /**
   * 带教人员签名
   */
  @WireField(
      tag = 13,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String hgSign;

  /**
   * 创建员工ID
   */
  @WireField(
      tag = 14,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createStaffId;

  /**
   * 创建员工名称
   */
  @WireField(
      tag = 15,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String createStaffName;

  /**
   * 创建时间
   */
  @WireField(
      tag = 16,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createTime;

  @WireField(
      tag = 17,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orderId;

  /**
   * 补贴标准（分）
   */
  @WireField(
      tag = 18,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long subsidy;

  /**
   * 服务id
   */
  @WireField(
      tag = 19,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long priceId;

  /**
   * 培训时间
   */
  @WireField(
      tag = 20,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String teachTimeStr;

  /**
   * 记录时间
   */
  @WireField(
      tag = 21,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String createTimeStr;

  /**
   * 带教对象签名url
   */
  @WireField(
      tag = 22,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String selfSignUrl;

  /**
   * 带教人员签名url
   */
  @WireField(
      tag = 23,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String hgSignUrl;

  /**
   * 图片集合url
   */
  @WireField(
      tag = 24,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> picUrls;

  public InsureOrderTeachRecord(Long id, Long startTime, Long endTime, Double trainTime, Double exerciseTime, List<String> trainContent, List<String> exerciseContent, Integer selfPraise, Integer hgPraise, String remark, List<String> pics, String selfSign, String hgSign, Long createStaffId, String createStaffName, Long createTime, String orderId, Long subsidy, Long priceId, String teachTimeStr, String createTimeStr, String selfSignUrl, String hgSignUrl, List<String> picUrls) {
    this(id, startTime, endTime, trainTime, exerciseTime, trainContent, exerciseContent, selfPraise, hgPraise, remark, pics, selfSign, hgSign, createStaffId, createStaffName, createTime, orderId, subsidy, priceId, teachTimeStr, createTimeStr, selfSignUrl, hgSignUrl, picUrls, ByteString.EMPTY);
  }

  public InsureOrderTeachRecord(Long id, Long startTime, Long endTime, Double trainTime, Double exerciseTime, List<String> trainContent, List<String> exerciseContent, Integer selfPraise, Integer hgPraise, String remark, List<String> pics, String selfSign, String hgSign, Long createStaffId, String createStaffName, Long createTime, String orderId, Long subsidy, Long priceId, String teachTimeStr, String createTimeStr, String selfSignUrl, String hgSignUrl, List<String> picUrls, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.startTime = startTime;
    this.endTime = endTime;
    this.trainTime = trainTime;
    this.exerciseTime = exerciseTime;
    this.trainContent = Internal.immutableCopyOf("trainContent", trainContent);
    this.exerciseContent = Internal.immutableCopyOf("exerciseContent", exerciseContent);
    this.selfPraise = selfPraise;
    this.hgPraise = hgPraise;
    this.remark = remark;
    this.pics = Internal.immutableCopyOf("pics", pics);
    this.selfSign = selfSign;
    this.hgSign = hgSign;
    this.createStaffId = createStaffId;
    this.createStaffName = createStaffName;
    this.createTime = createTime;
    this.orderId = orderId;
    this.subsidy = subsidy;
    this.priceId = priceId;
    this.teachTimeStr = teachTimeStr;
    this.createTimeStr = createTimeStr;
    this.selfSignUrl = selfSignUrl;
    this.hgSignUrl = hgSignUrl;
    this.picUrls = Internal.immutableCopyOf("picUrls", picUrls);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.startTime = startTime;
    builder.endTime = endTime;
    builder.trainTime = trainTime;
    builder.exerciseTime = exerciseTime;
    builder.trainContent = Internal.copyOf("trainContent", trainContent);
    builder.exerciseContent = Internal.copyOf("exerciseContent", exerciseContent);
    builder.selfPraise = selfPraise;
    builder.hgPraise = hgPraise;
    builder.remark = remark;
    builder.pics = Internal.copyOf("pics", pics);
    builder.selfSign = selfSign;
    builder.hgSign = hgSign;
    builder.createStaffId = createStaffId;
    builder.createStaffName = createStaffName;
    builder.createTime = createTime;
    builder.orderId = orderId;
    builder.subsidy = subsidy;
    builder.priceId = priceId;
    builder.teachTimeStr = teachTimeStr;
    builder.createTimeStr = createTimeStr;
    builder.selfSignUrl = selfSignUrl;
    builder.hgSignUrl = hgSignUrl;
    builder.picUrls = Internal.copyOf("picUrls", picUrls);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof InsureOrderTeachRecord)) return false;
    InsureOrderTeachRecord o = (InsureOrderTeachRecord) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(startTime, o.startTime)
        && Internal.equals(endTime, o.endTime)
        && Internal.equals(trainTime, o.trainTime)
        && Internal.equals(exerciseTime, o.exerciseTime)
        && trainContent.equals(o.trainContent)
        && exerciseContent.equals(o.exerciseContent)
        && Internal.equals(selfPraise, o.selfPraise)
        && Internal.equals(hgPraise, o.hgPraise)
        && Internal.equals(remark, o.remark)
        && pics.equals(o.pics)
        && Internal.equals(selfSign, o.selfSign)
        && Internal.equals(hgSign, o.hgSign)
        && Internal.equals(createStaffId, o.createStaffId)
        && Internal.equals(createStaffName, o.createStaffName)
        && Internal.equals(createTime, o.createTime)
        && Internal.equals(orderId, o.orderId)
        && Internal.equals(subsidy, o.subsidy)
        && Internal.equals(priceId, o.priceId)
        && Internal.equals(teachTimeStr, o.teachTimeStr)
        && Internal.equals(createTimeStr, o.createTimeStr)
        && Internal.equals(selfSignUrl, o.selfSignUrl)
        && Internal.equals(hgSignUrl, o.hgSignUrl)
        && picUrls.equals(o.picUrls);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (startTime != null ? startTime.hashCode() : 0);
      result = result * 37 + (endTime != null ? endTime.hashCode() : 0);
      result = result * 37 + (trainTime != null ? trainTime.hashCode() : 0);
      result = result * 37 + (exerciseTime != null ? exerciseTime.hashCode() : 0);
      result = result * 37 + trainContent.hashCode();
      result = result * 37 + exerciseContent.hashCode();
      result = result * 37 + (selfPraise != null ? selfPraise.hashCode() : 0);
      result = result * 37 + (hgPraise != null ? hgPraise.hashCode() : 0);
      result = result * 37 + (remark != null ? remark.hashCode() : 0);
      result = result * 37 + pics.hashCode();
      result = result * 37 + (selfSign != null ? selfSign.hashCode() : 0);
      result = result * 37 + (hgSign != null ? hgSign.hashCode() : 0);
      result = result * 37 + (createStaffId != null ? createStaffId.hashCode() : 0);
      result = result * 37 + (createStaffName != null ? createStaffName.hashCode() : 0);
      result = result * 37 + (createTime != null ? createTime.hashCode() : 0);
      result = result * 37 + (orderId != null ? orderId.hashCode() : 0);
      result = result * 37 + (subsidy != null ? subsidy.hashCode() : 0);
      result = result * 37 + (priceId != null ? priceId.hashCode() : 0);
      result = result * 37 + (teachTimeStr != null ? teachTimeStr.hashCode() : 0);
      result = result * 37 + (createTimeStr != null ? createTimeStr.hashCode() : 0);
      result = result * 37 + (selfSignUrl != null ? selfSignUrl.hashCode() : 0);
      result = result * 37 + (hgSignUrl != null ? hgSignUrl.hashCode() : 0);
      result = result * 37 + picUrls.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (id != null) builder.append(", id=").append(id);
    if (startTime != null) builder.append(", startTime=").append(startTime);
    if (endTime != null) builder.append(", endTime=").append(endTime);
    if (trainTime != null) builder.append(", trainTime=").append(trainTime);
    if (exerciseTime != null) builder.append(", exerciseTime=").append(exerciseTime);
    if (!trainContent.isEmpty()) builder.append(", trainContent=").append(trainContent);
    if (!exerciseContent.isEmpty()) builder.append(", exerciseContent=").append(exerciseContent);
    if (selfPraise != null) builder.append(", selfPraise=").append(selfPraise);
    if (hgPraise != null) builder.append(", hgPraise=").append(hgPraise);
    if (remark != null) builder.append(", remark=").append(remark);
    if (!pics.isEmpty()) builder.append(", pics=").append(pics);
    if (selfSign != null) builder.append(", selfSign=").append(selfSign);
    if (hgSign != null) builder.append(", hgSign=").append(hgSign);
    if (createStaffId != null) builder.append(", createStaffId=").append(createStaffId);
    if (createStaffName != null) builder.append(", createStaffName=").append(createStaffName);
    if (createTime != null) builder.append(", createTime=").append(createTime);
    if (orderId != null) builder.append(", orderId=").append(orderId);
    if (subsidy != null) builder.append(", subsidy=").append(subsidy);
    if (priceId != null) builder.append(", priceId=").append(priceId);
    if (teachTimeStr != null) builder.append(", teachTimeStr=").append(teachTimeStr);
    if (createTimeStr != null) builder.append(", createTimeStr=").append(createTimeStr);
    if (selfSignUrl != null) builder.append(", selfSignUrl=").append(selfSignUrl);
    if (hgSignUrl != null) builder.append(", hgSignUrl=").append(hgSignUrl);
    if (!picUrls.isEmpty()) builder.append(", picUrls=").append(picUrls);
    return builder.replace(0, 2, "InsureOrderTeachRecord{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<InsureOrderTeachRecord, Builder> {
    public Long id;

    public Long startTime;

    public Long endTime;

    public Double trainTime;

    public Double exerciseTime;

    public List<String> trainContent;

    public List<String> exerciseContent;

    public Integer selfPraise;

    public Integer hgPraise;

    public String remark;

    public List<String> pics;

    public String selfSign;

    public String hgSign;

    public Long createStaffId;

    public String createStaffName;

    public Long createTime;

    public String orderId;

    public Long subsidy;

    public Long priceId;

    public String teachTimeStr;

    public String createTimeStr;

    public String selfSignUrl;

    public String hgSignUrl;

    public List<String> picUrls;

    public Builder() {
      trainContent = Internal.newMutableList();
      exerciseContent = Internal.newMutableList();
      pics = Internal.newMutableList();
      picUrls = Internal.newMutableList();
    }

    public Builder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     * 带教开始时间
     */
    public Builder startTime(Long startTime) {
      this.startTime = startTime;
      return this;
    }

    /**
     * 带教结束时间
     */
    public Builder endTime(Long endTime) {
      this.endTime = endTime;
      return this;
    }

    /**
     * 培训时长
     */
    public Builder trainTime(Double trainTime) {
      this.trainTime = trainTime;
      return this;
    }

    /**
     * 练习时长
     */
    public Builder exerciseTime(Double exerciseTime) {
      this.exerciseTime = exerciseTime;
      return this;
    }

    /**
     * 培训内容
     */
    public Builder trainContent(List<String> trainContent) {
      Internal.checkElementsNotNull(trainContent);
      this.trainContent = trainContent;
      return this;
    }

    /**
     * 考核内容
     */
    public Builder exerciseContent(List<String> exerciseContent) {
      Internal.checkElementsNotNull(exerciseContent);
      this.exerciseContent = exerciseContent;
      return this;
    }

    /**
     * 带教对象自我评价 0-无 1-已经掌握 2-要求重新带教
     */
    public Builder selfPraise(Integer selfPraise) {
      this.selfPraise = selfPraise;
      return this;
    }

    /**
     * 带教人员评价 0-无 1-已经掌握 2-需要重新带教
     */
    public Builder hgPraise(Integer hgPraise) {
      this.hgPraise = hgPraise;
      return this;
    }

    /**
     * 备注
     */
    public Builder remark(String remark) {
      this.remark = remark;
      return this;
    }

    /**
     * 图片集合（多个用逗号个开）
     */
    public Builder pics(List<String> pics) {
      Internal.checkElementsNotNull(pics);
      this.pics = pics;
      return this;
    }

    /**
     * 带教对象签名
     */
    public Builder selfSign(String selfSign) {
      this.selfSign = selfSign;
      return this;
    }

    /**
     * 带教人员签名
     */
    public Builder hgSign(String hgSign) {
      this.hgSign = hgSign;
      return this;
    }

    /**
     * 创建员工ID
     */
    public Builder createStaffId(Long createStaffId) {
      this.createStaffId = createStaffId;
      return this;
    }

    /**
     * 创建员工名称
     */
    public Builder createStaffName(String createStaffName) {
      this.createStaffName = createStaffName;
      return this;
    }

    /**
     * 创建时间
     */
    public Builder createTime(Long createTime) {
      this.createTime = createTime;
      return this;
    }

    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * 补贴标准（分）
     */
    public Builder subsidy(Long subsidy) {
      this.subsidy = subsidy;
      return this;
    }

    /**
     * 服务id
     */
    public Builder priceId(Long priceId) {
      this.priceId = priceId;
      return this;
    }

    /**
     * 培训时间
     */
    public Builder teachTimeStr(String teachTimeStr) {
      this.teachTimeStr = teachTimeStr;
      return this;
    }

    /**
     * 记录时间
     */
    public Builder createTimeStr(String createTimeStr) {
      this.createTimeStr = createTimeStr;
      return this;
    }

    /**
     * 带教对象签名url
     */
    public Builder selfSignUrl(String selfSignUrl) {
      this.selfSignUrl = selfSignUrl;
      return this;
    }

    /**
     * 带教人员签名url
     */
    public Builder hgSignUrl(String hgSignUrl) {
      this.hgSignUrl = hgSignUrl;
      return this;
    }

    /**
     * 图片集合url
     */
    public Builder picUrls(List<String> picUrls) {
      Internal.checkElementsNotNull(picUrls);
      this.picUrls = picUrls;
      return this;
    }

    @Override
    public InsureOrderTeachRecord build() {
      return new InsureOrderTeachRecord(id, startTime, endTime, trainTime, exerciseTime, trainContent, exerciseContent, selfPraise, hgPraise, remark, pics, selfSign, hgSign, createStaffId, createStaffName, createTime, orderId, subsidy, priceId, teachTimeStr, createTimeStr, selfSignUrl, hgSignUrl, picUrls, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_InsureOrderTeachRecord extends ProtoAdapter<InsureOrderTeachRecord> {
    ProtoAdapter_InsureOrderTeachRecord() {
      super(FieldEncoding.LENGTH_DELIMITED, InsureOrderTeachRecord.class);
    }

    @Override
    public int encodedSize(InsureOrderTeachRecord value) {
      return (value.id != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.id) : 0)
          + (value.startTime != null ? ProtoAdapter.UINT64.encodedSizeWithTag(2, value.startTime) : 0)
          + (value.endTime != null ? ProtoAdapter.UINT64.encodedSizeWithTag(3, value.endTime) : 0)
          + (value.trainTime != null ? ProtoAdapter.DOUBLE.encodedSizeWithTag(4, value.trainTime) : 0)
          + (value.exerciseTime != null ? ProtoAdapter.DOUBLE.encodedSizeWithTag(5, value.exerciseTime) : 0)
          + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, value.trainContent)
          + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, value.exerciseContent)
          + (value.selfPraise != null ? ProtoAdapter.UINT32.encodedSizeWithTag(8, value.selfPraise) : 0)
          + (value.hgPraise != null ? ProtoAdapter.UINT32.encodedSizeWithTag(9, value.hgPraise) : 0)
          + (value.remark != null ? ProtoAdapter.STRING.encodedSizeWithTag(10, value.remark) : 0)
          + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(11, value.pics)
          + (value.selfSign != null ? ProtoAdapter.STRING.encodedSizeWithTag(12, value.selfSign) : 0)
          + (value.hgSign != null ? ProtoAdapter.STRING.encodedSizeWithTag(13, value.hgSign) : 0)
          + (value.createStaffId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(14, value.createStaffId) : 0)
          + (value.createStaffName != null ? ProtoAdapter.STRING.encodedSizeWithTag(15, value.createStaffName) : 0)
          + (value.createTime != null ? ProtoAdapter.UINT64.encodedSizeWithTag(16, value.createTime) : 0)
          + (value.orderId != null ? ProtoAdapter.STRING.encodedSizeWithTag(17, value.orderId) : 0)
          + (value.subsidy != null ? ProtoAdapter.UINT64.encodedSizeWithTag(18, value.subsidy) : 0)
          + (value.priceId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(19, value.priceId) : 0)
          + (value.teachTimeStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(20, value.teachTimeStr) : 0)
          + (value.createTimeStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(21, value.createTimeStr) : 0)
          + (value.selfSignUrl != null ? ProtoAdapter.STRING.encodedSizeWithTag(22, value.selfSignUrl) : 0)
          + (value.hgSignUrl != null ? ProtoAdapter.STRING.encodedSizeWithTag(23, value.hgSignUrl) : 0)
          + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(24, value.picUrls)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, InsureOrderTeachRecord value) throws IOException {
      if (value.id != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.id);
      if (value.startTime != null) ProtoAdapter.UINT64.encodeWithTag(writer, 2, value.startTime);
      if (value.endTime != null) ProtoAdapter.UINT64.encodeWithTag(writer, 3, value.endTime);
      if (value.trainTime != null) ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, value.trainTime);
      if (value.exerciseTime != null) ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, value.exerciseTime);
      ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 6, value.trainContent);
      ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 7, value.exerciseContent);
      if (value.selfPraise != null) ProtoAdapter.UINT32.encodeWithTag(writer, 8, value.selfPraise);
      if (value.hgPraise != null) ProtoAdapter.UINT32.encodeWithTag(writer, 9, value.hgPraise);
      if (value.remark != null) ProtoAdapter.STRING.encodeWithTag(writer, 10, value.remark);
      ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 11, value.pics);
      if (value.selfSign != null) ProtoAdapter.STRING.encodeWithTag(writer, 12, value.selfSign);
      if (value.hgSign != null) ProtoAdapter.STRING.encodeWithTag(writer, 13, value.hgSign);
      if (value.createStaffId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 14, value.createStaffId);
      if (value.createStaffName != null) ProtoAdapter.STRING.encodeWithTag(writer, 15, value.createStaffName);
      if (value.createTime != null) ProtoAdapter.UINT64.encodeWithTag(writer, 16, value.createTime);
      if (value.orderId != null) ProtoAdapter.STRING.encodeWithTag(writer, 17, value.orderId);
      if (value.subsidy != null) ProtoAdapter.UINT64.encodeWithTag(writer, 18, value.subsidy);
      if (value.priceId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 19, value.priceId);
      if (value.teachTimeStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 20, value.teachTimeStr);
      if (value.createTimeStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 21, value.createTimeStr);
      if (value.selfSignUrl != null) ProtoAdapter.STRING.encodeWithTag(writer, 22, value.selfSignUrl);
      if (value.hgSignUrl != null) ProtoAdapter.STRING.encodeWithTag(writer, 23, value.hgSignUrl);
      ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 24, value.picUrls);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public InsureOrderTeachRecord decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.UINT64.decode(reader)); break;
          case 2: builder.startTime(ProtoAdapter.UINT64.decode(reader)); break;
          case 3: builder.endTime(ProtoAdapter.UINT64.decode(reader)); break;
          case 4: builder.trainTime(ProtoAdapter.DOUBLE.decode(reader)); break;
          case 5: builder.exerciseTime(ProtoAdapter.DOUBLE.decode(reader)); break;
          case 6: builder.trainContent.add(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.exerciseContent.add(ProtoAdapter.STRING.decode(reader)); break;
          case 8: builder.selfPraise(ProtoAdapter.UINT32.decode(reader)); break;
          case 9: builder.hgPraise(ProtoAdapter.UINT32.decode(reader)); break;
          case 10: builder.remark(ProtoAdapter.STRING.decode(reader)); break;
          case 11: builder.pics.add(ProtoAdapter.STRING.decode(reader)); break;
          case 12: builder.selfSign(ProtoAdapter.STRING.decode(reader)); break;
          case 13: builder.hgSign(ProtoAdapter.STRING.decode(reader)); break;
          case 14: builder.createStaffId(ProtoAdapter.UINT64.decode(reader)); break;
          case 15: builder.createStaffName(ProtoAdapter.STRING.decode(reader)); break;
          case 16: builder.createTime(ProtoAdapter.UINT64.decode(reader)); break;
          case 17: builder.orderId(ProtoAdapter.STRING.decode(reader)); break;
          case 18: builder.subsidy(ProtoAdapter.UINT64.decode(reader)); break;
          case 19: builder.priceId(ProtoAdapter.UINT64.decode(reader)); break;
          case 20: builder.teachTimeStr(ProtoAdapter.STRING.decode(reader)); break;
          case 21: builder.createTimeStr(ProtoAdapter.STRING.decode(reader)); break;
          case 22: builder.selfSignUrl(ProtoAdapter.STRING.decode(reader)); break;
          case 23: builder.hgSignUrl(ProtoAdapter.STRING.decode(reader)); break;
          case 24: builder.picUrls.add(ProtoAdapter.STRING.decode(reader)); break;
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
    public InsureOrderTeachRecord redact(InsureOrderTeachRecord value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
