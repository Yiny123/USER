package com.yjy.user;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.yijianyi.protocol.AppError;
import com.yijianyi.protocol.GetSettingRsp;
import com.yijianyi.protocol.IndexServiceItem;
import com.yijianyi.protocol.LoginRsp;
import com.yjy.user.annotation.LayoutResource;
import com.yjy.user.app.AccountManager;
import com.yjy.user.ui.BaseActivity;
import com.yjy.user.ui.LoginActivity;
import com.yjy.user.ui.login.LoginPresenter;
import com.yjy.user.ui.login.LoginView;
import com.yjy.user.utils.ULog;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

@LayoutResource(R.layout.activity_main)
public class MainActivity extends BaseActivity<LoginView, LoginPresenter> implements LoginView {
    private final String TAG = this.getClass().getSimpleName();
    @BindView(R.id.get_code)
    Button mGetCode;
    @BindView(R.id.tv_to_login)
    TextView mTvToLogin;

    @NonNull
    @Override
    public LoginPresenter createPresenter() {
        return new LoginPresenter();
    }

    @OnClick({R.id.tv_to_login, R.id.get_code})
    public void onClick(View view) {
        if (view.getId() == R.id.tv_to_login) {
            startActivity(new Intent(this, LoginActivity.class));
        } else if (view.getId() == R.id.get_code) {
            AccountManager.getInstance().setSid("");
        }
    }

    @Override
    public void setData(LoginRsp rsp) {
        ULog.d(TAG, rsp.toString());
        Toast.makeText(mContext, rsp.toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void getSmsCodeSuc() {
        ULog.d(TAG, "getSmsCodeSuc: ");
        Toast.makeText(mContext, "获取短信成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void getSetting(GetSettingRsp rsp) {
        stopLoading();
        List<IndexServiceItem> items = rsp.items;
        ULog.d(TAG, "getSetting: %s" + items);

    }

    @Override
    public void onError(AppError err, String errMsg) {
        stopLoading();
        showLoadingError();

    }

    @Override
    protected void reloadData() {
        showLoading();
        getPresenter().getSetting();

    }


    @Override
    protected void initView(View view) {
        showLoading();
        getPresenter().getSetting();
        toolbar.setTitle("首页");
    }
}

