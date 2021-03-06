// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: Comm.proto at 27:1
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

public final class Terminal extends Message<Terminal, Terminal.Builder> {
  public static final ProtoAdapter<Terminal> ADAPTER = new ProtoAdapter_Terminal();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_IMEI = "";

  public static final String DEFAULT_IMEI2 = "";

  public static final String DEFAULT_MAC = "";

  public static final String DEFAULT_IMSI = "";

  public static final String DEFAULT_IMSI2 = "";

  public static final String DEFAULT_ANDROIDID = "";

  public static final String DEFAULT_ADID = "";

  public static final String DEFAULT_CHANNELID = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String IMEI;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String IMEI2;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String MAC;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String IMSI;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String IMSI2;

  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String ANDROIDID;

  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String ADID;

  /**
   * 标识平台， "android"-安卓设备，"apple"-苹果设备
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String CHANNELID;

  public Terminal(String IMEI, String IMEI2, String MAC, String IMSI, String IMSI2, String ANDROIDID, String ADID, String CHANNELID) {
    this(IMEI, IMEI2, MAC, IMSI, IMSI2, ANDROIDID, ADID, CHANNELID, ByteString.EMPTY);
  }

  public Terminal(String IMEI, String IMEI2, String MAC, String IMSI, String IMSI2, String ANDROIDID, String ADID, String CHANNELID, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.IMEI = IMEI;
    this.IMEI2 = IMEI2;
    this.MAC = MAC;
    this.IMSI = IMSI;
    this.IMSI2 = IMSI2;
    this.ANDROIDID = ANDROIDID;
    this.ADID = ADID;
    this.CHANNELID = CHANNELID;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.IMEI = IMEI;
    builder.IMEI2 = IMEI2;
    builder.MAC = MAC;
    builder.IMSI = IMSI;
    builder.IMSI2 = IMSI2;
    builder.ANDROIDID = ANDROIDID;
    builder.ADID = ADID;
    builder.CHANNELID = CHANNELID;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Terminal)) return false;
    Terminal o = (Terminal) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(IMEI, o.IMEI)
        && Internal.equals(IMEI2, o.IMEI2)
        && Internal.equals(MAC, o.MAC)
        && Internal.equals(IMSI, o.IMSI)
        && Internal.equals(IMSI2, o.IMSI2)
        && Internal.equals(ANDROIDID, o.ANDROIDID)
        && Internal.equals(ADID, o.ADID)
        && Internal.equals(CHANNELID, o.CHANNELID);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (IMEI != null ? IMEI.hashCode() : 0);
      result = result * 37 + (IMEI2 != null ? IMEI2.hashCode() : 0);
      result = result * 37 + (MAC != null ? MAC.hashCode() : 0);
      result = result * 37 + (IMSI != null ? IMSI.hashCode() : 0);
      result = result * 37 + (IMSI2 != null ? IMSI2.hashCode() : 0);
      result = result * 37 + (ANDROIDID != null ? ANDROIDID.hashCode() : 0);
      result = result * 37 + (ADID != null ? ADID.hashCode() : 0);
      result = result * 37 + (CHANNELID != null ? CHANNELID.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (IMEI != null) builder.append(", IMEI=").append(IMEI);
    if (IMEI2 != null) builder.append(", IMEI2=").append(IMEI2);
    if (MAC != null) builder.append(", MAC=").append(MAC);
    if (IMSI != null) builder.append(", IMSI=").append(IMSI);
    if (IMSI2 != null) builder.append(", IMSI2=").append(IMSI2);
    if (ANDROIDID != null) builder.append(", ANDROIDID=").append(ANDROIDID);
    if (ADID != null) builder.append(", ADID=").append(ADID);
    if (CHANNELID != null) builder.append(", CHANNELID=").append(CHANNELID);
    return builder.replace(0, 2, "Terminal{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Terminal, Builder> {
    public String IMEI;

    public String IMEI2;

    public String MAC;

    public String IMSI;

    public String IMSI2;

    public String ANDROIDID;

    public String ADID;

    public String CHANNELID;

    public Builder() {
    }

    public Builder IMEI(String IMEI) {
      this.IMEI = IMEI;
      return this;
    }

    public Builder IMEI2(String IMEI2) {
      this.IMEI2 = IMEI2;
      return this;
    }

    public Builder MAC(String MAC) {
      this.MAC = MAC;
      return this;
    }

    public Builder IMSI(String IMSI) {
      this.IMSI = IMSI;
      return this;
    }

    public Builder IMSI2(String IMSI2) {
      this.IMSI2 = IMSI2;
      return this;
    }

    public Builder ANDROIDID(String ANDROIDID) {
      this.ANDROIDID = ANDROIDID;
      return this;
    }

    public Builder ADID(String ADID) {
      this.ADID = ADID;
      return this;
    }

    /**
     * 标识平台， "android"-安卓设备，"apple"-苹果设备
     */
    public Builder CHANNELID(String CHANNELID) {
      this.CHANNELID = CHANNELID;
      return this;
    }

    @Override
    public Terminal build() {
      return new Terminal(IMEI, IMEI2, MAC, IMSI, IMSI2, ANDROIDID, ADID, CHANNELID, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_Terminal extends ProtoAdapter<Terminal> {
    ProtoAdapter_Terminal() {
      super(FieldEncoding.LENGTH_DELIMITED, Terminal.class);
    }

    @Override
    public int encodedSize(Terminal value) {
      return (value.IMEI != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.IMEI) : 0)
          + (value.IMEI2 != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.IMEI2) : 0)
          + (value.MAC != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.MAC) : 0)
          + (value.IMSI != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.IMSI) : 0)
          + (value.IMSI2 != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, value.IMSI2) : 0)
          + (value.ANDROIDID != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.ANDROIDID) : 0)
          + (value.ADID != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, value.ADID) : 0)
          + (value.CHANNELID != null ? ProtoAdapter.STRING.encodedSizeWithTag(8, value.CHANNELID) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, Terminal value) throws IOException {
      if (value.IMEI != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.IMEI);
      if (value.IMEI2 != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.IMEI2);
      if (value.MAC != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.MAC);
      if (value.IMSI != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.IMSI);
      if (value.IMSI2 != null) ProtoAdapter.STRING.encodeWithTag(writer, 5, value.IMSI2);
      if (value.ANDROIDID != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.ANDROIDID);
      if (value.ADID != null) ProtoAdapter.STRING.encodeWithTag(writer, 7, value.ADID);
      if (value.CHANNELID != null) ProtoAdapter.STRING.encodeWithTag(writer, 8, value.CHANNELID);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public Terminal decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.IMEI(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.IMEI2(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.MAC(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.IMSI(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.IMSI2(ProtoAdapter.STRING.decode(reader)); break;
          case 6: builder.ANDROIDID(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.ADID(ProtoAdapter.STRING.decode(reader)); break;
          case 8: builder.CHANNELID(ProtoAdapter.STRING.decode(reader)); break;
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
    public Terminal redact(Terminal value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
