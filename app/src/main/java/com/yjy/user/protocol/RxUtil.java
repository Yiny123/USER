package com.yjy.user.protocol;

import org.reactivestreams.Subscriber;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


public class RxUtil {
/*    public static Observable<File> listFile(File paramFile) {
        if (paramFile.isDirectory())
            return Observable.from(paramFile.listFiles()).filter(new Func1<File>() {
                public Boolean call(File paramFile) {
                    if ((paramFile != null) && (paramFile.exists()) && (paramFile.isFile()))
                        ;
                    for (boolean bool = true; ; bool = false)
                        return Boolean.valueOf(bool);
                }
            }).flatMap(new Func1<File, Observable<File>>() {
                public Observable<File> call(File paramFile) {
                    return RxUtil.listFile(paramFile);
                }
            });
        return Observable.just(paramFile).filter(new Func1<File, Boolean>() {
            public Boolean call(File paramFile) {
                if ((paramFile != null) && (paramFile.exists()))
                    ;
                for (boolean bool = true; ; bool = false)
                    return Boolean.valueOf(bool);
            }
        });
    }*/

    public static class RxSchedulersHelper {
        public static <T> ObservableTransformer<T, T> io_main() {
            return new ObservableTransformer<T,T>() {
                public Observable<T> apply(Observable<T> paramObservable) {
                    return paramObservable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
                }
            };
        }

        public static <T> ObservableTransformer<T, T> newThread_main() {
            return new ObservableTransformer<T,T>() {


                public Observable<T> apply(Observable<T> paramObservable) {
                    return paramObservable.subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread());
                }
            };
        }
    }

    public abstract class RxSubscriber<T> implements Subscriber<T> {
        String msg;

        public RxSubscriber() {
        }

        public abstract void _onError(String paramString);

        public abstract void _onNext(T paramT);

        public void onCompleted() {
        }

        public void onError(Throwable paramThrowable) {
            paramThrowable.printStackTrace();
            if ((paramThrowable instanceof SocketTimeoutException))
                this.msg = paramThrowable.getMessage();
            while (true) {
                _onError(this.msg);
//                return;
                if ((paramThrowable instanceof SocketTimeoutException))
                    continue;
                if ((paramThrowable instanceof UnknownHostException)) {
                    this.msg = "没有网络...";
                    continue;
                }
                if ((paramThrowable instanceof SocketTimeoutException)) {
                    this.msg = "超时...";
                    continue;
                }
                this.msg = "请求失败，请稍后重试...";
            }
        }

        public void onNext(T paramT) {
            _onNext(paramT);
        }
    }
}