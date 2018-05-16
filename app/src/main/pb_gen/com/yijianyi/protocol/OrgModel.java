// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: SaasModel.proto at 66:1
package com.yijianyi.protocol;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

public final class OrgModel extends Message<OrgModel, OrgModel.Builder> {
  public static final ProtoAdapter<OrgModel> ADAPTER = new ProtoAdapter_OrgModel();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_ID = 0L;

  public static final String DEFAULT_ORGNAME = "";

  public static final Integer DEFAULT_ORGTYPE = 0;

  public static final Integer DEFAULT_DETAILEDTYPE = 0;

  public static final Integer DEFAULT_ORGLEVEL = 0;

  public static final String DEFAULT_TELEPHONE = "";

  public static final String DEFAULT_PHONE = "";

  public static final Integer DEFAULT_OPERATEMODE = 0;

  public static final String DEFAULT_OFFICIALWEBSITE = "";

  public static final String DEFAULT_PROVINCE = "";

  public static final String DEFAULT_CITY = "";

  public static final String DEFAULT_DISTRICT = "";

  public static final String DEFAULT_ADDRESS = "";

  public static final String DEFAULT_BUILDING = "";

  public static final Integer DEFAULT_GPSTYPE = 0;

  public static final Double DEFAULT_LNG = 0.0d;

  public static final Double DEFAULT_LAT = 0.0d;

  public static final Integer DEFAULT_STATE = 0;

  public static final Long DEFAULT_CREATETIME = 0L;

  public static final Integer DEFAULT_CREATETYPE = 0;

  public static final String DEFAULT_CREATECHANNEL = "";

  public static final Long DEFAULT_CREATESTAFFID = 0L;

  public static final String DEFAULT_CREATESTAFFNAME = "";

  public static final Long DEFAULT_PROVINCEID = 0L;

  public static final Long DEFAULT_CITYID = 0L;

  public static final Long DEFAULT_COUNTYID = 0L;

  public static final String DEFAULT_FIRSTCASENAME = "";

  public static final String DEFAULT_FULLPINYIN = "";

  public static final Integer DEFAULT_SERVICENUM = 0;

  /**
   * 机构ID
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long id;

  /**
   * 机构名称
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String orgName;

  /**
   * 机构类型 机构类型  1-医院 2-养老院
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer orgType;

  /**
   * 详细类型  orgType = 1时   1-妇幼医院 2-肿瘤医院 3-整形美容 4-耳鼻喉科医院 5-眼科医院 6-皮肤病医院 7-中医院 8-综合医院 9-专科医院    orgType = 2时 未确定
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer detailedType;

  /**
   * 等级 0-未知 1-一丙 2-一乙 3-一甲 4-二丙 5-二乙 6-二甲 7-三丙 8-三乙 9-三甲
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer orgLevel;

  /**
   * 座机号码
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String telephone;

  /**
   * 手机号,非必填
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String phone;

  /**
   * 运营方式 1-国营 2-合伙制 3-股份制 4-中外合资合作 5-股份合作 6-私人 7-集体 8-未知
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer operateMode;

  /**
   * 官方网站
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String officialWebsite;

  /**
   * 省份
   */
  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String province;

  /**
   * 城市
   */
  @WireField(
      tag = 11,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String city;

  /**
   * 区
   */
  @WireField(
      tag = 12,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String district;

  /**
   * 详细地址
   */
  @WireField(
      tag = 13,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String address;

  /**
   * 地址 从高德或百度选中的地址（带经纬度信息）
   */
  @WireField(
      tag = 14,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String building;

  /**
   * 经纬度类型 1-百度  2-高德
   */
  @WireField(
      tag = 15,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer gpsType;

  /**
   * 经度
   */
  @WireField(
      tag = 16,
      adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
  )
  public final Double lng;

  /**
   * 纬度
   */
  @WireField(
      tag = 17,
      adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
  )
  public final Double lat;

  /**
   * 机构的状态 0 在线  -1已删除
   */
  @WireField(
      tag = 18,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer state;

  /**
   * 创建时间
   */
  @WireField(
      tag = 19,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createTime;

  /**
   * 1-自己注册  2-公司添加
   */
  @WireField(
      tag = 20,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer createType;

  /**
   * 创建渠道
   */
  @WireField(
      tag = 21,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String createChannel;

  /**
   * 创建员工ID
   */
  @WireField(
      tag = 22,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long createStaffId;

  /**
   * 创建员工名称
   */
  @WireField(
      tag = 23,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String createStaffName;

  @WireField(
      tag = 24,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long provinceId;

  @WireField(
      tag = 25,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long cityId;

  @WireField(
      tag = 26,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long countyId;

  /**
   * 机构名每个汉字的首字母
   */
  @WireField(
      tag = 27,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String firstCaseName;

  /**
   * 机构名汉字全拼
   */
  @WireField(
      tag = 28,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String fullPinYin;

  /**
   * 标签
   */
  @WireField(
      tag = 29,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> tags;

  /**
   * 服务人数
   */
  @WireField(
      tag = 30,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer serviceNum;

  public OrgModel(Long id, String orgName, Integer orgType, Integer detailedType, Integer orgLevel, String telephone, String phone, Integer operateMode, String officialWebsite, String province, String city, String district, String address, String building, Integer gpsType, Double lng, Double lat, Integer state, Long createTime, Integer createType, String createChannel, Long createStaffId, String createStaffName, Long provinceId, Long cityId, Long countyId, String firstCaseName, String fullPinYin, List<String> tags, Integer serviceNum) {
    this(id, orgName, orgType, detailedType, orgLevel, telephone, phone, operateMode, officialWebsite, province, city, district, address, building, gpsType, lng, lat, state, createTime, createType, createChannel, createStaffId, createStaffName, provinceId, cityId, countyId, firstCaseName, fullPinYin, tags, serviceNum, ByteString.EMPTY);
  }

  public OrgModel(Long id, String orgName, Integer orgType, Integer detailedType, Integer orgLevel, String telephone, String phone, Integer operateMode, String officialWebsite, String province, String city, String district, String address, String building, Integer gpsType, Double lng, Double lat, Integer state, Long createTime, Integer createType, String createChannel, Long createStaffId, String createStaffName, Long provinceId, Long cityId, Long countyId, String firstCaseName, String fullPinYin, List<String> tags, Integer serviceNum, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.orgName = orgName;
    this.orgType = orgType;
    this.detailedType = detailedType;
    this.orgLevel = orgLevel;
    this.telephone = telephone;
    this.phone = phone;
    this.operateMode = operateMode;
    this.officialWebsite = officialWebsite;
    this.province = province;
    this.city = city;
    this.district = district;
    this.address = address;
    this.building = building;
    this.gpsType = gpsType;
    this.lng = lng;
    this.lat = lat;
    this.state = state;
    this.createTime = createTime;
    this.createType = createType;
    this.createChannel = createChannel;
    this.createStaffId = createStaffId;
    this.createStaffName = createStaffName;
    this.provinceId = provinceId;
    this.cityId = cityId;
    this.countyId = countyId;
    this.firstCaseName = firstCaseName;
    this.fullPinYin = fullPinYin;
    this.tags = Internal.immutableCopyOf("tags", tags);
    this.serviceNum = serviceNum;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.orgName = orgName;
    builder.orgType = orgType;
    builder.detailedType = detailedType;
    builder.orgLevel = orgLevel;
    builder.telephone = telephone;
    builder.phone = phone;
    builder.operateMode = operateMode;
    builder.officialWebsite = officialWebsite;
    builder.province = province;
    builder.city = city;
    builder.district = district;
    builder.address = address;
    builder.building = building;
    builder.gpsType = gpsType;
    builder.lng = lng;
    builder.lat = lat;
    builder.state = state;
    builder.createTime = createTime;
    builder.createType = createType;
    builder.createChannel = createChannel;
    builder.createStaffId = createStaffId;
    builder.createStaffName = createStaffName;
    builder.provinceId = provinceId;
    builder.cityId = cityId;
    builder.countyId = countyId;
    builder.firstCaseName = firstCaseName;
    builder.fullPinYin = fullPinYin;
    builder.tags = Internal.copyOf("tags", tags);
    builder.serviceNum = serviceNum;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof OrgModel)) return false;
    OrgModel o = (OrgModel) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(orgName, o.orgName)
        && Internal.equals(orgType, o.orgType)
        && Internal.equals(detailedType, o.detailedType)
        && Internal.equals(orgLevel, o.orgLevel)
        && Internal.equals(telephone, o.telephone)
        && Internal.equals(phone, o.phone)
        && Internal.equals(operateMode, o.operateMode)
        && Internal.equals(officialWebsite, o.officialWebsite)
        && Internal.equals(province, o.province)
        && Internal.equals(city, o.city)
        && Internal.equals(district, o.district)
        && Internal.equals(address, o.address)
        && Internal.equals(building, o.building)
        && Internal.equals(gpsType, o.gpsType)
        && Internal.equals(lng, o.lng)
        && Internal.equals(lat, o.lat)
        && Internal.equals(state, o.state)
        && Internal.equals(createTime, o.createTime)
        && Internal.equals(createType, o.createType)
        && Internal.equals(createChannel, o.createChannel)
        && Internal.equals(createStaffId, o.createStaffId)
        && Internal.equals(createStaffName, o.createStaffName)
        && Internal.equals(provinceId, o.provinceId)
        && Internal.equals(cityId, o.cityId)
        && Internal.equals(countyId, o.countyId)
        && Internal.equals(firstCaseName, o.firstCaseName)
        && Internal.equals(fullPinYin, o.fullPinYin)
        && tags.equals(o.tags)
        && Internal.equals(serviceNum, o.serviceNum);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (orgName != null ? orgName.hashCode() : 0);
      result = result * 37 + (orgType != null ? orgType.hashCode() : 0);
      result = result * 37 + (detailedType != null ? detailedType.hashCode() : 0);
      result = result * 37 + (orgLevel != null ? orgLevel.hashCode() : 0);
      result = result * 37 + (telephone != null ? telephone.hashCode() : 0);
      result = result * 37 + (phone != null ? phone.hashCode() : 0);
      result = result * 37 + (operateMode != null ? operateMode.hashCode() : 0);
      result = result * 37 + (officialWebsite != null ? officialWebsite.hashCode() : 0);
      result = result * 37 + (province != null ? province.hashCode() : 0);
      result = result * 37 + (city != null ? city.hashCode() : 0);
      result = result * 37 + (district != null ? district.hashCode() : 0);
      result = result * 37 + (address != null ? address.hashCode() : 0);
      result = result * 37 + (building != null ? building.hashCode() : 0);
      result = result * 37 + (gpsType != null ? gpsType.hashCode() : 0);
      result = result * 37 + (lng != null ? lng.hashCode() : 0);
      result = result * 37 + (lat != null ? lat.hashCode() : 0);
      result = result * 37 + (state != null ? state.hashCode() : 0);
      result = result * 37 + (createTime != null ? createTime.hashCode() : 0);
      result = result * 37 + (createType != null ? createType.hashCode() : 0);
      result = result * 37 + (createChannel != null ? createChannel.hashCode() : 0);
      result = result * 37 + (createStaffId != null ? createStaffId.hashCode() : 0);
      result = result * 37 + (createStaffName != null ? createStaffName.hashCode() : 0);
      result = result * 37 + (provinceId != null ? provinceId.hashCode() : 0);
      result = result * 37 + (cityId != null ? cityId.hashCode() : 0);
      result = result * 37 + (countyId != null ? countyId.hashCode() : 0);
      result = result * 37 + (firstCaseName != null ? firstCaseName.hashCode() : 0);
      result = result * 37 + (fullPinYin != null ? fullPinYin.hashCode() : 0);
      result = result * 37 + tags.hashCode();
      result = result * 37 + (serviceNum != null ? serviceNum.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (id != null) builder.append(", id=").append(id);
    if (orgName != null) builder.append(", orgName=").append(orgName);
    if (orgType != null) builder.append(", orgType=").append(orgType);
    if (detailedType != null) builder.append(", detailedType=").append(detailedType);
    if (orgLevel != null) builder.append(", orgLevel=").append(orgLevel);
    if (telephone != null) builder.append(", telephone=").append(telephone);
    if (phone != null) builder.append(", phone=").append(phone);
    if (operateMode != null) builder.append(", operateMode=").append(operateMode);
    if (officialWebsite != null) builder.append(", officialWebsite=").append(officialWebsite);
    if (province != null) builder.append(", province=").append(province);
    if (city != null) builder.append(", city=").append(city);
    if (district != null) builder.append(", district=").append(district);
    if (address != null) builder.append(", address=").append(address);
    if (building != null) builder.append(", building=").append(building);
    if (gpsType != null) builder.append(", gpsType=").append(gpsType);
    if (lng != null) builder.append(", lng=").append(lng);
    if (lat != null) builder.append(", lat=").append(lat);
    if (state != null) builder.append(", state=").append(state);
    if (createTime != null) builder.append(", createTime=").append(createTime);
    if (createType != null) builder.append(", createType=").append(createType);
    if (createChannel != null) builder.append(", createChannel=").append(createChannel);
    if (createStaffId != null) builder.append(", createStaffId=").append(createStaffId);
    if (createStaffName != null) builder.append(", createStaffName=").append(createStaffName);
    if (provinceId != null) builder.append(", provinceId=").append(provinceId);
    if (cityId != null) builder.append(", cityId=").append(cityId);
    if (countyId != null) builder.append(", countyId=").append(countyId);
    if (firstCaseName != null) builder.append(", firstCaseName=").append(firstCaseName);
    if (fullPinYin != null) builder.append(", fullPinYin=").append(fullPinYin);
    if (!tags.isEmpty()) builder.append(", tags=").append(tags);
    if (serviceNum != null) builder.append(", serviceNum=").append(serviceNum);
    return builder.replace(0, 2, "OrgModel{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<OrgModel, Builder> {
    public Long id;

    public String orgName;

    public Integer orgType;

    public Integer detailedType;

    public Integer orgLevel;

    public String telephone;

    public String phone;

    public Integer operateMode;

    public String officialWebsite;

    public String province;

    public String city;

    public String district;

    public String address;

    public String building;

    public Integer gpsType;

    public Double lng;

    public Double lat;

    public Integer state;

    public Long createTime;

    public Integer createType;

    public String createChannel;

    public Long createStaffId;

    public String createStaffName;

    public Long provinceId;

    public Long cityId;

    public Long countyId;

    public String firstCaseName;

    public String fullPinYin;

    public List<String> tags;

    public Integer serviceNum;

    public Builder() {
      tags = Internal.newMutableList();
    }

    /**
     * 机构ID
     */
    public Builder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     * 机构名称
     */
    public Builder orgName(String orgName) {
      this.orgName = orgName;
      return this;
    }

    /**
     * 机构类型 机构类型  1-医院 2-养老院
     */
    public Builder orgType(Integer orgType) {
      this.orgType = orgType;
      return this;
    }

    /**
     * 详细类型  orgType = 1时   1-妇幼医院 2-肿瘤医院 3-整形美容 4-耳鼻喉科医院 5-眼科医院 6-皮肤病医院 7-中医院 8-综合医院 9-专科医院    orgType = 2时 未确定
     */
    public Builder detailedType(Integer detailedType) {
      this.detailedType = detailedType;
      return this;
    }

    /**
     * 等级 0-未知 1-一丙 2-一乙 3-一甲 4-二丙 5-二乙 6-二甲 7-三丙 8-三乙 9-三甲
     */
    public Builder orgLevel(Integer orgLevel) {
      this.orgLevel = orgLevel;
      return this;
    }

    /**
     * 座机号码
     */
    public Builder telephone(String telephone) {
      this.telephone = telephone;
      return this;
    }

    /**
     * 手机号,非必填
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * 运营方式 1-国营 2-合伙制 3-股份制 4-中外合资合作 5-股份合作 6-私人 7-集体 8-未知
     */
    public Builder operateMode(Integer operateMode) {
      this.operateMode = operateMode;
      return this;
    }

    /**
     * 官方网站
     */
    public Builder officialWebsite(String officialWebsite) {
      this.officialWebsite = officialWebsite;
      return this;
    }

    /**
     * 省份
     */
    public Builder province(String province) {
      this.province = province;
      return this;
    }

    /**
     * 城市
     */
    public Builder city(String city) {
      this.city = city;
      return this;
    }

    /**
     * 区
     */
    public Builder district(String district) {
      this.district = district;
      return this;
    }

    /**
     * 详细地址
     */
    public Builder address(String address) {
      this.address = address;
      return this;
    }

    /**
     * 地址 从高德或百度选中的地址（带经纬度信息）
     */
    public Builder building(String building) {
      this.building = building;
      return this;
    }

    /**
     * 经纬度类型 1-百度  2-高德
     */
    public Builder gpsType(Integer gpsType) {
      this.gpsType = gpsType;
      return this;
    }

    /**
     * 经度
     */
    public Builder lng(Double lng) {
      this.lng = lng;
      return this;
    }

    /**
     * 纬度
     */
    public Builder lat(Double lat) {
      this.lat = lat;
      return this;
    }

    /**
     * 机构的状态 0 在线  -1已删除
     */
    public Builder state(Integer state) {
      this.state = state;
      return this;
    }

    /**
     * 创建时间
     */
    public Builder createTime(Long createTime) {
      this.createTime = createTime;
      return this;
    }

    /**
     * 1-自己注册  2-公司添加
     */
    public Builder createType(Integer createType) {
      this.createType = createType;
      return this;
    }

    /**
     * 创建渠道
     */
    public Builder createChannel(String createChannel) {
      this.createChannel = createChannel;
      return this;
    }

    /**
     * 创建员工ID
     */
    public Builder createStaffId(Long createStaffId) {
      this.createStaffId = createStaffId;
      return this;
    }

    /**
     * 创建员工名称
     */
    public Builder createStaffName(String createStaffName) {
      this.createStaffName = createStaffName;
      return this;
    }

    public Builder provinceId(Long provinceId) {
      this.provinceId = provinceId;
      return this;
    }

    public Builder cityId(Long cityId) {
      this.cityId = cityId;
      return this;
    }

    public Builder countyId(Long countyId) {
      this.countyId = countyId;
      return this;
    }

    /**
     * 机构名每个汉字的首字母
     */
    public Builder firstCaseName(String firstCaseName) {
      this.firstCaseName = firstCaseName;
      return this;
    }

    /**
     * 机构名汉字全拼
     */
    public Builder fullPinYin(String fullPinYin) {
      this.fullPinYin = fullPinYin;
      return this;
    }

    /**
     * 标签
     */
    public Builder tags(List<String> tags) {
      Internal.checkElementsNotNull(tags);
      this.tags = tags;
      return this;
    }

    /**
     * 服务人数
     */
    public Builder serviceNum(Integer serviceNum) {
      this.serviceNum = serviceNum;
      return this;
    }

    @Override
    public OrgModel build() {
      return new OrgModel(id, orgName, orgType, detailedType, orgLevel, telephone, phone, operateMode, officialWebsite, province, city, district, address, building, gpsType, lng, lat, state, createTime, createType, createChannel, createStaffId, createStaffName, provinceId, cityId, countyId, firstCaseName, fullPinYin, tags, serviceNum, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_OrgModel extends ProtoAdapter<OrgModel> {
    ProtoAdapter_OrgModel() {
      super(FieldEncoding.LENGTH_DELIMITED, OrgModel.class);
    }

    @Override
    public int encodedSize(OrgModel value) {
      return (value.id != null ? ProtoAdapter.UINT64.encodedSizeWithTag(1, value.id) : 0)
          + (value.orgName != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.orgName) : 0)
          + (value.orgType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(3, value.orgType) : 0)
          + (value.detailedType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(4, value.detailedType) : 0)
          + (value.orgLevel != null ? ProtoAdapter.UINT32.encodedSizeWithTag(5, value.orgLevel) : 0)
          + (value.telephone != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.telephone) : 0)
          + (value.phone != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, value.phone) : 0)
          + (value.operateMode != null ? ProtoAdapter.UINT32.encodedSizeWithTag(8, value.operateMode) : 0)
          + (value.officialWebsite != null ? ProtoAdapter.STRING.encodedSizeWithTag(9, value.officialWebsite) : 0)
          + (value.province != null ? ProtoAdapter.STRING.encodedSizeWithTag(10, value.province) : 0)
          + (value.city != null ? ProtoAdapter.STRING.encodedSizeWithTag(11, value.city) : 0)
          + (value.district != null ? ProtoAdapter.STRING.encodedSizeWithTag(12, value.district) : 0)
          + (value.address != null ? ProtoAdapter.STRING.encodedSizeWithTag(13, value.address) : 0)
          + (value.building != null ? ProtoAdapter.STRING.encodedSizeWithTag(14, value.building) : 0)
          + (value.gpsType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(15, value.gpsType) : 0)
          + (value.lng != null ? ProtoAdapter.DOUBLE.encodedSizeWithTag(16, value.lng) : 0)
          + (value.lat != null ? ProtoAdapter.DOUBLE.encodedSizeWithTag(17, value.lat) : 0)
          + (value.state != null ? ProtoAdapter.UINT32.encodedSizeWithTag(18, value.state) : 0)
          + (value.createTime != null ? ProtoAdapter.UINT64.encodedSizeWithTag(19, value.createTime) : 0)
          + (value.createType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(20, value.createType) : 0)
          + (value.createChannel != null ? ProtoAdapter.STRING.encodedSizeWithTag(21, value.createChannel) : 0)
          + (value.createStaffId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(22, value.createStaffId) : 0)
          + (value.createStaffName != null ? ProtoAdapter.STRING.encodedSizeWithTag(23, value.createStaffName) : 0)
          + (value.provinceId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(24, value.provinceId) : 0)
          + (value.cityId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(25, value.cityId) : 0)
          + (value.countyId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(26, value.countyId) : 0)
          + (value.firstCaseName != null ? ProtoAdapter.STRING.encodedSizeWithTag(27, value.firstCaseName) : 0)
          + (value.fullPinYin != null ? ProtoAdapter.STRING.encodedSizeWithTag(28, value.fullPinYin) : 0)
          + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(29, value.tags)
          + (value.serviceNum != null ? ProtoAdapter.UINT32.encodedSizeWithTag(30, value.serviceNum) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, OrgModel value) throws IOException {
      if (value.id != null) ProtoAdapter.UINT64.encodeWithTag(writer, 1, value.id);
      if (value.orgName != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.orgName);
      if (value.orgType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.orgType);
      if (value.detailedType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 4, value.detailedType);
      if (value.orgLevel != null) ProtoAdapter.UINT32.encodeWithTag(writer, 5, value.orgLevel);
      if (value.telephone != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.telephone);
      if (value.phone != null) ProtoAdapter.STRING.encodeWithTag(writer, 7, value.phone);
      if (value.operateMode != null) ProtoAdapter.UINT32.encodeWithTag(writer, 8, value.operateMode);
      if (value.officialWebsite != null) ProtoAdapter.STRING.encodeWithTag(writer, 9, value.officialWebsite);
      if (value.province != null) ProtoAdapter.STRING.encodeWithTag(writer, 10, value.province);
      if (value.city != null) ProtoAdapter.STRING.encodeWithTag(writer, 11, value.city);
      if (value.district != null) ProtoAdapter.STRING.encodeWithTag(writer, 12, value.district);
      if (value.address != null) ProtoAdapter.STRING.encodeWithTag(writer, 13, value.address);
      if (value.building != null) ProtoAdapter.STRING.encodeWithTag(writer, 14, value.building);
      if (value.gpsType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 15, value.gpsType);
      if (value.lng != null) ProtoAdapter.DOUBLE.encodeWithTag(writer, 16, value.lng);
      if (value.lat != null) ProtoAdapter.DOUBLE.encodeWithTag(writer, 17, value.lat);
      if (value.state != null) ProtoAdapter.UINT32.encodeWithTag(writer, 18, value.state);
      if (value.createTime != null) ProtoAdapter.UINT64.encodeWithTag(writer, 19, value.createTime);
      if (value.createType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 20, value.createType);
      if (value.createChannel != null) ProtoAdapter.STRING.encodeWithTag(writer, 21, value.createChannel);
      if (value.createStaffId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 22, value.createStaffId);
      if (value.createStaffName != null) ProtoAdapter.STRING.encodeWithTag(writer, 23, value.createStaffName);
      if (value.provinceId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 24, value.provinceId);
      if (value.cityId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 25, value.cityId);
      if (value.countyId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 26, value.countyId);
      if (value.firstCaseName != null) ProtoAdapter.STRING.encodeWithTag(writer, 27, value.firstCaseName);
      if (value.fullPinYin != null) ProtoAdapter.STRING.encodeWithTag(writer, 28, value.fullPinYin);
      ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 29, value.tags);
      if (value.serviceNum != null) ProtoAdapter.UINT32.encodeWithTag(writer, 30, value.serviceNum);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public OrgModel decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.UINT64.decode(reader)); break;
          case 2: builder.orgName(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.orgType(ProtoAdapter.UINT32.decode(reader)); break;
          case 4: builder.detailedType(ProtoAdapter.UINT32.decode(reader)); break;
          case 5: builder.orgLevel(ProtoAdapter.UINT32.decode(reader)); break;
          case 6: builder.telephone(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.phone(ProtoAdapter.STRING.decode(reader)); break;
          case 8: builder.operateMode(ProtoAdapter.UINT32.decode(reader)); break;
          case 9: builder.officialWebsite(ProtoAdapter.STRING.decode(reader)); break;
          case 10: builder.province(ProtoAdapter.STRING.decode(reader)); break;
          case 11: builder.city(ProtoAdapter.STRING.decode(reader)); break;
          case 12: builder.district(ProtoAdapter.STRING.decode(reader)); break;
          case 13: builder.address(ProtoAdapter.STRING.decode(reader)); break;
          case 14: builder.building(ProtoAdapter.STRING.decode(reader)); break;
          case 15: builder.gpsType(ProtoAdapter.UINT32.decode(reader)); break;
          case 16: builder.lng(ProtoAdapter.DOUBLE.decode(reader)); break;
          case 17: builder.lat(ProtoAdapter.DOUBLE.decode(reader)); break;
          case 18: builder.state(ProtoAdapter.UINT32.decode(reader)); break;
          case 19: builder.createTime(ProtoAdapter.UINT64.decode(reader)); break;
          case 20: builder.createType(ProtoAdapter.UINT32.decode(reader)); break;
          case 21: builder.createChannel(ProtoAdapter.STRING.decode(reader)); break;
          case 22: builder.createStaffId(ProtoAdapter.UINT64.decode(reader)); break;
          case 23: builder.createStaffName(ProtoAdapter.STRING.decode(reader)); break;
          case 24: builder.provinceId(ProtoAdapter.UINT64.decode(reader)); break;
          case 25: builder.cityId(ProtoAdapter.UINT64.decode(reader)); break;
          case 26: builder.countyId(ProtoAdapter.UINT64.decode(reader)); break;
          case 27: builder.firstCaseName(ProtoAdapter.STRING.decode(reader)); break;
          case 28: builder.fullPinYin(ProtoAdapter.STRING.decode(reader)); break;
          case 29: builder.tags.add(ProtoAdapter.STRING.decode(reader)); break;
          case 30: builder.serviceNum(ProtoAdapter.UINT32.decode(reader)); break;
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
    public OrgModel redact(OrgModel value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}