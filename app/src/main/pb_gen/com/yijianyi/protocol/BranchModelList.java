// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: SaasModel.proto at 658:1
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
import java.util.List;
import okio.ByteString;

public final class BranchModelList extends Message<BranchModelList, BranchModelList.Builder> {
  public static final ProtoAdapter<BranchModelList> ADAPTER = new ProtoAdapter_BranchModelList();

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 2,
      adapter = "com.yijianyi.protocol.BranchModel#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<BranchModel> branchList;

  public BranchModelList(List<BranchModel> branchList) {
    this(branchList, ByteString.EMPTY);
  }

  public BranchModelList(List<BranchModel> branchList, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.branchList = Internal.immutableCopyOf("branchList", branchList);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.branchList = Internal.copyOf("branchList", branchList);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof BranchModelList)) return false;
    BranchModelList o = (BranchModelList) other;
    return unknownFields().equals(o.unknownFields())
        && branchList.equals(o.branchList);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + branchList.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (!branchList.isEmpty()) builder.append(", branchList=").append(branchList);
    return builder.replace(0, 2, "BranchModelList{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<BranchModelList, Builder> {
    public List<BranchModel> branchList;

    public Builder() {
      branchList = Internal.newMutableList();
    }

    public Builder branchList(List<BranchModel> branchList) {
      Internal.checkElementsNotNull(branchList);
      this.branchList = branchList;
      return this;
    }

    @Override
    public BranchModelList build() {
      return new BranchModelList(branchList, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_BranchModelList extends ProtoAdapter<BranchModelList> {
    ProtoAdapter_BranchModelList() {
      super(FieldEncoding.LENGTH_DELIMITED, BranchModelList.class);
    }

    @Override
    public int encodedSize(BranchModelList value) {
      return BranchModel.ADAPTER.asRepeated().encodedSizeWithTag(2, value.branchList)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, BranchModelList value) throws IOException {
      BranchModel.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.branchList);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public BranchModelList decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 2: builder.branchList.add(BranchModel.ADAPTER.decode(reader)); break;
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
    public BranchModelList redact(BranchModelList value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.branchList, BranchModel.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
