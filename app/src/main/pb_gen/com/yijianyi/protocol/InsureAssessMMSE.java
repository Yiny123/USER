// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: SaasModel.proto at 1024:1
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

public final class InsureAssessMMSE extends Message<InsureAssessMMSE, InsureAssessMMSE.Builder> {
  public static final ProtoAdapter<InsureAssessMMSE> ADAPTER = new ProtoAdapter_InsureAssessMMSE();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_ID = 0L;

  public static final String DEFAULT_INSURENO = "";

  public static final Integer DEFAULT_ASSESSTYPE = 0;

  public static final Integer DEFAULT_SCORE = 0;

  public static final String DEFAULT_IDCARD = "";

  public static final Long DEFAULT_USERID = 0L;

  public static final String DEFAULT_COMPOSURE = "";

  public static final Integer DEFAULT_ISMEMORY = 0;

  public static final Integer DEFAULT_ISMIND = 0;

  public static final Integer DEFAULT_ISRECALL = 0;

  public static final Integer DEFAULT_ISRENAME = 0;

  public static final Integer DEFAULT_ISRETELL = 0;

  public static final Integer DEFAULT_ISTHREE = 0;

  public static final Integer DEFAULT_ISWRITE = 0;

  public static final Integer DEFAULT_ISREAD = 0;

  public static final Integer DEFAULT_ISSTRUCT = 0;

  public static final String DEFAULT_MEMORYREMARK = "";

  public static final String DEFAULT_MINDREMARK = "";

  public static final String DEFAULT_RECALLREMARK = "";

  public static final String DEFAULT_RENAMEREMARK = "";

  public static final String DEFAULT_RETELLREMARK = "";

  public static final String DEFAULT_THREEREMARK = "";

  public static final String DEFAULT_WRITEREMARK = "";

  public static final String DEFAULT_READREMARK = "";

  public static final String DEFAULT_STRUCTREMARK = "";

  public static final Long DEFAULT_CREATESTAFFID = 0L;

  public static final String DEFAULT_CREATESTAFFNAME = "";

  public static final Long DEFAULT_CREATETIME = 0L;

  public static final String DEFAULT_REMARK = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long id;

  /**
   * 申请批次
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String insureNO;

  /**
   * 0-用户自评 1-初审评估 2-复审评估 3-终审评估
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer assessType;

  /**
   * 评估分数
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer score;

  /**
   * 被评估人的身份证号
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String idcard;

  /**
   * 用户id
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long userId;

  /**
   * 	定向力
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String composure;

  /**
   * 	记忆力得分
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer isMemory;

  /**
   * 	注意力得分
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer isMind;

  /**
   * 	回忆能力得分
   */
  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer isRecall;

  /**
   * 	命名能力得分
   */
  @WireField(
      tag = 11,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer isRename;

  /**
   * 	复述能力得分
   */
  @WireField(
      tag = 12,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer isRetell;

  /**
   * 	三步命令得分
   */
  @WireField(
      tag = 13,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer isThree;

  /**
   * 	书写能力得分
   */
  @WireField(
      tag = 14,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer isWrite;

  /**
   * 	阅读能力得分
   */
  @WireField(
      tag = 15,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer isRead;

  /**
   * 	结构能力得分
   */
  @WireField(
      tag = 16,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer isStruct;

  /**
   * 记忆力备注
   */
  @WireField(
      tag = 17,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String memoryRemark;

  /**
   * 注意力备注
   */
  @WireField(
      tag = 18,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String mindRemark;

  /**
   * 回忆能力备注
   */
  @WireField(
      tag = 19,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String recallRemark;

  /**
   * 命名能力备注
   */
  @WireField(
      tag = 20,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String renameRemark;

  /**
   * 复述能力备注
   */
  @WireField(
      tag = 21,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String retellRemark;

  /**
   * 三步命令备注
   */
  @WireField(
      tag = 22,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String threeRemark;

  /**
   * 书写能力备注
   */
  @WireField(
      tag = 23,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String writeRemark;

  /**
   * 阅读能力备注
   */
  @WireField(
      tag = 24,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String readRemark;

  /**
   * 结构能力得分
   */
  @WireField(
      tag = 25,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String structRemark;

  @WireField(
      tag = 26,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createStaffId;

  @WireField(
      tag = 27,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String createStaffName;

  @WireField(
      tag = 28,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createTime;

  /**
   * 评估备注
   */
  @WireField(
      tag = 29,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String remark;

  public InsureAssessMMSE(Long id, String insureNO, Integer assessType, Integer score, String idcard, Long userId, String composure, Integer isMemory, Integer isMind, Integer isRecall, Integer isRename, Integer isRetell, Integer isThree, Integer isWrite, Integer isRead, Integer isStruct, String memoryRemark, String mindRemark, String recallRemark, String renameRemark, String retellRemark, String threeRemark, String writeRemark, String readRemark, String structRemark, Long createStaffId, String createStaffName, Long createTime, String remark) {
    this(id, insureNO, assessType, score, idcard, userId, composure, isMemory, isMind, isRecall, isRename, isRetell, isThree, isWrite, isRead, isStruct, memoryRemark, mindRemark, recallRemark, renameRemark, retellRemark, threeRemark, writeRemark, readRemark, structRemark, createStaffId, createStaffName, createTime, remark, ByteString.EMPTY);
  }

  public InsureAssessMMSE(Long id, String insureNO, Integer assessType, Integer score, String idcard, Long userId, String composure, Integer isMemory, Integer isMind, Integer isRecall, Integer isRename, Integer isRetell, Integer isThree, Integer isWrite, Integer isRead, Integer isStruct, String memoryRemark, String mindRemark, String recallRemark, String renameRemark, String retellRemark, String threeRemark, String writeRemark, String readRemark, String structRemark, Long createStaffId, String createStaffName, Long createTime, String remark, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.insureNO = insureNO;
    this.assessType = assessType;
    this.score = score;
    this.idcard = idcard;
    this.userId = userId;
    this.composure = composure;
    this.isMemory = isMemory;
    this.isMind = isMind;
    this.isRecall = isRecall;
    this.isRename = isRename;
    this.isRetell = isRetell;
    this.isThree = isThree;
    this.isWrite = isWrite;
    this.isRead = isRead;
    this.isStruct = isStruct;
    this.memoryRemark = memoryRemark;
    this.mindRemark = mindRemark;
    this.recallRemark = recallRemark;
    this.renameRemark = renameRemark;
    this.retellRemark = retellRemark;
    this.threeRemark = threeRemark;
    this.writeRemark = writeRemark;
    this.readRemark = readRemark;
    this.structRemark = structRemark;
    this.createStaffId = createStaffId;
    this.createStaffName = createStaffName;
    this.createTime = createTime;
    this.remark = remark;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.insureNO = insureNO;
    builder.assessType = assessType;
    builder.score = score;
    builder.idcard = idcard;
    builder.userId = userId;
    builder.composure = composure;
    builder.isMemory = isMemory;
    builder.isMind = isMind;
    builder.isRecall = isRecall;
    builder.isRename = isRename;
    builder.isRetell = isRetell;
    builder.isThree = isThree;
    builder.isWrite = isWrite;
    builder.isRead = isRead;
    builder.isStruct = isStruct;
    builder.memoryRemark = memoryRemark;
    builder.mindRemark = mindRemark;
    builder.recallRemark = recallRemark;
    builder.renameRemark = renameRemark;
    builder.retellRemark = retellRemark;
    builder.threeRemark = threeRemark;
    builder.writeRemark = writeRemark;
    builder.readRemark = readRemark;
    builder.structRemark = structRemark;
    builder.createStaffId = createStaffId;
    builder.createStaffName = createStaffName;
    builder.createTime = createTime;
    builder.remark = remark;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof InsureAssessMMSE)) return false;
    InsureAssessMMSE o = (InsureAssessMMSE) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(insureNO, o.insureNO)
        && Internal.equals(assessType, o.assessType)
        && Internal.equals(score, o.score)
        && Internal.equals(idcard, o.idcard)
        && Internal.equals(userId, o.userId)
        && Internal.equals(composure, o.composure)
        && Internal.equals(isMemory, o.isMemory)
        && Internal.equals(isMind, o.isMind)
        && Internal.equals(isRecall, o.isRecall)
        && Internal.equals(isRename, o.isRename)
        && Internal.equals(isRetell, o.isRetell)
        && Internal.equals(isThree, o.isThree)
        && Internal.equals(isWrite, o.isWrite)
        && Internal.equals(isRead, o.isRead)
        && Internal.equals(isStruct, o.isStruct)
        && Internal.equals(memoryRemark, o.memoryRemark)
        && Internal.equals(mindRemark, o.mindRemark)
        && Internal.equals(recallRemark, o.recallRemark)
        && Internal.equals(renameRemark, o.renameRemark)
        && Internal.equals(retellRemark, o.retellRemark)
        && Internal.equals(threeRemark, o.threeRemark)
        && Internal.equals(writeRemark, o.writeRemark)
        && Internal.equals(readRemark, o.readRemark)
        && Internal.equals(structRemark, o.structRemark)
        && Internal.equals(createStaffId, o.createStaffId)
        && Internal.equals(createStaffName, o.createStaffName)
        && Internal.equals(createTime, o.createTime)
        && Internal.equals(remark, o.remark);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (insureNO != null ? insureNO.hashCode() : 0);
      result = result * 37 + (assessType != null ? assessType.hashCode() : 0);
      result = result * 37 + (score != null ? score.hashCode() : 0);
      result = result * 37 + (idcard != null ? idcard.hashCode() : 0);
      result = result * 37 + (userId != null ? userId.hashCode() : 0);
      result = result * 37 + (composure != null ? composure.hashCode() : 0);
      result = result * 37 + (isMemory != null ? isMemory.hashCode() : 0);
      result = result * 37 + (isMind != null ? isMind.hashCode() : 0);
      result = result * 37 + (isRecall != null ? isRecall.hashCode() : 0);
      result = result * 37 + (isRename != null ? isRename.hashCode() : 0);
      result = result * 37 + (isRetell != null ? isRetell.hashCode() : 0);
      result = result * 37 + (isThree != null ? isThree.hashCode() : 0);
      result = result * 37 + (isWrite != null ? isWrite.hashCode() : 0);
      result = result * 37 + (isRead != null ? isRead.hashCode() : 0);
      result = result * 37 + (isStruct != null ? isStruct.hashCode() : 0);
      result = result * 37 + (memoryRemark != null ? memoryRemark.hashCode() : 0);
      result = result * 37 + (mindRemark != null ? mindRemark.hashCode() : 0);
      result = result * 37 + (recallRemark != null ? recallRemark.hashCode() : 0);
      result = result * 37 + (renameRemark != null ? renameRemark.hashCode() : 0);
      result = result * 37 + (retellRemark != null ? retellRemark.hashCode() : 0);
      result = result * 37 + (threeRemark != null ? threeRemark.hashCode() : 0);
      result = result * 37 + (writeRemark != null ? writeRemark.hashCode() : 0);
      result = result * 37 + (readRemark != null ? readRemark.hashCode() : 0);
      result = result * 37 + (structRemark != null ? structRemark.hashCode() : 0);
      result = result * 37 + (createStaffId != null ? createStaffId.hashCode() : 0);
      result = result * 37 + (createStaffName != null ? createStaffName.hashCode() : 0);
      result = result * 37 + (createTime != null ? createTime.hashCode() : 0);
      result = result * 37 + (remark != null ? remark.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (id != null) builder.append(", id=").append(id);
    if (insureNO != null) builder.append(", insureNO=").append(insureNO);
    if (assessType != null) builder.append(", assessType=").append(assessType);
    if (score != null) builder.append(", score=").append(score);
    if (idcard != null) builder.append(", idcard=").append(idcard);
    if (userId != null) builder.append(", userId=").append(userId);
    if (composure != null) builder.append(", composure=").append(composure);
    if (isMemory != null) builder.append(", isMemory=").append(isMemory);
    if (isMind != null) builder.append(", isMind=").append(isMind);
    if (isRecall != null) builder.append(", isRecall=").append(isRecall);
    if (isRename != null) builder.append(", isRename=").append(isRename);
    if (isRetell != null) builder.append(", isRetell=").append(isRetell);
    if (isThree != null) builder.append(", isThree=").append(isThree);
    if (isWrite != null) builder.append(", isWrite=").append(isWrite);
    if (isRead != null) builder.append(", isRead=").append(isRead);
    if (isStruct != null) builder.append(", isStruct=").append(isStruct);
    if (memoryRemark != null) builder.append(", memoryRemark=").append(memoryRemark);
    if (mindRemark != null) builder.append(", mindRemark=").append(mindRemark);
    if (recallRemark != null) builder.append(", recallRemark=").append(recallRemark);
    if (renameRemark != null) builder.append(", renameRemark=").append(renameRemark);
    if (retellRemark != null) builder.append(", retellRemark=").append(retellRemark);
    if (threeRemark != null) builder.append(", threeRemark=").append(threeRemark);
    if (writeRemark != null) builder.append(", writeRemark=").append(writeRemark);
    if (readRemark != null) builder.append(", readRemark=").append(readRemark);
    if (structRemark != null) builder.append(", structRemark=").append(structRemark);
    if (createStaffId != null) builder.append(", createStaffId=").append(createStaffId);
    if (createStaffName != null) builder.append(", createStaffName=").append(createStaffName);
    if (createTime != null) builder.append(", createTime=").append(createTime);
    if (remark != null) builder.append(", remark=").append(remark);
    return builder.replace(0, 2, "InsureAssessMMSE{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<InsureAssessMMSE, Builder> {
    public Long id;

    public String insureNO;

    public Integer assessType;

    public Integer score;

    public String idcard;

    public Long userId;

    public String composure;

    public Integer isMemory;

    public Integer isMind;

    public Integer isRecall;

    public Integer isRename;

    public Integer isRetell;

    public Integer isThree;

    public Integer isWrite;

    public Integer isRead;

    public Integer isStruct;

    public String memoryRemark;

    public String mindRemark;

    public String recallRemark;

    public String renameRemark;

    public String retellRemark;

    public String threeRemark;

    public String writeRemark;

    public String readRemark;

    public String structRemark;

    public Long createStaffId;

    public String createStaffName;

    public Long createTime;

    public String remark;

    public Builder() {
    }

    public Builder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     * 申请批次
     */
    public Builder insureNO(String insureNO) {
      this.insureNO = insureNO;
      return this;
    }

    /**
     * 0-用户自评 1-初审评估 2-复审评估 3-终审评估
     */
    public Builder assessType(Integer assessType) {
      this.assessType = assessType;
      return this;
    }

    /**
     * 评估分数
     */
    public Builder score(Integer score) {
      this.score = score;
      return this;
    }

    /**
     * 被评估人的身份证号
     */
    public Builder idcard(String idcard) {
      this.idcard = idcard;
      return this;
    }

    /**
     * 用户id
     */
    public Builder userId(Long userId) {
      this.userId = userId;
      return this;
    }

    /**
     * 	定向力
     */
    public Builder composure(String composure) {
      this.composure = composure;
      return this;
    }

    /**
     * 	记忆力得分
     */
    public Builder isMemory(Integer isMemory) {
      this.isMemory = isMemory;
      return this;
    }

    /**
     * 	注意力得分
     */
    public Builder isMind(Integer isMind) {
      this.isMind = isMind;
      return this;
    }

    /**
     * 	回忆能力得分
     */
    public Builder isRecall(Integer isRecall) {
      this.isRecall = isRecall;
      return this;
    }

    /**
     * 	命名能力得分
     */
    public Builder isRename(Integer isRename) {
      this.isRename = isRename;
      return this;
    }

    /**
     * 	复述能力得分
     */
    public Builder isRetell(Integer isRetell) {
      this.isRetell = isRetell;
      return this;
    }

    /**
     * 	三步命令得分
     */
    public Builder isThree(Integer isThree) {
      this.isThree = isThree;
      return this;
    }

    /**
     * 	书写能力得分
     */
    public Builder isWrite(Integer isWrite) {
      this.isWrite = isWrite;
      return this;
    }

    /**
     * 	阅读能力得分
     */
    public Builder isRead(Integer isRead) {
      this.isRead = isRead;
      return this;
    }

    /**
     * 	结构能力得分
     */
    public Builder isStruct(Integer isStruct) {
      this.isStruct = isStruct;
      return this;
    }

    /**
     * 记忆力备注
     */
    public Builder memoryRemark(String memoryRemark) {
      this.memoryRemark = memoryRemark;
      return this;
    }

    /**
     * 注意力备注
     */
    public Builder mindRemark(String mindRemark) {
      this.mindRemark = mindRemark;
      return this;
    }

    /**
     * 回忆能力备注
     */
    public Builder recallRemark(String recallRemark) {
      this.recallRemark = recallRemark;
      return this;
    }

    /**
     * 命名能力备注
     */
    public Builder renameRemark(String renameRemark) {
      this.renameRemark = renameRemark;
      return this;
    }

    /**
     * 复述能力备注
     */
    public Builder retellRemark(String retellRemark) {
      this.retellRemark = retellRemark;
      return this;
    }

    /**
     * 三步命令备注
     */
    public Builder threeRemark(String threeRemark) {
      this.threeRemark = threeRemark;
      return this;
    }

    /**
     * 书写能力备注
     */
    public Builder writeRemark(String writeRemark) {
      this.writeRemark = writeRemark;
      return this;
    }

    /**
     * 阅读能力备注
     */
    public Builder readRemark(String readRemark) {
      this.readRemark = readRemark;
      return this;
    }

    /**
     * 结构能力得分
     */
    public Builder structRemark(String structRemark) {
      this.structRemark = structRemark;
      return this;
    }

    public Builder createStaffId(Long createStaffId) {
      this.createStaffId = createStaffId;
      return this;
    }

    public Builder createStaffName(String createStaffName) {
      this.createStaffName = createStaffName;
      return this;
    }

    public Builder createTime(Long createTime) {
      this.createTime = createTime;
      return this;
    }

    /**
     * 评估备注
     */
    public Builder remark(String remark) {
      this.remark = remark;
      return this;
    }

    @Override
    public InsureAssessMMSE build() {
      return new InsureAssessMMSE(id, insureNO, assessType, score, idcard, userId, composure, isMemory, isMind, isRecall, isRename, isRetell, isThree, isWrite, isRead, isStruct, memoryRemark, mindRemark, recallRemark, renameRemark, retellRemark, threeRemark, writeRemark, readRemark, structRemark, createStaffId, createStaffName, createTime, remark, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_InsureAssessMMSE extends ProtoAdapter<InsureAssessMMSE> {
    ProtoAdapter_InsureAssessMMSE() {
      super(FieldEncoding.LENGTH_DELIMITED, InsureAssessMMSE.class);
    }

    @Override
    public int encodedSize(InsureAssessMMSE value) {
      return (value.id != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.id) : 0)
          + (value.insureNO != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.insureNO) : 0)
          + (value.assessType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(3, value.assessType) : 0)
          + (value.score != null ? ProtoAdapter.INT32.encodedSizeWithTag(4, value.score) : 0)
          + (value.idcard != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, value.idcard) : 0)
          + (value.userId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(6, value.userId) : 0)
          + (value.composure != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, value.composure) : 0)
          + (value.isMemory != null ? ProtoAdapter.UINT32.encodedSizeWithTag(8, value.isMemory) : 0)
          + (value.isMind != null ? ProtoAdapter.UINT32.encodedSizeWithTag(9, value.isMind) : 0)
          + (value.isRecall != null ? ProtoAdapter.UINT32.encodedSizeWithTag(10, value.isRecall) : 0)
          + (value.isRename != null ? ProtoAdapter.UINT32.encodedSizeWithTag(11, value.isRename) : 0)
          + (value.isRetell != null ? ProtoAdapter.UINT32.encodedSizeWithTag(12, value.isRetell) : 0)
          + (value.isThree != null ? ProtoAdapter.UINT32.encodedSizeWithTag(13, value.isThree) : 0)
          + (value.isWrite != null ? ProtoAdapter.UINT32.encodedSizeWithTag(14, value.isWrite) : 0)
          + (value.isRead != null ? ProtoAdapter.UINT32.encodedSizeWithTag(15, value.isRead) : 0)
          + (value.isStruct != null ? ProtoAdapter.UINT32.encodedSizeWithTag(16, value.isStruct) : 0)
          + (value.memoryRemark != null ? ProtoAdapter.STRING.encodedSizeWithTag(17, value.memoryRemark) : 0)
          + (value.mindRemark != null ? ProtoAdapter.STRING.encodedSizeWithTag(18, value.mindRemark) : 0)
          + (value.recallRemark != null ? ProtoAdapter.STRING.encodedSizeWithTag(19, value.recallRemark) : 0)
          + (value.renameRemark != null ? ProtoAdapter.STRING.encodedSizeWithTag(20, value.renameRemark) : 0)
          + (value.retellRemark != null ? ProtoAdapter.STRING.encodedSizeWithTag(21, value.retellRemark) : 0)
          + (value.threeRemark != null ? ProtoAdapter.STRING.encodedSizeWithTag(22, value.threeRemark) : 0)
          + (value.writeRemark != null ? ProtoAdapter.STRING.encodedSizeWithTag(23, value.writeRemark) : 0)
          + (value.readRemark != null ? ProtoAdapter.STRING.encodedSizeWithTag(24, value.readRemark) : 0)
          + (value.structRemark != null ? ProtoAdapter.STRING.encodedSizeWithTag(25, value.structRemark) : 0)
          + (value.createStaffId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(26, value.createStaffId) : 0)
          + (value.createStaffName != null ? ProtoAdapter.STRING.encodedSizeWithTag(27, value.createStaffName) : 0)
          + (value.createTime != null ? ProtoAdapter.UINT64.encodedSizeWithTag(28, value.createTime) : 0)
          + (value.remark != null ? ProtoAdapter.STRING.encodedSizeWithTag(29, value.remark) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, InsureAssessMMSE value) throws IOException {
      if (value.id != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.id);
      if (value.insureNO != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.insureNO);
      if (value.assessType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.assessType);
      if (value.score != null) ProtoAdapter.INT32.encodeWithTag(writer, 4, value.score);
      if (value.idcard != null) ProtoAdapter.STRING.encodeWithTag(writer, 5, value.idcard);
      if (value.userId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 6, value.userId);
      if (value.composure != null) ProtoAdapter.STRING.encodeWithTag(writer, 7, value.composure);
      if (value.isMemory != null) ProtoAdapter.UINT32.encodeWithTag(writer, 8, value.isMemory);
      if (value.isMind != null) ProtoAdapter.UINT32.encodeWithTag(writer, 9, value.isMind);
      if (value.isRecall != null) ProtoAdapter.UINT32.encodeWithTag(writer, 10, value.isRecall);
      if (value.isRename != null) ProtoAdapter.UINT32.encodeWithTag(writer, 11, value.isRename);
      if (value.isRetell != null) ProtoAdapter.UINT32.encodeWithTag(writer, 12, value.isRetell);
      if (value.isThree != null) ProtoAdapter.UINT32.encodeWithTag(writer, 13, value.isThree);
      if (value.isWrite != null) ProtoAdapter.UINT32.encodeWithTag(writer, 14, value.isWrite);
      if (value.isRead != null) ProtoAdapter.UINT32.encodeWithTag(writer, 15, value.isRead);
      if (value.isStruct != null) ProtoAdapter.UINT32.encodeWithTag(writer, 16, value.isStruct);
      if (value.memoryRemark != null) ProtoAdapter.STRING.encodeWithTag(writer, 17, value.memoryRemark);
      if (value.mindRemark != null) ProtoAdapter.STRING.encodeWithTag(writer, 18, value.mindRemark);
      if (value.recallRemark != null) ProtoAdapter.STRING.encodeWithTag(writer, 19, value.recallRemark);
      if (value.renameRemark != null) ProtoAdapter.STRING.encodeWithTag(writer, 20, value.renameRemark);
      if (value.retellRemark != null) ProtoAdapter.STRING.encodeWithTag(writer, 21, value.retellRemark);
      if (value.threeRemark != null) ProtoAdapter.STRING.encodeWithTag(writer, 22, value.threeRemark);
      if (value.writeRemark != null) ProtoAdapter.STRING.encodeWithTag(writer, 23, value.writeRemark);
      if (value.readRemark != null) ProtoAdapter.STRING.encodeWithTag(writer, 24, value.readRemark);
      if (value.structRemark != null) ProtoAdapter.STRING.encodeWithTag(writer, 25, value.structRemark);
      if (value.createStaffId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 26, value.createStaffId);
      if (value.createStaffName != null) ProtoAdapter.STRING.encodeWithTag(writer, 27, value.createStaffName);
      if (value.createTime != null) ProtoAdapter.UINT64.encodeWithTag(writer, 28, value.createTime);
      if (value.remark != null) ProtoAdapter.STRING.encodeWithTag(writer, 29, value.remark);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public InsureAssessMMSE decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.UINT64.decode(reader)); break;
          case 2: builder.insureNO(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.assessType(ProtoAdapter.UINT32.decode(reader)); break;
          case 4: builder.score(ProtoAdapter.INT32.decode(reader)); break;
          case 5: builder.idcard(ProtoAdapter.STRING.decode(reader)); break;
          case 6: builder.userId(ProtoAdapter.UINT64.decode(reader)); break;
          case 7: builder.composure(ProtoAdapter.STRING.decode(reader)); break;
          case 8: builder.isMemory(ProtoAdapter.UINT32.decode(reader)); break;
          case 9: builder.isMind(ProtoAdapter.UINT32.decode(reader)); break;
          case 10: builder.isRecall(ProtoAdapter.UINT32.decode(reader)); break;
          case 11: builder.isRename(ProtoAdapter.UINT32.decode(reader)); break;
          case 12: builder.isRetell(ProtoAdapter.UINT32.decode(reader)); break;
          case 13: builder.isThree(ProtoAdapter.UINT32.decode(reader)); break;
          case 14: builder.isWrite(ProtoAdapter.UINT32.decode(reader)); break;
          case 15: builder.isRead(ProtoAdapter.UINT32.decode(reader)); break;
          case 16: builder.isStruct(ProtoAdapter.UINT32.decode(reader)); break;
          case 17: builder.memoryRemark(ProtoAdapter.STRING.decode(reader)); break;
          case 18: builder.mindRemark(ProtoAdapter.STRING.decode(reader)); break;
          case 19: builder.recallRemark(ProtoAdapter.STRING.decode(reader)); break;
          case 20: builder.renameRemark(ProtoAdapter.STRING.decode(reader)); break;
          case 21: builder.retellRemark(ProtoAdapter.STRING.decode(reader)); break;
          case 22: builder.threeRemark(ProtoAdapter.STRING.decode(reader)); break;
          case 23: builder.writeRemark(ProtoAdapter.STRING.decode(reader)); break;
          case 24: builder.readRemark(ProtoAdapter.STRING.decode(reader)); break;
          case 25: builder.structRemark(ProtoAdapter.STRING.decode(reader)); break;
          case 26: builder.createStaffId(ProtoAdapter.UINT64.decode(reader)); break;
          case 27: builder.createStaffName(ProtoAdapter.STRING.decode(reader)); break;
          case 28: builder.createTime(ProtoAdapter.UINT64.decode(reader)); break;
          case 29: builder.remark(ProtoAdapter.STRING.decode(reader)); break;
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
    public InsureAssessMMSE redact(InsureAssessMMSE value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}