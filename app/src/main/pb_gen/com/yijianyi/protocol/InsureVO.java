// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: SaasModel.proto at 856:1
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

public final class InsureVO extends Message<InsureVO, InsureVO.Builder> {
  public static final ProtoAdapter<InsureVO> ADAPTER = new ProtoAdapter_InsureVO();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_INSURENO = "";

  public static final String DEFAULT_KINSNAME = "";

  public static final String DEFAULT_CREATETIME = "";

  public static final String DEFAULT_STATUSDESC = "";

  public static final Integer DEFAULT_STATUS = 0;

  public static final Integer DEFAULT_SCORE = 0;

  /**
   * 申请编号
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String insureNO;

  /**
   * 被服务人
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String kinsName;

  /**
   * 申请时间
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String createTime;

  /**
   * 进度描述
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String statusDesc;

  /**
   * 状态 0-客服审核 1-护士初审 2-等待提交复审 3-等待复审 4-复审通过 5-复审中  50-客服驳回 51-初审驳回 52-复审驳回 53-已关闭
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer status;

  /**
   * 日常生活活动能力评分
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer score;

  public InsureVO(String insureNO, String kinsName, String createTime, String statusDesc, Integer status, Integer score) {
    this(insureNO, kinsName, createTime, statusDesc, status, score, ByteString.EMPTY);
  }

  public InsureVO(String insureNO, String kinsName, String createTime, String statusDesc, Integer status, Integer score, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.insureNO = insureNO;
    this.kinsName = kinsName;
    this.createTime = createTime;
    this.statusDesc = statusDesc;
    this.status = status;
    this.score = score;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.insureNO = insureNO;
    builder.kinsName = kinsName;
    builder.createTime = createTime;
    builder.statusDesc = statusDesc;
    builder.status = status;
    builder.score = score;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof InsureVO)) return false;
    InsureVO o = (InsureVO) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(insureNO, o.insureNO)
        && Internal.equals(kinsName, o.kinsName)
        && Internal.equals(createTime, o.createTime)
        && Internal.equals(statusDesc, o.statusDesc)
        && Internal.equals(status, o.status)
        && Internal.equals(score, o.score);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (insureNO != null ? insureNO.hashCode() : 0);
      result = result * 37 + (kinsName != null ? kinsName.hashCode() : 0);
      result = result * 37 + (createTime != null ? createTime.hashCode() : 0);
      result = result * 37 + (statusDesc != null ? statusDesc.hashCode() : 0);
      result = result * 37 + (status != null ? status.hashCode() : 0);
      result = result * 37 + (score != null ? score.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (insureNO != null) builder.append(", insureNO=").append(insureNO);
    if (kinsName != null) builder.append(", kinsName=").append(kinsName);
    if (createTime != null) builder.append(", createTime=").append(createTime);
    if (statusDesc != null) builder.append(", statusDesc=").append(statusDesc);
    if (status != null) builder.append(", status=").append(status);
    if (score != null) builder.append(", score=").append(score);
    return builder.replace(0, 2, "InsureVO{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<InsureVO, Builder> {
    public String insureNO;

    public String kinsName;

    public String createTime;

    public String statusDesc;

    public Integer status;

    public Integer score;

    public Builder() {
    }

    /**
     * 申请编号
     */
    public Builder insureNO(String insureNO) {
      this.insureNO = insureNO;
      return this;
    }

    /**
     * 被服务人
     */
    public Builder kinsName(String kinsName) {
      this.kinsName = kinsName;
      return this;
    }

    /**
     * 申请时间
     */
    public Builder createTime(String createTime) {
      this.createTime = createTime;
      return this;
    }

    /**
     * 进度描述
     */
    public Builder statusDesc(String statusDesc) {
      this.statusDesc = statusDesc;
      return this;
    }

    /**
     * 状态 0-客服审核 1-护士初审 2-等待提交复审 3-等待复审 4-复审通过 5-复审中  50-客服驳回 51-初审驳回 52-复审驳回 53-已关闭
     */
    public Builder status(Integer status) {
      this.status = status;
      return this;
    }

    /**
     * 日常生活活动能力评分
     */
    public Builder score(Integer score) {
      this.score = score;
      return this;
    }

    @Override
    public InsureVO build() {
      return new InsureVO(insureNO, kinsName, createTime, statusDesc, status, score, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_InsureVO extends ProtoAdapter<InsureVO> {
    ProtoAdapter_InsureVO() {
      super(FieldEncoding.LENGTH_DELIMITED, InsureVO.class);
    }

    @Override
    public int encodedSize(InsureVO value) {
      return (value.insureNO != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.insureNO) : 0)
          + (value.kinsName != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.kinsName) : 0)
          + (value.createTime != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.createTime) : 0)
          + (value.statusDesc != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.statusDesc) : 0)
          + (value.status != null ? ProtoAdapter.UINT32.encodedSizeWithTag(5, value.status) : 0)
          + (value.score != null ? ProtoAdapter.INT32.encodedSizeWithTag(6, value.score) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, InsureVO value) throws IOException {
      if (value.insureNO != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.insureNO);
      if (value.kinsName != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.kinsName);
      if (value.createTime != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.createTime);
      if (value.statusDesc != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.statusDesc);
      if (value.status != null) ProtoAdapter.UINT32.encodeWithTag(writer, 5, value.status);
      if (value.score != null) ProtoAdapter.INT32.encodeWithTag(writer, 6, value.score);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public InsureVO decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.insureNO(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.kinsName(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.createTime(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.statusDesc(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.status(ProtoAdapter.UINT32.decode(reader)); break;
          case 6: builder.score(ProtoAdapter.INT32.decode(reader)); break;
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
    public InsureVO redact(InsureVO value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
