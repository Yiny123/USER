// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 1458:1
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

/**
 * 校正服务
 */
public final class CreateOrUpdateOrderItemPriceRsp extends Message<CreateOrUpdateOrderItemPriceRsp, CreateOrUpdateOrderItemPriceRsp.Builder> {
  public static final ProtoAdapter<CreateOrUpdateOrderItemPriceRsp> ADAPTER = new ProtoAdapter_CreateOrUpdateOrderItemPriceRsp();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_ISUPDATENIGHT = 0;

  /**
   * 是否变更夜陪服务 0-未变更 1-已变更
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer isUpdateNight;

  public CreateOrUpdateOrderItemPriceRsp(Integer isUpdateNight) {
    this(isUpdateNight, ByteString.EMPTY);
  }

  public CreateOrUpdateOrderItemPriceRsp(Integer isUpdateNight, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.isUpdateNight = isUpdateNight;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.isUpdateNight = isUpdateNight;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof CreateOrUpdateOrderItemPriceRsp)) return false;
    CreateOrUpdateOrderItemPriceRsp o = (CreateOrUpdateOrderItemPriceRsp) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(isUpdateNight, o.isUpdateNight);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (isUpdateNight != null ? isUpdateNight.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (isUpdateNight != null) builder.append(", isUpdateNight=").append(isUpdateNight);
    return builder.replace(0, 2, "CreateOrUpdateOrderItemPriceRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<CreateOrUpdateOrderItemPriceRsp, Builder> {
    public Integer isUpdateNight;

    public Builder() {
    }

    /**
     * 是否变更夜陪服务 0-未变更 1-已变更
     */
    public Builder isUpdateNight(Integer isUpdateNight) {
      this.isUpdateNight = isUpdateNight;
      return this;
    }

    @Override
    public CreateOrUpdateOrderItemPriceRsp build() {
      return new CreateOrUpdateOrderItemPriceRsp(isUpdateNight, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_CreateOrUpdateOrderItemPriceRsp extends ProtoAdapter<CreateOrUpdateOrderItemPriceRsp> {
    ProtoAdapter_CreateOrUpdateOrderItemPriceRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, CreateOrUpdateOrderItemPriceRsp.class);
    }

    @Override
    public int encodedSize(CreateOrUpdateOrderItemPriceRsp value) {
      return (value.isUpdateNight != null ? ProtoAdapter.UINT32.encodedSizeWithTag(1, value.isUpdateNight) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, CreateOrUpdateOrderItemPriceRsp value) throws IOException {
      if (value.isUpdateNight != null) ProtoAdapter.UINT32.encodeWithTag(writer, 1, value.isUpdateNight);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public CreateOrUpdateOrderItemPriceRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.isUpdateNight(ProtoAdapter.UINT32.decode(reader)); break;
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
    public CreateOrUpdateOrderItemPriceRsp redact(CreateOrUpdateOrderItemPriceRsp value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
