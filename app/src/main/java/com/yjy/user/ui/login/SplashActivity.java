package com.yjy.user.ui.login;/**
 * Created by Administrator on 2018/4/10.
 */

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

import com.hannesdorfmann.mosby3.mvp.MvpPresenter;
import com.yjy.user.R;
import com.yjy.user.annotation.LayoutResource;
import com.yjy.user.app.AccountManager;
import com.yjy.user.ui.BaseActivity;
import com.yjy.user.ui.HomeActivity;
import com.yjy.user.ui.LoginActivity;
import com.yjy.user.utils.ULog;

import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by liny on 2018/4/10. 16:29
 */
@LayoutResource(R.layout.activity_splash)
public class SplashActivity extends BaseActivity {
    @BindView(R.id.tv_skip)
    TextView mTvSkip;
    private int time = 4;
    private String TAG = "SplashActivity";
    final TimerTask timerTask = new TimerTask() {
        public void run() {
            runOnUiThread(new Runnable() {
                public void run() {
                    ULog.d(TAG, time);
                    if (SplashActivity.this.time == 1) {
                        loadMain();
                    } else if (SplashActivity.this.time > 1) {
                        String v = "秒";
                        time--;
                        mTvSkip.setText(time + " 跳过");
                    }

                }
            });
        }
    };
    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

    @Override
    protected void initView(View view) {
        scheduledExecutorService.scheduleAtFixedRate(timerTask, 200L, 1000L, TimeUnit.MILLISECONDS);
    }

    private void loadMain() {
        if (AccountManager.getInstance().isLogined()) {
            startActivityFinish(HomeActivity.class);
        } else {
            startActivityFinish(LoginActivity.class);
        }


    }

    @OnClick(R.id.tv_skip)
    public void onClick(View view) {
        scheduledExecutorService.shutdown();
        loadMain();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        scheduledExecutorService.shutdown();
    }

    @NonNull
    @Override
    public MvpPresenter createPresenter() {
        return new LoginPresenter();
    }
}
