// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AssessModel.proto at 68:1
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
 * 老年人能力评估
 */
public final class InsureAssessAbility extends Message<InsureAssessAbility, InsureAssessAbility.Builder> {
  public static final ProtoAdapter<InsureAssessAbility> ADAPTER = new ProtoAdapter_InsureAssessAbility();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_ID = 0L;

  public static final Long DEFAULT_RESULTID = 0L;

  public static final Integer DEFAULT_LEVEL = 0;

  public static final Integer DEFAULT_ADLLEVEL = 0;

  public static final Integer DEFAULT_ADLSCORE = 0;

  public static final Integer DEFAULT_MINDLEVEL = 0;

  public static final Integer DEFAULT_MINDSCORE = 0;

  public static final Integer DEFAULT_COMMLEVEL = 0;

  public static final Integer DEFAULT_COMMSCORE = 0;

  public static final Integer DEFAULT_SOCIALLEVEL = 0;

  public static final Integer DEFAULT_SOCIALSCORE = 0;

  public static final Long DEFAULT_CREATETIME = 0L;

  public static final Long DEFAULT_CREATESTAFFID = 0L;

  public static final String DEFAULT_CREATESTAFFNAME = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long id;

  /**
   * 报告id
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long resultId;

  /**
   * 能力等级 0-能力完好 1-轻度失能 2-中度失能 3-重度失能
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer level;

  /**
   * 生活能力等级
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer adlLevel;

  /**
   * 生活能力分数
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer adlScore;

  /**
   * 精神状态等级
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer mindLevel;

  /**
   * 精神状态分数
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer mindScore;

  /**
   * 感知觉与沟通等级
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer commLevel;

  /**
   * 感知觉与沟通分数
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer commScore;

  /**
   * 社会参与等级
   */
  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer socialLevel;

  /**
   * 社会参与分数
   */
  @WireField(
      tag = 11,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer socialScore;

  /**
   * 本次评估时间
   */
  @WireField(
      tag = 12,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createTime;

  /**
   * 操作员工ID
   */
  @WireField(
      tag = 13,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createStaffId;

  /**
   * 评估人员
   */
  @WireField(
      tag = 14,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String createStaffName;

  public InsureAssessAbility(Long id, Long resultId, Integer level, Integer adlLevel, Integer adlScore, Integer mindLevel, Integer mindScore, Integer commLevel, Integer commScore, Integer socialLevel, Integer socialScore, Long createTime, Long createStaffId, String createStaffName) {
    this(id, resultId, level, adlLevel, adlScore, mindLevel, mindScore, commLevel, commScore, socialLevel, socialScore, createTime, createStaffId, createStaffName, ByteString.EMPTY);
  }

  public InsureAssessAbility(Long id, Long resultId, Integer level, Integer adlLevel, Integer adlScore, Integer mindLevel, Integer mindScore, Integer commLevel, Integer commScore, Integer socialLevel, Integer socialScore, Long createTime, Long createStaffId, String createStaffName, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.resultId = resultId;
    this.level = level;
    this.adlLevel = adlLevel;
    this.adlScore = adlScore;
    this.mindLevel = mindLevel;
    this.mindScore = mindScore;
    this.commLevel = commLevel;
    this.commScore = commScore;
    this.socialLevel = socialLevel;
    this.socialScore = socialScore;
    this.createTime = createTime;
    this.createStaffId = createStaffId;
    this.createStaffName = createStaffName;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.resultId = resultId;
    builder.level = level;
    builder.adlLevel = adlLevel;
    builder.adlScore = adlScore;
    builder.mindLevel = mindLevel;
    builder.mindScore = mindScore;
    builder.commLevel = commLevel;
    builder.commScore = commScore;
    builder.socialLevel = socialLevel;
    builder.socialScore = socialScore;
    builder.createTime = createTime;
    builder.createStaffId = createStaffId;
    builder.createStaffName = createStaffName;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof InsureAssessAbility)) return false;
    InsureAssessAbility o = (InsureAssessAbility) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(resultId, o.resultId)
        && Internal.equals(level, o.level)
        && Internal.equals(adlLevel, o.adlLevel)
        && Internal.equals(adlScore, o.adlScore)
        && Internal.equals(mindLevel, o.mindLevel)
        && Internal.equals(mindScore, o.mindScore)
        && Internal.equals(commLevel, o.commLevel)
        && Internal.equals(commScore, o.commScore)
        && Internal.equals(socialLevel, o.socialLevel)
        && Internal.equals(socialScore, o.socialScore)
        && Internal.equals(createTime, o.createTime)
        && Internal.equals(createStaffId, o.createStaffId)
        && Internal.equals(createStaffName, o.createStaffName);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (resultId != null ? resultId.hashCode() : 0);
      result = result * 37 + (level != null ? level.hashCode() : 0);
      result = result * 37 + (adlLevel != null ? adlLevel.hashCode() : 0);
      result = result * 37 + (adlScore != null ? adlScore.hashCode() : 0);
      result = result * 37 + (mindLevel != null ? mindLevel.hashCode() : 0);
      result = result * 37 + (mindScore != null ? mindScore.hashCode() : 0);
      result = result * 37 + (commLevel != null ? commLevel.hashCode() : 0);
      result = result * 37 + (commScore != null ? commScore.hashCode() : 0);
      result = result * 37 + (socialLevel != null ? socialLevel.hashCode() : 0);
      result = result * 37 + (socialScore != null ? socialScore.hashCode() : 0);
      result = result * 37 + (createTime != null ? createTime.hashCode() : 0);
      result = result * 37 + (createStaffId != null ? createStaffId.hashCode() : 0);
      result = result * 37 + (createStaffName != null ? createStaffName.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (id != null) builder.append(", id=").append(id);
    if (resultId != null) builder.append(", resultId=").append(resultId);
    if (level != null) builder.append(", level=").append(level);
    if (adlLevel != null) builder.append(", adlLevel=").append(adlLevel);
    if (adlScore != null) builder.append(", adlScore=").append(adlScore);
    if (mindLevel != null) builder.append(", mindLevel=").append(mindLevel);
    if (mindScore != null) builder.append(", mindScore=").append(mindScore);
    if (commLevel != null) builder.append(", commLevel=").append(commLevel);
    if (commScore != null) builder.append(", commScore=").append(commScore);
    if (socialLevel != null) builder.append(", socialLevel=").append(socialLevel);
    if (socialScore != null) builder.append(", socialScore=").append(socialScore);
    if (createTime != null) builder.append(", createTime=").append(createTime);
    if (createStaffId != null) builder.append(", createStaffId=").append(createStaffId);
    if (createStaffName != null) builder.append(", createStaffName=").append(createStaffName);
    return builder.replace(0, 2, "InsureAssessAbility{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<InsureAssessAbility, Builder> {
    public Long id;

    public Long resultId;

    public Integer level;

    public Integer adlLevel;

    public Integer adlScore;

    public Integer mindLevel;

    public Integer mindScore;

    public Integer commLevel;

    public Integer commScore;

    public Integer socialLevel;

    public Integer socialScore;

    public Long createTime;

    public Long createStaffId;

    public String createStaffName;

    public Builder() {
    }

    public Builder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     * 报告id
     */
    public Builder resultId(Long resultId) {
      this.resultId = resultId;
      return this;
    }

    /**
     * 能力等级 0-能力完好 1-轻度失能 2-中度失能 3-重度失能
     */
    public Builder level(Integer level) {
      this.level = level;
      return this;
    }

    /**
     * 生活能力等级
     */
    public Builder adlLevel(Integer adlLevel) {
      this.adlLevel = adlLevel;
      return this;
    }

    /**
     * 生活能力分数
     */
    public Builder adlScore(Integer adlScore) {
      this.adlScore = adlScore;
      return this;
    }

    /**
     * 精神状态等级
     */
    public Builder mindLevel(Integer mindLevel) {
      this.mindLevel = mindLevel;
      return this;
    }

    /**
     * 精神状态分数
     */
    public Builder mindScore(Integer mindScore) {
      this.mindScore = mindScore;
      return this;
    }

    /**
     * 感知觉与沟通等级
     */
    public Builder commLevel(Integer commLevel) {
      this.commLevel = commLevel;
      return this;
    }

    /**
     * 感知觉与沟通分数
     */
    public Builder commScore(Integer commScore) {
      this.commScore = commScore;
      return this;
    }

    /**
     * 社会参与等级
     */
    public Builder socialLevel(Integer socialLevel) {
      this.socialLevel = socialLevel;
      return this;
    }

    /**
     * 社会参与分数
     */
    public Builder socialScore(Integer socialScore) {
      this.socialScore = socialScore;
      return this;
    }

    /**
     * 本次评估时间
     */
    public Builder createTime(Long createTime) {
      this.createTime = createTime;
      return this;
    }

    /**
     * 操作员工ID
     */
    public Builder createStaffId(Long createStaffId) {
      this.createStaffId = createStaffId;
      return this;
    }

    /**
     * 评估人员
     */
    public Builder createStaffName(String createStaffName) {
      this.createStaffName = createStaffName;
      return this;
    }

    @Override
    public InsureAssessAbility build() {
      return new InsureAssessAbility(id, resultId, level, adlLevel, adlScore, mindLevel, mindScore, commLevel, commScore, socialLevel, socialScore, createTime, createStaffId, createStaffName, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_InsureAssessAbility extends ProtoAdapter<InsureAssessAbility> {
    ProtoAdapter_InsureAssessAbility() {
      super(FieldEncoding.LENGTH_DELIMITED, InsureAssessAbility.class);
    }

    @Override
    public int encodedSize(InsureAssessAbility value) {
      return (value.id != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.id) : 0)
          + (value.resultId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(2, value.resultId) : 0)
          + (value.level != null ? ProtoAdapter.UINT32.encodedSizeWithTag(3, value.level) : 0)
          + (value.adlLevel != null ? ProtoAdapter.UINT32.encodedSizeWithTag(4, value.adlLevel) : 0)
          + (value.adlScore != null ? ProtoAdapter.UINT32.encodedSizeWithTag(5, value.adlScore) : 0)
          + (value.mindLevel != null ? ProtoAdapter.UINT32.encodedSizeWithTag(6, value.mindLevel) : 0)
          + (value.mindScore != null ? ProtoAdapter.UINT32.encodedSizeWithTag(7, value.mindScore) : 0)
          + (value.commLevel != null ? ProtoAdapter.UINT32.encodedSizeWithTag(8, value.commLevel) : 0)
          + (value.commScore != null ? ProtoAdapter.UINT32.encodedSizeWithTag(9, value.commScore) : 0)
          + (value.socialLevel != null ? ProtoAdapter.UINT32.encodedSizeWithTag(10, value.socialLevel) : 0)
          + (value.socialScore != null ? ProtoAdapter.UINT32.encodedSizeWithTag(11, value.socialScore) : 0)
          + (value.createTime != null ? ProtoAdapter.UINT64.encodedSizeWithTag(12, value.createTime) : 0)
          + (value.createStaffId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(13, value.createStaffId) : 0)
          + (value.createStaffName != null ? ProtoAdapter.STRING.encodedSizeWithTag(14, value.createStaffName) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, InsureAssessAbility value) throws IOException {
      if (value.id != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.id);
      if (value.resultId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 2, value.resultId);
      if (value.level != null) ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.level);
      if (value.adlLevel != null) ProtoAdapter.UINT32.encodeWithTag(writer, 4, value.adlLevel);
      if (value.adlScore != null) ProtoAdapter.UINT32.encodeWithTag(writer, 5, value.adlScore);
      if (value.mindLevel != null) ProtoAdapter.UINT32.encodeWithTag(writer, 6, value.mindLevel);
      if (value.mindScore != null) ProtoAdapter.UINT32.encodeWithTag(writer, 7, value.mindScore);
      if (value.commLevel != null) ProtoAdapter.UINT32.encodeWithTag(writer, 8, value.commLevel);
      if (value.commScore != null) ProtoAdapter.UINT32.encodeWithTag(writer, 9, value.commScore);
      if (value.socialLevel != null) ProtoAdapter.UINT32.encodeWithTag(writer, 10, value.socialLevel);
      if (value.socialScore != null) ProtoAdapter.UINT32.encodeWithTag(writer, 11, value.socialScore);
      if (value.createTime != null) ProtoAdapter.UINT64.encodeWithTag(writer, 12, value.createTime);
      if (value.createStaffId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 13, value.createStaffId);
      if (value.createStaffName != null) ProtoAdapter.STRING.encodeWithTag(writer, 14, value.createStaffName);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public InsureAssessAbility decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.UINT64.decode(reader)); break;
          case 2: builder.resultId(ProtoAdapter.UINT64.decode(reader)); break;
          case 3: builder.level(ProtoAdapter.UINT32.decode(reader)); break;
          case 4: builder.adlLevel(ProtoAdapter.UINT32.decode(reader)); break;
          case 5: builder.adlScore(ProtoAdapter.UINT32.decode(reader)); break;
          case 6: builder.mindLevel(ProtoAdapter.UINT32.decode(reader)); break;
          case 7: builder.mindScore(ProtoAdapter.UINT32.decode(reader)); break;
          case 8: builder.commLevel(ProtoAdapter.UINT32.decode(reader)); break;
          case 9: builder.commScore(ProtoAdapter.UINT32.decode(reader)); break;
          case 10: builder.socialLevel(ProtoAdapter.UINT32.decode(reader)); break;
          case 11: builder.socialScore(ProtoAdapter.UINT32.decode(reader)); break;
          case 12: builder.createTime(ProtoAdapter.UINT64.decode(reader)); break;
          case 13: builder.createStaffId(ProtoAdapter.UINT64.decode(reader)); break;
          case 14: builder.createStaffName(ProtoAdapter.STRING.decode(reader)); break;
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
    public InsureAssessAbility redact(InsureAssessAbility value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
