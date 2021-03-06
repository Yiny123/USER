// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: SaasModel.proto at 99:1
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

public final class BranchModel extends Message<BranchModel, BranchModel.Builder> {
  public static final ProtoAdapter<BranchModel> ADAPTER = new ProtoAdapter_BranchModel();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_ID = 0L;

  public static final Long DEFAULT_ORGID = 0L;

  public static final String DEFAULT_BRANCHNAME = "";

  public static final Long DEFAULT_CREATETIME = 0L;

  public static final Integer DEFAULT_CREATETYPE = 0;

  public static final String DEFAULT_CREATECHANNEL = "";

  public static final Long DEFAULT_CREATESTAFFID = 0L;

  public static final String DEFAULT_CREATESTAFFNAME = "";

  public static final Integer DEFAULT_STATE = 0;

  public static final String DEFAULT_MPQRCODE = "";

  /**
   * 科室ID
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long id;

  /**
   * 机构ID
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long orgId;

  /**
   * 科室名称
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String branchName;

  /**
   * 创建时间
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createTime;

  /**
   * 1-自己注册  2-公司添加
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer createType;

  /**
   * 创建渠道
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String createChannel;

  /**
   * 创建员工ID
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createStaffId;

  /**
   * 创建员工名称
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String createStaffName;

  /**
   * 科室的状态  -1 已删除   0在线
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer state;

  /**
   * 对应的机构
   */
  @WireField(
      tag = 10,
      adapter = "com.yijianyi.protocol.OrgModel#ADAPTER"
  )
  public final OrgModel org;

  /**
   * 公众号二维码地址
   */
  @WireField(
      tag = 11,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String mpQRCode;

  public BranchModel(Long id, Long orgId, String branchName, Long createTime, Integer createType, String createChannel, Long createStaffId, String createStaffName, Integer state, OrgModel org, String mpQRCode) {
    this(id, orgId, branchName, createTime, createType, createChannel, createStaffId, createStaffName, state, org, mpQRCode, ByteString.EMPTY);
  }

  public BranchModel(Long id, Long orgId, String branchName, Long createTime, Integer createType, String createChannel, Long createStaffId, String createStaffName, Integer state, OrgModel org, String mpQRCode, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.orgId = orgId;
    this.branchName = branchName;
    this.createTime = createTime;
    this.createType = createType;
    this.createChannel = createChannel;
    this.createStaffId = createStaffId;
    this.createStaffName = createStaffName;
    this.state = state;
    this.org = org;
    this.mpQRCode = mpQRCode;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.orgId = orgId;
    builder.branchName = branchName;
    builder.createTime = createTime;
    builder.createType = createType;
    builder.createChannel = createChannel;
    builder.createStaffId = createStaffId;
    builder.createStaffName = createStaffName;
    builder.state = state;
    builder.org = org;
    builder.mpQRCode = mpQRCode;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof BranchModel)) return false;
    BranchModel o = (BranchModel) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(orgId, o.orgId)
        && Internal.equals(branchName, o.branchName)
        && Internal.equals(createTime, o.createTime)
        && Internal.equals(createType, o.createType)
        && Internal.equals(createChannel, o.createChannel)
        && Internal.equals(createStaffId, o.createStaffId)
        && Internal.equals(createStaffName, o.createStaffName)
        && Internal.equals(state, o.state)
        && Internal.equals(org, o.org)
        && Internal.equals(mpQRCode, o.mpQRCode);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (orgId != null ? orgId.hashCode() : 0);
      result = result * 37 + (branchName != null ? branchName.hashCode() : 0);
      result = result * 37 + (createTime != null ? createTime.hashCode() : 0);
      result = result * 37 + (createType != null ? createType.hashCode() : 0);
      result = result * 37 + (createChannel != null ? createChannel.hashCode() : 0);
      result = result * 37 + (createStaffId != null ? createStaffId.hashCode() : 0);
      result = result * 37 + (createStaffName != null ? createStaffName.hashCode() : 0);
      result = result * 37 + (state != null ? state.hashCode() : 0);
      result = result * 37 + (org != null ? org.hashCode() : 0);
      result = result * 37 + (mpQRCode != null ? mpQRCode.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (id != null) builder.append(", id=").append(id);
    if (orgId != null) builder.append(", orgId=").append(orgId);
    if (branchName != null) builder.append(", branchName=").append(branchName);
    if (createTime != null) builder.append(", createTime=").append(createTime);
    if (createType != null) builder.append(", createType=").append(createType);
    if (createChannel != null) builder.append(", createChannel=").append(createChannel);
    if (createStaffId != null) builder.append(", createStaffId=").append(createStaffId);
    if (createStaffName != null) builder.append(", createStaffName=").append(createStaffName);
    if (state != null) builder.append(", state=").append(state);
    if (org != null) builder.append(", org=").append(org);
    if (mpQRCode != null) builder.append(", mpQRCode=").append(mpQRCode);
    return builder.replace(0, 2, "BranchModel{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<BranchModel, Builder> {
    public Long id;

    public Long orgId;

    public String branchName;

    public Long createTime;

    public Integer createType;

    public String createChannel;

    public Long createStaffId;

    public String createStaffName;

    public Integer state;

    public OrgModel org;

    public String mpQRCode;

    public Builder() {
    }

    /**
     * 科室ID
     */
    public Builder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     * 机构ID
     */
    public Builder orgId(Long orgId) {
      this.orgId = orgId;
      return this;
    }

    /**
     * 科室名称
     */
    public Builder branchName(String branchName) {
      this.branchName = branchName;
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
     * 1-自己注册  2-公司添加
     */
    public Builder createType(Integer createType) {
      this.createType = createType;
      return this;
    }

    /**
     * 创建渠道
     */
    public Builder createChannel(String createChannel) {
      this.createChannel = createChannel;
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
     * 科室的状态  -1 已删除   0在线
     */
    public Builder state(Integer state) {
      this.state = state;
      return this;
    }

    /**
     * 对应的机构
     */
    public Builder org(OrgModel org) {
      this.org = org;
      return this;
    }

    /**
     * 公众号二维码地址
     */
    public Builder mpQRCode(String mpQRCode) {
      this.mpQRCode = mpQRCode;
      return this;
    }

    @Override
    public BranchModel build() {
      return new BranchModel(id, orgId, branchName, createTime, createType, createChannel, createStaffId, createStaffName, state, org, mpQRCode, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_BranchModel extends ProtoAdapter<BranchModel> {
    ProtoAdapter_BranchModel() {
      super(FieldEncoding.LENGTH_DELIMITED, BranchModel.class);
    }

    @Override
    public int encodedSize(BranchModel value) {
      return (value.id != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.id) : 0)
          + (value.orgId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(2, value.orgId) : 0)
          + (value.branchName != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.branchName) : 0)
          + (value.createTime != null ? ProtoAdapter.UINT64.encodedSizeWithTag(4, value.createTime) : 0)
          + (value.createType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(5, value.createType) : 0)
          + (value.createChannel != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.createChannel) : 0)
          + (value.createStaffId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(7, value.createStaffId) : 0)
          + (value.createStaffName != null ? ProtoAdapter.STRING.encodedSizeWithTag(8, value.createStaffName) : 0)
          + (value.state != null ? ProtoAdapter.UINT32.encodedSizeWithTag(9, value.state) : 0)
          + (value.org != null ? OrgModel.ADAPTER.encodedSizeWithTag(10, value.org) : 0)
          + (value.mpQRCode != null ? ProtoAdapter.STRING.encodedSizeWithTag(11, value.mpQRCode) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, BranchModel value) throws IOException {
      if (value.id != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.id);
      if (value.orgId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 2, value.orgId);
      if (value.branchName != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.branchName);
      if (value.createTime != null) ProtoAdapter.UINT64.encodeWithTag(writer, 4, value.createTime);
      if (value.createType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 5, value.createType);
      if (value.createChannel != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.createChannel);
      if (value.createStaffId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 7, value.createStaffId);
      if (value.createStaffName != null) ProtoAdapter.STRING.encodeWithTag(writer, 8, value.createStaffName);
      if (value.state != null) ProtoAdapter.UINT32.encodeWithTag(writer, 9, value.state);
      if (value.org != null) OrgModel.ADAPTER.encodeWithTag(writer, 10, value.org);
      if (value.mpQRCode != null) ProtoAdapter.STRING.encodeWithTag(writer, 11, value.mpQRCode);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public BranchModel decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.UINT64.decode(reader)); break;
          case 2: builder.orgId(ProtoAdapter.UINT64.decode(reader)); break;
          case 3: builder.branchName(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.createTime(ProtoAdapter.UINT64.decode(reader)); break;
          case 5: builder.createType(ProtoAdapter.UINT32.decode(reader)); break;
          case 6: builder.createChannel(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.createStaffId(ProtoAdapter.UINT64.decode(reader)); break;
          case 8: builder.createStaffName(ProtoAdapter.STRING.decode(reader)); break;
          case 9: builder.state(ProtoAdapter.UINT32.decode(reader)); break;
          case 10: builder.org(OrgModel.ADAPTER.decode(reader)); break;
          case 11: builder.mpQRCode(ProtoAdapter.STRING.decode(reader)); break;
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
    public BranchModel redact(BranchModel value) {
      Builder builder = value.newBuilder();
      if (builder.org != null) builder.org = OrgModel.ADAPTER.redact(builder.org);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
