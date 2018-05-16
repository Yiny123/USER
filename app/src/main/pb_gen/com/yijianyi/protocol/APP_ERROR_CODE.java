// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: Err.proto at 7:1
package com.yijianyi.protocol;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import java.lang.Override;

/**
 * 注意：1024以下的错误码供约定俗成或者框架错误使用，业务从1025开始定义错误码
 */
public enum APP_ERROR_CODE implements WireEnum {
  /**
   * 成功
   */
  AEC_SUCCESS(0),

  /**
   * 请求失败
   */
  AEC_FAULT(-1),

  /**
   * 未登录或者登录失效
   */
  AEC_UNLOGIN(1),

  /**
   * 解密失败
   */
  AEC_DECRYPTION_FAULT(2),

  /**
   * HTTP包文Decode 失败
   */
  AEC_PACKAGE_FAULT(3),

  /**
   * Command不存在
   */
  AEC_COMMAND_NOT_EXIST(4),

  /**
   * 按照指定的command解码失败
   */
  AEC_DECODE_FAULT(5),

  /**
   * 命令超时
   */
  AEC_COMMAND_TIME_OUT(6),

  /**
   * 服务端处理异常
   */
  AEC_SYSTEM_FAULT(7),

  /**
   * 请求参数错误
   */
  AEC_PARAM_ERR(8),

  /**
   * 融云Token获取异常
   */
  AEC_IM_GET_TOKEN_ERR(9),

  /**
   * 手机号为空
   */
  AEC_PHONE_BLANK(1100),

  /**
   * 短信发送异常
   */
  AEC_SMS_SEND_ERR(1101),

  /**
   * 短信发送频繁
   */
  AEC_SMS_SEND_FREQUENT(1102),

  /**
   * 用户不存在
   */
  AEC_USER_NOT_EXIST(1103),

  /**
   * 登录失败
   */
  AEC_LOGIN_VERIFY_FAIL(1104),

  /**
   * 手机号码不正确
   */
  AEC_PHONE_ERR(1105),

  /**
   * 用户资料不完善
   */
  AEC_PROFILE_NOT_COMPLETE(1106),

  /**
   * 验证码错误
   */
  AEC_CODE_ERR(1107),

  /**
   * 验证码过期
   */
  AEC_CODE_EXPIRE(1116),

  /**
   * 第三方用户添加失败
   */
  AEC_THIRD_USER_ADD_FAIL(1109),

  /**
   * 用户添加失败
   */
  AEC_USER_ADD_FAIL(1110),

  /**
   * 第三方登录账户验证不通过
   */
  AEC_THIRD_VERIFY_FAIL(1111),

  /**
   * 用户被冻结
   */
  AEC_USER_FROZEN(1112),

  /**
   * 二维码过期
   */
  AEC_QRC_EXPIRE(1113);

  public static final ProtoAdapter<APP_ERROR_CODE> ADAPTER = ProtoAdapter.newEnumAdapter(APP_ERROR_CODE.class);

  private final int value;

  APP_ERROR_CODE(int value) {
    this.value = value;
  }

  /**
   * Return the constant for {@code value} or null.
   */
  public static APP_ERROR_CODE fromValue(int value) {
    switch (value) {
      case 0: return AEC_SUCCESS;
      case -1: return AEC_FAULT;
      case 1: return AEC_UNLOGIN;
      case 2: return AEC_DECRYPTION_FAULT;
      case 3: return AEC_PACKAGE_FAULT;
      case 4: return AEC_COMMAND_NOT_EXIST;
      case 5: return AEC_DECODE_FAULT;
      case 6: return AEC_COMMAND_TIME_OUT;
      case 7: return AEC_SYSTEM_FAULT;
      case 8: return AEC_PARAM_ERR;
      case 9: return AEC_IM_GET_TOKEN_ERR;
      case 1100: return AEC_PHONE_BLANK;
      case 1101: return AEC_SMS_SEND_ERR;
      case 1102: return AEC_SMS_SEND_FREQUENT;
      case 1103: return AEC_USER_NOT_EXIST;
      case 1104: return AEC_LOGIN_VERIFY_FAIL;
      case 1105: return AEC_PHONE_ERR;
      case 1106: return AEC_PROFILE_NOT_COMPLETE;
      case 1107: return AEC_CODE_ERR;
      case 1116: return AEC_CODE_EXPIRE;
      case 1109: return AEC_THIRD_USER_ADD_FAIL;
      case 1110: return AEC_USER_ADD_FAIL;
      case 1111: return AEC_THIRD_VERIFY_FAIL;
      case 1112: return AEC_USER_FROZEN;
      case 1113: return AEC_QRC_EXPIRE;
      default: return null;
    }
  }

  @Override
  public int getValue() {
    return value;
  }
}