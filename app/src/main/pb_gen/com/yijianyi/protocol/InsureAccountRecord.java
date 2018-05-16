// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: SaasModel.proto at 961:1
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

public final class InsureAccountRecord extends Message<InsureAccountRecord, InsureAccountRecord.Builder> {
  public static final ProtoAdapter<InsureAccountRecord> ADAPTER = new ProtoAdapter_InsureAccountRecord();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_ID = 0L;

  public static final String DEFAULT_IDCARD = "";

  public static final Long DEFAULT_COMPANYID = 0L;

  public static final Long DEFAULT_CHANGEACCOUNT = 0L;

  public static final Long DEFAULT_ACCOUNT = 0L;

  public static final String DEFAULT_CHANGEDESC = "";

  public static final String DEFAULT_ORDERID = "";

  public static final Integer DEFAULT_CHANGETYPE = 0;

  public static final Long DEFAULT_CREATETIME = 0L;

  public static final Long DEFAULT_CREATESTAFFID = 0L;

  public static final String DEFAULT_CREATESTAFFNAME = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long id;

  /**
   * 身份证号
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String idcard;

  /**
   * 公司id
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long companyId;

  /**
   * 变动的金额
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long changeAccount;

  /**
   * 剩余账户金额
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long account;

  /**
   * 变动原因
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String changeDesc;

  /**
   * 订单id
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orderId;

  /**
   * 账户变动类型 1-补贴发放 2-消费 3-体现
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer changeType;

  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createTime;

  /**
   * 操作人id
   */
  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createStaffId;

  /**
   * 操作人
   */
  @WireField(
      tag = 11,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String createStaffName;

  public InsureAccountRecord(Long id, String idcard, Long companyId, Long changeAccount, Long account, String changeDesc, String orderId, Integer changeType, Long createTime, Long createStaffId, String createStaffName) {
    this(id, idcard, companyId, changeAccount, account, changeDesc, orderId, changeType, createTime, createStaffId, createStaffName, ByteString.EMPTY);
  }

  public InsureAccountRecord(Long id, String idcard, Long companyId, Long changeAccount, Long account, String changeDesc, String orderId, Integer changeType, Long createTime, Long createStaffId, String createStaffName, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.idcard = idcard;
    this.companyId = companyId;
    this.changeAccount = changeAccount;
    this.account = account;
    this.changeDesc = changeDesc;
    this.orderId = orderId;
    this.changeType = changeType;
    this.createTime = createTime;
    this.createStaffId = createStaffId;
    this.createStaffName = createStaffName;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.idcard = idcard;
    builder.companyId = companyId;
    builder.changeAccount = changeAccount;
    builder.account = account;
    builder.changeDesc = changeDesc;
    builder.orderId = orderId;
    builder.changeType = changeType;
    builder.createTime = createTime;
    builder.createStaffId = createStaffId;
    builder.createStaffName = createStaffName;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof InsureAccountRecord)) return false;
    InsureAccountRecord o = (InsureAccountRecord) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(idcard, o.idcard)
        && Internal.equals(companyId, o.companyId)
        && Internal.equals(changeAccount, o.changeAccount)
        && Internal.equals(account, o.account)
        && Internal.equals(changeDesc, o.changeDesc)
        && Internal.equals(orderId, o.orderId)
        && Internal.equals(changeType, o.changeType)
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
      result = result * 37 + (idcard != null ? idcard.hashCode() : 0);
      result = result * 37 + (companyId != null ? companyId.hashCode() : 0);
      result = result * 37 + (changeAccount != null ? changeAccount.hashCode() : 0);
      result = result * 37 + (account != null ? account.hashCode() : 0);
      result = result * 37 + (changeDesc != null ? changeDesc.hashCode() : 0);
      result = result * 37 + (orderId != null ? orderId.hashCode() : 0);
      result = result * 37 + (changeType != null ? changeType.hashCode() : 0);
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
    if (idcard != null) builder.append(", idcard=").append(idcard);
    if (companyId != null) builder.append(", companyId=").append(companyId);
    if (changeAccount != null) builder.append(", changeAccount=").append(changeAccount);
    if (account != null) builder.append(", account=").append(account);
    if (changeDesc != null) builder.append(", changeDesc=").append(changeDesc);
    if (orderId != null) builder.append(", orderId=").append(orderId);
    if (changeType != null) builder.append(", changeType=").append(changeType);
    if (createTime != null) builder.append(", createTime=").append(createTime);
    if (createStaffId != null) builder.append(", createStaffId=").append(createStaffId);
    if (createStaffName != null) builder.append(", createStaffName=").append(createStaffName);
    return builder.replace(0, 2, "InsureAccountRecord{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<InsureAccountRecord, Builder> {
    public Long id;

    public String idcard;

    public Long companyId;

    public Long changeAccount;

    public Long account;

    public String changeDesc;

    public String orderId;

    public Integer changeType;

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
     * 身份证号
     */
    public Builder idcard(String idcard) {
      this.idcard = idcard;
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
     * 变动的金额
     */
    public Builder changeAccount(Long changeAccount) {
      this.changeAccount = changeAccount;
      return this;
    }

    /**
     * 剩余账户金额
     */
    public Builder account(Long account) {
      this.account = account;
      return this;
    }

    /**
     * 变动原因
     */
    public Builder changeDesc(String changeDesc) {
      this.changeDesc = changeDesc;
      return this;
    }

    /**
     * 订单id
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * 账户变动类型 1-补贴发放 2-消费 3-体现
     */
    public Builder changeType(Integer changeType) {
      this.changeType = changeType;
      return this;
    }

    public Builder createTime(Long createTime) {
      this.createTime = createTime;
      return this;
    }

    /**
     * 操作人id
     */
    public Builder createStaffId(Long createStaffId) {
      this.createStaffId = createStaffId;
      return this;
    }

    /**
     * 操作人
     */
    public Builder createStaffName(String createStaffName) {
      this.createStaffName = createStaffName;
      return this;
    }

    @Override
    public InsureAccountRecord build() {
      return new InsureAccountRecord(id, idcard, companyId, changeAccount, account, changeDesc, orderId, changeType, createTime, createStaffId, createStaffName, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_InsureAccountRecord extends ProtoAdapter<InsureAccountRecord> {
    ProtoAdapter_InsureAccountRecord() {
      super(FieldEncoding.LENGTH_DELIMITED, InsureAccountRecord.class);
    }

    @Override
    public int encodedSize(InsureAccountRecord value) {
      return (value.id != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.id) : 0)
          + (value.idcard != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.idcard) : 0)
          + (value.companyId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(3, value.companyId) : 0)
          + (value.changeAccount != null ? ProtoAdapter.UINT64.encodedSizeWithTag(4, value.changeAccount) : 0)
          + (value.account != null ? ProtoAdapter.UINT64.encodedSizeWithTag(5, value.account) : 0)
          + (value.changeDesc != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.changeDesc) : 0)
          + (value.orderId != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, value.orderId) : 0)
          + (value.changeType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(8, value.changeType) : 0)
          + (value.createTime != null ? ProtoAdapter.UINT64.encodedSizeWithTag(9, value.createTime) : 0)
          + (value.createStaffId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(10, value.createStaffId) : 0)
          + (value.createStaffName != null ? ProtoAdapter.STRING.encodedSizeWithTag(11, value.createStaffName) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, InsureAccountRecord value) throws IOException {
      if (value.id != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.id);
      if (value.idcard != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.idcard);
      if (value.companyId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 3, value.companyId);
      if (value.changeAccount != null) ProtoAdapter.UINT64.encodeWithTag(writer, 4, value.changeAccount);
      if (value.account != null) ProtoAdapter.UINT64.encodeWithTag(writer, 5, value.account);
      if (value.changeDesc != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.changeDesc);
      if (value.orderId != null) ProtoAdapter.STRING.encodeWithTag(writer, 7, value.orderId);
      if (value.changeType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 8, value.changeType);
      if (value.createTime != null) ProtoAdapter.UINT64.encodeWithTag(writer, 9, value.createTime);
      if (value.createStaffId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 10, value.createStaffId);
      if (value.createStaffName != null) ProtoAdapter.STRING.encodeWithTag(writer, 11, value.createStaffName);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public InsureAccountRecord decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.UINT64.decode(reader)); break;
          case 2: builder.idcard(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.companyId(ProtoAdapter.UINT64.decode(reader)); break;
          case 4: builder.changeAccount(ProtoAdapter.UINT64.decode(reader)); break;
          case 5: builder.account(ProtoAdapter.UINT64.decode(reader)); break;
          case 6: builder.changeDesc(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.orderId(ProtoAdapter.STRING.decode(reader)); break;
          case 8: builder.changeType(ProtoAdapter.UINT32.decode(reader)); break;
          case 9: builder.createTime(ProtoAdapter.UINT64.decode(reader)); break;
          case 10: builder.createStaffId(ProtoAdapter.UINT64.decode(reader)); break;
          case 11: builder.createStaffName(ProtoAdapter.STRING.decode(reader)); break;
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
    public InsureAccountRecord redact(InsureAccountRecord value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
