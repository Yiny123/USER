// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 436:1
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

public final class GetUserAccountRsp extends Message<GetUserAccountRsp, GetUserAccountRsp.Builder> {
  public static final ProtoAdapter<GetUserAccountRsp> ADAPTER = new ProtoAdapter_GetUserAccountRsp();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_ACCOUNT = 0L;

  public static final Long DEFAULT_PRESENT = 0L;

  public static final String DEFAULT_TOTALACCOUNT = "";

  public static final String DEFAULT_ACCOUNTSTR = "";

  /**
   * 用户账户
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long account;

  /**
   * 赠送账户
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long present;

  /**
   * 总金额
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String totalAccount;

  /**
   * 可提现金额
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String accountStr;

  public GetUserAccountRsp(Long account, Long present, String totalAccount, String accountStr) {
    this(account, present, totalAccount, accountStr, ByteString.EMPTY);
  }

  public GetUserAccountRsp(Long account, Long present, String totalAccount, String accountStr, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.account = account;
    this.present = present;
    this.totalAccount = totalAccount;
    this.accountStr = accountStr;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.account = account;
    builder.present = present;
    builder.totalAccount = totalAccount;
    builder.accountStr = accountStr;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetUserAccountRsp)) return false;
    GetUserAccountRsp o = (GetUserAccountRsp) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(account, o.account)
        && Internal.equals(present, o.present)
        && Internal.equals(totalAccount, o.totalAccount)
        && Internal.equals(accountStr, o.accountStr);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (account != null ? account.hashCode() : 0);
      result = result * 37 + (present != null ? present.hashCode() : 0);
      result = result * 37 + (totalAccount != null ? totalAccount.hashCode() : 0);
      result = result * 37 + (accountStr != null ? accountStr.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (account != null) builder.append(", account=").append(account);
    if (present != null) builder.append(", present=").append(present);
    if (totalAccount != null) builder.append(", totalAccount=").append(totalAccount);
    if (accountStr != null) builder.append(", accountStr=").append(accountStr);
    return builder.replace(0, 2, "GetUserAccountRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetUserAccountRsp, Builder> {
    public Long account;

    public Long present;

    public String totalAccount;

    public String accountStr;

    public Builder() {
    }

    /**
     * 用户账户
     */
    public Builder account(Long account) {
      this.account = account;
      return this;
    }

    /**
     * 赠送账户
     */
    public Builder present(Long present) {
      this.present = present;
      return this;
    }

    /**
     * 总金额
     */
    public Builder totalAccount(String totalAccount) {
      this.totalAccount = totalAccount;
      return this;
    }

    /**
     * 可提现金额
     */
    public Builder accountStr(String accountStr) {
      this.accountStr = accountStr;
      return this;
    }

    @Override
    public GetUserAccountRsp build() {
      return new GetUserAccountRsp(account, present, totalAccount, accountStr, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetUserAccountRsp extends ProtoAdapter<GetUserAccountRsp> {
    ProtoAdapter_GetUserAccountRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, GetUserAccountRsp.class);
    }

    @Override
    public int encodedSize(GetUserAccountRsp value) {
      return (value.account != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.account) : 0)
          + (value.present != null ? ProtoAdapter.UINT64.encodedSizeWithTag(2, value.present) : 0)
          + (value.totalAccount != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.totalAccount) : 0)
          + (value.accountStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.accountStr) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetUserAccountRsp value) throws IOException {
      if (value.account != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.account);
      if (value.present != null) ProtoAdapter.UINT64.encodeWithTag(writer, 2, value.present);
      if (value.totalAccount != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.totalAccount);
      if (value.accountStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.accountStr);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetUserAccountRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.account(ProtoAdapter.UINT64.decode(reader)); break;
          case 2: builder.present(ProtoAdapter.UINT64.decode(reader)); break;
          case 3: builder.totalAccount(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.accountStr(ProtoAdapter.STRING.decode(reader)); break;
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
    public GetUserAccountRsp redact(GetUserAccountRsp value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
