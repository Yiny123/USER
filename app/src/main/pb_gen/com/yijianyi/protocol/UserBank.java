// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: SaasModel.proto at 383:1
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
 * 用户银行卡
 */
public final class UserBank extends Message<UserBank, UserBank.Builder> {
  public static final ProtoAdapter<UserBank> ADAPTER = new ProtoAdapter_UserBank();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_ID = 0L;

  public static final Long DEFAULT_USERID = 0L;

  public static final String DEFAULT_CARDHOLDERNAME = "";

  public static final String DEFAULT_BANKNAME = "";

  public static final String DEFAULT_CARDNO = "";

  public static final String DEFAULT_BANKBRANCH = "";

  public static final Integer DEFAULT_BANKTYPE = 0;

  public static final String DEFAULT_UPDATETIME = "";

  public static final String DEFAULT_CREATETIME = "";

  /**
   * 用户银行卡id
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long id;

  /**
   * 用户id
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long userId;

  /**
   * 持卡人姓名
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String cardholderName;

  /**
   * 银行名称
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String bankName;

  /**
   * 银行卡号
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String cardNO;

  /**
   * 银行支行
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String bankBranch;

  /**
   * 银行卡类型：0-储蓄卡，1-信用卡
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer bankType;

  /**
   * 更新时间
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String updateTime;

  /**
   * 创建时间
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String createTime;

  public UserBank(Long id, Long userId, String cardholderName, String bankName, String cardNO, String bankBranch, Integer bankType, String updateTime, String createTime) {
    this(id, userId, cardholderName, bankName, cardNO, bankBranch, bankType, updateTime, createTime, ByteString.EMPTY);
  }

  public UserBank(Long id, Long userId, String cardholderName, String bankName, String cardNO, String bankBranch, Integer bankType, String updateTime, String createTime, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.userId = userId;
    this.cardholderName = cardholderName;
    this.bankName = bankName;
    this.cardNO = cardNO;
    this.bankBranch = bankBranch;
    this.bankType = bankType;
    this.updateTime = updateTime;
    this.createTime = createTime;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.userId = userId;
    builder.cardholderName = cardholderName;
    builder.bankName = bankName;
    builder.cardNO = cardNO;
    builder.bankBranch = bankBranch;
    builder.bankType = bankType;
    builder.updateTime = updateTime;
    builder.createTime = createTime;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof UserBank)) return false;
    UserBank o = (UserBank) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(userId, o.userId)
        && Internal.equals(cardholderName, o.cardholderName)
        && Internal.equals(bankName, o.bankName)
        && Internal.equals(cardNO, o.cardNO)
        && Internal.equals(bankBranch, o.bankBranch)
        && Internal.equals(bankType, o.bankType)
        && Internal.equals(updateTime, o.updateTime)
        && Internal.equals(createTime, o.createTime);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (userId != null ? userId.hashCode() : 0);
      result = result * 37 + (cardholderName != null ? cardholderName.hashCode() : 0);
      result = result * 37 + (bankName != null ? bankName.hashCode() : 0);
      result = result * 37 + (cardNO != null ? cardNO.hashCode() : 0);
      result = result * 37 + (bankBranch != null ? bankBranch.hashCode() : 0);
      result = result * 37 + (bankType != null ? bankType.hashCode() : 0);
      result = result * 37 + (updateTime != null ? updateTime.hashCode() : 0);
      result = result * 37 + (createTime != null ? createTime.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (id != null) builder.append(", id=").append(id);
    if (userId != null) builder.append(", userId=").append(userId);
    if (cardholderName != null) builder.append(", cardholderName=").append(cardholderName);
    if (bankName != null) builder.append(", bankName=").append(bankName);
    if (cardNO != null) builder.append(", cardNO=").append(cardNO);
    if (bankBranch != null) builder.append(", bankBranch=").append(bankBranch);
    if (bankType != null) builder.append(", bankType=").append(bankType);
    if (updateTime != null) builder.append(", updateTime=").append(updateTime);
    if (createTime != null) builder.append(", createTime=").append(createTime);
    return builder.replace(0, 2, "UserBank{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<UserBank, Builder> {
    public Long id;

    public Long userId;

    public String cardholderName;

    public String bankName;

    public String cardNO;

    public String bankBranch;

    public Integer bankType;

    public String updateTime;

    public String createTime;

    public Builder() {
    }

    /**
     * 用户银行卡id
     */
    public Builder id(Long id) {
      this.id = id;
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
     * 持卡人姓名
     */
    public Builder cardholderName(String cardholderName) {
      this.cardholderName = cardholderName;
      return this;
    }

    /**
     * 银行名称
     */
    public Builder bankName(String bankName) {
      this.bankName = bankName;
      return this;
    }

    /**
     * 银行卡号
     */
    public Builder cardNO(String cardNO) {
      this.cardNO = cardNO;
      return this;
    }

    /**
     * 银行支行
     */
    public Builder bankBranch(String bankBranch) {
      this.bankBranch = bankBranch;
      return this;
    }

    /**
     * 银行卡类型：0-储蓄卡，1-信用卡
     */
    public Builder bankType(Integer bankType) {
      this.bankType = bankType;
      return this;
    }

    /**
     * 更新时间
     */
    public Builder updateTime(String updateTime) {
      this.updateTime = updateTime;
      return this;
    }

    /**
     * 创建时间
     */
    public Builder createTime(String createTime) {
      this.createTime = createTime;
      return this;
    }

    @Override
    public UserBank build() {
      return new UserBank(id, userId, cardholderName, bankName, cardNO, bankBranch, bankType, updateTime, createTime, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_UserBank extends ProtoAdapter<UserBank> {
    ProtoAdapter_UserBank() {
      super(FieldEncoding.LENGTH_DELIMITED, UserBank.class);
    }

    @Override
    public int encodedSize(UserBank value) {
      return (value.id != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.id) : 0)
          + (value.userId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(2, value.userId) : 0)
          + (value.cardholderName != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.cardholderName) : 0)
          + (value.bankName != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.bankName) : 0)
          + (value.cardNO != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, value.cardNO) : 0)
          + (value.bankBranch != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.bankBranch) : 0)
          + (value.bankType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(7, value.bankType) : 0)
          + (value.updateTime != null ? ProtoAdapter.STRING.encodedSizeWithTag(8, value.updateTime) : 0)
          + (value.createTime != null ? ProtoAdapter.STRING.encodedSizeWithTag(9, value.createTime) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, UserBank value) throws IOException {
      if (value.id != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.id);
      if (value.userId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 2, value.userId);
      if (value.cardholderName != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.cardholderName);
      if (value.bankName != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.bankName);
      if (value.cardNO != null) ProtoAdapter.STRING.encodeWithTag(writer, 5, value.cardNO);
      if (value.bankBranch != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.bankBranch);
      if (value.bankType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 7, value.bankType);
      if (value.updateTime != null) ProtoAdapter.STRING.encodeWithTag(writer, 8, value.updateTime);
      if (value.createTime != null) ProtoAdapter.STRING.encodeWithTag(writer, 9, value.createTime);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public UserBank decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.UINT64.decode(reader)); break;
          case 2: builder.userId(ProtoAdapter.UINT64.decode(reader)); break;
          case 3: builder.cardholderName(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.bankName(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.cardNO(ProtoAdapter.STRING.decode(reader)); break;
          case 6: builder.bankBranch(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.bankType(ProtoAdapter.UINT32.decode(reader)); break;
          case 8: builder.updateTime(ProtoAdapter.STRING.decode(reader)); break;
          case 9: builder.createTime(ProtoAdapter.STRING.decode(reader)); break;
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
    public UserBank redact(UserBank value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
