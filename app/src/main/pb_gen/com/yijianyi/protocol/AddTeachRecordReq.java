// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 2067:1
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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

/**
 * 记录带教情况
 */
public final class AddTeachRecordReq extends Message<AddTeachRecordReq, AddTeachRecordReq.Builder> {
  public static final ProtoAdapter<AddTeachRecordReq> ADAPTER = new ProtoAdapter_AddTeachRecordReq();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ORDERID = "";

  public static final String DEFAULT_STARTTIME = "";

  public static final String DEFAULT_ENDTIME = "";

  public static final Double DEFAULT_TRAINTIME = 0.0d;

  public static final Double DEFAULT_EXERCISETIME = 0.0d;

  public static final Integer DEFAULT_SELFPRAISE = 0;

  public static final Integer DEFAULT_HGPRAISE = 0;

  public static final String DEFAULT_REMARK = "";

  public static final String DEFAULT_SELFSIGN = "";

  public static final String DEFAULT_HGSIGN = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orderId;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String startTime;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String endTime;

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
  public final List<String> exerciseContent;

  /**
   * 考核内容
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> trainContent;

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

  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String remark;

  /**
   * 图片集合
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

  public AddTeachRecordReq(String orderId, String startTime, String endTime, Double trainTime, Double exerciseTime, List<String> exerciseContent, List<String> trainContent, Integer selfPraise, Integer hgPraise, String remark, List<String> pics, String selfSign, String hgSign) {
    this(orderId, startTime, endTime, trainTime, exerciseTime, exerciseContent, trainContent, selfPraise, hgPraise, remark, pics, selfSign, hgSign, ByteString.EMPTY);
  }

  public AddTeachRecordReq(String orderId, String startTime, String endTime, Double trainTime, Double exerciseTime, List<String> exerciseContent, List<String> trainContent, Integer selfPraise, Integer hgPraise, String remark, List<String> pics, String selfSign, String hgSign, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.orderId = orderId;
    this.startTime = startTime;
    this.endTime = endTime;
    this.trainTime = trainTime;
    this.exerciseTime = exerciseTime;
    this.exerciseContent = Internal.immutableCopyOf("exerciseContent", exerciseContent);
    this.trainContent = Internal.immutableCopyOf("trainContent", trainContent);
    this.selfPraise = selfPraise;
    this.hgPraise = hgPraise;
    this.remark = remark;
    this.pics = Internal.immutableCopyOf("pics", pics);
    this.selfSign = selfSign;
    this.hgSign = hgSign;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.orderId = orderId;
    builder.startTime = startTime;
    builder.endTime = endTime;
    builder.trainTime = trainTime;
    builder.exerciseTime = exerciseTime;
    builder.exerciseContent = Internal.copyOf("exerciseContent", exerciseContent);
    builder.trainContent = Internal.copyOf("trainContent", trainContent);
    builder.selfPraise = selfPraise;
    builder.hgPraise = hgPraise;
    builder.remark = remark;
    builder.pics = Internal.copyOf("pics", pics);
    builder.selfSign = selfSign;
    builder.hgSign = hgSign;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AddTeachRecordReq)) return false;
    AddTeachRecordReq o = (AddTeachRecordReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(orderId, o.orderId)
        && Internal.equals(startTime, o.startTime)
        && Internal.equals(endTime, o.endTime)
        && Internal.equals(trainTime, o.trainTime)
        && Internal.equals(exerciseTime, o.exerciseTime)
        && exerciseContent.equals(o.exerciseContent)
        && trainContent.equals(o.trainContent)
        && Internal.equals(selfPraise, o.selfPraise)
        && Internal.equals(hgPraise, o.hgPraise)
        && Internal.equals(remark, o.remark)
        && pics.equals(o.pics)
        && Internal.equals(selfSign, o.selfSign)
        && Internal.equals(hgSign, o.hgSign);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (orderId != null ? orderId.hashCode() : 0);
      result = result * 37 + (startTime != null ? startTime.hashCode() : 0);
      result = result * 37 + (endTime != null ? endTime.hashCode() : 0);
      result = result * 37 + (trainTime != null ? trainTime.hashCode() : 0);
      result = result * 37 + (exerciseTime != null ? exerciseTime.hashCode() : 0);
      result = result * 37 + exerciseContent.hashCode();
      result = result * 37 + trainContent.hashCode();
      result = result * 37 + (selfPraise != null ? selfPraise.hashCode() : 0);
      result = result * 37 + (hgPraise != null ? hgPraise.hashCode() : 0);
      result = result * 37 + (remark != null ? remark.hashCode() : 0);
      result = result * 37 + pics.hashCode();
      result = result * 37 + (selfSign != null ? selfSign.hashCode() : 0);
      result = result * 37 + (hgSign != null ? hgSign.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (orderId != null) builder.append(", orderId=").append(orderId);
    if (startTime != null) builder.append(", startTime=").append(startTime);
    if (endTime != null) builder.append(", endTime=").append(endTime);
    if (trainTime != null) builder.append(", trainTime=").append(trainTime);
    if (exerciseTime != null) builder.append(", exerciseTime=").append(exerciseTime);
    if (!exerciseContent.isEmpty()) builder.append(", exerciseContent=").append(exerciseContent);
    if (!trainContent.isEmpty()) builder.append(", trainContent=").append(trainContent);
    if (selfPraise != null) builder.append(", selfPraise=").append(selfPraise);
    if (hgPraise != null) builder.append(", hgPraise=").append(hgPraise);
    if (remark != null) builder.append(", remark=").append(remark);
    if (!pics.isEmpty()) builder.append(", pics=").append(pics);
    if (selfSign != null) builder.append(", selfSign=").append(selfSign);
    if (hgSign != null) builder.append(", hgSign=").append(hgSign);
    return builder.replace(0, 2, "AddTeachRecordReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<AddTeachRecordReq, Builder> {
    public String orderId;

    public String startTime;

    public String endTime;

    public Double trainTime;

    public Double exerciseTime;

    public List<String> exerciseContent;

    public List<String> trainContent;

    public Integer selfPraise;

    public Integer hgPraise;

    public String remark;

    public List<String> pics;

    public String selfSign;

    public String hgSign;

    public Builder() {
      exerciseContent = Internal.newMutableList();
      trainContent = Internal.newMutableList();
      pics = Internal.newMutableList();
    }

    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    public Builder startTime(String startTime) {
      this.startTime = startTime;
      return this;
    }

    public Builder endTime(String endTime) {
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
    public Builder exerciseContent(List<String> exerciseContent) {
      Internal.checkElementsNotNull(exerciseContent);
      this.exerciseContent = exerciseContent;
      return this;
    }

    /**
     * 考核内容
     */
    public Builder trainContent(List<String> trainContent) {
      Internal.checkElementsNotNull(trainContent);
      this.trainContent = trainContent;
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

    public Builder remark(String remark) {
      this.remark = remark;
      return this;
    }

    /**
     * 图片集合
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

    @Override
    public AddTeachRecordReq build() {
      return new AddTeachRecordReq(orderId, startTime, endTime, trainTime, exerciseTime, exerciseContent, trainContent, selfPraise, hgPraise, remark, pics, selfSign, hgSign, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_AddTeachRecordReq extends ProtoAdapter<AddTeachRecordReq> {
    ProtoAdapter_AddTeachRecordReq() {
      super(FieldEncoding.LENGTH_DELIMITED, AddTeachRecordReq.class);
    }

    @Override
    public int encodedSize(AddTeachRecordReq value) {
      return (value.orderId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.orderId) : 0)
          + (value.startTime != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.startTime) : 0)
          + (value.endTime != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.endTime) : 0)
          + (value.trainTime != null ? ProtoAdapter.DOUBLE.encodedSizeWithTag(4, value.trainTime) : 0)
          + (value.exerciseTime != null ? ProtoAdapter.DOUBLE.encodedSizeWithTag(5, value.exerciseTime) : 0)
          + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, value.exerciseContent)
          + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, value.trainContent)
          + (value.selfPraise != null ? ProtoAdapter.UINT32.encodedSizeWithTag(8, value.selfPraise) : 0)
          + (value.hgPraise != null ? ProtoAdapter.UINT32.encodedSizeWithTag(9, value.hgPraise) : 0)
          + (value.remark != null ? ProtoAdapter.STRING.encodedSizeWithTag(10, value.remark) : 0)
          + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(11, value.pics)
          + (value.selfSign != null ? ProtoAdapter.STRING.encodedSizeWithTag(12, value.selfSign) : 0)
          + (value.hgSign != null ? ProtoAdapter.STRING.encodedSizeWithTag(13, value.hgSign) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, AddTeachRecordReq value) throws IOException {
      if (value.orderId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.orderId);
      if (value.startTime != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.startTime);
      if (value.endTime != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.endTime);
      if (value.trainTime != null) ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, value.trainTime);
      if (value.exerciseTime != null) ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, value.exerciseTime);
      ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 6, value.exerciseContent);
      ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 7, value.trainContent);
      if (value.selfPraise != null) ProtoAdapter.UINT32.encodeWithTag(writer, 8, value.selfPraise);
      if (value.hgPraise != null) ProtoAdapter.UINT32.encodeWithTag(writer, 9, value.hgPraise);
      if (value.remark != null) ProtoAdapter.STRING.encodeWithTag(writer, 10, value.remark);
      ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 11, value.pics);
      if (value.selfSign != null) ProtoAdapter.STRING.encodeWithTag(writer, 12, value.selfSign);
      if (value.hgSign != null) ProtoAdapter.STRING.encodeWithTag(writer, 13, value.hgSign);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public AddTeachRecordReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.orderId(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.startTime(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.endTime(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.trainTime(ProtoAdapter.DOUBLE.decode(reader)); break;
          case 5: builder.exerciseTime(ProtoAdapter.DOUBLE.decode(reader)); break;
          case 6: builder.exerciseContent.add(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.trainContent.add(ProtoAdapter.STRING.decode(reader)); break;
          case 8: builder.selfPraise(ProtoAdapter.UINT32.decode(reader)); break;
          case 9: builder.hgPraise(ProtoAdapter.UINT32.decode(reader)); break;
          case 10: builder.remark(ProtoAdapter.STRING.decode(reader)); break;
          case 11: builder.pics.add(ProtoAdapter.STRING.decode(reader)); break;
          case 12: builder.selfSign(ProtoAdapter.STRING.decode(reader)); break;
          case 13: builder.hgSign(ProtoAdapter.STRING.decode(reader)); break;
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
    public AddTeachRecordReq redact(AddTeachRecordReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
