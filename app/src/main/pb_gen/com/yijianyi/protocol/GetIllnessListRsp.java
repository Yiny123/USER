// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1720:1
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
import java.util.Map;
import okio.ByteString;

/**
 * 获取病症,照护明细
 */
public final class GetIllnessListRsp extends Message<GetIllnessListRsp, GetIllnessListRsp.Builder> {
  public static final ProtoAdapter<GetIllnessListRsp> ADAPTER = new ProtoAdapter_GetIllnessListRsp();

  private static final long serialVersionUID = 0L;

  /**
   * 病症，照护明细
   */
  @WireField(
      tag = 1,
      keyAdapter = "com.squareup.wire.ProtoAdapter#UINT64",
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final Map<Long, String> illnessMap;

  /**
   * 照护明细类型
   */
  @WireField(
      tag = 2,
      keyAdapter = "com.squareup.wire.ProtoAdapter#UINT64",
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final Map<Long, String> tendDetailTypeMap;

  /**
   * 照护明细类型集合
   */
  @WireField(
      tag = 3,
      adapter = "com.yijianyi.protocol.TendDetailType#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<TendDetailType> detailTypeList;

  /**
   * 照护明细集合
   */
  @WireField(
      tag = 4,
      adapter = "com.yijianyi.protocol.TendDetail#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<TendDetail> detailList;

  /**
   * 适用病症集合
   */
  @WireField(
      tag = 5,
      adapter = "com.yijianyi.protocol.Illness#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<Illness> illnessList;

  public GetIllnessListRsp(Map<Long, String> illnessMap, Map<Long, String> tendDetailTypeMap, List<TendDetailType> detailTypeList, List<TendDetail> detailList, List<Illness> illnessList) {
    this(illnessMap, tendDetailTypeMap, detailTypeList, detailList, illnessList, ByteString.EMPTY);
  }

  public GetIllnessListRsp(Map<Long, String> illnessMap, Map<Long, String> tendDetailTypeMap, List<TendDetailType> detailTypeList, List<TendDetail> detailList, List<Illness> illnessList, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.illnessMap = Internal.immutableCopyOf("illnessMap", illnessMap);
    this.tendDetailTypeMap = Internal.immutableCopyOf("tendDetailTypeMap", tendDetailTypeMap);
    this.detailTypeList = Internal.immutableCopyOf("detailTypeList", detailTypeList);
    this.detailList = Internal.immutableCopyOf("detailList", detailList);
    this.illnessList = Internal.immutableCopyOf("illnessList", illnessList);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.illnessMap = Internal.copyOf("illnessMap", illnessMap);
    builder.tendDetailTypeMap = Internal.copyOf("tendDetailTypeMap", tendDetailTypeMap);
    builder.detailTypeList = Internal.copyOf("detailTypeList", detailTypeList);
    builder.detailList = Internal.copyOf("detailList", detailList);
    builder.illnessList = Internal.copyOf("illnessList", illnessList);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetIllnessListRsp)) return false;
    GetIllnessListRsp o = (GetIllnessListRsp) other;
    return unknownFields().equals(o.unknownFields())
        && illnessMap.equals(o.illnessMap)
        && tendDetailTypeMap.equals(o.tendDetailTypeMap)
        && detailTypeList.equals(o.detailTypeList)
        && detailList.equals(o.detailList)
        && illnessList.equals(o.illnessList);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + illnessMap.hashCode();
      result = result * 37 + tendDetailTypeMap.hashCode();
      result = result * 37 + detailTypeList.hashCode();
      result = result * 37 + detailList.hashCode();
      result = result * 37 + illnessList.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (!illnessMap.isEmpty()) builder.append(", illnessMap=").append(illnessMap);
    if (!tendDetailTypeMap.isEmpty()) builder.append(", tendDetailTypeMap=").append(tendDetailTypeMap);
    if (!detailTypeList.isEmpty()) builder.append(", detailTypeList=").append(detailTypeList);
    if (!detailList.isEmpty()) builder.append(", detailList=").append(detailList);
    if (!illnessList.isEmpty()) builder.append(", illnessList=").append(illnessList);
    return builder.replace(0, 2, "GetIllnessListRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetIllnessListRsp, Builder> {
    public Map<Long, String> illnessMap;

    public Map<Long, String> tendDetailTypeMap;

    public List<TendDetailType> detailTypeList;

    public List<TendDetail> detailList;

    public List<Illness> illnessList;

    public Builder() {
      illnessMap = Internal.newMutableMap();
      tendDetailTypeMap = Internal.newMutableMap();
      detailTypeList = Internal.newMutableList();
      detailList = Internal.newMutableList();
      illnessList = Internal.newMutableList();
    }

    /**
     * 病症，照护明细
     */
    public Builder illnessMap(Map<Long, String> illnessMap) {
      Internal.checkElementsNotNull(illnessMap);
      this.illnessMap = illnessMap;
      return this;
    }

    /**
     * 照护明细类型
     */
    public Builder tendDetailTypeMap(Map<Long, String> tendDetailTypeMap) {
      Internal.checkElementsNotNull(tendDetailTypeMap);
      this.tendDetailTypeMap = tendDetailTypeMap;
      return this;
    }

    /**
     * 照护明细类型集合
     */
    public Builder detailTypeList(List<TendDetailType> detailTypeList) {
      Internal.checkElementsNotNull(detailTypeList);
      this.detailTypeList = detailTypeList;
      return this;
    }

    /**
     * 照护明细集合
     */
    public Builder detailList(List<TendDetail> detailList) {
      Internal.checkElementsNotNull(detailList);
      this.detailList = detailList;
      return this;
    }

    /**
     * 适用病症集合
     */
    public Builder illnessList(List<Illness> illnessList) {
      Internal.checkElementsNotNull(illnessList);
      this.illnessList = illnessList;
      return this;
    }

    @Override
    public GetIllnessListRsp build() {
      return new GetIllnessListRsp(illnessMap, tendDetailTypeMap, detailTypeList, detailList, illnessList, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetIllnessListRsp extends ProtoAdapter<GetIllnessListRsp> {
    private final ProtoAdapter<Map<Long, String>> illnessMap = ProtoAdapter.newMapAdapter(ProtoAdapter.UINT64, ProtoAdapter.STRING);

    private final ProtoAdapter<Map<Long, String>> tendDetailTypeMap = ProtoAdapter.newMapAdapter(ProtoAdapter.UINT64, ProtoAdapter.STRING);

    ProtoAdapter_GetIllnessListRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, GetIllnessListRsp.class);
    }

    @Override
    public int encodedSize(GetIllnessListRsp value) {
      return illnessMap.encodedSizeWithTag(1, value.illnessMap)
          + tendDetailTypeMap.encodedSizeWithTag(2, value.tendDetailTypeMap)
          + TendDetailType.ADAPTER.asRepeated().encodedSizeWithTag(3, value.detailTypeList)
          + TendDetail.ADAPTER.asRepeated().encodedSizeWithTag(4, value.detailList)
          + Illness.ADAPTER.asRepeated().encodedSizeWithTag(5, value.illnessList)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetIllnessListRsp value) throws IOException {
      illnessMap.encodeWithTag(writer, 1, value.illnessMap);
      tendDetailTypeMap.encodeWithTag(writer, 2, value.tendDetailTypeMap);
      TendDetailType.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.detailTypeList);
      TendDetail.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.detailList);
      Illness.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.illnessList);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetIllnessListRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.illnessMap.putAll(illnessMap.decode(reader)); break;
          case 2: builder.tendDetailTypeMap.putAll(tendDetailTypeMap.decode(reader)); break;
          case 3: builder.detailTypeList.add(TendDetailType.ADAPTER.decode(reader)); break;
          case 4: builder.detailList.add(TendDetail.ADAPTER.decode(reader)); break;
          case 5: builder.illnessList.add(Illness.ADAPTER.decode(reader)); break;
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
    public GetIllnessListRsp redact(GetIllnessListRsp value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.detailTypeList, TendDetailType.ADAPTER);
      Internal.redactElements(builder.detailList, TendDetail.ADAPTER);
      Internal.redactElements(builder.illnessList, Illness.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
