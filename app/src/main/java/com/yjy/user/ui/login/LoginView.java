package com.yjy.user.ui.login;/**
 * Created by Administrator on 2018/4/4.
 */

import com.yijianyi.protocol.AppError;
import com.yijianyi.protocol.GetSettingRsp;
import com.yijianyi.protocol.LoginRsp;
import com.yjy.user.ui.BaseView;

/**
 * Created by liny on 2018/4/4. 20:18
 */
public interface LoginView extends BaseView {
    void setData(LoginRsp rsp);

    void getSmsCodeSuc();

    void getSetting(GetSettingRsp rsp);


}
