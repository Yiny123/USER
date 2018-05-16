// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 831:1
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
 * saasApp护士评估
 */
public final class InsureAssessFirstReq extends Message<InsureAssessFirstReq, InsureAssessFirstReq.Builder> {
  public static final ProtoAdapter<InsureAssessFirstReq> ADAPTER = new ProtoAdapter_InsureAssessFirstReq();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_INSURENO = "";

  public static final Integer DEFAULT_STATUS = 0;

  public static final String DEFAULT_REJECTDESC = "";

  public static final String DEFAULT_REMARK = "";

  public static final Integer DEFAULT_PAYTYPE = 0;

  /**
   * 申请单id
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String insureNO;

  /**
   * 状态 1-通过  2-驳回
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer status;

  /**
   * 驳回理由
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String rejectDesc;

  /**
   * 护士备注
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String remark;

  /**
   * 付款方式 1-在线 2-现金
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer payType;

  public InsureAssessFirstReq(String insureNO, Integer status, String rejectDesc, String remark, Integer payType) {
    this(insureNO, status, rejectDesc, remark, payType, ByteString.EMPTY);
  }

  public InsureAssessFirstReq(String insureNO, Integer status, String rejectDesc, String remark, Integer payType, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.insureNO = insureNO;
    this.status = status;
    this.rejectDesc = rejectDesc;
    this.remark = remark;
    this.payType = payType;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.insureNO = insureNO;
    builder.status = status;
    builder.rejectDesc = rejectDesc;
    builder.remark = remark;
    builder.payType = payType;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof InsureAssessFirstReq)) return false;
    InsureAssessFirstReq o = (InsureAssessFirstReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(insureNO, o.insureNO)
        && Internal.equals(status, o.status)
        && Internal.equals(rejectDesc, o.rejectDesc)
        && Internal.equals(remark, o.remark)
        && Internal.equals(payType, o.payType);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (insureNO != null ? insureNO.hashCode() : 0);
      result = result * 37 + (status != null ? status.hashCode() : 0);
      result = result * 37 + (rejectDesc != null ? rejectDesc.hashCode() : 0);
      result = result * 37 + (remark != null ? remark.hashCode() : 0);
      result = result * 37 + (payType != null ? payType.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (insureNO != null) builder.append(", insureNO=").append(insureNO);
    if (status != null) builder.append(", status=").append(status);
    if (rejectDesc != null) builder.append(", rejectDesc=").append(rejectDesc);
    if (remark != null) builder.append(", remark=").append(remark);
    if (payType != null) builder.append(", payType=").append(payType);
    return builder.replace(0, 2, "InsureAssessFirstReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<InsureAssessFirstReq, Builder> {
    public String insureNO;

    public Integer status;

    public String rejectDesc;

    public String remark;

    public Integer payType;

    public Builder() {
    }

    /**
     * 申请单id
     */
    public Builder insureNO(String insureNO) {
      this.insureNO = insureNO;
      return this;
    }

    /**
     * 状态 1-通过  2-驳回
     */
    public Builder status(Integer status) {
      this.status = status;
      return this;
    }

    /**
     * 驳回理由
     */
    public Builder rejectDesc(String rejectDesc) {
      this.rejectDesc = rejectDesc;
      return this;
    }

    /**
     * 护士备注
     */
    public Builder remark(String remark) {
      this.remark = remark;
      return this;
    }

    /**
     * 付款方式 1-在线 2-现金
     */
    public Builder payType(Integer payType) {
      this.payType = payType;
      return this;
    }

    @Override
    public InsureAssessFirstReq build() {
      return new InsureAssessFirstReq(insureNO, status, rejectDesc, remark, payType, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_InsureAssessFirstReq extends ProtoAdapter<InsureAssessFirstReq> {
    ProtoAdapter_InsureAssessFirstReq() {
      super(FieldEncoding.LENGTH_DELIMITED, InsureAssessFirstReq.class);
    }

    @Override
    public int encodedSize(InsureAssessFirstReq value) {
      return (value.insureNO != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.insureNO) : 0)
          + (value.status != null ? ProtoAdapter.UINT32.encodedSizeWithTag(2, value.status) : 0)
          + (value.rejectDesc != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.rejectDesc) : 0)
          + (value.remark != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.remark) : 0)
          + (value.payType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(5, value.payType) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, InsureAssessFirstReq value) throws IOException {
      if (value.insureNO != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.insureNO);
      if (value.status != null) ProtoAdapter.UINT32.encodeWithTag(writer, 2, value.status);
      if (value.rejectDesc != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.rejectDesc);
      if (value.remark != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.remark);
      if (value.payType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 5, value.payType);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public InsureAssessFirstReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.insureNO(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.status(ProtoAdapter.UINT32.decode(reader)); break;
          case 3: builder.rejectDesc(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.remark(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.payType(ProtoAdapter.UINT32.decode(reader)); break;
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
    public InsureAssessFirstReq redact(InsureAssessFirstReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
