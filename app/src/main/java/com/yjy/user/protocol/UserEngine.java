package com.yjy.user.protocol;/**
 * Created by Administrator on 2017/10/31.
 */

import com.yijianyi.protocol.APP_COMMAND;
import com.yijianyi.protocol.AppResponse;
import com.yijianyi.protocol.GetSettingReq;
import com.yijianyi.protocol.GetVerifyCodeReq;
import com.yijianyi.protocol.LoginReq;
import com.yijianyi.protocol.RequestItem;
import com.yijianyi.protocol.Source;
import com.yjy.user.pbstuff.WireConverter;
import com.yjy.user.utils.EncryptUtils;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okio.ByteString;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/**
 * Created by liny on 2017/10/31. 17:45
 */
public class UserEngine extends BaseEngine<UserApi> implements IUserEngine {
    private final Object monitor = new Object();
    private UserApi userApi = null;

    @Override
    public Disposable getSmsCode(String phone, PbSubscriber<AppResponse> paramPbSubscriber) {
        GetVerifyCodeReq.Builder builder = new GetVerifyCodeReq.Builder();
        builder.phone("18665311512");
        builder.purpose("Login");
        builder.source(Source.USER.getValue());

        ByteString byteString = PbUtil.pbToByteString(builder.build());
        RequestItem item = genRequestItem(byteString, ENCRYPT_NO, APP_COMMAND.GetSMSCode);
        Disposable operate = operate(APP_COMMAND.GetSMSCode, paramPbSubscriber, item);
        return operate;


    }

    @Override
    public Disposable login(String phone, String code, PbSubscriber<AppResponse> paramPbSubscriber) {
        LoginReq.Builder builder = new LoginReq.Builder();
        builder.phone = phone;
        builder.code = EncryptUtils.encryptMD5ToString(code);
        builder.source(Source.COMPANY);
        builder.jpushId("000000");
        ByteString byteString = PbUtil.pbToByteString(builder.build());
        RequestItem item = genRequestItem(byteString, ENCRYPT_NO, APP_COMMAND.Login);
        Disposable operate = operate(APP_COMMAND.Login, paramPbSubscriber, item);
        return operate;
    }

    @Override
    public Disposable getSetting(PbSubscriber<AppResponse> subscriber) {
        GetSettingReq.Builder builder = new GetSettingReq.Builder();
        builder.adcode(400100);
        builder.lat(0.00);
        builder.lng(0.00);

        ByteString data = PbUtil.pbToByteString(builder.build());

        RequestItem item = genRequestItem(data, ENCRYPT_NO, APP_COMMAND.SAASAPPGetSettings);

        Disposable operate = operate(APP_COMMAND.SAASAPPGetSettings, subscriber, item);
        return operate;
    }

    private Disposable operate(APP_COMMAND command, Observer<AppResponse> observer, RequestItem requestItem) {
        Observable<AppResponse> observable = getApiServer()
                .operate(getRequestBody(requestItem));

        Disposable subscribe = observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe();

        observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);

        register(command, subscribe);
        return subscribe;
    }

    @Override
    protected UserApi getApiServer() {

        synchronized (this.monitor) {
            if (this.userApi == null)
                this.userApi = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .client(OkClient.client)
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                        .addConverterFactory(WireConverter.create())
                        .build()
                        .create(UserApi.class);

            UserApi localHomeApi = this.userApi;
            return localHomeApi;


        }
    }


}
