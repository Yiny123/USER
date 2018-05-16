// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 652:1
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

public final class GetInsureAccountRsp extends Message<GetInsureAccountRsp, GetInsureAccountRsp.Builder> {
  public static final ProtoAdapter<GetInsureAccountRsp> ADAPTER = new ProtoAdapter_GetInsureAccountRsp();

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 4,
      adapter = "com.yijianyi.protocol.InsureAccountVO#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<InsureAccountVO> recordList;

  public GetInsureAccountRsp(List<InsureAccountVO> recordList) {
    this(recordList, ByteString.EMPTY);
  }

  public GetInsureAccountRsp(List<InsureAccountVO> recordList, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.recordList = Internal.immutableCopyOf("recordList", recordList);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.recordList = Internal.copyOf("recordList", recordList);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetInsureAccountRsp)) return false;
    GetInsureAccountRsp o = (GetInsureAccountRsp) other;
    return unknownFields().equals(o.unknownFields())
        && recordList.equals(o.recordList);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + recordList.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (!recordList.isEmpty()) builder.append(", recordList=").append(recordList);
    return builder.replace(0, 2, "GetInsureAccountRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetInsureAccountRsp, Builder> {
    public List<InsureAccountVO> recordList;

    public Builder() {
      recordList = Internal.newMutableList();
    }

    public Builder recordList(List<InsureAccountVO> recordList) {
      Internal.checkElementsNotNull(recordList);
      this.recordList = recordList;
      return this;
    }

    @Override
    public GetInsureAccountRsp build() {
      return new GetInsureAccountRsp(recordList, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetInsureAccountRsp extends ProtoAdapter<GetInsureAccountRsp> {
    ProtoAdapter_GetInsureAccountRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, GetInsureAccountRsp.class);
    }

    @Override
    public int encodedSize(GetInsureAccountRsp value) {
      return InsureAccountVO.ADAPTER.asRepeated().encodedSizeWithTag(4, value.recordList)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetInsureAccountRsp value) throws IOException {
      InsureAccountVO.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.recordList);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetInsureAccountRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 4: builder.recordList.add(InsureAccountVO.ADAPTER.decode(reader)); break;
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
    public GetInsureAccountRsp redact(GetInsureAccountRsp value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.recordList, InsureAccountVO.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
