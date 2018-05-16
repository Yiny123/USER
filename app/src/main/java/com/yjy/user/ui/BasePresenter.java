package com.yjy.user.ui;/**
 * Created by Administrator on 2018/4/4.
 */

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;
import com.hannesdorfmann.mosby3.mvp.MvpView;
import com.yjy.user.protocol.UserEngine;

/**
 * Created by liny on 2018/4/4. 17:07
 */
public class BasePresenter<V extends MvpView> extends MvpBasePresenter<V> {
    protected UserEngine mUserEngine = new UserEngine();

    public BasePresenter() {

    }

}
