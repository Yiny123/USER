// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1151:1
package com.yijianyi.protocol;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

/**
 * 变更服务反显
 */
public final class GetOrderServiceRsp extends Message<GetOrderServiceRsp, GetOrderServiceRsp.Builder> {
  public static final ProtoAdapter<GetOrderServiceRsp> ADAPTER = new ProtoAdapter_GetOrderServiceRsp();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_HGID = 0L;

  public static final String DEFAULT_HGNAME = "";

  public static final Long DEFAULT_ADDRID = 0L;

  public static final String DEFAULT_ADDRSTR = "";

  public static final Long DEFAULT_BRANCHID = 0L;

  public static final String DEFAULT_BRANCHNAME = "";

  public static final Long DEFAULT_ROOMID = 0L;

  public static final String DEFAULT_ROOMNO = "";

  public static final Long DEFAULT_BEDID = 0L;

  public static final String DEFAULT_BEDNO = "";

  public static final String DEFAULT_PHONE = "";

  public static final String DEFAULT_CONTACTS = "";

  public static final Long DEFAULT_USERID = 0L;

  public static final Integer DEFAULT_SERVICETYPE = 0;

  public static final Integer DEFAULT_UPDATETYPE = 0;

  /**
   * 服务人员id
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long hgId;

  /**
   * 服务人员昵称
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String hgName;

  /**
   * 地址id
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long addrId;

  /**
   * 地址信息
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String addrStr;

  /**
   * 科室id
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long branchId;

  /**
   * 科室名称
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String branchName;

  /**
   * 房间id
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long roomId;

  /**
   * 房间名称
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String roomNo;

  /**
   * 床位id
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long bedId;

  /**
   * 床位名称
   */
  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String bedNo;

  /**
   * 联系手机号
   */
  @WireField(
      tag = 11,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String phone;

  /**
   * 联系人
   */
  @WireField(
      tag = 12,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String contacts;

  /**
   * 一对多套餐列表
   */
  @WireField(
      tag = 13,
      adapter = "com.yijianyi.protocol.CompanyPriceVO#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<CompanyPriceVO> pList12N;

  /**
   * 一对一套餐列表
   */
  @WireField(
      tag = 14,
      adapter = "com.yijianyi.protocol.CompanyPriceVO#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<CompanyPriceVO> pList121;

  /**
   * 居家套餐列表 每个套餐都有不同的预付金 在CompanyPriceVO中
   */
  @WireField(
      tag = 15,
      adapter = "com.yijianyi.protocol.CompanyPriceVO#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<CompanyPriceVO> familyPriceVOList;

  /**
   * 用户id
   */
  @WireField(
      tag = 16,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long userId;

  /**
   * 服务类型 0-居家 1-专陪  2-多陪
   */
  @WireField(
      tag = 17,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer serviceType;

  /**
   * 手动选择变更服务计费规则时使用
   */
  @WireField(
      tag = 18,
      adapter = "com.yijianyi.protocol.UpdateType#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<UpdateType> updatePriceType;

  /**
   * 变更规则 变更服务配置 1-变更后当天费用各收一半 2-变更后当天费用收变更后套餐 3-变更后超时时间 4-变更当天手动选择
   */
  @WireField(
      tag = 19,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer updateType;

  public GetOrderServiceRsp(Long hgId, String hgName, Long addrId, String addrStr, Long branchId, String branchName, Long roomId, String roomNo, Long bedId, String bedNo, String phone, String contacts, List<CompanyPriceVO> pList12N, List<CompanyPriceVO> pList121, List<CompanyPriceVO> familyPriceVOList, Long userId, Integer serviceType, List<UpdateType> updatePriceType, Integer updateType) {
    this(hgId, hgName, addrId, addrStr, branchId, branchName, roomId, roomNo, bedId, bedNo, phone, contacts, pList12N, pList121, familyPriceVOList, userId, serviceType, updatePriceType, updateType, ByteString.EMPTY);
  }

  public GetOrderServiceRsp(Long hgId, String hgName, Long addrId, String addrStr, Long branchId, String branchName, Long roomId, String roomNo, Long bedId, String bedNo, String phone, String contacts, List<CompanyPriceVO> pList12N, List<CompanyPriceVO> pList121, List<CompanyPriceVO> familyPriceVOList, Long userId, Integer serviceType, List<UpdateType> updatePriceType, Integer updateType, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.hgId = hgId;
    this.hgName = hgName;
    this.addrId = addrId;
    this.addrStr = addrStr;
    this.branchId = branchId;
    this.branchName = branchName;
    this.roomId = roomId;
    this.roomNo = roomNo;
    this.bedId = bedId;
    this.bedNo = bedNo;
    this.phone = phone;
    this.contacts = contacts;
    this.pList12N = Internal.immutableCopyOf("pList12N", pList12N);
    this.pList121 = Internal.immutableCopyOf("pList121", pList121);
    this.familyPriceVOList = Internal.immutableCopyOf("familyPriceVOList", familyPriceVOList);
    this.userId = userId;
    this.serviceType = serviceType;
    this.updatePriceType = Internal.immutableCopyOf("updatePriceType", updatePriceType);
    this.updateType = updateType;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.hgId = hgId;
    builder.hgName = hgName;
    builder.addrId = addrId;
    builder.addrStr = addrStr;
    builder.branchId = branchId;
    builder.branchName = branchName;
    builder.roomId = roomId;
    builder.roomNo = roomNo;
    builder.bedId = bedId;
    builder.bedNo = bedNo;
    builder.phone = phone;
    builder.contacts = contacts;
    builder.pList12N = Internal.copyOf("pList12N", pList12N);
    builder.pList121 = Internal.copyOf("pList121", pList121);
    builder.familyPriceVOList = Internal.copyOf("familyPriceVOList", familyPriceVOList);
    builder.userId = userId;
    builder.serviceType = serviceType;
    builder.updatePriceType = Internal.copyOf("updatePriceType", updatePriceType);
    builder.updateType = updateType;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetOrderServiceRsp)) return false;
    GetOrderServiceRsp o = (GetOrderServiceRsp) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(hgId, o.hgId)
        && Internal.equals(hgName, o.hgName)
        && Internal.equals(addrId, o.addrId)
        && Internal.equals(addrStr, o.addrStr)
        && Internal.equals(branchId, o.branchId)
        && Internal.equals(branchName, o.branchName)
        && Internal.equals(roomId, o.roomId)
        && Internal.equals(roomNo, o.roomNo)
        && Internal.equals(bedId, o.bedId)
        && Internal.equals(bedNo, o.bedNo)
        && Internal.equals(phone, o.phone)
        && Internal.equals(contacts, o.contacts)
        && pList12N.equals(o.pList12N)
        && pList121.equals(o.pList121)
        && familyPriceVOList.equals(o.familyPriceVOList)
        && Internal.equals(userId, o.userId)
        && Internal.equals(serviceType, o.serviceType)
        && updatePriceType.equals(o.updatePriceType)
        && Internal.equals(updateType, o.updateType);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (hgId != null ? hgId.hashCode() : 0);
      result = result * 37 + (hgName != null ? hgName.hashCode() : 0);
      result = result * 37 + (addrId != null ? addrId.hashCode() : 0);
      result = result * 37 + (addrStr != null ? addrStr.hashCode() : 0);
      result = result * 37 + (branchId != null ? branchId.hashCode() : 0);
      result = result * 37 + (branchName != null ? branchName.hashCode() : 0);
      result = result * 37 + (roomId != null ? roomId.hashCode() : 0);
      result = result * 37 + (roomNo != null ? roomNo.hashCode() : 0);
      result = result * 37 + (bedId != null ? bedId.hashCode() : 0);
      result = result * 37 + (bedNo != null ? bedNo.hashCode() : 0);
      result = result * 37 + (phone != null ? phone.hashCode() : 0);
      result = result * 37 + (contacts != null ? contacts.hashCode() : 0);
      result = result * 37 + pList12N.hashCode();
      result = result * 37 + pList121.hashCode();
      result = result * 37 + familyPriceVOList.hashCode();
      result = result * 37 + (userId != null ? userId.hashCode() : 0);
      result = result * 37 + (serviceType != null ? serviceType.hashCode() : 0);
      result = result * 37 + updatePriceType.hashCode();
      result = result * 37 + (updateType != null ? updateType.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (hgId != null) builder.append(", hgId=").append(hgId);
    if (hgName != null) builder.append(", hgName=").append(hgName);
    if (addrId != null) builder.append(", addrId=").append(addrId);
    if (addrStr != null) builder.append(", addrStr=").append(addrStr);
    if (branchId != null) builder.append(", branchId=").append(branchId);
    if (branchName != null) builder.append(", branchName=").append(branchName);
    if (roomId != null) builder.append(", roomId=").append(roomId);
    if (roomNo != null) builder.append(", roomNo=").append(roomNo);
    if (bedId != null) builder.append(", bedId=").append(bedId);
    if (bedNo != null) builder.append(", bedNo=").append(bedNo);
    if (phone != null) builder.append(", phone=").append(phone);
    if (contacts != null) builder.append(", contacts=").append(contacts);
    if (!pList12N.isEmpty()) builder.append(", pList12N=").append(pList12N);
    if (!pList121.isEmpty()) builder.append(", pList121=").append(pList121);
    if (!familyPriceVOList.isEmpty()) builder.append(", familyPriceVOList=").append(familyPriceVOList);
    if (userId != null) builder.append(", userId=").append(userId);
    if (serviceType != null) builder.append(", serviceType=").append(serviceType);
    if (!updatePriceType.isEmpty()) builder.append(", updatePriceType=").append(updatePriceType);
    if (updateType != null) builder.append(", updateType=").append(updateType);
    return builder.replace(0, 2, "GetOrderServiceRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetOrderServiceRsp, Builder> {
    public Long hgId;

    public String hgName;

    public Long addrId;

    public String addrStr;

    public Long branchId;

    public String branchName;

    public Long roomId;

    public String roomNo;

    public Long bedId;

    public String bedNo;

    public String phone;

    public String contacts;

    public List<CompanyPriceVO> pList12N;

    public List<CompanyPriceVO> pList121;

    public List<CompanyPriceVO> familyPriceVOList;

    public Long userId;

    public Integer serviceType;

    public List<UpdateType> updatePriceType;

    public Integer updateType;

    public Builder() {
      pList12N = Internal.newMutableList();
      pList121 = Internal.newMutableList();
      familyPriceVOList = Internal.newMutableList();
      updatePriceType = Internal.newMutableList();
    }

    /**
     * 服务人员id
     */
    public Builder hgId(Long hgId) {
      this.hgId = hgId;
      return this;
    }

    /**
     * 服务人员昵称
     */
    public Builder hgName(String hgName) {
      this.hgName = hgName;
      return this;
    }

    /**
     * 地址id
     */
    public Builder addrId(Long addrId) {
      this.addrId = addrId;
      return this;
    }

    /**
     * 地址信息
     */
    public Builder addrStr(String addrStr) {
      this.addrStr = addrStr;
      return this;
    }

    /**
     * 科室id
     */
    public Builder branchId(Long branchId) {
      this.branchId = branchId;
      return this;
    }

    /**
     * 科室名称
     */
    public Builder branchName(String branchName) {
      this.branchName = branchName;
      return this;
    }

    /**
     * 房间id
     */
    public Builder roomId(Long roomId) {
      this.roomId = roomId;
      return this;
    }

    /**
     * 房间名称
     */
    public Builder roomNo(String roomNo) {
      this.roomNo = roomNo;
      return this;
    }

    /**
     * 床位id
     */
    public Builder bedId(Long bedId) {
      this.bedId = bedId;
      return this;
    }

    /**
     * 床位名称
     */
    public Builder bedNo(String bedNo) {
      this.bedNo = bedNo;
      return this;
    }

    /**
     * 联系手机号
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * 联系人
     */
    public Builder contacts(String contacts) {
      this.contacts = contacts;
      return this;
    }

    /**
     * 一对多套餐列表
     */
    public Builder pList12N(List<CompanyPriceVO> pList12N) {
      Internal.checkElementsNotNull(pList12N);
      this.pList12N = pList12N;
      return this;
    }

    /**
     * 一对一套餐列表
     */
    public Builder pList121(List<CompanyPriceVO> pList121) {
      Internal.checkElementsNotNull(pList121);
      this.pList121 = pList121;
      return this;
    }

    /**
     * 居家套餐列表 每个套餐都有不同的预付金 在CompanyPriceVO中
     */
    public Builder familyPriceVOList(List<CompanyPriceVO> familyPriceVOList) {
      Internal.checkElementsNotNull(familyPriceVOList);
      this.familyPriceVOList = familyPriceVOList;
      return this;
    }

    /**
     * 用户id
     */
    public Builder userId(Long userId) {
      this.userId = userId;
      return this;
    }

    /**
     * 服务类型 0-居家 1-专陪  2-多陪
     */
    public Builder serviceType(Integer serviceType) {
      this.serviceType = serviceType;
      return this;
    }

    /**
     * 手动选择变更服务计费规则时使用
     */
    public Builder updatePriceType(List<UpdateType> updatePriceType) {
      Internal.checkElementsNotNull(updatePriceType);
      this.updatePriceType = updatePriceType;
      return this;
    }

    /**
     * 变更规则 变更服务配置 1-变更后当天费用各收一半 2-变更后当天费用收变更后套餐 3-变更后超时时间 4-变更当天手动选择
     */
    public Builder updateType(Integer updateType) {
      this.updateType = updateType;
      return this;
    }

    @Override
    public GetOrderServiceRsp build() {
      return new GetOrderServiceRsp(hgId, hgName, addrId, addrStr, branchId, branchName, roomId, roomNo, bedId, bedNo, phone, contacts, pList12N, pList121, familyPriceVOList, userId, serviceType, updatePriceType, updateType, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetOrderServiceRsp extends ProtoAdapter<GetOrderServiceRsp> {
    ProtoAdapter_GetOrderServiceRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, GetOrderServiceRsp.class);
    }

    @Override
    public int encodedSize(GetOrderServiceRsp value) {
      return (value.hgId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.hgId) : 0)
          + (value.hgName != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.hgName) : 0)
          + (value.addrId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(3, value.addrId) : 0)
          + (value.addrStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.addrStr) : 0)
          + (value.branchId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(5, value.branchId) : 0)
          + (value.branchName != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.branchName) : 0)
          + (value.roomId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(7, value.roomId) : 0)
          + (value.roomNo != null ? ProtoAdapter.STRING.encodedSizeWithTag(8, value.roomNo) : 0)
          + (value.bedId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(9, value.bedId) : 0)
          + (value.bedNo != null ? ProtoAdapter.STRING.encodedSizeWithTag(10, value.bedNo) : 0)
          + (value.phone != null ? ProtoAdapter.STRING.encodedSizeWithTag(11, value.phone) : 0)
          + (value.contacts != null ? ProtoAdapter.STRING.encodedSizeWithTag(12, value.contacts) : 0)
          + CompanyPriceVO.ADAPTER.asRepeated().encodedSizeWithTag(13, value.pList12N)
          + CompanyPriceVO.ADAPTER.asRepeated().encodedSizeWithTag(14, value.pList121)
          + CompanyPriceVO.ADAPTER.asRepeated().encodedSizeWithTag(15, value.familyPriceVOList)
          + (value.userId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(16, value.userId) : 0)
          + (value.serviceType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(17, value.serviceType) : 0)
          + UpdateType.ADAPTER.asRepeated().encodedSizeWithTag(18, value.updatePriceType)
          + (value.updateType != null ? ProtoAdapter.INT32.encodedSizeWithTag(19, value.updateType) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetOrderServiceRsp value) throws IOException {
      if (value.hgId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.hgId);
      if (value.hgName != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.hgName);
      if (value.addrId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 3, value.addrId);
      if (value.addrStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.addrStr);
      if (value.branchId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 5, value.branchId);
      if (value.branchName != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.branchName);
      if (value.roomId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 7, value.roomId);
      if (value.roomNo != null) ProtoAdapter.STRING.encodeWithTag(writer, 8, value.roomNo);
      if (value.bedId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 9, value.bedId);
      if (value.bedNo != null) ProtoAdapter.STRING.encodeWithTag(writer, 10, value.bedNo);
      if (value.phone != null) ProtoAdapter.STRING.encodeWithTag(writer, 11, value.phone);
      if (value.contacts != null) ProtoAdapter.STRING.encodeWithTag(writer, 12, value.contacts);
      CompanyPriceVO.ADAPTER.asRepeated().encodeWithTag(writer, 13, value.pList12N);
      CompanyPriceVO.ADAPTER.asRepeated().encodeWithTag(writer, 14, value.pList121);
      CompanyPriceVO.ADAPTER.asRepeated().encodeWithTag(writer, 15, value.familyPriceVOList);
      if (value.userId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 16, value.userId);
      if (value.serviceType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 17, value.serviceType);
      UpdateType.ADAPTER.asRepeated().encodeWithTag(writer, 18, value.updatePriceType);
      if (value.updateType != null) ProtoAdapter.INT32.encodeWithTag(writer, 19, value.updateType);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetOrderServiceRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.hgId(ProtoAdapter.UINT64.decode(reader)); break;
          case 2: builder.hgName(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.addrId(ProtoAdapter.UINT64.decode(reader)); break;
          case 4: builder.addrStr(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.branchId(ProtoAdapter.UINT64.decode(reader)); break;
          case 6: builder.branchName(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.roomId(ProtoAdapter.UINT64.decode(reader)); break;
          case 8: builder.roomNo(ProtoAdapter.STRING.decode(reader)); break;
          case 9: builder.bedId(ProtoAdapter.UINT64.decode(reader)); break;
          case 10: builder.bedNo(ProtoAdapter.STRING.decode(reader)); break;
          case 11: builder.phone(ProtoAdapter.STRING.decode(reader)); break;
          case 12: builder.contacts(ProtoAdapter.STRING.decode(reader)); break;
          case 13: builder.pList12N.add(CompanyPriceVO.ADAPTER.decode(reader)); break;
          case 14: builder.pList121.add(CompanyPriceVO.ADAPTER.decode(reader)); break;
          case 15: builder.familyPriceVOList.add(CompanyPriceVO.ADAPTER.decode(reader)); break;
          case 16: builder.userId(ProtoAdapter.UINT64.decode(reader)); break;
          case 17: builder.serviceType(ProtoAdapter.UINT32.decode(reader)); break;
          case 18: builder.updatePriceType.add(UpdateType.ADAPTER.decode(reader)); break;
          case 19: builder.updateType(ProtoAdapter.INT32.decode(reader)); break;
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
    public GetOrderServiceRsp redact(GetOrderServiceRsp value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.pList12N, CompanyPriceVO.ADAPTER);
      Internal.redactElements(builder.pList121, CompanyPriceVO.ADAPTER);
      Internal.redactElements(builder.familyPriceVOList, CompanyPriceVO.ADAPTER);
      Internal.redactElements(builder.updatePriceType, UpdateType.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
