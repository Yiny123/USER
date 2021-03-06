// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: SaasModel.proto at 1423:1
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
 * 客户端护士护工信息VO
 */
public final class HGInfoVO extends Message<HGInfoVO, HGInfoVO.Builder> {
  public static final ProtoAdapter<HGInfoVO> ADAPTER = new ProtoAdapter_HGInfoVO();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_ID = 0L;

  public static final String DEFAULT_HEADIMG = "";

  public static final String DEFAULT_HGNAME = "";

  public static final Integer DEFAULT_SEX = 0;

  public static final Integer DEFAULT_AGE = 0;

  public static final String DEFAULT_NATIVEPLACE = "";

  public static final Integer DEFAULT_SERVICENUM = 0;

  public static final String DEFAULT_COMPANYNAME = "";

  public static final String DEFAULT_HGNO = "";

  public static final String DEFAULT_LANGUAGE = "";

  public static final Integer DEFAULT_EXP = 0;

  public static final String DEFAULT_GOODATPROJECT = "";

  public static final String DEFAULT_HEALTHCERTIFICATE = "";

  public static final String DEFAULT_NURSINGCERTIFICATE = "";

  public static final String DEFAULT_SERVICEORG = "";

  public static final String DEFAULT_PHONE = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long id;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String headImg;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String hgName;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer sex;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer age;

  /**
   * 籍贯
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String nativeplace;

  /**
   * 已服务人数
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer serviceNum;

  @WireField(
      tag = 11,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String companyName;

  /**
   * 工号
   */
  @WireField(
      tag = 12,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String hgNO;

  /**
   * 多种语言用、分割
   */
  @WireField(
      tag = 13,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String language;

  /**
   * 工作经验
   */
  @WireField(
      tag = 14,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer exp;

  /**
   * 擅长项目
   */
  @WireField(
      tag = 15,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String goodAtProject;

  /**
   * 健康证（护理师独有）
   */
  @WireField(
      tag = 16,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String healthCertificate;

  /**
   * 护理证（护理师独有）
   */
  @WireField(
      tag = 17,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String nursingCertificate;

  /**
   * 任职医院（护士独有）
   */
  @WireField(
      tag = 18,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String serviceOrg;

  @WireField(
      tag = 19,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String phone;

  public HGInfoVO(Long id, String headImg, String hgName, Integer sex, Integer age, String nativeplace, Integer serviceNum, String companyName, String hgNO, String language, Integer exp, String goodAtProject, String healthCertificate, String nursingCertificate, String serviceOrg, String phone) {
    this(id, headImg, hgName, sex, age, nativeplace, serviceNum, companyName, hgNO, language, exp, goodAtProject, healthCertificate, nursingCertificate, serviceOrg, phone, ByteString.EMPTY);
  }

  public HGInfoVO(Long id, String headImg, String hgName, Integer sex, Integer age, String nativeplace, Integer serviceNum, String companyName, String hgNO, String language, Integer exp, String goodAtProject, String healthCertificate, String nursingCertificate, String serviceOrg, String phone, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.headImg = headImg;
    this.hgName = hgName;
    this.sex = sex;
    this.age = age;
    this.nativeplace = nativeplace;
    this.serviceNum = serviceNum;
    this.companyName = companyName;
    this.hgNO = hgNO;
    this.language = language;
    this.exp = exp;
    this.goodAtProject = goodAtProject;
    this.healthCertificate = healthCertificate;
    this.nursingCertificate = nursingCertificate;
    this.serviceOrg = serviceOrg;
    this.phone = phone;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.headImg = headImg;
    builder.hgName = hgName;
    builder.sex = sex;
    builder.age = age;
    builder.nativeplace = nativeplace;
    builder.serviceNum = serviceNum;
    builder.companyName = companyName;
    builder.hgNO = hgNO;
    builder.language = language;
    builder.exp = exp;
    builder.goodAtProject = goodAtProject;
    builder.healthCertificate = healthCertificate;
    builder.nursingCertificate = nursingCertificate;
    builder.serviceOrg = serviceOrg;
    builder.phone = phone;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof HGInfoVO)) return false;
    HGInfoVO o = (HGInfoVO) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(headImg, o.headImg)
        && Internal.equals(hgName, o.hgName)
        && Internal.equals(sex, o.sex)
        && Internal.equals(age, o.age)
        && Internal.equals(nativeplace, o.nativeplace)
        && Internal.equals(serviceNum, o.serviceNum)
        && Internal.equals(companyName, o.companyName)
        && Internal.equals(hgNO, o.hgNO)
        && Internal.equals(language, o.language)
        && Internal.equals(exp, o.exp)
        && Internal.equals(goodAtProject, o.goodAtProject)
        && Internal.equals(healthCertificate, o.healthCertificate)
        && Internal.equals(nursingCertificate, o.nursingCertificate)
        && Internal.equals(serviceOrg, o.serviceOrg)
        && Internal.equals(phone, o.phone);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (headImg != null ? headImg.hashCode() : 0);
      result = result * 37 + (hgName != null ? hgName.hashCode() : 0);
      result = result * 37 + (sex != null ? sex.hashCode() : 0);
      result = result * 37 + (age != null ? age.hashCode() : 0);
      result = result * 37 + (nativeplace != null ? nativeplace.hashCode() : 0);
      result = result * 37 + (serviceNum != null ? serviceNum.hashCode() : 0);
      result = result * 37 + (companyName != null ? companyName.hashCode() : 0);
      result = result * 37 + (hgNO != null ? hgNO.hashCode() : 0);
      result = result * 37 + (language != null ? language.hashCode() : 0);
      result = result * 37 + (exp != null ? exp.hashCode() : 0);
      result = result * 37 + (goodAtProject != null ? goodAtProject.hashCode() : 0);
      result = result * 37 + (healthCertificate != null ? healthCertificate.hashCode() : 0);
      result = result * 37 + (nursingCertificate != null ? nursingCertificate.hashCode() : 0);
      result = result * 37 + (serviceOrg != null ? serviceOrg.hashCode() : 0);
      result = result * 37 + (phone != null ? phone.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (id != null) builder.append(", id=").append(id);
    if (headImg != null) builder.append(", headImg=").append(headImg);
    if (hgName != null) builder.append(", hgName=").append(hgName);
    if (sex != null) builder.append(", sex=").append(sex);
    if (age != null) builder.append(", age=").append(age);
    if (nativeplace != null) builder.append(", nativeplace=").append(nativeplace);
    if (serviceNum != null) builder.append(", serviceNum=").append(serviceNum);
    if (companyName != null) builder.append(", companyName=").append(companyName);
    if (hgNO != null) builder.append(", hgNO=").append(hgNO);
    if (language != null) builder.append(", language=").append(language);
    if (exp != null) builder.append(", exp=").append(exp);
    if (goodAtProject != null) builder.append(", goodAtProject=").append(goodAtProject);
    if (healthCertificate != null) builder.append(", healthCertificate=").append(healthCertificate);
    if (nursingCertificate != null) builder.append(", nursingCertificate=").append(nursingCertificate);
    if (serviceOrg != null) builder.append(", serviceOrg=").append(serviceOrg);
    if (phone != null) builder.append(", phone=").append(phone);
    return builder.replace(0, 2, "HGInfoVO{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<HGInfoVO, Builder> {
    public Long id;

    public String headImg;

    public String hgName;

    public Integer sex;

    public Integer age;

    public String nativeplace;

    public Integer serviceNum;

    public String companyName;

    public String hgNO;

    public String language;

    public Integer exp;

    public String goodAtProject;

    public String healthCertificate;

    public String nursingCertificate;

    public String serviceOrg;

    public String phone;

    public Builder() {
    }

    public Builder id(Long id) {
      this.id = id;
      return this;
    }

    public Builder headImg(String headImg) {
      this.headImg = headImg;
      return this;
    }

    public Builder hgName(String hgName) {
      this.hgName = hgName;
      return this;
    }

    public Builder sex(Integer sex) {
      this.sex = sex;
      return this;
    }

    public Builder age(Integer age) {
      this.age = age;
      return this;
    }

    /**
     * 籍贯
     */
    public Builder nativeplace(String nativeplace) {
      this.nativeplace = nativeplace;
      return this;
    }

    /**
     * 已服务人数
     */
    public Builder serviceNum(Integer serviceNum) {
      this.serviceNum = serviceNum;
      return this;
    }

    public Builder companyName(String companyName) {
      this.companyName = companyName;
      return this;
    }

    /**
     * 工号
     */
    public Builder hgNO(String hgNO) {
      this.hgNO = hgNO;
      return this;
    }

    /**
     * 多种语言用、分割
     */
    public Builder language(String language) {
      this.language = language;
      return this;
    }

    /**
     * 工作经验
     */
    public Builder exp(Integer exp) {
      this.exp = exp;
      return this;
    }

    /**
     * 擅长项目
     */
    public Builder goodAtProject(String goodAtProject) {
      this.goodAtProject = goodAtProject;
      return this;
    }

    /**
     * 健康证（护理师独有）
     */
    public Builder healthCertificate(String healthCertificate) {
      this.healthCertificate = healthCertificate;
      return this;
    }

    /**
     * 护理证（护理师独有）
     */
    public Builder nursingCertificate(String nursingCertificate) {
      this.nursingCertificate = nursingCertificate;
      return this;
    }

    /**
     * 任职医院（护士独有）
     */
    public Builder serviceOrg(String serviceOrg) {
      this.serviceOrg = serviceOrg;
      return this;
    }

    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    @Override
    public HGInfoVO build() {
      return new HGInfoVO(id, headImg, hgName, sex, age, nativeplace, serviceNum, companyName, hgNO, language, exp, goodAtProject, healthCertificate, nursingCertificate, serviceOrg, phone, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_HGInfoVO extends ProtoAdapter<HGInfoVO> {
    ProtoAdapter_HGInfoVO() {
      super(FieldEncoding.LENGTH_DELIMITED, HGInfoVO.class);
    }

    @Override
    public int encodedSize(HGInfoVO value) {
      return (value.id != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.id) : 0)
          + (value.headImg != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.headImg) : 0)
          + (value.hgName != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.hgName) : 0)
          + (value.sex != null ? ProtoAdapter.UINT32.encodedSizeWithTag(4, value.sex) : 0)
          + (value.age != null ? ProtoAdapter.UINT32.encodedSizeWithTag(5, value.age) : 0)
          + (value.nativeplace != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.nativeplace) : 0)
          + (value.serviceNum != null ? ProtoAdapter.UINT32.encodedSizeWithTag(7, value.serviceNum) : 0)
          + (value.companyName != null ? ProtoAdapter.STRING.encodedSizeWithTag(11, value.companyName) : 0)
          + (value.hgNO != null ? ProtoAdapter.STRING.encodedSizeWithTag(12, value.hgNO) : 0)
          + (value.language != null ? ProtoAdapter.STRING.encodedSizeWithTag(13, value.language) : 0)
          + (value.exp != null ? ProtoAdapter.UINT32.encodedSizeWithTag(14, value.exp) : 0)
          + (value.goodAtProject != null ? ProtoAdapter.STRING.encodedSizeWithTag(15, value.goodAtProject) : 0)
          + (value.healthCertificate != null ? ProtoAdapter.STRING.encodedSizeWithTag(16, value.healthCertificate) : 0)
          + (value.nursingCertificate != null ? ProtoAdapter.STRING.encodedSizeWithTag(17, value.nursingCertificate) : 0)
          + (value.serviceOrg != null ? ProtoAdapter.STRING.encodedSizeWithTag(18, value.serviceOrg) : 0)
          + (value.phone != null ? ProtoAdapter.STRING.encodedSizeWithTag(19, value.phone) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, HGInfoVO value) throws IOException {
      if (value.id != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.id);
      if (value.headImg != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.headImg);
      if (value.hgName != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.hgName);
      if (value.sex != null) ProtoAdapter.UINT32.encodeWithTag(writer, 4, value.sex);
      if (value.age != null) ProtoAdapter.UINT32.encodeWithTag(writer, 5, value.age);
      if (value.nativeplace != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.nativeplace);
      if (value.serviceNum != null) ProtoAdapter.UINT32.encodeWithTag(writer, 7, value.serviceNum);
      if (value.companyName != null) ProtoAdapter.STRING.encodeWithTag(writer, 11, value.companyName);
      if (value.hgNO != null) ProtoAdapter.STRING.encodeWithTag(writer, 12, value.hgNO);
      if (value.language != null) ProtoAdapter.STRING.encodeWithTag(writer, 13, value.language);
      if (value.exp != null) ProtoAdapter.UINT32.encodeWithTag(writer, 14, value.exp);
      if (value.goodAtProject != null) ProtoAdapter.STRING.encodeWithTag(writer, 15, value.goodAtProject);
      if (value.healthCertificate != null) ProtoAdapter.STRING.encodeWithTag(writer, 16, value.healthCertificate);
      if (value.nursingCertificate != null) ProtoAdapter.STRING.encodeWithTag(writer, 17, value.nursingCertificate);
      if (value.serviceOrg != null) ProtoAdapter.STRING.encodeWithTag(writer, 18, value.serviceOrg);
      if (value.phone != null) ProtoAdapter.STRING.encodeWithTag(writer, 19, value.phone);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public HGInfoVO decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.UINT64.decode(reader)); break;
          case 2: builder.headImg(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.hgName(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.sex(ProtoAdapter.UINT32.decode(reader)); break;
          case 5: builder.age(ProtoAdapter.UINT32.decode(reader)); break;
          case 6: builder.nativeplace(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.serviceNum(ProtoAdapter.UINT32.decode(reader)); break;
          case 11: builder.companyName(ProtoAdapter.STRING.decode(reader)); break;
          case 12: builder.hgNO(ProtoAdapter.STRING.decode(reader)); break;
          case 13: builder.language(ProtoAdapter.STRING.decode(reader)); break;
          case 14: builder.exp(ProtoAdapter.UINT32.decode(reader)); break;
          case 15: builder.goodAtProject(ProtoAdapter.STRING.decode(reader)); break;
          case 16: builder.healthCertificate(ProtoAdapter.STRING.decode(reader)); break;
          case 17: builder.nursingCertificate(ProtoAdapter.STRING.decode(reader)); break;
          case 18: builder.serviceOrg(ProtoAdapter.STRING.decode(reader)); break;
          case 19: builder.phone(ProtoAdapter.STRING.decode(reader)); break;
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
    public HGInfoVO redact(HGInfoVO value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
