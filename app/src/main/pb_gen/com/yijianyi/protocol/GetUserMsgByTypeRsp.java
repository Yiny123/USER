// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 633:1
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

public final class GetUserMsgByTypeRsp extends Message<GetUserMsgByTypeRsp, GetUserMsgByTypeRsp.Builder> {
  public static final ProtoAdapter<GetUserMsgByTypeRsp> ADAPTER = new ProtoAdapter_GetUserMsgByTypeRsp();

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.SystemMessage#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<SystemMessage> msgList;

  public GetUserMsgByTypeRsp(List<SystemMessage> msgList) {
    this(msgList, ByteString.EMPTY);
  }

  public GetUserMsgByTypeRsp(List<SystemMessage> msgList, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.msgList = Internal.immutableCopyOf("msgList", msgList);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.msgList = Internal.copyOf("msgList", msgList);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetUserMsgByTypeRsp)) return false;
    GetUserMsgByTypeRsp o = (GetUserMsgByTypeRsp) other;
    return unknownFields().equals(o.unknownFields())
        && msgList.equals(o.msgList);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + msgList.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (!msgList.isEmpty()) builder.append(", msgList=").append(msgList);
    return builder.replace(0, 2, "GetUserMsgByTypeRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetUserMsgByTypeRsp, Builder> {
    public List<SystemMessage> msgList;

    public Builder() {
      msgList = Internal.newMutableList();
    }

    public Builder msgList(List<SystemMessage> msgList) {
      Internal.checkElementsNotNull(msgList);
      this.msgList = msgList;
      return this;
    }

    @Override
    public GetUserMsgByTypeRsp build() {
      return new GetUserMsgByTypeRsp(msgList, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetUserMsgByTypeRsp extends ProtoAdapter<GetUserMsgByTypeRsp> {
    ProtoAdapter_GetUserMsgByTypeRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, GetUserMsgByTypeRsp.class);
    }

    @Override
    public int encodedSize(GetUserMsgByTypeRsp value) {
      return SystemMessage.ADAPTER.asRepeated().encodedSizeWithTag(1, value.msgList)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetUserMsgByTypeRsp value) throws IOException {
      SystemMessage.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.msgList);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetUserMsgByTypeRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.msgList.add(SystemMessage.ADAPTER.decode(reader)); break;
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
    public GetUserMsgByTypeRsp redact(GetUserMsgByTypeRsp value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.msgList, SystemMessage.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
