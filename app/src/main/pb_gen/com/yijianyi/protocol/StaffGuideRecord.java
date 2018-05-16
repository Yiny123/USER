// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: SaasModel.proto at 932:1
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
 * 人员指派记录
 */
public final class StaffGuideRecord extends Message<StaffGuideRecord, StaffGuideRecord.Builder> {
  public static final ProtoAdapter<StaffGuideRecord> ADAPTER = new ProtoAdapter_StaffGuideRecord();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_ID = 0L;

  public static final String DEFAULT_INSURENO = "";

  public static final String DEFAULT_ORDERID = "";

  public static final Long DEFAULT_STAFFID = 0L;

  public static final String DEFAULT_STAFFNAME = "";

  public static final Integer DEFAULT_GUIDE = 0;

  public static final String DEFAULT_CONTENT = "";

  public static final Long DEFAULT_CREATESTAFFID = 0L;

  public static final String DEFAULT_CREATESTAFFNAME = "";

  public static final Long DEFAULT_CREATETIME = 0L;

  public static final Integer DEFAULT_STATUS = 0;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long id;

  /**
   * 相关申请批次
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String insureNO;

  /**
   * 相关订单id
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orderId;

  /**
   * 被指派人id
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long staffId;

  /**
   * 被指派人
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String staffName;

  /**
   * 指派类型 0-护士上门评估长护险 1-服务上门评估
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer guide;

  /**
   * 指派内容
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String content;

  /**
   * 指派人id
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createStaffId;

  /**
   * 指派人
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String createStaffName;

  /**
   * 指派时间
   */
  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createTime;

  /**
   * 0-待上门 1-进行中 2-已完成
   */
  @WireField(
      tag = 11,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer status;

  public StaffGuideRecord(Long id, String insureNO, String orderId, Long staffId, String staffName, Integer guide, String content, Long createStaffId, String createStaffName, Long createTime, Integer status) {
    this(id, insureNO, orderId, staffId, staffName, guide, content, createStaffId, createStaffName, createTime, status, ByteString.EMPTY);
  }

  public StaffGuideRecord(Long id, String insureNO, String orderId, Long staffId, String staffName, Integer guide, String content, Long createStaffId, String createStaffName, Long createTime, Integer status, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.insureNO = insureNO;
    this.orderId = orderId;
    this.staffId = staffId;
    this.staffName = staffName;
    this.guide = guide;
    this.content = content;
    this.createStaffId = createStaffId;
    this.createStaffName = createStaffName;
    this.createTime = createTime;
    this.status = status;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.insureNO = insureNO;
    builder.orderId = orderId;
    builder.staffId = staffId;
    builder.staffName = staffName;
    builder.guide = guide;
    builder.content = content;
    builder.createStaffId = createStaffId;
    builder.createStaffName = createStaffName;
    builder.createTime = createTime;
    builder.status = status;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof StaffGuideRecord)) return false;
    StaffGuideRecord o = (StaffGuideRecord) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(insureNO, o.insureNO)
        && Internal.equals(orderId, o.orderId)
        && Internal.equals(staffId, o.staffId)
        && Internal.equals(staffName, o.staffName)
        && Internal.equals(guide, o.guide)
        && Internal.equals(content, o.content)
        && Internal.equals(createStaffId, o.createStaffId)
        && Internal.equals(createStaffName, o.createStaffName)
        && Internal.equals(createTime, o.createTime)
        && Internal.equals(status, o.status);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (insureNO != null ? insureNO.hashCode() : 0);
      result = result * 37 + (orderId != null ? orderId.hashCode() : 0);
      result = result * 37 + (staffId != null ? staffId.hashCode() : 0);
      result = result * 37 + (staffName != null ? staffName.hashCode() : 0);
      result = result * 37 + (guide != null ? guide.hashCode() : 0);
      result = result * 37 + (content != null ? content.hashCode() : 0);
      result = result * 37 + (createStaffId != null ? createStaffId.hashCode() : 0);
      result = result * 37 + (createStaffName != null ? createStaffName.hashCode() : 0);
      result = result * 37 + (createTime != null ? createTime.hashCode() : 0);
      result = result * 37 + (status != null ? status.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (id != null) builder.append(", id=").append(id);
    if (insureNO != null) builder.append(", insureNO=").append(insureNO);
    if (orderId != null) builder.append(", orderId=").append(orderId);
    if (staffId != null) builder.append(", staffId=").append(staffId);
    if (staffName != null) builder.append(", staffName=").append(staffName);
    if (guide != null) builder.append(", guide=").append(guide);
    if (content != null) builder.append(", content=").append(content);
    if (createStaffId != null) builder.append(", createStaffId=").append(createStaffId);
    if (createStaffName != null) builder.append(", createStaffName=").append(createStaffName);
    if (createTime != null) builder.append(", createTime=").append(createTime);
    if (status != null) builder.append(", status=").append(status);
    return builder.replace(0, 2, "StaffGuideRecord{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<StaffGuideRecord, Builder> {
    public Long id;

    public String insureNO;

    public String orderId;

    public Long staffId;

    public String staffName;

    public Integer guide;

    public String content;

    public Long createStaffId;

    public String createStaffName;

    public Long createTime;

    public Integer status;

    public Builder() {
    }

    public Builder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     * 相关申请批次
     */
    public Builder insureNO(String insureNO) {
      this.insureNO = insureNO;
      return this;
    }

    /**
     * 相关订单id
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * 被指派人id
     */
    public Builder staffId(Long staffId) {
      this.staffId = staffId;
      return this;
    }

    /**
     * 被指派人
     */
    public Builder staffName(String staffName) {
      this.staffName = staffName;
      return this;
    }

    /**
     * 指派类型 0-护士上门评估长护险 1-服务上门评估
     */
    public Builder guide(Integer guide) {
      this.guide = guide;
      return this;
    }

    /**
     * 指派内容
     */
    public Builder content(String content) {
      this.content = content;
      return this;
    }

    /**
     * 指派人id
     */
    public Builder createStaffId(Long createStaffId) {
      this.createStaffId = createStaffId;
      return this;
    }

    /**
     * 指派人
     */
    public Builder createStaffName(String createStaffName) {
      this.createStaffName = createStaffName;
      return this;
    }

    /**
     * 指派时间
     */
    public Builder createTime(Long createTime) {
      this.createTime = createTime;
      return this;
    }

    /**
     * 0-待上门 1-进行中 2-已完成
     */
    public Builder status(Integer status) {
      this.status = status;
      return this;
    }

    @Override
    public StaffGuideRecord build() {
      return new StaffGuideRecord(id, insureNO, orderId, staffId, staffName, guide, content, createStaffId, createStaffName, createTime, status, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_StaffGuideRecord extends ProtoAdapter<StaffGuideRecord> {
    ProtoAdapter_StaffGuideRecord() {
      super(FieldEncoding.LENGTH_DELIMITED, StaffGuideRecord.class);
    }

    @Override
    public int encodedSize(StaffGuideRecord value) {
      return (value.id != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.id) : 0)
          + (value.insureNO != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.insureNO) : 0)
          + (value.orderId != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.orderId) : 0)
          + (value.staffId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(4, value.staffId) : 0)
          + (value.staffName != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, value.staffName) : 0)
          + (value.guide != null ? ProtoAdapter.UINT32.encodedSizeWithTag(6, value.guide) : 0)
          + (value.content != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, value.content) : 0)
          + (value.createStaffId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(8, value.createStaffId) : 0)
          + (value.createStaffName != null ? ProtoAdapter.STRING.encodedSizeWithTag(9, value.createStaffName) : 0)
          + (value.createTime != null ? ProtoAdapter.UINT64.encodedSizeWithTag(10, value.createTime) : 0)
          + (value.status != null ? ProtoAdapter.UINT32.encodedSizeWithTag(11, value.status) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, StaffGuideRecord value) throws IOException {
      if (value.id != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.id);
      if (value.insureNO != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.insureNO);
      if (value.orderId != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.orderId);
      if (value.staffId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 4, value.staffId);
      if (value.staffName != null) ProtoAdapter.STRING.encodeWithTag(writer, 5, value.staffName);
      if (value.guide != null) ProtoAdapter.UINT32.encodeWithTag(writer, 6, value.guide);
      if (value.content != null) ProtoAdapter.STRING.encodeWithTag(writer, 7, value.content);
      if (value.createStaffId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 8, value.createStaffId);
      if (value.createStaffName != null) ProtoAdapter.STRING.encodeWithTag(writer, 9, value.createStaffName);
      if (value.createTime != null) ProtoAdapter.UINT64.encodeWithTag(writer, 10, value.createTime);
      if (value.status != null) ProtoAdapter.UINT32.encodeWithTag(writer, 11, value.status);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public StaffGuideRecord decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.UINT64.decode(reader)); break;
          case 2: builder.insureNO(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.orderId(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.staffId(ProtoAdapter.UINT64.decode(reader)); break;
          case 5: builder.staffName(ProtoAdapter.STRING.decode(reader)); break;
          case 6: builder.guide(ProtoAdapter.UINT32.decode(reader)); break;
          case 7: builder.content(ProtoAdapter.STRING.decode(reader)); break;
          case 8: builder.createStaffId(ProtoAdapter.UINT64.decode(reader)); break;
          case 9: builder.createStaffName(ProtoAdapter.STRING.decode(reader)); break;
          case 10: builder.createTime(ProtoAdapter.UINT64.decode(reader)); break;
          case 11: builder.status(ProtoAdapter.UINT32.decode(reader)); break;
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
    public StaffGuideRecord redact(StaffGuideRecord value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
