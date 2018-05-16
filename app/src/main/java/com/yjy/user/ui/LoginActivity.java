package com.yjy.user.ui;

import android.os.Handler;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.dd.CircularProgressButton;
import com.rengwuxian.materialedittext.MaterialEditText;
import com.yijianyi.protocol.AppError;
import com.yijianyi.protocol.GetSettingRsp;
import com.yijianyi.protocol.LoginRsp;
import com.yjy.user.MainActivity;
import com.yjy.user.R;
import com.yjy.user.annotation.LayoutResource;
import com.yjy.user.ui.login.LoginPresenter;
import com.yjy.user.ui.login.LoginView;
import com.yjy.user.ui.wedget.TimeButton;
import com.yjy.user.utils.ULog;

import butterknife.BindView;
import butterknife.OnClick;

@LayoutResource(R.layout.activity_login)
public class LoginActivity extends BaseActivity<LoginView, LoginPresenter> implements LoginView {

    private final String TAG = this.getClass().getSimpleName();
    @BindView(R.id.medt_phone)
    MaterialEditText mMedtPhone;
    @BindView(R.id.medt_code)
    MaterialEditText mMedtCode;
    @BindView(R.id.time_btn)
    TimeButton mTimeBtn;
    @BindView(R.id.cpb_login)
    CircularProgressButton mCpbLogin;

    @NonNull
    @Override
    public LoginPresenter createPresenter() {
        return new LoginPresenter();
    }

    @Override
    public void setData(LoginRsp rsp) {
        ULog.d(TAG, rsp.toString());
//        Toast.makeText(mContext, rsp.toString(), Toast.LENGTH_SHORT).show();
        mCpbLogin.setProgress(100);
        startActivityFinish(MainActivity.class);
    }

    @Override
    public void getSmsCodeSuc() {
        ULog.d(TAG, "getSmsCodeSuc: ");
        Toast.makeText(mContext, "获取短信成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void getSetting(GetSettingRsp rsp) {
        ULog.d(TAG, "getSetting: " + rsp.toString());

    }

    @OnClick({R.id.cpb_login})
    public void onClick(View view) {
        //登陆
        String code = mMedtCode.getText().toString().trim();
        String phone = "13829044815";
        if (!TextUtils.isEmpty(code)) {
            mCpbLogin.setProgress(50);
            LoginActivity.this.getPresenter().login(phone, code);
        }
    }

    @Override
    public void onError(AppError err, String errMsg) {
        toast(errMsg);
        mCpbLogin.setProgress(-1);
        mCpbLogin.setErrorText(errMsg);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mCpbLogin.setProgress(0);
            }
        }, 1000);//在失败时。隔两秒钟自动回到默认状态
    }


    @Override
    protected void initView(View view) {
        toolbar.setTitle("登录");
        mCpbLogin.setCompleteText("成功");
        //设置校验规则
        //        mMedtPhone.validateWith(new RegexpValidator("手机号错误", "\\d+"));


    }
}
