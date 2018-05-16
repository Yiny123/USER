// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: SaasModel.proto at 662:1
package com.yijianyi.protocol;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

public final class OrgVO extends Message<OrgVO, OrgVO.Builder> {
  public static final ProtoAdapter<OrgVO> ADAPTER = new ProtoAdapter_OrgVO();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ORGNAME = "";

  public static final Long DEFAULT_SERVICEDNUMBER = 0L;

  public static final Integer DEFAULT_WORKER = 0;

  public static final String DEFAULT_ORGLEVELSTR = "";

  public static final Integer DEFAULT_ORGLEVEL = 0;

  public static final Long DEFAULT_ORGID = 0L;

  public static final Boolean DEFAULT_ISHIS = false;

  public static final Boolean DEFAULT_ISLOCATION = false;

  public static final Integer DEFAULT_HISTYPE = 0;

  /**
   * 机构名
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orgName;

  /**
   * 被服务的人数
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long servicedNumber;

  /**
   * 护理员数量
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer worker;

  /**
   * 机构等级
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orgLevelStr;

  /**
   * 机构等级
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer orgLevel;

  /**
   * 机构id
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long orgId;

  /**
   * 标签
   */
  @WireField(
      tag = 7,
      adapter = "com.yijianyi.protocol.OrgTagVO#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<OrgTagVO> tagList;

  /**
   * 是否对接机构his系统
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean isHis;

  /**
   * 是否为定位机构
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean isLocation;

  /**
   * 医院类型 1-对接his 2-未对接his 3-小医院（不需要拍照直接下单）
   */
  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer hisType;

  public OrgVO(String orgName, Long servicedNumber, Integer worker, String orgLevelStr, Integer orgLevel, Long orgId, List<OrgTagVO> tagList, Boolean isHis, Boolean isLocation, Integer hisType) {
    this(orgName, servicedNumber, worker, orgLevelStr, orgLevel, orgId, tagList, isHis, isLocation, hisType, ByteString.EMPTY);
  }

  public OrgVO(String orgName, Long servicedNumber, Integer worker, String orgLevelStr, Integer orgLevel, Long orgId, List<OrgTagVO> tagList, Boolean isHis, Boolean isLocation, Integer hisType, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.orgName = orgName;
    this.servicedNumber = servicedNumber;
    this.worker = worker;
    this.orgLevelStr = orgLevelStr;
    this.orgLevel = orgLevel;
    this.orgId = orgId;
    this.tagList = Internal.immutableCopyOf("tagList", tagList);
    this.isHis = isHis;
    this.isLocation = isLocation;
    this.hisType = hisType;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.orgName = orgName;
    builder.servicedNumber = servicedNumber;
    builder.worker = worker;
    builder.orgLevelStr = orgLevelStr;
    builder.orgLevel = orgLevel;
    builder.orgId = orgId;
    builder.tagList = Internal.copyOf("tagList", tagList);
    builder.isHis = isHis;
    builder.isLocation = isLocation;
    builder.hisType = hisType;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof OrgVO)) return false;
    OrgVO o = (OrgVO) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(orgName, o.orgName)
        && Internal.equals(servicedNumber, o.servicedNumber)
        && Internal.equals(worker, o.worker)
        && Internal.equals(orgLevelStr, o.orgLevelStr)
        && Internal.equals(orgLevel, o.orgLevel)
        && Internal.equals(orgId, o.orgId)
        && tagList.equals(o.tagList)
        && Internal.equals(isHis, o.isHis)
        && Internal.equals(isLocation, o.isLocation)
        && Internal.equals(hisType, o.hisType);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (orgName != null ? orgName.hashCode() : 0);
      result = result * 37 + (servicedNumber != null ? servicedNumber.hashCode() : 0);
      result = result * 37 + (worker != null ? worker.hashCode() : 0);
      result = result * 37 + (orgLevelStr != null ? orgLevelStr.hashCode() : 0);
      result = result * 37 + (orgLevel != null ? orgLevel.hashCode() : 0);
      result = result * 37 + (orgId != null ? orgId.hashCode() : 0);
      result = result * 37 + tagList.hashCode();
      result = result * 37 + (isHis != null ? isHis.hashCode() : 0);
      result = result * 37 + (isLocation != null ? isLocation.hashCode() : 0);
      result = result * 37 + (hisType != null ? hisType.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (orgName != null) builder.append(", orgName=").append(orgName);
    if (servicedNumber != null) builder.append(", servicedNumber=").append(servicedNumber);
    if (worker != null) builder.append(", worker=").append(worker);
    if (orgLevelStr != null) builder.append(", orgLevelStr=").append(orgLevelStr);
    if (orgLevel != null) builder.append(", orgLevel=").append(orgLevel);
    if (orgId != null) builder.append(", orgId=").append(orgId);
    if (!tagList.isEmpty()) builder.append(", tagList=").append(tagList);
    if (isHis != null) builder.append(", isHis=").append(isHis);
    if (isLocation != null) builder.append(", isLocation=").append(isLocation);
    if (hisType != null) builder.append(", hisType=").append(hisType);
    return builder.replace(0, 2, "OrgVO{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<OrgVO, Builder> {
    public String orgName;

    public Long servicedNumber;

    public Integer worker;

    public String orgLevelStr;

    public Integer orgLevel;

    public Long orgId;

    public List<OrgTagVO> tagList;

    public Boolean isHis;

    public Boolean isLocation;

    public Integer hisType;

    public Builder() {
      tagList = Internal.newMutableList();
    }

    /**
     * 机构名
     */
    public Builder orgName(String orgName) {
      this.orgName = orgName;
      return this;
    }

    /**
     * 被服务的人数
     */
    public Builder servicedNumber(Long servicedNumber) {
      this.servicedNumber = servicedNumber;
      return this;
    }

    /**
     * 护理员数量
     */
    public Builder worker(Integer worker) {
      this.worker = worker;
      return this;
    }

    /**
     * 机构等级
     */
    public Builder orgLevelStr(String orgLevelStr) {
      this.orgLevelStr = orgLevelStr;
      return this;
    }

    /**
     * 机构等级
     */
    public Builder orgLevel(Integer orgLevel) {
      this.orgLevel = orgLevel;
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
     * 标签
     */
    public Builder tagList(List<OrgTagVO> tagList) {
      Internal.checkElementsNotNull(tagList);
      this.tagList = tagList;
      return this;
    }

    /**
     * 是否对接机构his系统
     */
    public Builder isHis(Boolean isHis) {
      this.isHis = isHis;
      return this;
    }

    /**
     * 是否为定位机构
     */
    public Builder isLocation(Boolean isLocation) {
      this.isLocation = isLocation;
      return this;
    }

    /**
     * 医院类型 1-对接his 2-未对接his 3-小医院（不需要拍照直接下单）
     */
    public Builder hisType(Integer hisType) {
      this.hisType = hisType;
      return this;
    }

    @Override
    public OrgVO build() {
      return new OrgVO(orgName, servicedNumber, worker, orgLevelStr, orgLevel, orgId, tagList, isHis, isLocation, hisType, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_OrgVO extends ProtoAdapter<OrgVO> {
    ProtoAdapter_OrgVO() {
      super(FieldEncoding.LENGTH_DELIMITED, OrgVO.class);
    }

    @Override
    public int encodedSize(OrgVO value) {
      return (value.orgName != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.orgName) : 0)
          + (value.servicedNumber != null ? ProtoAdapter.UINT64.encodedSizeWithTag(2, value.servicedNumber) : 0)
          + (value.worker != null ? ProtoAdapter.UINT32.encodedSizeWithTag(3, value.worker) : 0)
          + (value.orgLevelStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.orgLevelStr) : 0)
          + (value.orgLevel != null ? ProtoAdapter.UINT32.encodedSizeWithTag(5, value.orgLevel) : 0)
          + (value.orgId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(6, value.orgId) : 0)
          + OrgTagVO.ADAPTER.asRepeated().encodedSizeWithTag(7, value.tagList)
          + (value.isHis != null ? ProtoAdapter.BOOL.encodedSizeWithTag(8, value.isHis) : 0)
          + (value.isLocation != null ? ProtoAdapter.BOOL.encodedSizeWithTag(9, value.isLocation) : 0)
          + (value.hisType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(10, value.hisType) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, OrgVO value) throws IOException {
      if (value.orgName != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.orgName);
      if (value.servicedNumber != null) ProtoAdapter.UINT64.encodeWithTag(writer, 2, value.servicedNumber);
      if (value.worker != null) ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.worker);
      if (value.orgLevelStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.orgLevelStr);
      if (value.orgLevel != null) ProtoAdapter.UINT32.encodeWithTag(writer, 5, value.orgLevel);
      if (value.orgId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 6, value.orgId);
      OrgTagVO.ADAPTER.asRepeated().encodeWithTag(writer, 7, value.tagList);
      if (value.isHis != null) ProtoAdapter.BOOL.encodeWithTag(writer, 8, value.isHis);
      if (value.isLocation != null) ProtoAdapter.BOOL.encodeWithTag(writer, 9, value.isLocation);
      if (value.hisType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 10, value.hisType);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public OrgVO decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.orgName(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.servicedNumber(ProtoAdapter.UINT64.decode(reader)); break;
          case 3: builder.worker(ProtoAdapter.UINT32.decode(reader)); break;
          case 4: builder.orgLevelStr(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.orgLevel(ProtoAdapter.UINT32.decode(reader)); break;
          case 6: builder.orgId(ProtoAdapter.UINT64.decode(reader)); break;
          case 7: builder.tagList.add(OrgTagVO.ADAPTER.decode(reader)); break;
          case 8: builder.isHis(ProtoAdapter.BOOL.decode(reader)); break;
          case 9: builder.isLocation(ProtoAdapter.BOOL.decode(reader)); break;
          case 10: builder.hisType(ProtoAdapter.UINT32.decode(reader)); break;
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
    public OrgVO redact(OrgVO value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.tagList, OrgTagVO.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
