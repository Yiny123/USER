// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: Stat.proto at 40:1
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
import okio.ByteString;

public final class StatUserAction extends Message<StatUserAction, StatUserAction.Builder> {
  public static final ProtoAdapter<StatUserAction> ADAPTER = new ProtoAdapter_StatUserAction();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_SOURCESCENE = 0;

  public static final Integer DEFAULT_SCENE = 0;

  public static final String DEFAULT_SLOT = "";

  public static final Integer DEFAULT_ACTION = 0;

  public static final Long DEFAULT_USERID = 0L;

  public static final String DEFAULT_SCENEKEY = "";

  public static final String DEFAULT_EXTRADATA = "";

  public static final Long DEFAULT_TIME = 0L;

  public static final Long DEFAULT_PUSHID = 0L;

  public static final Integer DEFAULT_RESULT = 0;

  /**
   * 源场景 见enum SCENCE_PAGE
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer sourceScene;

  /**
   * 场景 见enum SCENCE_PAGE
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer scene;

  /**
   * 槽位号
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String slot;

  /**
   * 动作 见enum ACTION
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer action;

  /**
   * 用户ID 未登录 0
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long userId;

  /**
   * 当前页面主键  用户详情页为用户ID，帖子详情页为帖子ID，宠物详情页为宠物ID
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String sceneKey;

  /**
   * 额外数据
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String extraData;

  /**
   * 时间
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long time;

  /**
   * pushId
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long pushId;

  /**
   * 结果
   */
  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer result;

  public StatUserAction(Integer sourceScene, Integer scene, String slot, Integer action, Long userId, String sceneKey, String extraData, Long time, Long pushId, Integer result) {
    this(sourceScene, scene, slot, action, userId, sceneKey, extraData, time, pushId, result, ByteString.EMPTY);
  }

  public StatUserAction(Integer sourceScene, Integer scene, String slot, Integer action, Long userId, String sceneKey, String extraData, Long time, Long pushId, Integer result, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.sourceScene = sourceScene;
    this.scene = scene;
    this.slot = slot;
    this.action = action;
    this.userId = userId;
    this.sceneKey = sceneKey;
    this.extraData = extraData;
    this.time = time;
    this.pushId = pushId;
    this.result = result;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.sourceScene = sourceScene;
    builder.scene = scene;
    builder.slot = slot;
    builder.action = action;
    builder.userId = userId;
    builder.sceneKey = sceneKey;
    builder.extraData = extraData;
    builder.time = time;
    builder.pushId = pushId;
    builder.result = result;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof StatUserAction)) return false;
    StatUserAction o = (StatUserAction) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(sourceScene, o.sourceScene)
        && Internal.equals(scene, o.scene)
        && Internal.equals(slot, o.slot)
        && Internal.equals(action, o.action)
        && Internal.equals(userId, o.userId)
        && Internal.equals(sceneKey, o.sceneKey)
        && Internal.equals(extraData, o.extraData)
        && Internal.equals(time, o.time)
        && Internal.equals(pushId, o.pushId)
        && Internal.equals(result, o.result);
  }

  @Override
  public int hashCode() {
    int result_ = super.hashCode;
    if (result_ == 0) {
      result_ = unknownFields().hashCode();
      result_ = result_ * 37 + (sourceScene != null ? sourceScene.hashCode() : 0);
      result_ = result_ * 37 + (scene != null ? scene.hashCode() : 0);
      result_ = result_ * 37 + (slot != null ? slot.hashCode() : 0);
      result_ = result_ * 37 + (action != null ? action.hashCode() : 0);
      result_ = result_ * 37 + (userId != null ? userId.hashCode() : 0);
      result_ = result_ * 37 + (sceneKey != null ? sceneKey.hashCode() : 0);
      result_ = result_ * 37 + (extraData != null ? extraData.hashCode() : 0);
      result_ = result_ * 37 + (time != null ? time.hashCode() : 0);
      result_ = result_ * 37 + (pushId != null ? pushId.hashCode() : 0);
      result_ = result_ * 37 + (result != null ? result.hashCode() : 0);
      super.hashCode = result_;
    }
    return result_;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (sourceScene != null) builder.append(", sourceScene=").append(sourceScene);
    if (scene != null) builder.append(", scene=").append(scene);
    if (slot != null) builder.append(", slot=").append(slot);
    if (action != null) builder.append(", action=").append(action);
    if (userId != null) builder.append(", userId=").append(userId);
    if (sceneKey != null) builder.append(", sceneKey=").append(sceneKey);
    if (extraData != null) builder.append(", extraData=").append(extraData);
    if (time != null) builder.append(", time=").append(time);
    if (pushId != null) builder.append(", pushId=").append(pushId);
    if (result != null) builder.append(", result=").append(result);
    return builder.replace(0, 2, "StatUserAction{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<StatUserAction, Builder> {
    public Integer sourceScene;

    public Integer scene;

    public String slot;

    public Integer action;

    public Long userId;

    public String sceneKey;

    public String extraData;

    public Long time;

    public Long pushId;

    public Integer result;

    public Builder() {
    }

    /**
     * 源场景 见enum SCENCE_PAGE
     */
    public Builder sourceScene(Integer sourceScene) {
      this.sourceScene = sourceScene;
      return this;
    }

    /**
     * 场景 见enum SCENCE_PAGE
     */
    public Builder scene(Integer scene) {
      this.scene = scene;
      return this;
    }

    /**
     * 槽位号
     */
    public Builder slot(String slot) {
      this.slot = slot;
      return this;
    }

    /**
     * 动作 见enum ACTION
     */
    public Builder action(Integer action) {
      this.action = action;
      return this;
    }

    /**
     * 用户ID 未登录 0
     */
    public Builder userId(Long userId) {
      this.userId = userId;
      return this;
    }

    /**
     * 当前页面主键  用户详情页为用户ID，帖子详情页为帖子ID，宠物详情页为宠物ID
     */
    public Builder sceneKey(String sceneKey) {
      this.sceneKey = sceneKey;
      return this;
    }

    /**
     * 额外数据
     */
    public Builder extraData(String extraData) {
      this.extraData = extraData;
      return this;
    }

    /**
     * 时间
     */
    public Builder time(Long time) {
      this.time = time;
      return this;
    }

    /**
     * pushId
     */
    public Builder pushId(Long pushId) {
      this.pushId = pushId;
      return this;
    }

    /**
     * 结果
     */
    public Builder result(Integer result) {
      this.result = result;
      return this;
    }

    @Override
    public StatUserAction build() {
      return new StatUserAction(sourceScene, scene, slot, action, userId, sceneKey, extraData, time, pushId, result, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_StatUserAction extends ProtoAdapter<StatUserAction> {
    ProtoAdapter_StatUserAction() {
      super(FieldEncoding.LENGTH_DELIMITED, StatUserAction.class);
    }

    @Override
    public int encodedSize(StatUserAction value) {
      return (value.sourceScene != null ? ProtoAdapter.UINT32.encodedSizeWithTag(1, value.sourceScene) : 0)
          + (value.scene != null ? ProtoAdapter.UINT32.encodedSizeWithTag(2, value.scene) : 0)
          + (value.slot != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.slot) : 0)
          + (value.action != null ? ProtoAdapter.UINT32.encodedSizeWithTag(4, value.action) : 0)
          + (value.userId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(5, value.userId) : 0)
          + (value.sceneKey != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.sceneKey) : 0)
          + (value.extraData != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, value.extraData) : 0)
          + (value.time != null ? ProtoAdapter.UINT64.encodedSizeWithTag(8, value.time) : 0)
          + (value.pushId != null ? ProtoAdapter.UINT64.encodedSizeWithTag(9, value.pushId) : 0)
          + (value.result != null ? ProtoAdapter.UINT32.encodedSizeWithTag(10, value.result) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, StatUserAction value) throws IOException {
      if (value.sourceScene != null) ProtoAdapter.UINT32.encodeWithTag(writer, 1, value.sourceScene);
      if (value.scene != null) ProtoAdapter.UINT32.encodeWithTag(writer, 2, value.scene);
      if (value.slot != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.slot);
      if (value.action != null) ProtoAdapter.UINT32.encodeWithTag(writer, 4, value.action);
      if (value.userId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 5, value.userId);
      if (value.sceneKey != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.sceneKey);
      if (value.extraData != null) ProtoAdapter.STRING.encodeWithTag(writer, 7, value.extraData);
      if (value.time != null) ProtoAdapter.UINT64.encodeWithTag(writer, 8, value.time);
      if (value.pushId != null) ProtoAdapter.UINT64.encodeWithTag(writer, 9, value.pushId);
      if (value.result != null) ProtoAdapter.UINT32.encodeWithTag(writer, 10, value.result);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public StatUserAction decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.sourceScene(ProtoAdapter.UINT32.decode(reader)); break;
          case 2: builder.scene(ProtoAdapter.UINT32.decode(reader)); break;
          case 3: builder.slot(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.action(ProtoAdapter.UINT32.decode(reader)); break;
          case 5: builder.userId(ProtoAdapter.UINT64.decode(reader)); break;
          case 6: builder.sceneKey(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.extraData(ProtoAdapter.STRING.decode(reader)); break;
          case 8: builder.time(ProtoAdapter.UINT64.decode(reader)); break;
          case 9: builder.pushId(ProtoAdapter.UINT64.decode(reader)); break;
          case 10: builder.result(ProtoAdapter.UINT32.decode(reader)); break;
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
    public StatUserAction redact(StatUserAction value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}