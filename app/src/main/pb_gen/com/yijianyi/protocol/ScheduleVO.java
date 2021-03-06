// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: SaasModel.proto at 1086:1
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
 * 日程表
 */
public final class ScheduleVO extends Message<ScheduleVO, ScheduleVO.Builder> {
  public static final ProtoAdapter<ScheduleVO> ADAPTER = new ProtoAdapter_ScheduleVO();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_INSURENOID = "";

  public static final String DEFAULT_ITEMS = "";

  public static final String DEFAULT_FULLNAME = "";

  public static final Integer DEFAULT_SEX = 0;

  public static final Integer DEFAULT_AGE = 0;

  public static final String DEFAULT_USERNAME = "";

  public static final String DEFAULT_PHONE = "";

  public static final Long DEFAULT_CREATETIME = 0L;

  public static final Integer DEFAULT_ITEMTYPE = 0;

  public static final String DEFAULT_ORDERID = "";

  /**
   * 长护护险申请id
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String insureNOId;

  /**
   * 事项
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String items;

  /**
   * 全名
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String fullName;

  /**
   * 性别 1- 男 2-女
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer sex;

  /**
   * 年龄
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer age;

  /**
   * 用户姓名
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String userName;

  /**
   * 用户手机号
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String phone;

  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createTime;

  /**
   * 事项类型 1：长护险申请评估 2：医疗服务 3：长护险下单预约
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer itemType;

  /**
   * 订单id
   */
  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orderId;

  public ScheduleVO(String insureNOId, String items, String fullName, Integer sex, Integer age, String userName, String phone, Long createTime, Integer itemType, String orderId) {
    this(insureNOId, items, fullName, sex, age, userName, phone, createTime, itemType, orderId, ByteString.EMPTY);
  }

  public ScheduleVO(String insureNOId, String items, String fullName, Integer sex, Integer age, String userName, String phone, Long createTime, Integer itemType, String orderId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.insureNOId = insureNOId;
    this.items = items;
    this.fullName = fullName;
    this.sex = sex;
    this.age = age;
    this.userName = userName;
    this.phone = phone;
    this.createTime = createTime;
    this.itemType = itemType;
    this.orderId = orderId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.insureNOId = insureNOId;
    builder.items = items;
    builder.fullName = fullName;
    builder.sex = sex;
    builder.age = age;
    builder.userName = userName;
    builder.phone = phone;
    builder.createTime = createTime;
    builder.itemType = itemType;
    builder.orderId = orderId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ScheduleVO)) return false;
    ScheduleVO o = (ScheduleVO) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(insureNOId, o.insureNOId)
        && Internal.equals(items, o.items)
        && Internal.equals(fullName, o.fullName)
        && Internal.equals(sex, o.sex)
        && Internal.equals(age, o.age)
        && Internal.equals(userName, o.userName)
        && Internal.equals(phone, o.phone)
        && Internal.equals(createTime, o.createTime)
        && Internal.equals(itemType, o.itemType)
        && Internal.equals(orderId, o.orderId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (insureNOId != null ? insureNOId.hashCode() : 0);
      result = result * 37 + (items != null ? items.hashCode() : 0);
      result = result * 37 + (fullName != null ? fullName.hashCode() : 0);
      result = result * 37 + (sex != null ? sex.hashCode() : 0);
      result = result * 37 + (age != null ? age.hashCode() : 0);
      result = result * 37 + (userName != null ? userName.hashCode() : 0);
      result = result * 37 + (phone != null ? phone.hashCode() : 0);
      result = result * 37 + (createTime != null ? createTime.hashCode() : 0);
      result = result * 37 + (itemType != null ? itemType.hashCode() : 0);
      result = result * 37 + (orderId != null ? orderId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (insureNOId != null) builder.append(", insureNOId=").append(insureNOId);
    if (items != null) builder.append(", items=").append(items);
    if (fullName != null) builder.append(", fullName=").append(fullName);
    if (sex != null) builder.append(", sex=").append(sex);
    if (age != null) builder.append(", age=").append(age);
    if (userName != null) builder.append(", userName=").append(userName);
    if (phone != null) builder.append(", phone=").append(phone);
    if (createTime != null) builder.append(", createTime=").append(createTime);
    if (itemType != null) builder.append(", itemType=").append(itemType);
    if (orderId != null) builder.append(", orderId=").append(orderId);
    return builder.replace(0, 2, "ScheduleVO{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<ScheduleVO, Builder> {
    public String insureNOId;

    public String items;

    public String fullName;

    public Integer sex;

    public Integer age;

    public String userName;

    public String phone;

    public Long createTime;

    public Integer itemType;

    public String orderId;

    public Builder() {
    }

    /**
     * 长护护险申请id
     */
    public Builder insureNOId(String insureNOId) {
      this.insureNOId = insureNOId;
      return this;
    }

    /**
     * 事项
     */
    public Builder items(String items) {
      this.items = items;
      return this;
    }

    /**
     * 全名
     */
    public Builder fullName(String fullName) {
      this.fullName = fullName;
      return this;
    }

    /**
     * 性别 1- 男 2-女
     */
    public Builder sex(Integer sex) {
      this.sex = sex;
      return this;
    }

    /**
     * 年龄
     */
    public Builder age(Integer age) {
      this.age = age;
      return this;
    }

    /**
     * 用户姓名
     */
    public Builder userName(String userName) {
      this.userName = userName;
      return this;
    }

    /**
     * 用户手机号
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    public Builder createTime(Long createTime) {
      this.createTime = createTime;
      return this;
    }

    /**
     * 事项类型 1：长护险申请评估 2：医疗服务 3：长护险下单预约
     */
    public Builder itemType(Integer itemType) {
      this.itemType = itemType;
      return this;
    }

    /**
     * 订单id
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    @Override
    public ScheduleVO build() {
      return new ScheduleVO(insureNOId, items, fullName, sex, age, userName, phone, createTime, itemType, orderId, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_ScheduleVO extends ProtoAdapter<ScheduleVO> {
    ProtoAdapter_ScheduleVO() {
      super(FieldEncoding.LENGTH_DELIMITED, ScheduleVO.class);
    }

    @Override
    public int encodedSize(ScheduleVO value) {
      return (value.insureNOId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.insureNOId) : 0)
          + (value.items != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.items) : 0)
          + (value.fullName != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.fullName) : 0)
          + (value.sex != null ? ProtoAdapter.UINT32.encodedSizeWithTag(4, value.sex) : 0)
          + (value.age != null ? ProtoAdapter.UINT32.encodedSizeWithTag(5, value.age) : 0)
          + (value.userName != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.userName) : 0)
          + (value.phone != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, value.phone) : 0)
          + (value.createTime != null ? ProtoAdapter.UINT64.encodedSizeWithTag(8, value.createTime) : 0)
          + (value.itemType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(9, value.itemType) : 0)
          + (value.orderId != null ? ProtoAdapter.STRING.encodedSizeWithTag(10, value.orderId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, ScheduleVO value) throws IOException {
      if (value.insureNOId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.insureNOId);
      if (value.items != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.items);
      if (value.fullName != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.fullName);
      if (value.sex != null) ProtoAdapter.UINT32.encodeWithTag(writer, 4, value.sex);
      if (value.age != null) ProtoAdapter.UINT32.encodeWithTag(writer, 5, value.age);
      if (value.userName != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.userName);
      if (value.phone != null) ProtoAdapter.STRING.encodeWithTag(writer, 7, value.phone);
      if (value.createTime != null) ProtoAdapter.UINT64.encodeWithTag(writer, 8, value.createTime);
      if (value.itemType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 9, value.itemType);
      if (value.orderId != null) ProtoAdapter.STRING.encodeWithTag(writer, 10, value.orderId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public ScheduleVO decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.insureNOId(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.items(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.fullName(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.sex(ProtoAdapter.UINT32.decode(reader)); break;
          case 5: builder.age(ProtoAdapter.UINT32.decode(reader)); break;
          case 6: builder.userName(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.phone(ProtoAdapter.STRING.decode(reader)); break;
          case 8: builder.createTime(ProtoAdapter.UINT64.decode(reader)); break;
          case 9: builder.itemType(ProtoAdapter.UINT32.decode(reader)); break;
          case 10: builder.orderId(ProtoAdapter.STRING.decode(reader)); break;
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
    public ScheduleVO redact(ScheduleVO value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
