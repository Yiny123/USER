// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 221:1
package com.yijianyi.protocol;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class GetPriceReq extends Message<GetPriceReq, GetPriceReq.Builder> {
  public static final ProtoAdapter<GetPriceReq> ADAPTER = new ProtoAdapter_GetPriceReq();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_BRANCHID = 0L;

  public static final Integer DEFAULT_ADCODE = 0;

  public static final Integer DEFAULT_ST = 0;

  public static final Boolean DEFAULT_ISLTI = false;

  /**
   * 科室的id 机构订单时需要传
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long branchId;

  /**
   * 用户所在的区域id 居家订单时需要传
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer adcode;

  /**
   * 服务类型 居家专用 101 居家照护 102家庭护士 103 康复护理 104 中医理疗 105 金牌月嫂 106 就医陪护 107 心理慰藉 108 产后恢复 109 育婴幼教 110 临终关怀    199 医疗附加项 200 长护险医疗服务
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer st;

  /**
   * 是否长护险套餐
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean islti;

  public GetPriceReq(Long branchId, Integer adcode, Integer st, Boolean islti) {
    this(branchId, adcode, st, islti, ByteString.EMPTY);
  }

  public GetPriceReq(Long branchId, Integer adcode, Integer st, Boolean islti, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.branchId = branchId;
    this.adcode = adcode;
    this.st = st;
    this.islti = islti;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.branchId = branchId;
    builder.adcode = adcode;
    builder.st = st;
    builder.islti = islti;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetPriceReq)) return false;
    GetPriceReq o = (GetPriceReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(branchId, o.branchId)
        && Internal.equals(adcode, o.adcode)
        && Internal.equals(st, o.st)
        && Internal.equals(islti, o.islti);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (branchId != null ? branchId.hashCode() : 0);
      result = result * 37 + (adcode != null ? adcode.hashCode() : 0);
      result = result * 37 + (st != null ? st.hashCode() : 0);
      result = result * 37 + (islti != null ? islti.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (branchId != null) builder.append(", branchId=").append(branchId);
    if (adcode != null) builder.append(", adcode=").append(adcode);
    if (st != null) builder.append(", st=").append(st);
    if (islti != null) builder.append(", islti=").append(islti);
    return builder.replace(0, 2, "GetPriceReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetPriceReq, Builder> {
    public Long branchId;

    public Integer adcode;

    public Integer st;

    public Boolean islti;

    public Builder() {
    }

    /**
     * 科室的id 机构订单时需要传
     */
    public Builder branchId(Long branchId) {
      this.branchId = branchId;
      return this;
    }

    /**
     * 用户所在的区域id 居家订单时需要传
     */
    public Builder adcode(Integer adcode) {
      this.adcode = adcode;
      return this;
    }

    /**
     * 服务类型 居家专用 101 居家照护 102家庭护士 103 康复护理 104 中医理疗 105 金牌月嫂 106 就医陪护 107 心理慰藉 108 产后恢复 109 育婴幼教 110 临终关怀    199 医疗附加项 200 长护险医疗服务
     */
    public Builder st(Integer st) {
      this.st = st;
      return this;
    }

    /**
     * 是否长护险套餐
     */
    public Builder islti(Boolean islti) {
      this.islti = islti;
      return this;
    }

    @Override
    public GetPriceReq build() {
      return new GetPriceReq(branchId, adcode, st, islti, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetPriceReq extends ProtoAdapter<GetPriceReq> {
    ProtoAdapter_GetPriceReq() {
      super(FieldEncoding.LENGTH_DELIMITED, GetPriceReq.class);
    }

    @Override
    public int encodedSize(GetPriceReq value) {
      return (value.branchId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.branchId) : 0)
          + (value.adcode != null ? ProtoAdapter.UINT32.encodedSizeWithTag(2, value.adcode) : 0)
          + (value.st != null ? ProtoAdapter.UINT32.encodedSizeWithTag(3, value.st) : 0)
          + (value.islti != null ? ProtoAdapter.BOOL.encodedSizeWithTag(4, value.islti) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetPriceReq value) throws IOException {
      if (value.branchId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.branchId);
      if (value.adcode != null) ProtoAdapter.UINT32.encodeWithTag(writer, 2, value.adcode);
      if (value.st != null) ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.st);
      if (value.islti != null) ProtoAdapter.BOOL.encodeWithTag(writer, 4, value.islti);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetPriceReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.branchId(ProtoAdapter.UINT64.decode(reader)); break;
          case 2: builder.adcode(ProtoAdapter.UINT32.decode(reader)); break;
          case 3: builder.st(ProtoAdapter.UINT32.decode(reader)); break;
          case 4: builder.islti(ProtoAdapter.BOOL.decode(reader)); break;
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
    public GetPriceReq redact(GetPriceReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}