package com.yjy.user.utils;/**
 * Created by Administrator on 2018/4/8.
 */

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

/**
 * Created by liny on 2018/4/8. 11:47
 */
public class ULog {
    static {

    }

    public static void d(Object msg) {
        Logger.d(msg);

    }

    public static void d(String TAG, Object msg) {
        Logger.t(TAG).d(msg);

    }

    public static void e(String TAG, Object msg) {
        Logger.d(TAG, msg);
    }

    public static void w(String TAG, Object msg) {
        Logger.d(TAG, msg);
    }

    public static void f(String TAG, Object msg) {
        Logger.d(TAG, msg);
    }
}
