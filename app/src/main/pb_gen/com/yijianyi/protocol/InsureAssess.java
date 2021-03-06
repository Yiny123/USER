// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: SaasModel.proto at 983:1
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
 * 长护险评估结果
 */
public final class InsureAssess extends Message<InsureAssess, InsureAssess.Builder> {
  public static final ProtoAdapter<InsureAssess> ADAPTER = new ProtoAdapter_InsureAssess();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_ID = 0L;

  public static final String DEFAULT_INSURENO = "";

  public static final Integer DEFAULT_ASSESSTYPE = 0;

  public static final Integer DEFAULT_SCORE = 0;

  public static final Integer DEFAULT_ISEAT = 0;

  public static final Integer DEFAULT_ISWATER = 0;

  public static final Integer DEFAULT_ISFACE = 0;

  public static final Integer DEFAULT_ISWEAR = 0;

  public static final Integer DEFAULT_ISFAEC = 0;

  public static final Integer DEFAULT_ISPEE = 0;

  public static final Integer DEFAULT_ISTOILET = 0;

  public static final Integer DEFAULT_ISCARRY = 0;

  public static final Integer DEFAULT_ISWALK = 0;

  public static final Integer DEFAULT_ISSTAIR = 0;

  public static final Long DEFAULT_CREATESTAFFID = 0L;

  public static final String DEFAULT_CREATESTAFFNAME = "";

  public static final Long DEFAULT_CREATETIME = 0L;

  public static final String DEFAULT_REMARK = "";

  public static final String DEFAULT_IDCARD = "";

  public static final Long DEFAULT_USERID = 0L;

  public static final String DEFAULT_EATREMARK = "";

  public static final String DEFAULT_WATERREMARK = "";

  public static final String DEFAULT_FACEREMARK = "";

  public static final String DEFAULT_WEARREMARK = "";

  public static final String DEFAULT_FAECREMARK = "";

  public static final String DEFAULT_PEEREMARK = "";

  public static final String DEFAULT_TOILETREMARK = "";

  public static final String DEFAULT_CARRYREMARK = "";

  public static final String DEFAULT_WALKREMARK = "";

  public static final String DEFAULT_STAIRREMARK = "";

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
   * 是否能自己吃饭
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer isEat;

  /**
   * 是否能自己洗澡
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer isWater;

  /**
   * 是否能自己整理仪容
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer isFace;

  /**
   * 是否能自己穿衣服
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer isWear;

  /**
   * 是否能自己控制大便
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer isFaec;

  /**
   * 是否能自己控制小便
   */
  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer isPee;

  /**
   * 是否能自己上厕所
   */
  @WireField(
      tag = 11,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer isToilet;

  /**
   * 是否能自己进行床椅转移
   */
  @WireField(
      tag = 12,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer isCarry;

  /**
   * 是否能自己行走
   */
  @WireField(
      tag = 13,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer isWalk;

  /**
   * 是否能自己上下楼梯
   */
  @WireField(
      tag = 14,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer isStair;

  @WireField(
      tag = 15,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createStaffId;

  @WireField(
      tag = 16,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String createStaffName;

  @WireField(
      tag = 17,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createTime;

  /**
   * 评估备注
   */
  @WireField(
      tag = 18,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String remark;

  /**
   * 被评估人的身份证号
   */
  @WireField(
      tag = 19,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String idcard;

  /**
   * 用户id
   */
  @WireField(
      tag = 20,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long userId;

  /**
   * 是否能自己吃饭-备注
   */
  @WireField(
      tag = 21,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String eatRemark;

  /**
   * 是否能自己洗澡-备注
   */
  @WireField(
      tag = 22,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String waterRemark;

  /**
   * 是否能自己整理仪容-备注
   */
  @WireField(
      tag = 23,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String faceRemark;

  /**
   * 是否能自己穿衣服-备注
   */
  @WireField(
      tag = 24,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String wearRemark;

  /**
   * 是否能自己控制大便-备注
   */
  @WireField(
      tag = 25,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String faecRemark;

  /**
   * 是否能自己控制小便-备注
   */
  @WireField(
      tag = 26,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String peeRemark;

  /**
   * 是否能自己上厕所-备注
   */
  @WireField(
      tag = 27,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String toiletRemark;

  /**
   * 是否能自己进行床椅转移-备注
   */
  @WireField(
      tag = 28,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String carryRemark;

  /**
   * 是否能自己行走-备注
   */
  @WireField(
      tag = 29,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String walkRemark;

  /**
   * 是否能自己上下楼梯-备注
   */
  @WireField(
      tag = 30,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String stairRemark;

  public InsureAssess(Long id, String insureNO, Integer assessType, Integer score, Integer isEat, Integer isWater, Integer isFace, Integer isWear, Integer isFaec, Integer isPee, Integer isToilet, Integer isCarry, Integer isWalk, Integer isStair, Long createStaffId, String createStaffName, Long createTime, String remark, String idcard, Long userId, String eatRemark, String waterRemark, String faceRemark, String wearRemark, String faecRemark, String peeRemark, String toiletRemark, String carryRemark, String walkRemark, String stairRemark) {
    this(id, insureNO, assessType, score, isEat, isWater, isFace, isWear, isFaec, isPee, isToilet, isCarry, isWalk, isStair, createStaffId, createStaffName, createTime, remark, idcard, userId, eatRemark, waterRemark, faceRemark, wearRemark, faecRemark, peeRemark, toiletRemark, carryRemark, walkRemark, stairRemark, ByteString.EMPTY);
  }

  public InsureAssess(Long id, String insureNO, Integer assessType, Integer score, Integer isEat, Integer isWater, Integer isFace, Integer isWear, Integer isFaec, Integer isPee, Integer isToilet, Integer isCarry, Integer isWalk, Integer isStair, Long createStaffId, String createStaffName, Long createTime, String remark, String idcard, Long userId, String eatRemark, String waterRemark, String faceRemark, String wearRemark, String faecRemark, String peeRemark, String toiletRemark, String carryRemark, String walkRemark, String stairRemark, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.insureNO = insureNO;
    this.assessType = assessType;
    this.score = score;
    this.isEat = isEat;
    this.isWater = isWater;
    this.isFace = isFace;
    this.isWear = isWear;
    this.isFaec = isFaec;
    this.isPee = isPee;
    this.isToilet = isToilet;
    this.isCarry = isCarry;
    this.isWalk = isWalk;
    this.isStair = isStair;
    this.createStaffId = createStaffId;
    this.createStaffName = createStaffName;
    this.createTime = createTime;
    this.remark = remark;
    this.idcard = idcard;
    this.userId = userId;
    this.eatRemark = eatRemark;
    this.waterRemark = waterRemark;
    this.faceRemark = faceRemark;
    this.wearRemark = wearRemark;
    this.faecRemark = faecRemark;
    this.peeRemark = peeRemark;
    this.toiletRemark = toiletRemark;
    this.carryRemark = carryRemark;
    this.walkRemark = walkRemark;
    this.stairRemark = stairRemark;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.insureNO = insureNO;
    builder.assessType = assessType;
    builder.score = score;
    builder.isEat = isEat;
    builder.isWater = isWater;
    builder.isFace = isFace;
    builder.isWear = isWear;
    builder.isFaec = isFaec;
    builder.isPee = isPee;
    builder.isToilet = isToilet;
    builder.isCarry = isCarry;
    builder.isWalk = isWalk;
    builder.isStair = isStair;
    builder.createStaffId = createStaffId;
    builder.createStaffName = createStaffName;
    builder.createTime = createTime;
    builder.remark = remark;
    builder.idcard = idcard;
    builder.userId = userId;
    builder.eatRemark = eatRemark;
    builder.waterRemark = waterRemark;
    builder.faceRemark = faceRemark;
    builder.wearRemark = wearRemark;
    builder.faecRemark = faecRemark;
    builder.peeRemark = peeRemark;
    builder.toiletRemark = toiletRemark;
    builder.carryRemark = carryRemark;
    builder.walkRemark = walkRemark;
    builder.stairRemark = stairRemark;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof InsureAssess)) return false;
    InsureAssess o = (InsureAssess) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(insureNO, o.insureNO)
        && Internal.equals(assessType, o.assessType)
        && Internal.equals(score, o.score)
        && Internal.equals(isEat, o.isEat)
        && Internal.equals(isWater, o.isWater)
        && Internal.equals(isFace, o.isFace)
        && Internal.equals(isWear, o.isWear)
        && Internal.equals(isFaec, o.isFaec)
        && Internal.equals(isPee, o.isPee)
        && Internal.equals(isToilet, o.isToilet)
        && Internal.equals(isCarry, o.isCarry)
        && Internal.equals(isWalk, o.isWalk)
        && Internal.equals(isStair, o.isStair)
        && Internal.equals(createStaffId, o.createStaffId)
        && Internal.equals(createStaffName, o.createStaffName)
        && Internal.equals(createTime, o.createTime)
        && Internal.equals(remark, o.remark)
        && Internal.equals(idcard, o.idcard)
        && Internal.equals(userId, o.userId)
        && Internal.equals(eatRemark, o.eatRemark)
        && Internal.equals(waterRemark, o.waterRemark)
        && Internal.equals(faceRemark, o.faceRemark)
        && Internal.equals(wearRemark, o.wearRemark)
        && Internal.equals(faecRemark, o.faecRemark)
        && Internal.equals(peeRemark, o.peeRemark)
        && Internal.equals(toiletRemark, o.toiletRemark)
        && Internal.equals(carryRemark, o.carryRemark)
        && Internal.equals(walkRemark, o.walkRemark)
        && Internal.equals(stairRemark, o.stairRemark);
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
      result = result * 37 + (isEat != null ? isEat.hashCode() : 0);
      result = result * 37 + (isWater != null ? isWater.hashCode() : 0);
      result = result * 37 + (isFace != null ? isFace.hashCode() : 0);
      result = result * 37 + (isWear != null ? isWear.hashCode() : 0);
      result = result * 37 + (isFaec != null ? isFaec.hashCode() : 0);
      result = result * 37 + (isPee != null ? isPee.hashCode() : 0);
      result = result * 37 + (isToilet != null ? isToilet.hashCode() : 0);
      result = result * 37 + (isCarry != null ? isCarry.hashCode() : 0);
      result = result * 37 + (isWalk != null ? isWalk.hashCode() : 0);
      result = result * 37 + (isStair != null ? isStair.hashCode() : 0);
      result = result * 37 + (createStaffId != null ? createStaffId.hashCode() : 0);
      result = result * 37 + (createStaffName != null ? createStaffName.hashCode() : 0);
      result = result * 37 + (createTime != null ? createTime.hashCode() : 0);
      result = result * 37 + (remark != null ? remark.hashCode() : 0);
      result = result * 37 + (idcard != null ? idcard.hashCode() : 0);
      result = result * 37 + (userId != null ? userId.hashCode() : 0);
      result = result * 37 + (eatRemark != null ? eatRemark.hashCode() : 0);
      result = result * 37 + (waterRemark != null ? waterRemark.hashCode() : 0);
      result = result * 37 + (faceRemark != null ? faceRemark.hashCode() : 0);
      result = result * 37 + (wearRemark != null ? wearRemark.hashCode() : 0);
      result = result * 37 + (faecRemark != null ? faecRemark.hashCode() : 0);
      result = result * 37 + (peeRemark != null ? peeRemark.hashCode() : 0);
      result = result * 37 + (toiletRemark != null ? toiletRemark.hashCode() : 0);
      result = result * 37 + (carryRemark != null ? carryRemark.hashCode() : 0);
      result = result * 37 + (walkRemark != null ? walkRemark.hashCode() : 0);
      result = result * 37 + (stairRemark != null ? stairRemark.hashCode() : 0);
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
    if (isEat != null) builder.append(", isEat=").append(isEat);
    if (isWater != null) builder.append(", isWater=").append(isWater);
    if (isFace != null) builder.append(", isFace=").append(isFace);
    if (isWear != null) builder.append(", isWear=").append(isWear);
    if (isFaec != null) builder.append(", isFaec=").append(isFaec);
    if (isPee != null) builder.append(", isPee=").append(isPee);
    if (isToilet != null) builder.append(", isToilet=").append(isToilet);
    if (isCarry != null) builder.append(", isCarry=").append(isCarry);
    if (isWalk != null) builder.append(", isWalk=").append(isWalk);
    if (isStair != null) builder.append(", isStair=").append(isStair);
    if (createStaffId != null) builder.append(", createStaffId=").append(createStaffId);
    if (createStaffName != null) builder.append(", createStaffName=").append(createStaffName);
    if (createTime != null) builder.append(", createTime=").append(createTime);
    if (remark != null) builder.append(", remark=").append(remark);
    if (idcard != null) builder.append(", idcard=").append(idcard);
    if (userId != null) builder.append(", userId=").append(userId);
    if (eatRemark != null) builder.append(", eatRemark=").append(eatRemark);
    if (waterRemark != null) builder.append(", waterRemark=").append(waterRemark);
    if (faceRemark != null) builder.append(", faceRemark=").append(faceRemark);
    if (wearRemark != null) builder.append(", wearRemark=").append(wearRemark);
    if (faecRemark != null) builder.append(", faecRemark=").append(faecRemark);
    if (peeRemark != null) builder.append(", peeRemark=").append(peeRemark);
    if (toiletRemark != null) builder.append(", toiletRemark=").append(toiletRemark);
    if (carryRemark != null) builder.append(", carryRemark=").append(carryRemark);
    if (walkRemark != null) builder.append(", walkRemark=").append(walkRemark);
    if (stairRemark != null) builder.append(", stairRemark=").append(stairRemark);
    return builder.replace(0, 2, "InsureAssess{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<InsureAssess, Builder> {
    public Long id;

    public String insureNO;

    public Integer assessType;

    public Integer score;

    public Integer isEat;

    public Integer isWater;

    public Integer isFace;

    public Integer isWear;

    public Integer isFaec;

    public Integer isPee;

    public Integer isToilet;

    public Integer isCarry;

    public Integer isWalk;

    public Integer isStair;

    public Long createStaffId;

    public String createStaffName;

    public Long createTime;

    public String remark;

    public String idcard;

    public Long userId;

    public String eatRemark;

    public String waterRemark;

    public String faceRemark;

    public String wearRemark;

    public String faecRemark;

    public String peeRemark;

    public String toiletRemark;

    public String carryRemark;

    public String walkRemark;

    public String stairRemark;

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
     * 是否能自己吃饭
     */
    public Builder isEat(Integer isEat) {
      this.isEat = isEat;
      return this;
    }

    /**
     * 是否能自己洗澡
     */
    public Builder isWater(Integer isWater) {
      this.isWater = isWater;
      return this;
    }

    /**
     * 是否能自己整理仪容
     */
    public Builder isFace(Integer isFace) {
      this.isFace = isFace;
      return this;
    }

    /**
     * 是否能自己穿衣服
     */
    public Builder isWear(Integer isWear) {
      this.isWear = isWear;
      return this;
    }

    /**
     * 是否能自己控制大便
     */
    public Builder isFaec(Integer isFaec) {
      this.isFaec = isFaec;
      return this;
    }

    /**
     * 是否能自己控制小便
     */
    public Builder isPee(Integer isPee) {
      this.isPee = isPee;
      return this;
    }

    /**
     * 是否能自己上厕所
     */
    public Builder isToilet(Integer isToilet) {
      this.isToilet = isToilet;
      return this;
    }

    /**
     * 是否能自己进行床椅转移
     */
    public Builder isCarry(Integer isCarry) {
      this.isCarry = isCarry;
      return this;
    }

    /**
     * 是否能自己行走
     */
    public Builder isWalk(Integer isWalk) {
      this.isWalk = isWalk;
      return this;
    }

    /**
     * 是否能自己上下楼梯
     */
    public Builder isStair(Integer isStair) {
      this.isStair = isStair;
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
     * 是否能自己吃饭-备注
     */
    public Builder eatRemark(String eatRemark) {
      this.eatRemark = eatRemark;
      return this;
    }

    /**
     * 是否能自己洗澡-备注
     */
    public Builder waterRemark(String waterRemark) {
      this.waterRemark = waterRemark;
      return this;
    }

    /**
     * 是否能自己整理仪容-备注
     */
    public Builder faceRemark(String faceRemark) {
      this.faceRemark = faceRemark;
      return this;
    }

    /**
     * 是否能自己穿衣服-备注
     */
    public Builder wearRemark(String wearRemark) {
      this.wearRemark = wearRemark;
      return this;
    }

    /**
     * 是否能自己控制大便-备注
     */
    public Builder faecRemark(String faecRemark) {
      this.faecRemark = faecRemark;
      return this;
    }

    /**
     * 是否能自己控制小便-备注
     */
    public Builder peeRemark(String peeRemark) {
      this.peeRemark = peeRemark;
      return this;
    }

    /**
     * 是否能自己上厕所-备注
     */
    public Builder toiletRemark(String toiletRemark) {
      this.toiletRemark = toiletRemark;
      return this;
    }

    /**
     * 是否能自己进行床椅转移-备注
     */
    public Builder carryRemark(String carryRemark) {
      this.carryRemark = carryRemark;
      return this;
    }

    /**
     * 是否能自己行走-备注
     */
    public Builder walkRemark(String walkRemark) {
      this.walkRemark = walkRemark;
      return this;
    }

    /**
     * 是否能自己上下楼梯-备注
     */
    public Builder stairRemark(String stairRemark) {
      this.stairRemark = stairRemark;
      return this;
    }

    @Override
    public InsureAssess build() {
      return new InsureAssess(id, insureNO, assessType, score, isEat, isWater, isFace, isWear, isFaec, isPee, isToilet, isCarry, isWalk, isStair, createStaffId, createStaffName, createTime, remark, idcard, userId, eatRemark, waterRemark, faceRemark, wearRemark, faecRemark, peeRemark, toiletRemark, carryRemark, walkRemark, stairRemark, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_InsureAssess extends ProtoAdapter<InsureAssess> {
    ProtoAdapter_InsureAssess() {
      super(FieldEncoding.LENGTH_DELIMITED, InsureAssess.class);
    }

    @Override
    public int encodedSize(InsureAssess value) {
      return (value.id != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.id) : 0)
          + (value.insureNO != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.insureNO) : 0)
          + (value.assessType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(3, value.assessType) : 0)
          + (value.score != null ? ProtoAdapter.INT32.encodedSizeWithTag(4, value.score) : 0)
          + (value.isEat != null ? ProtoAdapter.UINT32.encodedSizeWithTag(5, value.isEat) : 0)
          + (value.isWater != null ? ProtoAdapter.UINT32.encodedSizeWithTag(6, value.isWater) : 0)
          + (value.isFace != null ? ProtoAdapter.UINT32.encodedSizeWithTag(7, value.isFace) : 0)
          + (value.isWear != null ? ProtoAdapter.UINT32.encodedSizeWithTag(8, value.isWear) : 0)
          + (value.isFaec != null ? ProtoAdapter.UINT32.encodedSizeWithTag(9, value.isFaec) : 0)
          + (value.isPee != null ? ProtoAdapter.UINT32.encodedSizeWithTag(10, value.isPee) : 0)
          + (value.isToilet != null ? ProtoAdapter.UINT32.encodedSizeWithTag(11, value.isToilet) : 0)
          + (value.isCarry != null ? ProtoAdapter.UINT32.encodedSizeWithTag(12, value.isCarry) : 0)
          + (value.isWalk != null ? ProtoAdapter.UINT32.encodedSizeWithTag(13, value.isWalk) : 0)
          + (value.isStair != null ? ProtoAdapter.UINT32.encodedSizeWithTag(14, value.isStair) : 0)
          + (value.createStaffId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(15, value.createStaffId) : 0)
          + (value.createStaffName != null ? ProtoAdapter.STRING.encodedSizeWithTag(16, value.createStaffName) : 0)
          + (value.createTime != null ? ProtoAdapter.UINT64.encodedSizeWithTag(17, value.createTime) : 0)
          + (value.remark != null ? ProtoAdapter.STRING.encodedSizeWithTag(18, value.remark) : 0)
          + (value.idcard != null ? ProtoAdapter.STRING.encodedSizeWithTag(19, value.idcard) : 0)
          + (value.userId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(20, value.userId) : 0)
          + (value.eatRemark != null ? ProtoAdapter.STRING.encodedSizeWithTag(21, value.eatRemark) : 0)
          + (value.waterRemark != null ? ProtoAdapter.STRING.encodedSizeWithTag(22, value.waterRemark) : 0)
          + (value.faceRemark != null ? ProtoAdapter.STRING.encodedSizeWithTag(23, value.faceRemark) : 0)
          + (value.wearRemark != null ? ProtoAdapter.STRING.encodedSizeWithTag(24, value.wearRemark) : 0)
          + (value.faecRemark != null ? ProtoAdapter.STRING.encodedSizeWithTag(25, value.faecRemark) : 0)
          + (value.peeRemark != null ? ProtoAdapter.STRING.encodedSizeWithTag(26, value.peeRemark) : 0)
          + (value.toiletRemark != null ? ProtoAdapter.STRING.encodedSizeWithTag(27, value.toiletRemark) : 0)
          + (value.carryRemark != null ? ProtoAdapter.STRING.encodedSizeWithTag(28, value.carryRemark) : 0)
          + (value.walkRemark != null ? ProtoAdapter.STRING.encodedSizeWithTag(29, value.walkRemark) : 0)
          + (value.stairRemark != null ? ProtoAdapter.STRING.encodedSizeWithTag(30, value.stairRemark) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, InsureAssess value) throws IOException {
      if (value.id != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.id);
      if (value.insureNO != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.insureNO);
      if (value.assessType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.assessType);
      if (value.score != null) ProtoAdapter.INT32.encodeWithTag(writer, 4, value.score);
      if (value.isEat != null) ProtoAdapter.UINT32.encodeWithTag(writer, 5, value.isEat);
      if (value.isWater != null) ProtoAdapter.UINT32.encodeWithTag(writer, 6, value.isWater);
      if (value.isFace != null) ProtoAdapter.UINT32.encodeWithTag(writer, 7, value.isFace);
      if (value.isWear != null) ProtoAdapter.UINT32.encodeWithTag(writer, 8, value.isWear);
      if (value.isFaec != null) ProtoAdapter.UINT32.encodeWithTag(writer, 9, value.isFaec);
      if (value.isPee != null) ProtoAdapter.UINT32.encodeWithTag(writer, 10, value.isPee);
      if (value.isToilet != null) ProtoAdapter.UINT32.encodeWithTag(writer, 11, value.isToilet);
      if (value.isCarry != null) ProtoAdapter.UINT32.encodeWithTag(writer, 12, value.isCarry);
      if (value.isWalk != null) ProtoAdapter.UINT32.encodeWithTag(writer, 13, value.isWalk);
      if (value.isStair != null) ProtoAdapter.UINT32.encodeWithTag(writer, 14, value.isStair);
      if (value.createStaffId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 15, value.createStaffId);
      if (value.createStaffName != null) ProtoAdapter.STRING.encodeWithTag(writer, 16, value.createStaffName);
      if (value.createTime != null) ProtoAdapter.UINT64.encodeWithTag(writer, 17, value.createTime);
      if (value.remark != null) ProtoAdapter.STRING.encodeWithTag(writer, 18, value.remark);
      if (value.idcard != null) ProtoAdapter.STRING.encodeWithTag(writer, 19, value.idcard);
      if (value.userId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 20, value.userId);
      if (value.eatRemark != null) ProtoAdapter.STRING.encodeWithTag(writer, 21, value.eatRemark);
      if (value.waterRemark != null) ProtoAdapter.STRING.encodeWithTag(writer, 22, value.waterRemark);
      if (value.faceRemark != null) ProtoAdapter.STRING.encodeWithTag(writer, 23, value.faceRemark);
      if (value.wearRemark != null) ProtoAdapter.STRING.encodeWithTag(writer, 24, value.wearRemark);
      if (value.faecRemark != null) ProtoAdapter.STRING.encodeWithTag(writer, 25, value.faecRemark);
      if (value.peeRemark != null) ProtoAdapter.STRING.encodeWithTag(writer, 26, value.peeRemark);
      if (value.toiletRemark != null) ProtoAdapter.STRING.encodeWithTag(writer, 27, value.toiletRemark);
      if (value.carryRemark != null) ProtoAdapter.STRING.encodeWithTag(writer, 28, value.carryRemark);
      if (value.walkRemark != null) ProtoAdapter.STRING.encodeWithTag(writer, 29, value.walkRemark);
      if (value.stairRemark != null) ProtoAdapter.STRING.encodeWithTag(writer, 30, value.stairRemark);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public InsureAssess decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.UINT64.decode(reader)); break;
          case 2: builder.insureNO(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.assessType(ProtoAdapter.UINT32.decode(reader)); break;
          case 4: builder.score(ProtoAdapter.INT32.decode(reader)); break;
          case 5: builder.isEat(ProtoAdapter.UINT32.decode(reader)); break;
          case 6: builder.isWater(ProtoAdapter.UINT32.decode(reader)); break;
          case 7: builder.isFace(ProtoAdapter.UINT32.decode(reader)); break;
          case 8: builder.isWear(ProtoAdapter.UINT32.decode(reader)); break;
          case 9: builder.isFaec(ProtoAdapter.UINT32.decode(reader)); break;
          case 10: builder.isPee(ProtoAdapter.UINT32.decode(reader)); break;
          case 11: builder.isToilet(ProtoAdapter.UINT32.decode(reader)); break;
          case 12: builder.isCarry(ProtoAdapter.UINT32.decode(reader)); break;
          case 13: builder.isWalk(ProtoAdapter.UINT32.decode(reader)); break;
          case 14: builder.isStair(ProtoAdapter.UINT32.decode(reader)); break;
          case 15: builder.createStaffId(ProtoAdapter.UINT64.decode(reader)); break;
          case 16: builder.createStaffName(ProtoAdapter.STRING.decode(reader)); break;
          case 17: builder.createTime(ProtoAdapter.UINT64.decode(reader)); break;
          case 18: builder.remark(ProtoAdapter.STRING.decode(reader)); break;
          case 19: builder.idcard(ProtoAdapter.STRING.decode(reader)); break;
          case 20: builder.userId(ProtoAdapter.UINT64.decode(reader)); break;
          case 21: builder.eatRemark(ProtoAdapter.STRING.decode(reader)); break;
          case 22: builder.waterRemark(ProtoAdapter.STRING.decode(reader)); break;
          case 23: builder.faceRemark(ProtoAdapter.STRING.decode(reader)); break;
          case 24: builder.wearRemark(ProtoAdapter.STRING.decode(reader)); break;
          case 25: builder.faecRemark(ProtoAdapter.STRING.decode(reader)); break;
          case 26: builder.peeRemark(ProtoAdapter.STRING.decode(reader)); break;
          case 27: builder.toiletRemark(ProtoAdapter.STRING.decode(reader)); break;
          case 28: builder.carryRemark(ProtoAdapter.STRING.decode(reader)); break;
          case 29: builder.walkRemark(ProtoAdapter.STRING.decode(reader)); break;
          case 30: builder.stairRemark(ProtoAdapter.STRING.decode(reader)); break;
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
    public InsureAssess redact(InsureAssess value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
