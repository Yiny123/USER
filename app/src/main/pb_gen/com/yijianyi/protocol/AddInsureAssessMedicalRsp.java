// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 759:1
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

/**
 * 	护士病史
 */
public final class AddInsureAssessMedicalRsp extends Message<AddInsureAssessMedicalRsp, AddInsureAssessMedicalRsp.Builder> {
  public static final ProtoAdapter<AddInsureAssessMedicalRsp> ADAPTER = new ProtoAdapter_AddInsureAssessMedicalRsp();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_INSURENO = "";

  public static final String DEFAULT_MEDICALLIST = "";

  /**
   * 订单唯一id
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String insureNO;

  /**
   * 病例信息
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String medicalList;

  public AddInsureAssessMedicalRsp(String insureNO, String medicalList) {
    this(insureNO, medicalList, ByteString.EMPTY);
  }

  public AddInsureAssessMedicalRsp(String insureNO, String medicalList, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.insureNO = insureNO;
    this.medicalList = medicalList;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.insureNO = insureNO;
    builder.medicalList = medicalList;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AddInsureAssessMedicalRsp)) return false;
    AddInsureAssessMedicalRsp o = (AddInsureAssessMedicalRsp) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(insureNO, o.insureNO)
        && Internal.equals(medicalList, o.medicalList);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (insureNO != null ? insureNO.hashCode() : 0);
      result = result * 37 + (medicalList != null ? medicalList.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (insureNO != null) builder.append(", insureNO=").append(insureNO);
    if (medicalList != null) builder.append(", medicalList=").append(medicalList);
    return builder.replace(0, 2, "AddInsureAssessMedicalRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<AddInsureAssessMedicalRsp, Builder> {
    public String insureNO;

    public String medicalList;

    public Builder() {
    }

    /**
     * 订单唯一id
     */
    public Builder insureNO(String insureNO) {
      this.insureNO = insureNO;
      return this;
    }

    /**
     * 病例信息
     */
    public Builder medicalList(String medicalList) {
      this.medicalList = medicalList;
      return this;
    }

    @Override
    public AddInsureAssessMedicalRsp build() {
      return new AddInsureAssessMedicalRsp(insureNO, medicalList, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_AddInsureAssessMedicalRsp extends ProtoAdapter<AddInsureAssessMedicalRsp> {
    ProtoAdapter_AddInsureAssessMedicalRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, AddInsureAssessMedicalRsp.class);
    }

    @Override
    public int encodedSize(AddInsureAssessMedicalRsp value) {
      return (value.insureNO != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.insureNO) : 0)
          + (value.medicalList != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.medicalList) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, AddInsureAssessMedicalRsp value) throws IOException {
      if (value.insureNO != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.insureNO);
      if (value.medicalList != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.medicalList);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public AddInsureAssessMedicalRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.insureNO(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.medicalList(ProtoAdapter.STRING.decode(reader)); break;
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
    public AddInsureAssessMedicalRsp redact(AddInsureAssessMedicalRsp value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
