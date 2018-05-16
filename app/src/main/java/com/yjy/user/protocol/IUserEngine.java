package com.yjy.user.protocol;

import com.yijianyi.protocol.AppResponse;

import org.reactivestreams.Subscription;

import io.reactivex.disposables.Disposable;


/**
 * Created by Administrator on 2017/10/31.
 */

public interface IUserEngine {
    Disposable getSmsCode(String phone, PbSubscriber<AppResponse> paramPbSubscriber);

    Disposable login(String phone, String code,PbSubscriber<AppResponse> paramPbSubscriber);

    Disposable getSetting(PbSubscriber<AppResponse> subscriber);

}
