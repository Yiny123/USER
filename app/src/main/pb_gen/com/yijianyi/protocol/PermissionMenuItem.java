// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: SaasModel.proto at 691:1
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
import okio.ByteString;

public final class PermissionMenuItem extends Message<PermissionMenuItem, PermissionMenuItem.Builder> {
  public static final ProtoAdapter<PermissionMenuItem> ADAPTER = new ProtoAdapter_PermissionMenuItem();

  private static final long serialVersionUID = 0L;

  public static final PermissionMenuType DEFAULT_MENUTYPE = PermissionMenuType.DictMgr;

  public static final String DEFAULT_NAME = "";

  public static final String DEFAULT_URL = "";

  /**
   * 菜单类型
   */
  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.PermissionMenuType#ADAPTER"
  )
  public final PermissionMenuType menuType;

  /**
   * 菜单名
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String name;

  /**
   * 菜单列表
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String url;

  public PermissionMenuItem(PermissionMenuType menuType, String name, String url) {
    this(menuType, name, url, ByteString.EMPTY);
  }

  public PermissionMenuItem(PermissionMenuType menuType, String name, String url, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.menuType = menuType;
    this.name = name;
    this.url = url;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.menuType = menuType;
    builder.name = name;
    builder.url = url;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof PermissionMenuItem)) return false;
    PermissionMenuItem o = (PermissionMenuItem) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(menuType, o.menuType)
        && Internal.equals(name, o.name)
        && Internal.equals(url, o.url);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (menuType != null ? menuType.hashCode() : 0);
      result = result * 37 + (name != null ? name.hashCode() : 0);
      result = result * 37 + (url != null ? url.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (menuType != null) builder.append(", menuType=").append(menuType);
    if (name != null) builder.append(", name=").append(name);
    if (url != null) builder.append(", url=").append(url);
    return builder.replace(0, 2, "PermissionMenuItem{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<PermissionMenuItem, Builder> {
    public PermissionMenuType menuType;

    public String name;

    public String url;

    public Builder() {
    }

    /**
     * 菜单类型
     */
    public Builder menuType(PermissionMenuType menuType) {
      this.menuType = menuType;
      return this;
    }

    /**
     * 菜单名
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * 菜单列表
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    @Override
    public PermissionMenuItem build() {
      return new PermissionMenuItem(menuType, name, url, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_PermissionMenuItem extends ProtoAdapter<PermissionMenuItem> {
    ProtoAdapter_PermissionMenuItem() {
      super(FieldEncoding.LENGTH_DELIMITED, PermissionMenuItem.class);
    }

    @Override
    public int encodedSize(PermissionMenuItem value) {
      return (value.menuType != null ? PermissionMenuType.ADAPTER.encodedSizeWithTag(1, value.menuType) : 0)
          + (value.name != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.name) : 0)
          + (value.url != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.url) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, PermissionMenuItem value) throws IOException {
      if (value.menuType != null) PermissionMenuType.ADAPTER.encodeWithTag(writer, 1, value.menuType);
      if (value.name != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.name);
      if (value.url != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.url);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public PermissionMenuItem decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: {
            try {
              builder.menuType(PermissionMenuType.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 2: builder.name(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.url(ProtoAdapter.STRING.decode(reader)); break;
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
    public PermissionMenuItem redact(PermissionMenuItem value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}