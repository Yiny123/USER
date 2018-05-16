// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1217:1
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
import java.util.List;
import okio.ByteString;

/**
 * 用户银行卡列表返回数据体
 */
public final class ListBankRsp extends Message<ListBankRsp, ListBankRsp.Builder> {
  public static final ProtoAdapter<ListBankRsp> ADAPTER = new ProtoAdapter_ListBankRsp();

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.UserBankVO#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<UserBankVO> bankList;

  public ListBankRsp(List<UserBankVO> bankList) {
    this(bankList, ByteString.EMPTY);
  }

  public ListBankRsp(List<UserBankVO> bankList, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.bankList = Internal.immutableCopyOf("bankList", bankList);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.bankList = Internal.copyOf("bankList", bankList);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ListBankRsp)) return false;
    ListBankRsp o = (ListBankRsp) other;
    return unknownFields().equals(o.unknownFields())
        && bankList.equals(o.bankList);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + bankList.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (!bankList.isEmpty()) builder.append(", bankList=").append(bankList);
    return builder.replace(0, 2, "ListBankRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<ListBankRsp, Builder> {
    public List<UserBankVO> bankList;

    public Builder() {
      bankList = Internal.newMutableList();
    }

    public Builder bankList(List<UserBankVO> bankList) {
      Internal.checkElementsNotNull(bankList);
      this.bankList = bankList;
      return this;
    }

    @Override
    public ListBankRsp build() {
      return new ListBankRsp(bankList, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_ListBankRsp extends ProtoAdapter<ListBankRsp> {
    ProtoAdapter_ListBankRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, ListBankRsp.class);
    }

    @Override
    public int encodedSize(ListBankRsp value) {
      return UserBankVO.ADAPTER.asRepeated().encodedSizeWithTag(1, value.bankList)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, ListBankRsp value) throws IOException {
      UserBankVO.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.bankList);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public ListBankRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.bankList.add(UserBankVO.ADAPTER.decode(reader)); break;
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
    public ListBankRsp redact(ListBankRsp value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.bankList, UserBankVO.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}