// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: Lbs.proto at 29:1
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

public final class LbsWifiMac extends Message<LbsWifiMac, LbsWifiMac.Builder> {
  public static final ProtoAdapter<LbsWifiMac> ADAPTER = new ProtoAdapter_LbsWifiMac();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_MAC = "";

  public static final Integer DEFAULT_RSSI = 0;

  /**
   * mac wifi接入点的mac地址
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String mac;

  /**
   * rssi	信号强度（dBm）
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer rssi;

  public LbsWifiMac(String mac, Integer rssi) {
    this(mac, rssi, ByteString.EMPTY);
  }

  public LbsWifiMac(String mac, Integer rssi, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.mac = mac;
    this.rssi = rssi;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.mac = mac;
    builder.rssi = rssi;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof LbsWifiMac)) return false;
    LbsWifiMac o = (LbsWifiMac) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(mac, o.mac)
        && Internal.equals(rssi, o.rssi);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (mac != null ? mac.hashCode() : 0);
      result = result * 37 + (rssi != null ? rssi.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (mac != null) builder.append(", mac=").append(mac);
    if (rssi != null) builder.append(", rssi=").append(rssi);
    return builder.replace(0, 2, "LbsWifiMac{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<LbsWifiMac, Builder> {
    public String mac;

    public Integer rssi;

    public Builder() {
    }

    /**
     * mac wifi接入点的mac地址
     */
    public Builder mac(String mac) {
      this.mac = mac;
      return this;
    }

    /**
     * rssi	信号强度（dBm）
     */
    public Builder rssi(Integer rssi) {
      this.rssi = rssi;
      return this;
    }

    @Override
    public LbsWifiMac build() {
      return new LbsWifiMac(mac, rssi, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_LbsWifiMac extends ProtoAdapter<LbsWifiMac> {
    ProtoAdapter_LbsWifiMac() {
      super(FieldEncoding.LENGTH_DELIMITED, LbsWifiMac.class);
    }

    @Override
    public int encodedSize(LbsWifiMac value) {
      return (value.mac != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.mac) : 0)
          + (value.rssi != null ? ProtoAdapter.UINT32.encodedSizeWithTag(2, value.rssi) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, LbsWifiMac value) throws IOException {
      if (value.mac != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.mac);
      if (value.rssi != null) ProtoAdapter.UINT32.encodeWithTag(writer, 2, value.rssi);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public LbsWifiMac decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.mac(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.rssi(ProtoAdapter.UINT32.decode(reader)); break;
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
    public LbsWifiMac redact(LbsWifiMac value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
