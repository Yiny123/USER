package com.yjy.user.ui;/**
 * Created by Administrator on 2018/4/11.
 */

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.hannesdorfmann.mosby3.mvp.MvpPresenter;
import com.yjy.user.R;
import com.yjy.user.annotation.LayoutResource;
import com.yjy.user.ui.login.BaseFragment;
import com.yjy.user.ui.wedget.bottombar.BottomBar;
import com.yjy.user.ui.wedget.bottombar.BottomBarTab;

import butterknife.BindView;
import butterknife.Unbinder;
import me.yokeyword.fragmentation.ISupportFragment;
import me.yokeyword.fragmentation.SupportFragment;


/**
 * Created by liny on 2018/4/11. 11:05
 */
@LayoutResource(R.layout.fragment_main)
public class MainFragment extends BaseFragment {
    public static final int FIRST = 0;
    public static final int SECOND = 1;
    public static final int THIRD = 2;
    @BindView(R.id.fl_main_container)
    FrameLayout mFlMainContainer;
    @BindView(R.id.bottom_bar)
    BottomBar mBottomBar;
    Unbinder unbinder;
    private ISupportFragment[] mFragments = new ISupportFragment[2];

    public static MainFragment newInstance() {
        Bundle args = new Bundle();
        MainFragment fragment = new MainFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void initView() {
        DisocoverFragment disocoverFragment = (DisocoverFragment) findChildFragment(DisocoverFragment.class);
        if (disocoverFragment == null) {
            mFragments[FIRST] = disocoverFragment.newInstance();
            mFragments[SECOND] = SecondFragment.newInstance();

            //加载多个页面 同级根Fragment 类似wechat 场景
            loadMultipleRootFragment(R.id.fl_main_container, FIRST, mFragments[FIRST], mFragments[SECOND]);
        } else {
            mFragments[FIRST] = disocoverFragment;
            mFragments[SECOND] = findChildFragment(SecondFragment.class);
        }

        initBottomBar();


    }



    @Override
    public MvpPresenter creatPresenter() {
        return null;
    }


    private void initBottomBar() {
        mBottomBar.addItem(new BottomBarTab(_mActivity, R.drawable.ic_discover_white_24dp, "发现"));
        mBottomBar.addItem(new BottomBarTab(_mActivity, R.drawable.ic_account_circle_white_24dp, "妹纸"));

        mBottomBar.setOnTabSelectedListener(new BottomBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position, int prePosition) {
                showHideFragment(mFragments[position], mFragments[prePosition]);

                BottomBarTab tab = mBottomBar.getItem(FIRST);

            }

            @Override
            public void onTabUnselected(int position) {

            }

            @Override
            public void onTabReselected(int position) {
                //双击处理, 一般用于发送通知, 对应页面处理数据
                //要为了交互: 重选tab 如果列表不在顶部则移动到顶部,如果已经在顶部,则刷新

                Toast.makeText(mContext, "double", Toast.LENGTH_SHORT).show();
            }
        });


    }

    /**
     * start other BrotherFragment
     */
    public void startBrotherFragment(SupportFragment targetFragment) {
        start(targetFragment);
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
