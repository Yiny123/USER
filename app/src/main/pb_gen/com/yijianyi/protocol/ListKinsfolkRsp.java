// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 240:1
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
 * 亲属列表返回数据体
 */
public final class ListKinsfolkRsp extends Message<ListKinsfolkRsp, ListKinsfolkRsp.Builder> {
  public static final ProtoAdapter<ListKinsfolkRsp> ADAPTER = new ProtoAdapter_ListKinsfolkRsp();

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.KinsfolkVO#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<KinsfolkVO> kinsfolkList;

  public ListKinsfolkRsp(List<KinsfolkVO> kinsfolkList) {
    this(kinsfolkList, ByteString.EMPTY);
  }

  public ListKinsfolkRsp(List<KinsfolkVO> kinsfolkList, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.kinsfolkList = Internal.immutableCopyOf("kinsfolkList", kinsfolkList);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.kinsfolkList = Internal.copyOf("kinsfolkList", kinsfolkList);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ListKinsfolkRsp)) return false;
    ListKinsfolkRsp o = (ListKinsfolkRsp) other;
    return unknownFields().equals(o.unknownFields())
        && kinsfolkList.equals(o.kinsfolkList);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + kinsfolkList.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (!kinsfolkList.isEmpty()) builder.append(", kinsfolkList=").append(kinsfolkList);
    return builder.replace(0, 2, "ListKinsfolkRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<ListKinsfolkRsp, Builder> {
    public List<KinsfolkVO> kinsfolkList;

    public Builder() {
      kinsfolkList = Internal.newMutableList();
    }

    public Builder kinsfolkList(List<KinsfolkVO> kinsfolkList) {
      Internal.checkElementsNotNull(kinsfolkList);
      this.kinsfolkList = kinsfolkList;
      return this;
    }

    @Override
    public ListKinsfolkRsp build() {
      return new ListKinsfolkRsp(kinsfolkList, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_ListKinsfolkRsp extends ProtoAdapter<ListKinsfolkRsp> {
    ProtoAdapter_ListKinsfolkRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, ListKinsfolkRsp.class);
    }

    @Override
    public int encodedSize(ListKinsfolkRsp value) {
      return KinsfolkVO.ADAPTER.asRepeated().encodedSizeWithTag(1, value.kinsfolkList)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, ListKinsfolkRsp value) throws IOException {
      KinsfolkVO.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.kinsfolkList);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public ListKinsfolkRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.kinsfolkList.add(KinsfolkVO.ADAPTER.decode(reader)); break;
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
    public ListKinsfolkRsp redact(ListKinsfolkRsp value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.kinsfolkList, KinsfolkVO.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}