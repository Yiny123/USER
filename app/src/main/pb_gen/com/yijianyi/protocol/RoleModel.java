// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: SaasModel.proto at 298:1
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
 *  角色
 */
public final class RoleModel extends Message<RoleModel, RoleModel.Builder> {
  public static final ProtoAdapter<RoleModel> ADAPTER = new ProtoAdapter_RoleModel();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_ROLEID = 0L;

  public static final Long DEFAULT_COMPANYID = 0L;

  public static final String DEFAULT_ROLENAME = "";

  public static final Long DEFAULT_CREATETIME = 0L;

  public static final Long DEFAULT_CREATESTAFFID = 0L;

  public static final String DEFAULT_CREATESTAFFNAME = "";

  /**
   *  角色id
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long roleId;

  /**
   *  公司id
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long companyId;

  /**
   *  角色名称
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String roleName;

  /**
   *  创建时间
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createTime;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createStaffId;

  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String createStaffName;

  public RoleModel(Long roleId, Long companyId, String roleName, Long createTime, Long createStaffId, String createStaffName) {
    this(roleId, companyId, roleName, createTime, createStaffId, createStaffName, ByteString.EMPTY);
  }

  public RoleModel(Long roleId, Long companyId, String roleName, Long createTime, Long createStaffId, String createStaffName, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.roleId = roleId;
    this.companyId = companyId;
    this.roleName = roleName;
    this.createTime = createTime;
    this.createStaffId = createStaffId;
    this.createStaffName = createStaffName;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.roleId = roleId;
    builder.companyId = companyId;
    builder.roleName = roleName;
    builder.createTime = createTime;
    builder.createStaffId = createStaffId;
    builder.createStaffName = createStaffName;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RoleModel)) return false;
    RoleModel o = (RoleModel) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(roleId, o.roleId)
        && Internal.equals(companyId, o.companyId)
        && Internal.equals(roleName, o.roleName)
        && Internal.equals(createTime, o.createTime)
        && Internal.equals(createStaffId, o.createStaffId)
        && Internal.equals(createStaffName, o.createStaffName);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (roleId != null ? roleId.hashCode() : 0);
      result = result * 37 + (companyId != null ? companyId.hashCode() : 0);
      result = result * 37 + (roleName != null ? roleName.hashCode() : 0);
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
    if (roleId != null) builder.append(", roleId=").append(roleId);
    if (companyId != null) builder.append(", companyId=").append(companyId);
    if (roleName != null) builder.append(", roleName=").append(roleName);
    if (createTime != null) builder.append(", createTime=").append(createTime);
    if (createStaffId != null) builder.append(", createStaffId=").append(createStaffId);
    if (createStaffName != null) builder.append(", createStaffName=").append(createStaffName);
    return builder.replace(0, 2, "RoleModel{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<RoleModel, Builder> {
    public Long roleId;

    public Long companyId;

    public String roleName;

    public Long createTime;

    public Long createStaffId;

    public String createStaffName;

    public Builder() {
    }

    /**
     *  角色id
     */
    public Builder roleId(Long roleId) {
      this.roleId = roleId;
      return this;
    }

    /**
     *  公司id
     */
    public Builder companyId(Long companyId) {
      this.companyId = companyId;
      return this;
    }

    /**
     *  角色名称
     */
    public Builder roleName(String roleName) {
      this.roleName = roleName;
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

    @Override
    public RoleModel build() {
      return new RoleModel(roleId, companyId, roleName, createTime, createStaffId, createStaffName, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_RoleModel extends ProtoAdapter<RoleModel> {
    ProtoAdapter_RoleModel() {
      super(FieldEncoding.LENGTH_DELIMITED, RoleModel.class);
    }

    @Override
    public int encodedSize(RoleModel value) {
      return (value.roleId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.roleId) : 0)
          + (value.companyId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(2, value.companyId) : 0)
          + (value.roleName != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.roleName) : 0)
          + (value.createTime != null ? ProtoAdapter.UINT64.encodedSizeWithTag(4, value.createTime) : 0)
          + (value.createStaffId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(5, value.createStaffId) : 0)
          + (value.createStaffName != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.createStaffName) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, RoleModel value) throws IOException {
      if (value.roleId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.roleId);
      if (value.companyId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 2, value.companyId);
      if (value.roleName != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.roleName);
      if (value.createTime != null) ProtoAdapter.UINT64.encodeWithTag(writer, 4, value.createTime);
      if (value.createStaffId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 5, value.createStaffId);
      if (value.createStaffName != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.createStaffName);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public RoleModel decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.roleId(ProtoAdapter.UINT64.decode(reader)); break;
          case 2: builder.companyId(ProtoAdapter.UINT64.decode(reader)); break;
          case 3: builder.roleName(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.createTime(ProtoAdapter.UINT64.decode(reader)); break;
          case 5: builder.createStaffId(ProtoAdapter.UINT64.decode(reader)); break;
          case 6: builder.createStaffName(ProtoAdapter.STRING.decode(reader)); break;
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
    public RoleModel redact(RoleModel value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
