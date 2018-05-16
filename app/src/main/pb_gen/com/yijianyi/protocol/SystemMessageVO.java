// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: SaasModel.proto at 531:1
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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class SystemMessageVO extends Message<SystemMessageVO, SystemMessageVO.Builder> {
  public static final ProtoAdapter<SystemMessageVO> ADAPTER = new ProtoAdapter_SystemMessageVO();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_TITLE = "";

  public static final Integer DEFAULT_MSGTYPE = 0;

  public static final String DEFAULT_CONTENT = "";

  public static final String DEFAULT_CREATETIME = "";

  public static final Integer DEFAULT_NUM = 0;

  /**
   * 标题
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String title;

  /**
   * 消息类型
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer msgType;

  /**
   * 发送消息的内容
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String content;

  /**
   * 消息发送时间
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String createTime;

  /**
   * 未读消息数
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer num;

  public SystemMessageVO(String title, Integer msgType, String content, String createTime, Integer num) {
    this(title, msgType, content, createTime, num, ByteString.EMPTY);
  }

  public SystemMessageVO(String title, Integer msgType, String content, String createTime, Integer num, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.title = title;
    this.msgType = msgType;
    this.content = content;
    this.createTime = createTime;
    this.num = num;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.title = title;
    builder.msgType = msgType;
    builder.content = content;
    builder.createTime = createTime;
    builder.num = num;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof SystemMessageVO)) return false;
    SystemMessageVO o = (SystemMessageVO) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(title, o.title)
        && Internal.equals(msgType, o.msgType)
        && Internal.equals(content, o.content)
        && Internal.equals(createTime, o.createTime)
        && Internal.equals(num, o.num);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (title != null ? title.hashCode() : 0);
      result = result * 37 + (msgType != null ? msgType.hashCode() : 0);
      result = result * 37 + (content != null ? content.hashCode() : 0);
      result = result * 37 + (createTime != null ? createTime.hashCode() : 0);
      result = result * 37 + (num != null ? num.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (title != null) builder.append(", title=").append(title);
    if (msgType != null) builder.append(", msgType=").append(msgType);
    if (content != null) builder.append(", content=").append(content);
    if (createTime != null) builder.append(", createTime=").append(createTime);
    if (num != null) builder.append(", num=").append(num);
    return builder.replace(0, 2, "SystemMessageVO{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<SystemMessageVO, Builder> {
    public String title;

    public Integer msgType;

    public String content;

    public String createTime;

    public Integer num;

    public Builder() {
    }

    /**
     * 标题
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * 消息类型
     */
    public Builder msgType(Integer msgType) {
      this.msgType = msgType;
      return this;
    }

    /**
     * 发送消息的内容
     */
    public Builder content(String content) {
      this.content = content;
      return this;
    }

    /**
     * 消息发送时间
     */
    public Builder createTime(String createTime) {
      this.createTime = createTime;
      return this;
    }

    /**
     * 未读消息数
     */
    public Builder num(Integer num) {
      this.num = num;
      return this;
    }

    @Override
    public SystemMessageVO build() {
      return new SystemMessageVO(title, msgType, content, createTime, num, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_SystemMessageVO extends ProtoAdapter<SystemMessageVO> {
    ProtoAdapter_SystemMessageVO() {
      super(FieldEncoding.LENGTH_DELIMITED, SystemMessageVO.class);
    }

    @Override
    public int encodedSize(SystemMessageVO value) {
      return (value.title != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.title) : 0)
          + (value.msgType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(4, value.msgType) : 0)
          + (value.content != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.content) : 0)
          + (value.createTime != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, value.createTime) : 0)
          + (value.num != null ? ProtoAdapter.UINT32.encodedSizeWithTag(8, value.num) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, SystemMessageVO value) throws IOException {
      if (value.title != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.title);
      if (value.msgType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 4, value.msgType);
      if (value.content != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.content);
      if (value.createTime != null) ProtoAdapter.STRING.encodeWithTag(writer, 7, value.createTime);
      if (value.num != null) ProtoAdapter.UINT32.encodeWithTag(writer, 8, value.num);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public SystemMessageVO decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.title(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.msgType(ProtoAdapter.UINT32.decode(reader)); break;
          case 6: builder.content(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.createTime(ProtoAdapter.STRING.decode(reader)); break;
          case 8: builder.num(ProtoAdapter.UINT32.decode(reader)); break;
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
    public SystemMessageVO redact(SystemMessageVO value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}