package com.yjy.user.ui.login;/**
 * Created by Administrator on 2018/4/17.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;


import android.view.ViewGroup;

import com.hannesdorfmann.mosby3.mvp.MvpPresenter;
import com.yjy.user.R;
import com.yjy.user.annotation.LayoutResource;
import com.yjy.user.ui.BasePresenter;
import com.yjy.user.ui.MySupportFragment;
import com.yjy.user.ui.wedget.LoadingLayout;
import com.yjy.user.utils.ULog;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by liny on 2018/4/17. 10:30
 */
public abstract class BaseFragment extends MySupportFragment {

    protected Context mContext;
    protected Toolbar toolbar;
    private View view;
    private LoadingLayout loadingView;
    private Unbinder mUnbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LayoutResource resource = this.getClass().getAnnotation(LayoutResource.class);
        mContext = getActivity();
        if (view == null)
            this.view = LayoutInflater.from(mContext).inflate(resource.value(), null, false);

        mUnbinder = ButterKnife.bind(this, view);

        this.toolbar = (Toolbar) this.view.findViewById(R.id.common_toolbar);
        if (null != toolbar) {
            this.toolbar.setTitle("");
            toolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);
            this.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                public void onClick(View var1) {
                    //处理返回
                    _mActivity.onBackPressed();
                }
            });
        }


        this.loadingView = (LoadingLayout) this.view.findViewById(R.id.loading);
        if (null != loadingView)
            loadingView.setOnReloadListener(new LoadingLayout.OnReloadListener() {
                @Override
                public void onReload(View v) {
                    reloadData();
                }
            });

        initView();
        ViewGroup parent = (ViewGroup) view.getParent();
        if (parent != null)
            parent.removeView(view);

        return view;
    }


    protected abstract void initView();

    protected void reloadData() {
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mUnbinder != null)
            mUnbinder.unbind();
    }

    @Override
    public MvpPresenter createPresenter() {
        MvpPresenter presenter = creatPresenter();

        if (presenter == null) {
            ULog.d("baseFragment: ", "is null");
            return new BasePresenter();
        } else {
            ULog.d("baseFragmen t: ", "not null");

            return presenter;
        }


    }

    public abstract MvpPresenter creatPresenter();


}
