// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: SaasModel.proto at 974:1
package com.yijianyi.protocol;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class InsureAccountRecordVO extends Message<InsureAccountRecordVO, InsureAccountRecordVO.Builder> {
  public static final ProtoAdapter<InsureAccountRecordVO> ADAPTER = new ProtoAdapter_InsureAccountRecordVO();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_CHANGEDESC = "";

  public static final String DEFAULT_CHANGEACCOUNTSTR = "";

  public static final String DEFAULT_ACCOUNTSTR = "";

  public static final String DEFAULT_ORDERID = "";

  public static final String DEFAULT_CREATETIME = "";

  /**
   * 变动原因
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String changeDesc;

  /**
   * 变动的金额
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String changeAccountStr;

  /**
   * 剩余账户金额
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String accountStr;

  /**
   * 订单id
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orderId;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String createTime;

  public InsureAccountRecordVO(String changeDesc, String changeAccountStr, String accountStr, String orderId, String createTime) {
    this(changeDesc, changeAccountStr, accountStr, orderId, createTime, ByteString.EMPTY);
  }

  public InsureAccountRecordVO(String changeDesc, String changeAccountStr, String accountStr, String orderId, String createTime, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.changeDesc = changeDesc;
    this.changeAccountStr = changeAccountStr;
    this.accountStr = accountStr;
    this.orderId = orderId;
    this.createTime = createTime;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.changeDesc = changeDesc;
    builder.changeAccountStr = changeAccountStr;
    builder.accountStr = accountStr;
    builder.orderId = orderId;
    builder.createTime = createTime;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof InsureAccountRecordVO)) return false;
    InsureAccountRecordVO o = (InsureAccountRecordVO) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(changeDesc, o.changeDesc)
        && Internal.equals(changeAccountStr, o.changeAccountStr)
        && Internal.equals(accountStr, o.accountStr)
        && Internal.equals(orderId, o.orderId)
        && Internal.equals(createTime, o.createTime);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (changeDesc != null ? changeDesc.hashCode() : 0);
      result = result * 37 + (changeAccountStr != null ? changeAccountStr.hashCode() : 0);
      result = result * 37 + (accountStr != null ? accountStr.hashCode() : 0);
      result = result * 37 + (orderId != null ? orderId.hashCode() : 0);
      result = result * 37 + (createTime != null ? createTime.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (changeDesc != null) builder.append(", changeDesc=").append(changeDesc);
    if (changeAccountStr != null) builder.append(", changeAccountStr=").append(changeAccountStr);
    if (accountStr != null) builder.append(", accountStr=").append(accountStr);
    if (orderId != null) builder.append(", orderId=").append(orderId);
    if (createTime != null) builder.append(", createTime=").append(createTime);
    return builder.replace(0, 2, "InsureAccountRecordVO{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<InsureAccountRecordVO, Builder> {
    public String changeDesc;

    public String changeAccountStr;

    public String accountStr;

    public String orderId;

    public String createTime;

    public Builder() {
    }

    /**
     * 变动原因
     */
    public Builder changeDesc(String changeDesc) {
      this.changeDesc = changeDesc;
      return this;
    }

    /**
     * 变动的金额
     */
    public Builder changeAccountStr(String changeAccountStr) {
      this.changeAccountStr = changeAccountStr;
      return this;
    }

    /**
     * 剩余账户金额
     */
    public Builder accountStr(String accountStr) {
      this.accountStr = accountStr;
      return this;
    }

    /**
     * 订单id
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    public Builder createTime(String createTime) {
      this.createTime = createTime;
      return this;
    }

    @Override
    public InsureAccountRecordVO build() {
      return new InsureAccountRecordVO(changeDesc, changeAccountStr, accountStr, orderId, createTime, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_InsureAccountRecordVO extends ProtoAdapter<InsureAccountRecordVO> {
    ProtoAdapter_InsureAccountRecordVO() {
      super(FieldEncoding.LENGTH_DELIMITED, InsureAccountRecordVO.class);
    }

    @Override
    public int encodedSize(InsureAccountRecordVO value) {
      return (value.changeDesc != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.changeDesc) : 0)
          + (value.changeAccountStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.changeAccountStr) : 0)
          + (value.accountStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.accountStr) : 0)
          + (value.orderId != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.orderId) : 0)
          + (value.createTime != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, value.createTime) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, InsureAccountRecordVO value) throws IOException {
      if (value.changeDesc != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.changeDesc);
      if (value.changeAccountStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.changeAccountStr);
      if (value.accountStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.accountStr);
      if (value.orderId != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.orderId);
      if (value.createTime != null) ProtoAdapter.STRING.encodeWithTag(writer, 5, value.createTime);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public InsureAccountRecordVO decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.changeDesc(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.changeAccountStr(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.accountStr(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.orderId(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.createTime(ProtoAdapter.STRING.decode(reader)); break;
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
    public InsureAccountRecordVO redact(InsureAccountRecordVO value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
