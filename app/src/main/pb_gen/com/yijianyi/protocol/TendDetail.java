// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: Insure.proto at 32:1
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
 * 照护明细
 */
public final class TendDetail extends Message<TendDetail, TendDetail.Builder> {
  public static final ProtoAdapter<TendDetail> ADAPTER = new ProtoAdapter_TendDetail();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_ID = 0L;

  public static final String DEFAULT_TENDDETAIL = "";

  public static final Long DEFAULT_DETAILTYPEID = 0L;

  public static final String DEFAULT_DETAILTYPENAME = "";

  public static final Long DEFAULT_ILLNESSID = 0L;

  public static final String DEFAULT_ILLNESSNAME = "";

  public static final Integer DEFAULT_STATUS = 0;

  public static final Long DEFAULT_CREATESTAFFID = 0L;

  public static final String DEFAULT_CREATESTAFFNAME = "";

  public static final Long DEFAULT_CREATETIME = 0L;

  public static final Long DEFAULT_COMPANYID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long id;

  /**
   * 照护明细内容
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String tendDetail;

  /**
   * 照护明细类型id
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long detailTypeId;

  /**
   * 照护明细类型名称
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String detailTypeName;

  /**
   * 适用病症id
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long illnessId;

  /**
   * 病症名称
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String illnessName;

  /**
   * 状态 0-正常 -1-已删除
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer status;

  /**
   * 创建员工ID
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createStaffId;

  /**
   * 创建员工名称
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String createStaffName;

  /**
   * 创建时间
   */
  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createTime;

  /**
   * 公司id
   */
  @WireField(
      tag = 11,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long companyId;

  public TendDetail(Long id, String tendDetail, Long detailTypeId, String detailTypeName, Long illnessId, String illnessName, Integer status, Long createStaffId, String createStaffName, Long createTime, Long companyId) {
    this(id, tendDetail, detailTypeId, detailTypeName, illnessId, illnessName, status, createStaffId, createStaffName, createTime, companyId, ByteString.EMPTY);
  }

  public TendDetail(Long id, String tendDetail, Long detailTypeId, String detailTypeName, Long illnessId, String illnessName, Integer status, Long createStaffId, String createStaffName, Long createTime, Long companyId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.tendDetail = tendDetail;
    this.detailTypeId = detailTypeId;
    this.detailTypeName = detailTypeName;
    this.illnessId = illnessId;
    this.illnessName = illnessName;
    this.status = status;
    this.createStaffId = createStaffId;
    this.createStaffName = createStaffName;
    this.createTime = createTime;
    this.companyId = companyId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.tendDetail = tendDetail;
    builder.detailTypeId = detailTypeId;
    builder.detailTypeName = detailTypeName;
    builder.illnessId = illnessId;
    builder.illnessName = illnessName;
    builder.status = status;
    builder.createStaffId = createStaffId;
    builder.createStaffName = createStaffName;
    builder.createTime = createTime;
    builder.companyId = companyId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof TendDetail)) return false;
    TendDetail o = (TendDetail) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(tendDetail, o.tendDetail)
        && Internal.equals(detailTypeId, o.detailTypeId)
        && Internal.equals(detailTypeName, o.detailTypeName)
        && Internal.equals(illnessId, o.illnessId)
        && Internal.equals(illnessName, o.illnessName)
        && Internal.equals(status, o.status)
        && Internal.equals(createStaffId, o.createStaffId)
        && Internal.equals(createStaffName, o.createStaffName)
        && Internal.equals(createTime, o.createTime)
        && Internal.equals(companyId, o.companyId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (tendDetail != null ? tendDetail.hashCode() : 0);
      result = result * 37 + (detailTypeId != null ? detailTypeId.hashCode() : 0);
      result = result * 37 + (detailTypeName != null ? detailTypeName.hashCode() : 0);
      result = result * 37 + (illnessId != null ? illnessId.hashCode() : 0);
      result = result * 37 + (illnessName != null ? illnessName.hashCode() : 0);
      result = result * 37 + (status != null ? status.hashCode() : 0);
      result = result * 37 + (createStaffId != null ? createStaffId.hashCode() : 0);
      result = result * 37 + (createStaffName != null ? createStaffName.hashCode() : 0);
      result = result * 37 + (createTime != null ? createTime.hashCode() : 0);
      result = result * 37 + (companyId != null ? companyId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (id != null) builder.append(", id=").append(id);
    if (tendDetail != null) builder.append(", tendDetail=").append(tendDetail);
    if (detailTypeId != null) builder.append(", detailTypeId=").append(detailTypeId);
    if (detailTypeName != null) builder.append(", detailTypeName=").append(detailTypeName);
    if (illnessId != null) builder.append(", illnessId=").append(illnessId);
    if (illnessName != null) builder.append(", illnessName=").append(illnessName);
    if (status != null) builder.append(", status=").append(status);
    if (createStaffId != null) builder.append(", createStaffId=").append(createStaffId);
    if (createStaffName != null) builder.append(", createStaffName=").append(createStaffName);
    if (createTime != null) builder.append(", createTime=").append(createTime);
    if (companyId != null) builder.append(", companyId=").append(companyId);
    return builder.replace(0, 2, "TendDetail{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<TendDetail, Builder> {
    public Long id;

    public String tendDetail;

    public Long detailTypeId;

    public String detailTypeName;

    public Long illnessId;

    public String illnessName;

    public Integer status;

    public Long createStaffId;

    public String createStaffName;

    public Long createTime;

    public Long companyId;

    public Builder() {
    }

    public Builder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     * 照护明细内容
     */
    public Builder tendDetail(String tendDetail) {
      this.tendDetail = tendDetail;
      return this;
    }

    /**
     * 照护明细类型id
     */
    public Builder detailTypeId(Long detailTypeId) {
      this.detailTypeId = detailTypeId;
      return this;
    }

    /**
     * 照护明细类型名称
     */
    public Builder detailTypeName(String detailTypeName) {
      this.detailTypeName = detailTypeName;
      return this;
    }

    /**
     * 适用病症id
     */
    public Builder illnessId(Long illnessId) {
      this.illnessId = illnessId;
      return this;
    }

    /**
     * 病症名称
     */
    public Builder illnessName(String illnessName) {
      this.illnessName = illnessName;
      return this;
    }

    /**
     * 状态 0-正常 -1-已删除
     */
    public Builder status(Integer status) {
      this.status = status;
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

    /**
     * 公司id
     */
    public Builder companyId(Long companyId) {
      this.companyId = companyId;
      return this;
    }

    @Override
    public TendDetail build() {
      return new TendDetail(id, tendDetail, detailTypeId, detailTypeName, illnessId, illnessName, status, createStaffId, createStaffName, createTime, companyId, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_TendDetail extends ProtoAdapter<TendDetail> {
    ProtoAdapter_TendDetail() {
      super(FieldEncoding.LENGTH_DELIMITED, TendDetail.class);
    }

    @Override
    public int encodedSize(TendDetail value) {
      return (value.id != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.id) : 0)
          + (value.tendDetail != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.tendDetail) : 0)
          + (value.detailTypeId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(3, value.detailTypeId) : 0)
          + (value.detailTypeName != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.detailTypeName) : 0)
          + (value.illnessId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(5, value.illnessId) : 0)
          + (value.illnessName != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.illnessName) : 0)
          + (value.status != null ? ProtoAdapter.INT32.encodedSizeWithTag(7, value.status) : 0)
          + (value.createStaffId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(8, value.createStaffId) : 0)
          + (value.createStaffName != null ? ProtoAdapter.STRING.encodedSizeWithTag(9, value.createStaffName) : 0)
          + (value.createTime != null ? ProtoAdapter.UINT64.encodedSizeWithTag(10, value.createTime) : 0)
          + (value.companyId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(11, value.companyId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, TendDetail value) throws IOException {
      if (value.id != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.id);
      if (value.tendDetail != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.tendDetail);
      if (value.detailTypeId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 3, value.detailTypeId);
      if (value.detailTypeName != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.detailTypeName);
      if (value.illnessId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 5, value.illnessId);
      if (value.illnessName != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.illnessName);
      if (value.status != null) ProtoAdapter.INT32.encodeWithTag(writer, 7, value.status);
      if (value.createStaffId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 8, value.createStaffId);
      if (value.createStaffName != null) ProtoAdapter.STRING.encodeWithTag(writer, 9, value.createStaffName);
      if (value.createTime != null) ProtoAdapter.UINT64.encodeWithTag(writer, 10, value.createTime);
      if (value.companyId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 11, value.companyId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public TendDetail decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.UINT64.decode(reader)); break;
          case 2: builder.tendDetail(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.detailTypeId(ProtoAdapter.UINT64.decode(reader)); break;
          case 4: builder.detailTypeName(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.illnessId(ProtoAdapter.UINT64.decode(reader)); break;
          case 6: builder.illnessName(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.status(ProtoAdapter.INT32.decode(reader)); break;
          case 8: builder.createStaffId(ProtoAdapter.UINT64.decode(reader)); break;
          case 9: builder.createStaffName(ProtoAdapter.STRING.decode(reader)); break;
          case 10: builder.createTime(ProtoAdapter.UINT64.decode(reader)); break;
          case 11: builder.companyId(ProtoAdapter.UINT64.decode(reader)); break;
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
    public TendDetail redact(TendDetail value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
