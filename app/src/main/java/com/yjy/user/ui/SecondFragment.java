package com.yjy.user.ui;/**
 * Created by Administrator on 2018/4/17.
 */

import android.os.Bundle;

import com.hannesdorfmann.mosby3.mvp.MvpPresenter;
import com.yjy.user.R;
import com.yjy.user.annotation.LayoutResource;
import com.yjy.user.ui.login.BaseFragment;

/**
 * Created by liny on 2018/4/17. 11:09
 */
@LayoutResource(R.layout.fragment_second)
public class SecondFragment extends BaseFragment {
    @Override
    protected void initView() {

    }


    @Override
    public MvpPresenter creatPresenter() {
        return null;
    }


    public static SecondFragment newInstance() {
        Bundle bundle = new Bundle();
        SecondFragment f = new SecondFragment();

        f.setArguments(bundle);
        return f;
    }


}
