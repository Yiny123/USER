package com.yjy.user.protocol;/**
 * Created by Administrator on 2017/10/31.
 */

import android.content.Context;

import com.yijianyi.protocol.AppError;
import com.yijianyi.protocol.AppResponse;
import com.yjy.user.utils.ExceptionHandle;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import okio.ByteString;


/**
 * Created by liny on 2017/10/31. 17:21
 */
public abstract class PbSubscriber<K> implements Observer<K> {
    private Context context;

    public PbSubscriber() {
    }

    public PbSubscriber(Context context) {
        this.context = context;
    }


    protected void closeLoadingProgress() {
    }

    protected void showLoadingProgress() {
    }

    public abstract void onBusiError(AppError err, String errMsg, ByteString byteString);

    public abstract void onSuc(ByteString paramByteString);

    /*public void onCompleted() {
        closeLoadingProgress();
    }*/

    //////////////override methods//////////////////////////////////////

    @Override
    public void onSubscribe(Disposable d) {
        showLoadingProgress();
    }

    @Override
    public void onNext(K paramT) {
        if ((paramT instanceof AppResponse)) {
            AppResponse localAppResponse = (AppResponse) paramT;
            new ResponseEngine(new ResponseEngine.OnResponseListener() {
                public void onComplete(ByteString paramByteString) {
                    PbSubscriber.this.onSuc(paramByteString);
                }

                public void onError(AppError paramAppErrorCode, String paramString, ByteString paramByteString) {
                    PbSubscriber.this.onBusiError(paramAppErrorCode, paramString, paramByteString);
                }
            }).response(localAppResponse);
        }

    }

    @Override
    public void onError(Throwable paramThrowable) {
        paramThrowable.printStackTrace();
        if ((paramThrowable instanceof ExceptionHandle.ResponeThrowable)) {
            onNetError((ExceptionHandle.ResponeThrowable) paramThrowable);
            return;
        }
        onNetError(ExceptionHandle.handleException(paramThrowable));

    }


    public abstract void onNetError(ExceptionHandle.ResponeThrowable paramResponeThrowable);
}
