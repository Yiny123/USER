package com.yjy.user.ui;

import com.hannesdorfmann.mosby3.mvp.MvpView;
import com.yijianyi.protocol.AppError;

/**
 * Created by Administrator on 2018/4/4.
 */

public interface BaseView extends MvpView {
    void onError(AppError err, String errMsg);
}
