// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: AppInterface.proto at 870:1
package com.yijianyi.protocol;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

/**
 * 获取订单详情
 */
public final class GetOrderInfoRsp extends Message<GetOrderInfoRsp, GetOrderInfoRsp.Builder> {
  public static final ProtoAdapter<GetOrderInfoRsp> ADAPTER = new ProtoAdapter_GetOrderInfoRsp();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_CONFIRMCOST = "";

  public static final Long DEFAULT_EXPIRE = 0L;

  public static final String DEFAULT_INSUREACCOUNT = "";

  public static final Integer DEFAULT_WORKTYPE = 0;

  public static final Integer DEFAULT_ISITEM = 0;

  public static final Boolean DEFAULT_ISFINISH = false;

  public static final Boolean DEFAULT_DUDAOCHARGECONFIG = false;

  public static final Boolean DEFAULT_NEEDREFUNDPREPAY = false;

  public static final Boolean DEFAULT_NEEDREFUNDEXTRA = false;

  public static final Boolean DEFAULT_CASHPAYFLAG = false;

  public static final String DEFAULT_SUBJOINFEESTR = "";

  public static final Long DEFAULT_SUBJOINNEWNUM = 0L;

  public static final String DEFAULT_ACCOMPANYFEE = "";

  public static final Integer DEFAULT_ISNUMBERPRC = 0;

  public static final Integer DEFAULT_ISNUMBERNIGHT = 0;

  public static final Long DEFAULT_NUMBERNIGHT = 0L;

  public static final Integer DEFAULT_RETURNTYPE = 0;

  public static final Long DEFAULT_RETURNFEE = 0L;

  public static final String DEFAULT_RETURNFEESTR = "";

  /**
   * 订单信息
   */
  @WireField(
      tag = 1,
      adapter = "com.yijianyi.protocol.OrderVO#ADAPTER"
  )
  public final OrderVO orderVo;

  /**
   * 订单所以套餐
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> priceName;

  /**
   * 每月套餐信息
   */
  @WireField(
      tag = 3,
      adapter = "com.yijianyi.protocol.SettlementVO#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<SettlementVO> orderItem;

  /**
   * 护士附加服务信息
   */
  @WireField(
      tag = 4,
      adapter = "com.yijianyi.protocol.OrderItemVO#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<OrderItemVO> insureItem;

  /**
   * 消费金额
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String confirmCost;

  /**
   * 剩余时间（毫秒），如果是小于0，则表示已过期
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long expire;

  /**
   * 长护险账户
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String insureAccount;

  /**
   * 护工服务类型 0-非护工，1-多陪 2-专陪
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer workType;

  /**
   * 是否存在附加项 0-不存在，1-存在
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer isItem;

  /**
   * 是否可以结束订单
   */
  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean isfinish;

  /**
   * 督导是否可以收款
   */
  @WireField(
      tag = 11,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean dudaoChargeConfig;

  /**
   * 订单已取消时，是否可以退预付款
   */
  @WireField(
      tag = 12,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean needRefundPrepay;

  /**
   * 订单已取消时，是否可以退门禁卡
   */
  @WireField(
      tag = 13,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean needRefundExtra;

  /**
   * 是否有现金支付
   */
  @WireField(
      tag = 14,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean cashPayFlag;

  /**
   * 附加项费用（陪人床）
   */
  @WireField(
      tag = 15,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String subjoinFeeStr;

  /**
   * 附加项数量（今日）（陪人床）
   */
  @WireField(
      tag = 16,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long subjoinNewNum;

  /**
   * 陪工费
   */
  @WireField(
      tag = 17,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String accompanyFee;

  /**
   * 是否显示陪人床 0-显示 1-不显示
   */
  @WireField(
      tag = 18,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer isNumberPRC;

  /**
   * 是否显示夜陪 0-显示 1-不显示
   */
  @WireField(
      tag = 19,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer isNumberNight;

  /**
   * 夜陪数量
   */
  @WireField(
      tag = 20,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long numberNight;

  /**
   * 退款方式 0-无默认 1-默认现金，可选两种退款 2-线上，只能线上
   */
  @WireField(
      tag = 21,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer returnType;

  /**
   * 取消能退的金额
   */
  @WireField(
      tag = 22,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long returnFee;

  /**
   * 取消能退的金额
   */
  @WireField(
      tag = 23,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String returnFeeStr;

  public GetOrderInfoRsp(OrderVO orderVo, List<String> priceName, List<SettlementVO> orderItem, List<OrderItemVO> insureItem, String confirmCost, Long expire, String insureAccount, Integer workType, Integer isItem, Boolean isfinish, Boolean dudaoChargeConfig, Boolean needRefundPrepay, Boolean needRefundExtra, Boolean cashPayFlag, String subjoinFeeStr, Long subjoinNewNum, String accompanyFee, Integer isNumberPRC, Integer isNumberNight, Long numberNight, Integer returnType, Long returnFee, String returnFeeStr) {
    this(orderVo, priceName, orderItem, insureItem, confirmCost, expire, insureAccount, workType, isItem, isfinish, dudaoChargeConfig, needRefundPrepay, needRefundExtra, cashPayFlag, subjoinFeeStr, subjoinNewNum, accompanyFee, isNumberPRC, isNumberNight, numberNight, returnType, returnFee, returnFeeStr, ByteString.EMPTY);
  }

  public GetOrderInfoRsp(OrderVO orderVo, List<String> priceName, List<SettlementVO> orderItem, List<OrderItemVO> insureItem, String confirmCost, Long expire, String insureAccount, Integer workType, Integer isItem, Boolean isfinish, Boolean dudaoChargeConfig, Boolean needRefundPrepay, Boolean needRefundExtra, Boolean cashPayFlag, String subjoinFeeStr, Long subjoinNewNum, String accompanyFee, Integer isNumberPRC, Integer isNumberNight, Long numberNight, Integer returnType, Long returnFee, String returnFeeStr, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.orderVo = orderVo;
    this.priceName = Internal.immutableCopyOf("priceName", priceName);
    this.orderItem = Internal.immutableCopyOf("orderItem", orderItem);
    this.insureItem = Internal.immutableCopyOf("insureItem", insureItem);
    this.confirmCost = confirmCost;
    this.expire = expire;
    this.insureAccount = insureAccount;
    this.workType = workType;
    this.isItem = isItem;
    this.isfinish = isfinish;
    this.dudaoChargeConfig = dudaoChargeConfig;
    this.needRefundPrepay = needRefundPrepay;
    this.needRefundExtra = needRefundExtra;
    this.cashPayFlag = cashPayFlag;
    this.subjoinFeeStr = subjoinFeeStr;
    this.subjoinNewNum = subjoinNewNum;
    this.accompanyFee = accompanyFee;
    this.isNumberPRC = isNumberPRC;
    this.isNumberNight = isNumberNight;
    this.numberNight = numberNight;
    this.returnType = returnType;
    this.returnFee = returnFee;
    this.returnFeeStr = returnFeeStr;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.orderVo = orderVo;
    builder.priceName = Internal.copyOf("priceName", priceName);
    builder.orderItem = Internal.copyOf("orderItem", orderItem);
    builder.insureItem = Internal.copyOf("insureItem", insureItem);
    builder.confirmCost = confirmCost;
    builder.expire = expire;
    builder.insureAccount = insureAccount;
    builder.workType = workType;
    builder.isItem = isItem;
    builder.isfinish = isfinish;
    builder.dudaoChargeConfig = dudaoChargeConfig;
    builder.needRefundPrepay = needRefundPrepay;
    builder.needRefundExtra = needRefundExtra;
    builder.cashPayFlag = cashPayFlag;
    builder.subjoinFeeStr = subjoinFeeStr;
    builder.subjoinNewNum = subjoinNewNum;
    builder.accompanyFee = accompanyFee;
    builder.isNumberPRC = isNumberPRC;
    builder.isNumberNight = isNumberNight;
    builder.numberNight = numberNight;
    builder.returnType = returnType;
    builder.returnFee = returnFee;
    builder.returnFeeStr = returnFeeStr;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetOrderInfoRsp)) return false;
    GetOrderInfoRsp o = (GetOrderInfoRsp) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(orderVo, o.orderVo)
        && priceName.equals(o.priceName)
        && orderItem.equals(o.orderItem)
        && insureItem.equals(o.insureItem)
        && Internal.equals(confirmCost, o.confirmCost)
        && Internal.equals(expire, o.expire)
        && Internal.equals(insureAccount, o.insureAccount)
        && Internal.equals(workType, o.workType)
        && Internal.equals(isItem, o.isItem)
        && Internal.equals(isfinish, o.isfinish)
        && Internal.equals(dudaoChargeConfig, o.dudaoChargeConfig)
        && Internal.equals(needRefundPrepay, o.needRefundPrepay)
        && Internal.equals(needRefundExtra, o.needRefundExtra)
        && Internal.equals(cashPayFlag, o.cashPayFlag)
        && Internal.equals(subjoinFeeStr, o.subjoinFeeStr)
        && Internal.equals(subjoinNewNum, o.subjoinNewNum)
        && Internal.equals(accompanyFee, o.accompanyFee)
        && Internal.equals(isNumberPRC, o.isNumberPRC)
        && Internal.equals(isNumberNight, o.isNumberNight)
        && Internal.equals(numberNight, o.numberNight)
        && Internal.equals(returnType, o.returnType)
        && Internal.equals(returnFee, o.returnFee)
        && Internal.equals(returnFeeStr, o.returnFeeStr);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (orderVo != null ? orderVo.hashCode() : 0);
      result = result * 37 + priceName.hashCode();
      result = result * 37 + orderItem.hashCode();
      result = result * 37 + insureItem.hashCode();
      result = result * 37 + (confirmCost != null ? confirmCost.hashCode() : 0);
      result = result * 37 + (expire != null ? expire.hashCode() : 0);
      result = result * 37 + (insureAccount != null ? insureAccount.hashCode() : 0);
      result = result * 37 + (workType != null ? workType.hashCode() : 0);
      result = result * 37 + (isItem != null ? isItem.hashCode() : 0);
      result = result * 37 + (isfinish != null ? isfinish.hashCode() : 0);
      result = result * 37 + (dudaoChargeConfig != null ? dudaoChargeConfig.hashCode() : 0);
      result = result * 37 + (needRefundPrepay != null ? needRefundPrepay.hashCode() : 0);
      result = result * 37 + (needRefundExtra != null ? needRefundExtra.hashCode() : 0);
      result = result * 37 + (cashPayFlag != null ? cashPayFlag.hashCode() : 0);
      result = result * 37 + (subjoinFeeStr != null ? subjoinFeeStr.hashCode() : 0);
      result = result * 37 + (subjoinNewNum != null ? subjoinNewNum.hashCode() : 0);
      result = result * 37 + (accompanyFee != null ? accompanyFee.hashCode() : 0);
      result = result * 37 + (isNumberPRC != null ? isNumberPRC.hashCode() : 0);
      result = result * 37 + (isNumberNight != null ? isNumberNight.hashCode() : 0);
      result = result * 37 + (numberNight != null ? numberNight.hashCode() : 0);
      result = result * 37 + (returnType != null ? returnType.hashCode() : 0);
      result = result * 37 + (returnFee != null ? returnFee.hashCode() : 0);
      result = result * 37 + (returnFeeStr != null ? returnFeeStr.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (orderVo != null) builder.append(", orderVo=").append(orderVo);
    if (!priceName.isEmpty()) builder.append(", priceName=").append(priceName);
    if (!orderItem.isEmpty()) builder.append(", orderItem=").append(orderItem);
    if (!insureItem.isEmpty()) builder.append(", insureItem=").append(insureItem);
    if (confirmCost != null) builder.append(", confirmCost=").append(confirmCost);
    if (expire != null) builder.append(", expire=").append(expire);
    if (insureAccount != null) builder.append(", insureAccount=").append(insureAccount);
    if (workType != null) builder.append(", workType=").append(workType);
    if (isItem != null) builder.append(", isItem=").append(isItem);
    if (isfinish != null) builder.append(", isfinish=").append(isfinish);
    if (dudaoChargeConfig != null) builder.append(", dudaoChargeConfig=").append(dudaoChargeConfig);
    if (needRefundPrepay != null) builder.append(", needRefundPrepay=").append(needRefundPrepay);
    if (needRefundExtra != null) builder.append(", needRefundExtra=").append(needRefundExtra);
    if (cashPayFlag != null) builder.append(", cashPayFlag=").append(cashPayFlag);
    if (subjoinFeeStr != null) builder.append(", subjoinFeeStr=").append(subjoinFeeStr);
    if (subjoinNewNum != null) builder.append(", subjoinNewNum=").append(subjoinNewNum);
    if (accompanyFee != null) builder.append(", accompanyFee=").append(accompanyFee);
    if (isNumberPRC != null) builder.append(", isNumberPRC=").append(isNumberPRC);
    if (isNumberNight != null) builder.append(", isNumberNight=").append(isNumberNight);
    if (numberNight != null) builder.append(", numberNight=").append(numberNight);
    if (returnType != null) builder.append(", returnType=").append(returnType);
    if (returnFee != null) builder.append(", returnFee=").append(returnFee);
    if (returnFeeStr != null) builder.append(", returnFeeStr=").append(returnFeeStr);
    return builder.replace(0, 2, "GetOrderInfoRsp{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetOrderInfoRsp, Builder> {
    public OrderVO orderVo;

    public List<String> priceName;

    public List<SettlementVO> orderItem;

    public List<OrderItemVO> insureItem;

    public String confirmCost;

    public Long expire;

    public String insureAccount;

    public Integer workType;

    public Integer isItem;

    public Boolean isfinish;

    public Boolean dudaoChargeConfig;

    public Boolean needRefundPrepay;

    public Boolean needRefundExtra;

    public Boolean cashPayFlag;

    public String subjoinFeeStr;

    public Long subjoinNewNum;

    public String accompanyFee;

    public Integer isNumberPRC;

    public Integer isNumberNight;

    public Long numberNight;

    public Integer returnType;

    public Long returnFee;

    public String returnFeeStr;

    public Builder() {
      priceName = Internal.newMutableList();
      orderItem = Internal.newMutableList();
      insureItem = Internal.newMutableList();
    }

    /**
     * 订单信息
     */
    public Builder orderVo(OrderVO orderVo) {
      this.orderVo = orderVo;
      return this;
    }

    /**
     * 订单所以套餐
     */
    public Builder priceName(List<String> priceName) {
      Internal.checkElementsNotNull(priceName);
      this.priceName = priceName;
      return this;
    }

    /**
     * 每月套餐信息
     */
    public Builder orderItem(List<SettlementVO> orderItem) {
      Internal.checkElementsNotNull(orderItem);
      this.orderItem = orderItem;
      return this;
    }

    /**
     * 护士附加服务信息
     */
    public Builder insureItem(List<OrderItemVO> insureItem) {
      Internal.checkElementsNotNull(insureItem);
      this.insureItem = insureItem;
      return this;
    }

    /**
     * 消费金额
     */
    public Builder confirmCost(String confirmCost) {
      this.confirmCost = confirmCost;
      return this;
    }

    /**
     * 剩余时间（毫秒），如果是小于0，则表示已过期
     */
    public Builder expire(Long expire) {
      this.expire = expire;
      return this;
    }

    /**
     * 长护险账户
     */
    public Builder insureAccount(String insureAccount) {
      this.insureAccount = insureAccount;
      return this;
    }

    /**
     * 护工服务类型 0-非护工，1-多陪 2-专陪
     */
    public Builder workType(Integer workType) {
      this.workType = workType;
      return this;
    }

    /**
     * 是否存在附加项 0-不存在，1-存在
     */
    public Builder isItem(Integer isItem) {
      this.isItem = isItem;
      return this;
    }

    /**
     * 是否可以结束订单
     */
    public Builder isfinish(Boolean isfinish) {
      this.isfinish = isfinish;
      return this;
    }

    /**
     * 督导是否可以收款
     */
    public Builder dudaoChargeConfig(Boolean dudaoChargeConfig) {
      this.dudaoChargeConfig = dudaoChargeConfig;
      return this;
    }

    /**
     * 订单已取消时，是否可以退预付款
     */
    public Builder needRefundPrepay(Boolean needRefundPrepay) {
      this.needRefundPrepay = needRefundPrepay;
      return this;
    }

    /**
     * 订单已取消时，是否可以退门禁卡
     */
    public Builder needRefundExtra(Boolean needRefundExtra) {
      this.needRefundExtra = needRefundExtra;
      return this;
    }

    /**
     * 是否有现金支付
     */
    public Builder cashPayFlag(Boolean cashPayFlag) {
      this.cashPayFlag = cashPayFlag;
      return this;
    }

    /**
     * 附加项费用（陪人床）
     */
    public Builder subjoinFeeStr(String subjoinFeeStr) {
      this.subjoinFeeStr = subjoinFeeStr;
      return this;
    }

    /**
     * 附加项数量（今日）（陪人床）
     */
    public Builder subjoinNewNum(Long subjoinNewNum) {
      this.subjoinNewNum = subjoinNewNum;
      return this;
    }

    /**
     * 陪工费
     */
    public Builder accompanyFee(String accompanyFee) {
      this.accompanyFee = accompanyFee;
      return this;
    }

    /**
     * 是否显示陪人床 0-显示 1-不显示
     */
    public Builder isNumberPRC(Integer isNumberPRC) {
      this.isNumberPRC = isNumberPRC;
      return this;
    }

    /**
     * 是否显示夜陪 0-显示 1-不显示
     */
    public Builder isNumberNight(Integer isNumberNight) {
      this.isNumberNight = isNumberNight;
      return this;
    }

    /**
     * 夜陪数量
     */
    public Builder numberNight(Long numberNight) {
      this.numberNight = numberNight;
      return this;
    }

    /**
     * 退款方式 0-无默认 1-默认现金，可选两种退款 2-线上，只能线上
     */
    public Builder returnType(Integer returnType) {
      this.returnType = returnType;
      return this;
    }

    /**
     * 取消能退的金额
     */
    public Builder returnFee(Long returnFee) {
      this.returnFee = returnFee;
      return this;
    }

    /**
     * 取消能退的金额
     */
    public Builder returnFeeStr(String returnFeeStr) {
      this.returnFeeStr = returnFeeStr;
      return this;
    }

    @Override
    public GetOrderInfoRsp build() {
      return new GetOrderInfoRsp(orderVo, priceName, orderItem, insureItem, confirmCost, expire, insureAccount, workType, isItem, isfinish, dudaoChargeConfig, needRefundPrepay, needRefundExtra, cashPayFlag, subjoinFeeStr, subjoinNewNum, accompanyFee, isNumberPRC, isNumberNight, numberNight, returnType, returnFee, returnFeeStr, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetOrderInfoRsp extends ProtoAdapter<GetOrderInfoRsp> {
    ProtoAdapter_GetOrderInfoRsp() {
      super(FieldEncoding.LENGTH_DELIMITED, GetOrderInfoRsp.class);
    }

    @Override
    public int encodedSize(GetOrderInfoRsp value) {
      return (value.orderVo != null ? OrderVO.ADAPTER.encodedSizeWithTag(1, value.orderVo) : 0)
          + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, value.priceName)
          + SettlementVO.ADAPTER.asRepeated().encodedSizeWithTag(3, value.orderItem)
          + OrderItemVO.ADAPTER.asRepeated().encodedSizeWithTag(4, value.insureItem)
          + (value.confirmCost != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, value.confirmCost) : 0)
          + (value.expire != null ? ProtoAdapter.INT64.encodedSizeWithTag(6, value.expire) : 0)
          + (value.insureAccount != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, value.insureAccount) : 0)
          + (value.workType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(8, value.workType) : 0)
          + (value.isItem != null ? ProtoAdapter.UINT32.encodedSizeWithTag(9, value.isItem) : 0)
          + (value.isfinish != null ? ProtoAdapter.BOOL.encodedSizeWithTag(10, value.isfinish) : 0)
          + (value.dudaoChargeConfig != null ? ProtoAdapter.BOOL.encodedSizeWithTag(11, value.dudaoChargeConfig) : 0)
          + (value.needRefundPrepay != null ? ProtoAdapter.BOOL.encodedSizeWithTag(12, value.needRefundPrepay) : 0)
          + (value.needRefundExtra != null ? ProtoAdapter.BOOL.encodedSizeWithTag(13, value.needRefundExtra) : 0)
          + (value.cashPayFlag != null ? ProtoAdapter.BOOL.encodedSizeWithTag(14, value.cashPayFlag) : 0)
          + (value.subjoinFeeStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(15, value.subjoinFeeStr) : 0)
          + (value.subjoinNewNum != null ? ProtoAdapter.INT64.encodedSizeWithTag(16, value.subjoinNewNum) : 0)
          + (value.accompanyFee != null ? ProtoAdapter.STRING.encodedSizeWithTag(17, value.accompanyFee) : 0)
          + (value.isNumberPRC != null ? ProtoAdapter.INT32.encodedSizeWithTag(18, value.isNumberPRC) : 0)
          + (value.isNumberNight != null ? ProtoAdapter.INT32.encodedSizeWithTag(19, value.isNumberNight) : 0)
          + (value.numberNight != null ? ProtoAdapter.UINT64.encodedSizeWithTag(20, value.numberNight) : 0)
          + (value.returnType != null ? ProtoAdapter.UINT32.encodedSizeWithTag(21, value.returnType) : 0)
          + (value.returnFee != null ? ProtoAdapter.INT64.encodedSizeWithTag(22, value.returnFee) : 0)
          + (value.returnFeeStr != null ? ProtoAdapter.STRING.encodedSizeWithTag(23, value.returnFeeStr) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetOrderInfoRsp value) throws IOException {
      if (value.orderVo != null) OrderVO.ADAPTER.encodeWithTag(writer, 1, value.orderVo);
      ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 2, value.priceName);
      SettlementVO.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.orderItem);
      OrderItemVO.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.insureItem);
      if (value.confirmCost != null) ProtoAdapter.STRING.encodeWithTag(writer, 5, value.confirmCost);
      if (value.expire != null) ProtoAdapter.INT64.encodeWithTag(writer, 6, value.expire);
      if (value.insureAccount != null) ProtoAdapter.STRING.encodeWithTag(writer, 7, value.insureAccount);
      if (value.workType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 8, value.workType);
      if (value.isItem != null) ProtoAdapter.UINT32.encodeWithTag(writer, 9, value.isItem);
      if (value.isfinish != null) ProtoAdapter.BOOL.encodeWithTag(writer, 10, value.isfinish);
      if (value.dudaoChargeConfig != null) ProtoAdapter.BOOL.encodeWithTag(writer, 11, value.dudaoChargeConfig);
      if (value.needRefundPrepay != null) ProtoAdapter.BOOL.encodeWithTag(writer, 12, value.needRefundPrepay);
      if (value.needRefundExtra != null) ProtoAdapter.BOOL.encodeWithTag(writer, 13, value.needRefundExtra);
      if (value.cashPayFlag != null) ProtoAdapter.BOOL.encodeWithTag(writer, 14, value.cashPayFlag);
      if (value.subjoinFeeStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 15, value.subjoinFeeStr);
      if (value.subjoinNewNum != null) ProtoAdapter.INT64.encodeWithTag(writer, 16, value.subjoinNewNum);
      if (value.accompanyFee != null) ProtoAdapter.STRING.encodeWithTag(writer, 17, value.accompanyFee);
      if (value.isNumberPRC != null) ProtoAdapter.INT32.encodeWithTag(writer, 18, value.isNumberPRC);
      if (value.isNumberNight != null) ProtoAdapter.INT32.encodeWithTag(writer, 19, value.isNumberNight);
      if (value.numberNight != null) ProtoAdapter.UINT64.encodeWithTag(writer, 20, value.numberNight);
      if (value.returnType != null) ProtoAdapter.UINT32.encodeWithTag(writer, 21, value.returnType);
      if (value.returnFee != null) ProtoAdapter.INT64.encodeWithTag(writer, 22, value.returnFee);
      if (value.returnFeeStr != null) ProtoAdapter.STRING.encodeWithTag(writer, 23, value.returnFeeStr);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetOrderInfoRsp decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.orderVo(OrderVO.ADAPTER.decode(reader)); break;
          case 2: builder.priceName.add(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.orderItem.add(SettlementVO.ADAPTER.decode(reader)); break;
          case 4: builder.insureItem.add(OrderItemVO.ADAPTER.decode(reader)); break;
          case 5: builder.confirmCost(ProtoAdapter.STRING.decode(reader)); break;
          case 6: builder.expire(ProtoAdapter.INT64.decode(reader)); break;
          case 7: builder.insureAccount(ProtoAdapter.STRING.decode(reader)); break;
          case 8: builder.workType(ProtoAdapter.UINT32.decode(reader)); break;
          case 9: builder.isItem(ProtoAdapter.UINT32.decode(reader)); break;
          case 10: builder.isfinish(ProtoAdapter.BOOL.decode(reader)); break;
          case 11: builder.dudaoChargeConfig(ProtoAdapter.BOOL.decode(reader)); break;
          case 12: builder.needRefundPrepay(ProtoAdapter.BOOL.decode(reader)); break;
          case 13: builder.needRefundExtra(ProtoAdapter.BOOL.decode(reader)); break;
          case 14: builder.cashPayFlag(ProtoAdapter.BOOL.decode(reader)); break;
          case 15: builder.subjoinFeeStr(ProtoAdapter.STRING.decode(reader)); break;
          case 16: builder.subjoinNewNum(ProtoAdapter.INT64.decode(reader)); break;
          case 17: builder.accompanyFee(ProtoAdapter.STRING.decode(reader)); break;
          case 18: builder.isNumberPRC(ProtoAdapter.INT32.decode(reader)); break;
          case 19: builder.isNumberNight(ProtoAdapter.INT32.decode(reader)); break;
          case 20: builder.numberNight(ProtoAdapter.UINT64.decode(reader)); break;
          case 21: builder.returnType(ProtoAdapter.UINT32.decode(reader)); break;
          case 22: builder.returnFee(ProtoAdapter.INT64.decode(reader)); break;
          case 23: builder.returnFeeStr(ProtoAdapter.STRING.decode(reader)); break;
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
    public GetOrderInfoRsp redact(GetOrderInfoRsp value) {
      Builder builder = value.newBuilder();
      if (builder.orderVo != null) builder.orderVo = OrderVO.ADAPTER.redact(builder.orderVo);
      Internal.redactElements(builder.orderItem, SettlementVO.ADAPTER);
      Internal.redactElements(builder.insureItem, OrderItemVO.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
