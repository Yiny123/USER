// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: SaasModel.proto at 465:1
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

public final class UserAccount extends Message<UserAccount, UserAccount.Builder> {
  public static final ProtoAdapter<UserAccount> ADAPTER = new ProtoAdapter_UserAccount();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_USERID = 0L;

  public static final Long DEFAULT_COMPANYID = 0L;

  public static final Long DEFAULT_ACCOUNT = 0L;

  public static final Long DEFAULT_PRESENT = 0L;

  public static final Long DEFAULT_TOTALACCOUNT = 0L;

  public static final Long DEFAULT_INTEGRAL = 0L;

  public static final Long DEFAULT_TOTALINTEGRAL = 0L;

  public static final Long DEFAULT_CREATETIME = 0L;

  /**
   * 用户id
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long userId;

  /**
   * 公司id
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long companyId;

  /**
   * 账户金额 单位 分
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long account;

  /**
   * 赠送账户 单位 分
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long present;

  /**
   * 历史总金额(只增不减)
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long totalAccount;

  /**
   * 积分
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long integral;

  /**
   * 历史总积分(只增不减)
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long totalIntegral;

  /**
   * 创建时间
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createTime;

  public UserAccount(Long userId, Long companyId, Long account, Long present, Long totalAccount, Long integral, Long totalIntegral, Long createTime) {
    this(userId, companyId, account, present, totalAccount, integral, totalIntegral, createTime, ByteString.EMPTY);
  }

  public UserAccount(Long userId, Long companyId, Long account, Long present, Long totalAccount, Long integral, Long totalIntegral, Long createTime, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.userId = userId;
    this.companyId = companyId;
    this.account = account;
    this.present = present;
    this.totalAccount = totalAccount;
    this.integral = integral;
    this.totalIntegral = totalIntegral;
    this.createTime = createTime;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.userId = userId;
    builder.companyId = companyId;
    builder.account = account;
    builder.present = present;
    builder.totalAccount = totalAccount;
    builder.integral = integral;
    builder.totalIntegral = totalIntegral;
    builder.createTime = createTime;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof UserAccount)) return false;
    UserAccount o = (UserAccount) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(userId, o.userId)
        && Internal.equals(companyId, o.companyId)
        && Internal.equals(account, o.account)
        && Internal.equals(present, o.present)
        && Internal.equals(totalAccount, o.totalAccount)
        && Internal.equals(integral, o.integral)
        && Internal.equals(totalIntegral, o.totalIntegral)
        && Internal.equals(createTime, o.createTime);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (userId != null ? userId.hashCode() : 0);
      result = result * 37 + (companyId != null ? companyId.hashCode() : 0);
      result = result * 37 + (account != null ? account.hashCode() : 0);
      result = result * 37 + (present != null ? present.hashCode() : 0);
      result = result * 37 + (totalAccount != null ? totalAccount.hashCode() : 0);
      result = result * 37 + (integral != null ? integral.hashCode() : 0);
      result = result * 37 + (totalIntegral != null ? totalIntegral.hashCode() : 0);
      result = result * 37 + (createTime != null ? createTime.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (userId != null) builder.append(", userId=").append(userId);
    if (companyId != null) builder.append(", companyId=").append(companyId);
    if (account != null) builder.append(", account=").append(account);
    if (present != null) builder.append(", present=").append(present);
    if (totalAccount != null) builder.append(", totalAccount=").append(totalAccount);
    if (integral != null) builder.append(", integral=").append(integral);
    if (totalIntegral != null) builder.append(", totalIntegral=").append(totalIntegral);
    if (createTime != null) builder.append(", createTime=").append(createTime);
    return builder.replace(0, 2, "UserAccount{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<UserAccount, Builder> {
    public Long userId;

    public Long companyId;

    public Long account;

    public Long present;

    public Long totalAccount;

    public Long integral;

    public Long totalIntegral;

    public Long createTime;

    public Builder() {
    }

    /**
     * 用户id
     */
    public Builder userId(Long userId) {
      this.userId = userId;
      return this;
    }

    /**
     * 公司id
     */
    public Builder companyId(Long companyId) {
      this.companyId = companyId;
      return this;
    }

    /**
     * 账户金额 单位 分
     */
    public Builder account(Long account) {
      this.account = account;
      return this;
    }

    /**
     * 赠送账户 单位 分
     */
    public Builder present(Long present) {
      this.present = present;
      return this;
    }

    /**
     * 历史总金额(只增不减)
     */
    public Builder totalAccount(Long totalAccount) {
      this.totalAccount = totalAccount;
      return this;
    }

    /**
     * 积分
     */
    public Builder integral(Long integral) {
      this.integral = integral;
      return this;
    }

    /**
     * 历史总积分(只增不减)
     */
    public Builder totalIntegral(Long totalIntegral) {
      this.totalIntegral = totalIntegral;
      return this;
    }

    /**
     * 创建时间
     */
    public Builder createTime(Long createTime) {
      this.createTime = createTime;
      return this;
    }

    @Override
    public UserAccount build() {
      return new UserAccount(userId, companyId, account, present, totalAccount, integral, totalIntegral, createTime, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_UserAccount extends ProtoAdapter<UserAccount> {
    ProtoAdapter_UserAccount() {
      super(FieldEncoding.LENGTH_DELIMITED, UserAccount.class);
    }

    @Override
    public int encodedSize(UserAccount value) {
      return (value.userId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.userId) : 0)
          + (value.companyId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(2, value.companyId) : 0)
          + (value.account != null ? ProtoAdapter.UINT64.encodedSizeWithTag(3, value.account) : 0)
          + (value.present != null ? ProtoAdapter.UINT64.encodedSizeWithTag(4, value.present) : 0)
          + (value.totalAccount != null ? ProtoAdapter.UINT64.encodedSizeWithTag(5, value.totalAccount) : 0)
          + (value.integral != null ? ProtoAdapter.UINT64.encodedSizeWithTag(6, value.integral) : 0)
          + (value.totalIntegral != null ? ProtoAdapter.UINT64.encodedSizeWithTag(7, value.totalIntegral) : 0)
          + (value.createTime != null ? ProtoAdapter.UINT64.encodedSizeWithTag(8, value.createTime) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, UserAccount value) throws IOException {
      if (value.userId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.userId);
      if (value.companyId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 2, value.companyId);
      if (value.account != null) ProtoAdapter.UINT64.encodeWithTag(writer, 3, value.account);
      if (value.present != null) ProtoAdapter.UINT64.encodeWithTag(writer, 4, value.present);
      if (value.totalAccount != null) ProtoAdapter.UINT64.encodeWithTag(writer, 5, value.totalAccount);
      if (value.integral != null) ProtoAdapter.UINT64.encodeWithTag(writer, 6, value.integral);
      if (value.totalIntegral != null) ProtoAdapter.UINT64.encodeWithTag(writer, 7, value.totalIntegral);
      if (value.createTime != null) ProtoAdapter.UINT64.encodeWithTag(writer, 8, value.createTime);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public UserAccount decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.userId(ProtoAdapter.UINT64.decode(reader)); break;
          case 2: builder.companyId(ProtoAdapter.UINT64.decode(reader)); break;
          case 3: builder.account(ProtoAdapter.UINT64.decode(reader)); break;
          case 4: builder.present(ProtoAdapter.UINT64.decode(reader)); break;
          case 5: builder.totalAccount(ProtoAdapter.UINT64.decode(reader)); break;
          case 6: builder.integral(ProtoAdapter.UINT64.decode(reader)); break;
          case 7: builder.totalIntegral(ProtoAdapter.UINT64.decode(reader)); break;
          case 8: builder.createTime(ProtoAdapter.UINT64.decode(reader)); break;
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
    public UserAccount redact(UserAccount value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
