// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1607:1
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

/**
 * 获取工作台信息
 */
public final class GetMyWorkbenchRsp extends Message<GetMyWorkbenchRsp, GetMyWorkbenchRsp.Builder> {
  public static final ProtoAdapter<GetMyWorkbenchRsp> ADAPTER = new ProtoAdapter_GetMyWorkbenchRsp();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_HGNAME = "";

  public static final String DEFAULT_UNREADNUM = "";

  public static final Long DEFAULT_ROLEID = 0L;

  /**
   * 服务数据
   */
  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.WorkbenchVO#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<WorkbenchVO> serviceDataList;

  /**
   * 我的待办
   */
  @WireField(
      tag = 2,
      adapter = "com.yijianyi.protocol.WorkbenchVO#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<WorkbenchVO> backlogList;

  /**
   * 常用工具
   */
  @WireField(
      tag = 3,
      adapter = "com.yijianyi.protocol.CommonToolsVO#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<CommonToolsVO> tools;

  /**
   * 登陆人名字
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String hgName;

  /**
   * 未读消息数
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String unReadNum;

  /**
   * 权限 0-无角色 10003-健康经理 10006-督导 10004-护士长  10001-护工 10002-护士 10100-客户经理 6-其他
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long roleId;

  public GetMyWorkbenchRsp(List<WorkbenchVO> serviceDataList, List<WorkbenchVO> backlogList, List<CommonToolsVO> tools, String hgName, String unReadNum, Long roleId) {
    this(serviceDataList, backlogList, tools, hgName, unReadNum, roleId, ByteString.EMPTY);
  }

  public GetMyWorkbenchRsp(List<WorkbenchVO> serviceDataList, List<WorkbenchVO> backlogList, List<CommonToolsVO> tools, String hgName, String unReadNum, Long roleId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.serviceDataList = Internal.immutableCopyOf("serviceDataList", serviceDataList);
    this.backlogList = Internal.immutableCopyOf("backlogList", backlogList);
    this.tools = Internal.immutableCopyOf("tools", tools);
    this.hgName = hgName;
    this.unReadNum = unReadNum;
    this.roleId = roleId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.serviceDataList = Internal.copyOf("serviceDataList", serviceDataList);
    builder.backlogList = Internal.copyOf("backlogList", backlogList);
    builder.tools = Internal.copyOf("tools", tools);
    builder.hgName = hgName;
    builder.unReadNum = unReadNum;
    builder.roleId = roleId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetMyWorkbenchRsp)) return false;
    GetMyWorkbenchRsp o = (GetMyWorkbenchRsp) other;
    return unknownFields().equals(o.unknownFields())
        && serviceDataList.equals(o.serviceDataList)
        && backlogList.equals(o.backlogList)
        && tools.equals(o.tools)
        && Internal.equals(hgName, o.hgName)
        && Internal.equals(unReadNum, o.unReadNum)
        && Internal.equals(roleId, o.roleId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + serviceDataList.hashCode();
      result = result * 37 + backlogList.hashCode();
      result = result * 37 + tools.hashCode();
      result = result * 37 + (hgName != null ? hgName.hashCode() : 0);
      result = result * 37 + (unReadNum != null ? unReadNum.hashCode() : 0);
      result = result * 37 + (roleId != null ? roleId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (!serviceDataList.isEmpty()) builder.append(", serviceDataList=").append(serviceDataList);
    if (!backlogList.isEmpty()) builder.append(", backlogList=").append(backlogList);
    if (!tools.isEmpty()) builder.append(", tools=").append(tools);
    if (hgName != null) builder.append(", hgName=").append(hgName);
    if (unReadNum != null) builder.append(", unReadNum=").append(unReadNum);
    if (roleId != null) builder.append(", roleId=").append(roleId);
    return builder.replace(0, 2, "GetMyWorkbenchRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetMyWorkbenchRsp, Builder> {
    public List<WorkbenchVO> serviceDataList;

    public List<WorkbenchVO> backlogList;

    public List<CommonToolsVO> tools;

    public String hgName;

    public String unReadNum;

    public Long roleId;

    public Builder() {
      serviceDataList = Internal.newMutableList();
      backlogList = Internal.newMutableList();
      tools = Internal.newMutableList();
    }

    /**
     * 服务数据
     */
    public Builder serviceDataList(List<WorkbenchVO> serviceDataList) {
      Internal.checkElementsNotNull(serviceDataList);
      this.serviceDataList = serviceDataList;
      return this;
    }

    /**
     * 我的待办
     */
    public Builder backlogList(List<WorkbenchVO> backlogList) {
      Internal.checkElementsNotNull(backlogList);
      this.backlogList = backlogList;
      return this;
    }

    /**
     * 常用工具
     */
    public Builder tools(List<CommonToolsVO> tools) {
      Internal.checkElementsNotNull(tools);
      this.tools = tools;
      return this;
    }

    /**
     * 登陆人名字
     */
    public Builder hgName(String hgName) {
      this.hgName = hgName;
      return this;
    }

    /**
     * 未读消息数
     */
    public Builder unReadNum(String unReadNum) {
      this.unReadNum = unReadNum;
      return this;
    }

    /**
     * 权限 0-无角色 10003-健康经理 10006-督导 10004-护士长  10001-护工 10002-护士 10100-客户经理 6-其他
     */
    public Builder roleId(Long roleId) {
      this.roleId = roleId;
      return this;
    }

    @Override
    public GetMyWorkbenchRsp build() {
      return new GetMyWorkbenchRsp(serviceDataList, backlogList, tools, hgName, unReadNum, roleId, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetMyWorkbenchRsp extends ProtoAdapter<GetMyWorkbenchRsp> {
    ProtoAdapter_GetMyWorkbenchRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, GetMyWorkbenchRsp.class);
    }

    @Override
    public int encodedSize(GetMyWorkbenchRsp value) {
      return WorkbenchVO.ADAPTER.asRepeated().encodedSizeWithTag(1, value.serviceDataList)
          + WorkbenchVO.ADAPTER.asRepeated().encodedSizeWithTag(2, value.backlogList)
          + CommonToolsVO.ADAPTER.asRepeated().encodedSizeWithTag(3, value.tools)
          + (value.hgName != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.hgName) : 0)
          + (value.unReadNum != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, value.unReadNum) : 0)
          + (value.roleId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(6, value.roleId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetMyWorkbenchRsp value) throws IOException {
      WorkbenchVO.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.serviceDataList);
      WorkbenchVO.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.backlogList);
      CommonToolsVO.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.tools);
      if (value.hgName != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.hgName);
      if (value.unReadNum != null) ProtoAdapter.STRING.encodeWithTag(writer, 5, value.unReadNum);
      if (value.roleId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 6, value.roleId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetMyWorkbenchRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.serviceDataList.add(WorkbenchVO.ADAPTER.decode(reader)); break;
          case 2: builder.backlogList.add(WorkbenchVO.ADAPTER.decode(reader)); break;
          case 3: builder.tools.add(CommonToolsVO.ADAPTER.decode(reader)); break;
          case 4: builder.hgName(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.unReadNum(ProtoAdapter.STRING.decode(reader)); break;
          case 6: builder.roleId(ProtoAdapter.UINT64.decode(reader)); break;
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
    public GetMyWorkbenchRsp redact(GetMyWorkbenchRsp value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.serviceDataList, WorkbenchVO.ADAPTER);
      Internal.redactElements(builder.backlogList, WorkbenchVO.ADAPTER);
      Internal.redactElements(builder.tools, CommonToolsVO.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
