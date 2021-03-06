// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: SaasModel.proto at 1100:1
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
 * 护士评估
 */
public final class AssessVO extends Message<AssessVO, AssessVO.Builder> {
  public static final ProtoAdapter<AssessVO> ADAPTER = new ProtoAdapter_AssessVO();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_INSURENOID = "";

  public static final String DEFAULT_KINSNAME = "";

  public static final Integer DEFAULT_SEX = 0;

  public static final Integer DEFAULT_AGE = 0;

  public static final String DEFAULT_USERNAME = "";

  public static final String DEFAULT_PHONE = "";

  public static final String DEFAULT_KFREMARK = "";

  public static final String DEFAULT_DETAIL = "";

  public static final String DEFAULT_HSREMARK = "";

  /**
   * 申请编号
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String insureNOId;

  /**
   * 全名
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String kinsName;

  /**
   * 性别 1- 男 2-女
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer sex;

  /**
   * 年龄
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer age;

  /**
   * 用户姓名
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String userName;

  /**
   * 用户手机号
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String phone;

  /**
   * 客服备注
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String kfRemark;

  /**
   * 联系地址
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String Detail;

  /**
   * 护士备注
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String hsRemark;

  public AssessVO(String insureNOId, String kinsName, Integer sex, Integer age, String userName, String phone, String kfRemark, String Detail, String hsRemark) {
    this(insureNOId, kinsName, sex, age, userName, phone, kfRemark, Detail, hsRemark, ByteString.EMPTY);
  }

  public AssessVO(String insureNOId, String kinsName, Integer sex, Integer age, String userName, String phone, String kfRemark, String Detail, String hsRemark, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.insureNOId = insureNOId;
    this.kinsName = kinsName;
    this.sex = sex;
    this.age = age;
    this.userName = userName;
    this.phone = phone;
    this.kfRemark = kfRemark;
    this.Detail = Detail;
    this.hsRemark = hsRemark;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.insureNOId = insureNOId;
    builder.kinsName = kinsName;
    builder.sex = sex;
    builder.age = age;
    builder.userName = userName;
    builder.phone = phone;
    builder.kfRemark = kfRemark;
    builder.Detail = Detail;
    builder.hsRemark = hsRemark;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AssessVO)) return false;
    AssessVO o = (AssessVO) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(insureNOId, o.insureNOId)
        && Internal.equals(kinsName, o.kinsName)
        && Internal.equals(sex, o.sex)
        && Internal.equals(age, o.age)
        && Internal.equals(userName, o.userName)
        && Internal.equals(phone, o.phone)
        && Internal.equals(kfRemark, o.kfRemark)
        && Internal.equals(Detail, o.Detail)
        && Internal.equals(hsRemark, o.hsRemark);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (insureNOId != null ? insureNOId.hashCode() : 0);
      result = result * 37 + (kinsName != null ? kinsName.hashCode() : 0);
      result = result * 37 + (sex != null ? sex.hashCode() : 0);
      result = result * 37 + (age != null ? age.hashCode() : 0);
      result = result * 37 + (userName != null ? userName.hashCode() : 0);
      result = result * 37 + (phone != null ? phone.hashCode() : 0);
      result = result * 37 + (kfRemark != null ? kfRemark.hashCode() : 0);
      result = result * 37 + (Detail != null ? Detail.hashCode() : 0);
      result = result * 37 + (hsRemark != null ? hsRemark.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (insureNOId != null) builder.append(", insureNOId=").append(insureNOId);
    if (kinsName != null) builder.append(", kinsName=").append(kinsName);
    if (sex != null) builder.append(", sex=").append(sex);
    if (age != null) builder.append(", age=").append(age);
    if (userName != null) builder.append(", userName=").append(userName);
    if (phone != null) builder.append(", phone=").append(phone);
    if (kfRemark != null) builder.append(", kfRemark=").append(kfRemark);
    if (Detail != null) builder.append(", Detail=").append(Detail);
    if (hsRemark != null) builder.append(", hsRemark=").append(hsRemark);
    return builder.replace(0, 2, "AssessVO{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<AssessVO, Builder> {
    public String insureNOId;

    public String kinsName;

    public Integer sex;

    public Integer age;

    public String userName;

    public String phone;

    public String kfRemark;

    public String Detail;

    public String hsRemark;

    public Builder() {
    }

    /**
     * 申请编号
     */
    public Builder insureNOId(String insureNOId) {
      this.insureNOId = insureNOId;
      return this;
    }

    /**
     * 全名
     */
    public Builder kinsName(String kinsName) {
      this.kinsName = kinsName;
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

    /**
     * 客服备注
     */
    public Builder kfRemark(String kfRemark) {
      this.kfRemark = kfRemark;
      return this;
    }

    /**
     * 联系地址
     */
    public Builder Detail(String Detail) {
      this.Detail = Detail;
      return this;
    }

    /**
     * 护士备注
     */
    public Builder hsRemark(String hsRemark) {
      this.hsRemark = hsRemark;
      return this;
    }

    @Override
    public AssessVO build() {
      return new AssessVO(insureNOId, kinsName, sex, age, userName, phone, kfRemark, Detail, hsRemark, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_AssessVO extends ProtoAdapter<AssessVO> {
    ProtoAdapter_AssessVO() {
      super(FieldEncoding.LENGTH_DELIMITED, AssessVO.class);
    }

    @Override
    public int encodedSize(AssessVO value) {
      return (value.insureNOId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.insureNOId) : 0)
          + (value.kinsName != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.kinsName) : 0)
          + (value.sex != null ? ProtoAdapter.UINT32.encodedSizeWithTag(3, value.sex) : 0)
          + (value.age != null ? ProtoAdapter.UINT32.encodedSizeWithTag(4, value.age) : 0)
          + (value.userName != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, value.userName) : 0)
          + (value.phone != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.phone) : 0)
          + (value.kfRemark != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, value.kfRemark) : 0)
          + (value.Detail != null ? ProtoAdapter.STRING.encodedSizeWithTag(8, value.Detail) : 0)
          + (value.hsRemark != null ? ProtoAdapter.STRING.encodedSizeWithTag(9, value.hsRemark) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, AssessVO value) throws IOException {
      if (value.insureNOId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.insureNOId);
      if (value.kinsName != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.kinsName);
      if (value.sex != null) ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.sex);
      if (value.age != null) ProtoAdapter.UINT32.encodeWithTag(writer, 4, value.age);
      if (value.userName != null) ProtoAdapter.STRING.encodeWithTag(writer, 5, value.userName);
      if (value.phone != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.phone);
      if (value.kfRemark != null) ProtoAdapter.STRING.encodeWithTag(writer, 7, value.kfRemark);
      if (value.Detail != null) ProtoAdapter.STRING.encodeWithTag(writer, 8, value.Detail);
      if (value.hsRemark != null) ProtoAdapter.STRING.encodeWithTag(writer, 9, value.hsRemark);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public AssessVO decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.insureNOId(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.kinsName(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.sex(ProtoAdapter.UINT32.decode(reader)); break;
          case 4: builder.age(ProtoAdapter.UINT32.decode(reader)); break;
          case 5: builder.userName(ProtoAdapter.STRING.decode(reader)); break;
          case 6: builder.phone(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.kfRemark(ProtoAdapter.STRING.decode(reader)); break;
          case 8: builder.Detail(ProtoAdapter.STRING.decode(reader)); break;
          case 9: builder.hsRemark(ProtoAdapter.STRING.decode(reader)); break;
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
    public AssessVO redact(AssessVO value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
