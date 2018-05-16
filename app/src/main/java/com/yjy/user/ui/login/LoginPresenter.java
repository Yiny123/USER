package com.yjy.user.ui.login;/**
 * Created by Administrator on 2018/4/4.
 */

import com.yijianyi.protocol.AppError;
import com.yijianyi.protocol.AppResponse;
import com.yijianyi.protocol.GetSettingRsp;
import com.yijianyi.protocol.LoginRsp;
import com.yjy.user.MainActivity;
import com.yjy.user.protocol.PbSubscriber;
import com.yjy.user.ui.BasePresenter;
import com.yjy.user.utils.ExceptionHandle;

import java.io.IOException;

import okio.ByteString;

/**
 * Created by liny on 2018/4/4. 20:19
 */
public class LoginPresenter extends BasePresenter<LoginView> {
    public void login(String phone, String code) {
        this.mUserEngine.login(phone, code, new PbSubscriber<AppResponse>() {
            @Override
            public void onComplete() {

            }

            @Override
            public void onBusiError(AppError err, String errMsg, ByteString paramByteString) {
                getView().onError(err, errMsg);

               /* try {
                    LoginRsp rsp = LoginRsp.ADAPTER.decode(paramByteString);

                    //回调数据
                    LoginPresenter.this.getView().setData(rsp);

                } catch (IOException e) {
                    e.printStackTrace();
                }*/
            }

            @Override
            public void onSuc(ByteString paramByteString) {
                try {
                    LoginRsp rsp = LoginRsp.ADAPTER.decode(paramByteString);

                    //回调数据
                    LoginPresenter.this.getView().setData(rsp);

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onNetError(ExceptionHandle.ResponeThrowable paramResponeThrowable) {

            }

        });
    }

    public void getSmsCode(String phone) {
        this.mUserEngine.getSmsCode(phone, new PbSubscriber<AppResponse>() {
            @Override
            public void onBusiError(AppError err, String errMsg, ByteString paramByteString) {
                //获取短信
                getView().onError(err, errMsg);


            }

            @Override
            public void onSuc(ByteString paramByteString) {
                getView().getSmsCodeSuc();

            }

            @Override
            public void onNetError(ExceptionHandle.ResponeThrowable paramResponeThrowable) {

            }

            @Override
            public void onComplete() {

            }
        });
    }

    public void getSetting() {
        mUserEngine.getSetting(new PbSubscriber<AppResponse>() {
            @Override
            public void onBusiError(AppError err, String errMsg, ByteString paramByteString) {
                MainActivity view = (MainActivity) getView();
//                view.stopLoading();
                view.onError(err, errMsg);
            }

            @Override
            public void onSuc(ByteString paramByteString) {
                MainActivity view = (MainActivity) getView();
//                view.stopLoading();
                try {
                    GetSettingRsp rsp = GetSettingRsp.ADAPTER.decode(paramByteString);
                    getView().getSetting(rsp);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onNetError(ExceptionHandle.ResponeThrowable paramResponeThrowable) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
