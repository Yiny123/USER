// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1937:1
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
import java.util.List;
import okio.ByteString;

public final class GetInsureOrderTendItemRsp extends Message<GetInsureOrderTendItemRsp, GetInsureOrderTendItemRsp.Builder> {
  public static final ProtoAdapter<GetInsureOrderTendItemRsp> ADAPTER = new ProtoAdapter_GetInsureOrderTendItemRsp();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ORDERID = "";

  public static final Long DEFAULT_FAMILYNUMBER = 0L;

  public static final Long DEFAULT_HOSPITALNUMBER = 0L;

  public static final Long DEFAULT_SERVENUMBER = 0L;

  public static final Long DEFAULT_RESTNUMBER = 0L;

  public static final Long DEFAULT_ABSENTEEISMNUMBER = 0L;

  /**
   * 订单id
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orderId;

  /**
   * 在家
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long familyNumber;

  /**
   * 住院
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long hospitalNumber;

  /**
   * 服务
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long serveNumber;

  /**
   * 休假
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long restNumber;

  /**
   * 旷工
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long absenteeismNumber;

  @WireField(
      tag = 7,
      adapter = "com.yijianyi.protocol.InsureOrderTendItemVO#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<InsureOrderTendItemVO> vo;

  public GetInsureOrderTendItemRsp(String orderId, Long familyNumber, Long hospitalNumber, Long serveNumber, Long restNumber, Long absenteeismNumber, List<InsureOrderTendItemVO> vo) {
    this(orderId, familyNumber, hospitalNumber, serveNumber, restNumber, absenteeismNumber, vo, ByteString.EMPTY);
  }

  public GetInsureOrderTendItemRsp(String orderId, Long familyNumber, Long hospitalNumber, Long serveNumber, Long restNumber, Long absenteeismNumber, List<InsureOrderTendItemVO> vo, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.orderId = orderId;
    this.familyNumber = familyNumber;
    this.hospitalNumber = hospitalNumber;
    this.serveNumber = serveNumber;
    this.restNumber = restNumber;
    this.absenteeismNumber = absenteeismNumber;
    this.vo = Internal.immutableCopyOf("vo", vo);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.orderId = orderId;
    builder.familyNumber = familyNumber;
    builder.hospitalNumber = hospitalNumber;
    builder.serveNumber = serveNumber;
    builder.restNumber = restNumber;
    builder.absenteeismNumber = absenteeismNumber;
    builder.vo = Internal.copyOf("vo", vo);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetInsureOrderTendItemRsp)) return false;
    GetInsureOrderTendItemRsp o = (GetInsureOrderTendItemRsp) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(orderId, o.orderId)
        && Internal.equals(familyNumber, o.familyNumber)
        && Internal.equals(hospitalNumber, o.hospitalNumber)
        && Internal.equals(serveNumber, o.serveNumber)
        && Internal.equals(restNumber, o.restNumber)
        && Internal.equals(absenteeismNumber, o.absenteeismNumber)
        && vo.equals(o.vo);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (orderId != null ? orderId.hashCode() : 0);
      result = result * 37 + (familyNumber != null ? familyNumber.hashCode() : 0);
      result = result * 37 + (hospitalNumber != null ? hospitalNumber.hashCode() : 0);
      result = result * 37 + (serveNumber != null ? serveNumber.hashCode() : 0);
      result = result * 37 + (restNumber != null ? restNumber.hashCode() : 0);
      result = result * 37 + (absenteeismNumber != null ? absenteeismNumber.hashCode() : 0);
      result = result * 37 + vo.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (orderId != null) builder.append(", orderId=").append(orderId);
    if (familyNumber != null) builder.append(", familyNumber=").append(familyNumber);
    if (hospitalNumber != null) builder.append(", hospitalNumber=").append(hospitalNumber);
    if (serveNumber != null) builder.append(", serveNumber=").append(serveNumber);
    if (restNumber != null) builder.append(", restNumber=").append(restNumber);
    if (absenteeismNumber != null) builder.append(", absenteeismNumber=").append(absenteeismNumber);
    if (!vo.isEmpty()) builder.append(", vo=").append(vo);
    return builder.replace(0, 2, "GetInsureOrderTendItemRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetInsureOrderTendItemRsp, Builder> {
    public String orderId;

    public Long familyNumber;

    public Long hospitalNumber;

    public Long serveNumber;

    public Long restNumber;

    public Long absenteeismNumber;

    public List<InsureOrderTendItemVO> vo;

    public Builder() {
      vo = Internal.newMutableList();
    }

    /**
     * 订单id
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * 在家
     */
    public Builder familyNumber(Long familyNumber) {
      this.familyNumber = familyNumber;
      return this;
    }

    /**
     * 住院
     */
    public Builder hospitalNumber(Long hospitalNumber) {
      this.hospitalNumber = hospitalNumber;
      return this;
    }

    /**
     * 服务
     */
    public Builder serveNumber(Long serveNumber) {
      this.serveNumber = serveNumber;
      return this;
    }

    /**
     * 休假
     */
    public Builder restNumber(Long restNumber) {
      this.restNumber = restNumber;
      return this;
    }

    /**
     * 旷工
     */
    public Builder absenteeismNumber(Long absenteeismNumber) {
      this.absenteeismNumber = absenteeismNumber;
      return this;
    }

    public Builder vo(List<InsureOrderTendItemVO> vo) {
      Internal.checkElementsNotNull(vo);
      this.vo = vo;
      return this;
    }

    @Override
    public GetInsureOrderTendItemRsp build() {
      return new GetInsureOrderTendItemRsp(orderId, familyNumber, hospitalNumber, serveNumber, restNumber, absenteeismNumber, vo, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetInsureOrderTendItemRsp extends ProtoAdapter<GetInsureOrderTendItemRsp> {
    ProtoAdapter_GetInsureOrderTendItemRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, GetInsureOrderTendItemRsp.class);
    }

    @Override
    public int encodedSize(GetInsureOrderTendItemRsp value) {
      return (value.orderId != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.orderId) : 0)
          + (value.familyNumber != null ? ProtoAdapter.UINT64.encodedSizeWithTag(2, value.familyNumber) : 0)
          + (value.hospitalNumber != null ? ProtoAdapter.UINT64.encodedSizeWithTag(3, value.hospitalNumber) : 0)
          + (value.serveNumber != null ? ProtoAdapter.UINT64.encodedSizeWithTag(4, value.serveNumber) : 0)
          + (value.restNumber != null ? ProtoAdapter.UINT64.encodedSizeWithTag(5, value.restNumber) : 0)
          + (value.absenteeismNumber != null ? ProtoAdapter.UINT64.encodedSizeWithTag(6, value.absenteeismNumber) : 0)
          + InsureOrderTendItemVO.ADAPTER.asRepeated().encodedSizeWithTag(7, value.vo)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetInsureOrderTendItemRsp value) throws IOException {
      if (value.orderId != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.orderId);
      if (value.familyNumber != null) ProtoAdapter.UINT64.encodeWithTag(writer, 2, value.familyNumber);
      if (value.hospitalNumber != null) ProtoAdapter.UINT64.encodeWithTag(writer, 3, value.hospitalNumber);
      if (value.serveNumber != null) ProtoAdapter.UINT64.encodeWithTag(writer, 4, value.serveNumber);
      if (value.restNumber != null) ProtoAdapter.UINT64.encodeWithTag(writer, 5, value.restNumber);
      if (value.absenteeismNumber != null) ProtoAdapter.UINT64.encodeWithTag(writer, 6, value.absenteeismNumber);
      InsureOrderTendItemVO.ADAPTER.asRepeated().encodeWithTag(writer, 7, value.vo);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetInsureOrderTendItemRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.orderId(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.familyNumber(ProtoAdapter.UINT64.decode(reader)); break;
          case 3: builder.hospitalNumber(ProtoAdapter.UINT64.decode(reader)); break;
          case 4: builder.serveNumber(ProtoAdapter.UINT64.decode(reader)); break;
          case 5: builder.restNumber(ProtoAdapter.UINT64.decode(reader)); break;
          case 6: builder.absenteeismNumber(ProtoAdapter.UINT64.decode(reader)); break;
          case 7: builder.vo.add(InsureOrderTendItemVO.ADAPTER.decode(reader)); break;
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
    public GetInsureOrderTendItemRsp redact(GetInsureOrderTendItemRsp value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.vo, InsureOrderTendItemVO.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
