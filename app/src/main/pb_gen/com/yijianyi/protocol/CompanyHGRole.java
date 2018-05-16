// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: SaasModel.proto at 308:1
package com.yijianyi.protocol;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 *  员工角色
 */
public final class CompanyHGRole extends Message<CompanyHGRole, CompanyHGRole.Builder> {
  public static final ProtoAdapter<CompanyHGRole> ADAPTER = new ProtoAdapter_CompanyHGRole();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_COMPANYID = 0L;

  public static final Long DEFAULT_ORGID = 0L;

  public static final Long DEFAULT_BRANCHID = 0L;

  public static final Long DEFAULT_HGID = 0L;

  public static final Long DEFAULT_ROLEID = 0L;

  public static final Long DEFAULT_CREATETIME = 0L;

  public static final Long DEFAULT_CREATESTAFFID = 0L;

  public static final String DEFAULT_CREATESTAFFNAME = "";

  public static final String DEFAULT_ROLENAME = "";

  /**
   *  公司id
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long companyId;

  /**
   *  机构id
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long orgId;

  /**
   *  科室id
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long branchId;

  /**
   *  护工id
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long hgId;

  /**
   *  角色id
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long roleId;

  /**
   *  创建时间
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createTime;

  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createStaffId;

  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String createStaffName;

  /**
   * 角色名
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String roleName;

  public CompanyHGRole(Long companyId, Long orgId, Long branchId, Long hgId, Long roleId, Long createTime, Long createStaffId, String createStaffName, String roleName) {
    this(companyId, orgId, branchId, hgId, roleId, createTime, createStaffId, createStaffName, roleName, ByteString.EMPTY);
  }

  public CompanyHGRole(Long companyId, Long orgId, Long branchId, Long hgId, Long roleId, Long createTime, Long createStaffId, String createStaffName, String roleName, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.companyId = companyId;
    this.orgId = orgId;
    this.branchId = branchId;
    this.hgId = hgId;
    this.roleId = roleId;
    this.createTime = createTime;
    this.createStaffId = createStaffId;
    this.createStaffName = createStaffName;
    this.roleName = roleName;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.companyId = companyId;
    builder.orgId = orgId;
    builder.branchId = branchId;
    builder.hgId = hgId;
    builder.roleId = roleId;
    builder.createTime = createTime;
    builder.createStaffId = createStaffId;
    builder.createStaffName = createStaffName;
    builder.roleName = roleName;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof CompanyHGRole)) return false;
    CompanyHGRole o = (CompanyHGRole) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(companyId, o.companyId)
        && Internal.equals(orgId, o.orgId)
        && Internal.equals(branchId, o.branchId)
        && Internal.equals(hgId, o.hgId)
        && Internal.equals(roleId, o.roleId)
        && Internal.equals(createTime, o.createTime)
        && Internal.equals(createStaffId, o.createStaffId)
        && Internal.equals(createStaffName, o.createStaffName)
        && Internal.equals(roleName, o.roleName);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (companyId != null ? companyId.hashCode() : 0);
      result = result * 37 + (orgId != null ? orgId.hashCode() : 0);
      result = result * 37 + (branchId != null ? branchId.hashCode() : 0);
      result = result * 37 + (hgId != null ? hgId.hashCode() : 0);
      result = result * 37 + (roleId != null ? roleId.hashCode() : 0);
      result = result * 37 + (createTime != null ? createTime.hashCode() : 0);
      result = result * 37 + (createStaffId != null ? createStaffId.hashCode() : 0);
      result = result * 37 + (createStaffName != null ? createStaffName.hashCode() : 0);
      result = result * 37 + (roleName != null ? roleName.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (companyId != null) builder.append(", companyId=").append(companyId);
    if (orgId != null) builder.append(", orgId=").append(orgId);
    if (branchId != null) builder.append(", branchId=").append(branchId);
    if (hgId != null) builder.append(", hgId=").append(hgId);
    if (roleId != null) builder.append(", roleId=").append(roleId);
    if (createTime != null) builder.append(", createTime=").append(createTime);
    if (createStaffId != null) builder.append(", createStaffId=").append(createStaffId);
    if (createStaffName != null) builder.append(", createStaffName=").append(createStaffName);
    if (roleName != null) builder.append(", roleName=").append(roleName);
    return builder.replace(0, 2, "CompanyHGRole{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<CompanyHGRole, Builder> {
    public Long companyId;

    public Long orgId;

    public Long branchId;

    public Long hgId;

    public Long roleId;

    public Long createTime;

    public Long createStaffId;

    public String createStaffName;

    public String roleName;

    public Builder() {
    }

    /**
     *  公司id
     */
    public Builder companyId(Long companyId) {
      this.companyId = companyId;
      return this;
    }

    /**
     *  机构id
     */
    public Builder orgId(Long orgId) {
      this.orgId = orgId;
      return this;
    }

    /**
     *  科室id
     */
    public Builder branchId(Long branchId) {
      this.branchId = branchId;
      return this;
    }

    /**
     *  护工id
     */
    public Builder hgId(Long hgId) {
      this.hgId = hgId;
      return this;
    }

    /**
     *  角色id
     */
    public Builder roleId(Long roleId) {
      this.roleId = roleId;
      return this;
    }

    /**
     *  创建时间
     */
    public Builder createTime(Long createTime) {
      this.createTime = createTime;
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

    /**
     * 角色名
     */
    public Builder roleName(String roleName) {
      this.roleName = roleName;
      return this;
    }

    @Override
    public CompanyHGRole build() {
      return new CompanyHGRole(companyId, orgId, branchId, hgId, roleId, createTime, createStaffId, createStaffName, roleName, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_CompanyHGRole extends ProtoAdapter<CompanyHGRole> {
    ProtoAdapter_CompanyHGRole() {
      super(FieldEncoding.LENGTH_DELIMITED, CompanyHGRole.class);
    }

    @Override
    public int encodedSize(CompanyHGRole value) {
      return (value.companyId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.companyId) : 0)
          + (value.orgId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(2, value.orgId) : 0)
          + (value.branchId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(3, value.branchId) : 0)
          + (value.hgId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(4, value.hgId) : 0)
          + (value.roleId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(5, value.roleId) : 0)
          + (value.createTime != null ? ProtoAdapter.UINT64.encodedSizeWithTag(6, value.createTime) : 0)
          + (value.createStaffId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(7, value.createStaffId) : 0)
          + (value.createStaffName != null ? ProtoAdapter.STRING.encodedSizeWithTag(8, value.createStaffName) : 0)
          + (value.roleName != null ? ProtoAdapter.STRING.encodedSizeWithTag(9, value.roleName) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, CompanyHGRole value) throws IOException {
      if (value.companyId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.companyId);
      if (value.orgId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 2, value.orgId);
      if (value.branchId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 3, value.branchId);
      if (value.hgId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 4, value.hgId);
      if (value.roleId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 5, value.roleId);
      if (value.createTime != null) ProtoAdapter.UINT64.encodeWithTag(writer, 6, value.createTime);
      if (value.createStaffId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 7, value.createStaffId);
      if (value.createStaffName != null) ProtoAdapter.STRING.encodeWithTag(writer, 8, value.createStaffName);
      if (value.roleName != null) ProtoAdapter.STRING.encodeWithTag(writer, 9, value.roleName);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public CompanyHGRole decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.companyId(ProtoAdapter.UINT64.decode(reader)); break;
          case 2: builder.orgId(ProtoAdapter.UINT64.decode(reader)); break;
          case 3: builder.branchId(ProtoAdapter.UINT64.decode(reader)); break;
          case 4: builder.hgId(ProtoAdapter.UINT64.decode(reader)); break;
          case 5: builder.roleId(ProtoAdapter.UINT64.decode(reader)); break;
          case 6: builder.createTime(ProtoAdapter.UINT64.decode(reader)); break;
          case 7: builder.createStaffId(ProtoAdapter.UINT64.decode(reader)); break;
          case 8: builder.createStaffName(ProtoAdapter.STRING.decode(reader)); break;
          case 9: builder.roleName(ProtoAdapter.STRING.decode(reader)); break;
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
    public CompanyHGRole redact(CompanyHGRole value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
