// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 954:1
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
 * 获取长护险和普通附加服务
 */
public final class GetPriceListRsp extends Message<GetPriceListRsp, GetPriceListRsp.Builder> {
  public static final ProtoAdapter<GetPriceListRsp> ADAPTER = new ProtoAdapter_GetPriceListRsp();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_HGREBATEFEEAM = "";

  public static final String DEFAULT_HGREBATEFEEPM = "";

  public static final String DEFAULT_HGKINSREBATEFEEAM = "";

  public static final String DEFAULT_HGKINSREBATEFEEPM = "";

  public static final String DEFAULT_DISCHARGEDTIME = "";

  /**
   * 长护险附加服务
   */
  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.CompanyPriceVO#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<CompanyPriceVO> insurePriceVOList;

  /**
   * 普通附加服务
   */
  @WireField(
      tag = 2,
      adapter = "com.yijianyi.protocol.CompanyPriceVO#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<CompanyPriceVO> commonPriceVOList;

  /**
   * 职工优惠金额（上午出院）
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String hgRebateFeeAM;

  /**
   * 职工优惠金额（下午出院）
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String hgRebateFeePM;

  /**
   * 职工家属优惠金额（上午出院）
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String hgKinsRebateFeeAM;

  /**
   * 职工家属优惠金额（下午出院）
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String hgKinsRebateFeePM;

  /**
   * 预计出院时间
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String dischargedTime;

  public GetPriceListRsp(List<CompanyPriceVO> insurePriceVOList, List<CompanyPriceVO> commonPriceVOList, String hgRebateFeeAM, String hgRebateFeePM, String hgKinsRebateFeeAM, String hgKinsRebateFeePM, String dischargedTime) {
    this(insurePriceVOList, commonPriceVOList, hgRebateFeeAM, hgRebateFeePM, hgKinsRebateFeeAM, hgKinsRebateFeePM, dischargedTime, ByteString.EMPTY);
  }

  public GetPriceListRsp(List<CompanyPriceVO> insurePriceVOList, List<CompanyPriceVO> commonPriceVOList, String hgRebateFeeAM, String hgRebateFeePM, String hgKinsRebateFeeAM, String hgKinsRebateFeePM, String dischargedTime, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.insurePriceVOList = Internal.immutableCopyOf("insurePriceVOList", insurePriceVOList);
    this.commonPriceVOList = Internal.immutableCopyOf("commonPriceVOList", commonPriceVOList);
    this.hgRebateFeeAM = hgRebateFeeAM;
    this.hgRebateFeePM = hgRebateFeePM;
    this.hgKinsRebateFeeAM = hgKinsRebateFeeAM;
    this.hgKinsRebateFeePM = hgKinsRebateFeePM;
    this.dischargedTime = dischargedTime;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.insurePriceVOList = Internal.copyOf("insurePriceVOList", insurePriceVOList);
    builder.commonPriceVOList = Internal.copyOf("commonPriceVOList", commonPriceVOList);
    builder.hgRebateFeeAM = hgRebateFeeAM;
    builder.hgRebateFeePM = hgRebateFeePM;
    builder.hgKinsRebateFeeAM = hgKinsRebateFeeAM;
    builder.hgKinsRebateFeePM = hgKinsRebateFeePM;
    builder.dischargedTime = dischargedTime;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetPriceListRsp)) return false;
    GetPriceListRsp o = (GetPriceListRsp) other;
    return unknownFields().equals(o.unknownFields())
        && insurePriceVOList.equals(o.insurePriceVOList)
        && commonPriceVOList.equals(o.commonPriceVOList)
        && Internal.equals(hgRebateFeeAM, o.hgRebateFeeAM)
        && Internal.equals(hgRebateFeePM, o.hgRebateFeePM)
        && Internal.equals(hgKinsRebateFeeAM, o.hgKinsRebateFeeAM)
        && Internal.equals(hgKinsRebateFeePM, o.hgKinsRebateFeePM)
        && Internal.equals(dischargedTime, o.dischargedTime);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + insurePriceVOList.hashCode();
      result = result * 37 + commonPriceVOList.hashCode();
      result = result * 37 + (hgRebateFeeAM != null ? hgRebateFeeAM.hashCode() : 0);
      result = result * 37 + (hgRebateFeePM != null ? hgRebateFeePM.hashCode() : 0);
      result = result * 37 + (hgKinsRebateFeeAM != null ? hgKinsRebateFeeAM.hashCode() : 0);
      result = result * 37 + (hgKinsRebateFeePM != null ? hgKinsRebateFeePM.hashCode() : 0);
      result = result * 37 + (dischargedTime != null ? dischargedTime.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (!insurePriceVOList.isEmpty()) builder.append(", insurePriceVOList=").append(insurePriceVOList);
    if (!commonPriceVOList.isEmpty()) builder.append(", commonPriceVOList=").append(commonPriceVOList);
    if (hgRebateFeeAM != null) builder.append(", hgRebateFeeAM=").append(hgRebateFeeAM);
    if (hgRebateFeePM != null) builder.append(", hgRebateFeePM=").append(hgRebateFeePM);
    if (hgKinsRebateFeeAM != null) builder.append(", hgKinsRebateFeeAM=").append(hgKinsRebateFeeAM);
    if (hgKinsRebateFeePM != null) builder.append(", hgKinsRebateFeePM=").append(hgKinsRebateFeePM);
    if (dischargedTime != null) builder.append(", dischargedTime=").append(dischargedTime);
    return builder.replace(0, 2, "GetPriceListRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetPriceListRsp, Builder> {
    public List<CompanyPriceVO> insurePriceVOList;

    public List<CompanyPriceVO> commonPriceVOList;

    public String hgRebateFeeAM;

    public String hgRebateFeePM;

    public String hgKinsRebateFeeAM;

    public String hgKinsRebateFeePM;

    public String dischargedTime;

    public Builder() {
      insurePriceVOList = Internal.newMutableList();
      commonPriceVOList = Internal.newMutableList();
    }

    /**
     * 长护险附加服务
     */
    public Builder insurePriceVOList(List<CompanyPriceVO> insurePriceVOList) {
      Internal.checkElementsNotNull(insurePriceVOList);
      this.insurePriceVOList = insurePriceVOList;
      return this;
    }

    /**
     * 普通附加服务
     */
    public Builder commonPriceVOList(List<CompanyPriceVO> commonPriceVOList) {
      Internal.checkElementsNotNull(commonPriceVOList);
      this.commonPriceVOList = commonPriceVOList;
      return this;
    }

    /**
     * 职工优惠金额（上午出院）
     */
    public Builder hgRebateFeeAM(String hgRebateFeeAM) {
      this.hgRebateFeeAM = hgRebateFeeAM;
      return this;
    }

    /**
     * 职工优惠金额（下午出院）
     */
    public Builder hgRebateFeePM(String hgRebateFeePM) {
      this.hgRebateFeePM = hgRebateFeePM;
      return this;
    }

    /**
     * 职工家属优惠金额（上午出院）
     */
    public Builder hgKinsRebateFeeAM(String hgKinsRebateFeeAM) {
      this.hgKinsRebateFeeAM = hgKinsRebateFeeAM;
      return this;
    }

    /**
     * 职工家属优惠金额（下午出院）
     */
    public Builder hgKinsRebateFeePM(String hgKinsRebateFeePM) {
      this.hgKinsRebateFeePM = hgKinsRebateFeePM;
      return this;
    }

    /**
     * 预计出院时间
     */
    public Builder dischargedTime(String dischargedTime) {
      this.dischargedTime = dischargedTime;
      return this;
    }

    @Override
    public GetPriceListRsp build() {
      return new GetPriceListRsp(insurePriceVOList, commonPriceVOList, hgRebateFeeAM, hgRebateFeePM, hgKinsRebateFeeAM, hgKinsRebateFeePM, dischargedTime, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetPriceListRsp extends ProtoAdapter<GetPriceListRsp> {
    ProtoAdapter_GetPriceListRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, GetPriceListRsp.class);
    }

    @Override
    public int encodedSize(GetPriceListRsp value) {
      return CompanyPriceVO.ADAPTER.asRepeated().encodedSizeWithTag(1, value.insurePriceVOList)
          + CompanyPriceVO.ADAPTER.asRepeated().encodedSizeWithTag(2, value.commonPriceVOList)
          + (value.hgRebateFeeAM != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.hgRebateFeeAM) : 0)
          + (value.hgRebateFeePM != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.hgRebateFeePM) : 0)
          + (value.hgKinsRebateFeeAM != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, value.hgKinsRebateFeeAM) : 0)
          + (value.hgKinsRebateFeePM != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.hgKinsRebateFeePM) : 0)
          + (value.dischargedTime != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, value.dischargedTime) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetPriceListRsp value) throws IOException {
      CompanyPriceVO.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.insurePriceVOList);
      CompanyPriceVO.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.commonPriceVOList);
      if (value.hgRebateFeeAM != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.hgRebateFeeAM);
      if (value.hgRebateFeePM != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.hgRebateFeePM);
      if (value.hgKinsRebateFeeAM != null) ProtoAdapter.STRING.encodeWithTag(writer, 5, value.hgKinsRebateFeeAM);
      if (value.hgKinsRebateFeePM != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.hgKinsRebateFeePM);
      if (value.dischargedTime != null) ProtoAdapter.STRING.encodeWithTag(writer, 7, value.dischargedTime);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetPriceListRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.insurePriceVOList.add(CompanyPriceVO.ADAPTER.decode(reader)); break;
          case 2: builder.commonPriceVOList.add(CompanyPriceVO.ADAPTER.decode(reader)); break;
          case 3: builder.hgRebateFeeAM(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.hgRebateFeePM(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.hgKinsRebateFeeAM(ProtoAdapter.STRING.decode(reader)); break;
          case 6: builder.hgKinsRebateFeePM(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.dischargedTime(ProtoAdapter.STRING.decode(reader)); break;
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
    public GetPriceListRsp redact(GetPriceListRsp value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.insurePriceVOList, CompanyPriceVO.ADAPTER);
      Internal.redactElements(builder.commonPriceVOList, CompanyPriceVO.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
