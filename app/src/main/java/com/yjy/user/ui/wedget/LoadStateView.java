//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.yjy.user.ui.wedget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yjy.user.R;

public class LoadStateView extends RelativeLayout {
    private RelativeLayout loadingErrorLayout;
    private RelativeLayout loadingLayout;
    private Context mContext;
    private TextView reloadBtn;

    public LoadStateView(Context var1) {
        this(var1, (AttributeSet) null);
    }

    public LoadStateView(Context var1, AttributeSet var2) {
        this(var1, var2, 0);
    }

    public LoadStateView(Context var1, AttributeSet var2, int var3) {
        super(var1, var2, var3);
        this.mContext = var1;
        this.initView();
    }

    private void inflate() {
        LayoutInflater.from(this.mContext).inflate(R.layout.loading_layout, this, true);
    }

    private void initView() {
        this.inflate();
        this.loadingLayout = (RelativeLayout) this.findViewById(R.id.loading_layout);
        this.loadingErrorLayout = (RelativeLayout) this.findViewById(R.id.loading_fail_layout);
        this.reloadBtn = (TextView) this.findViewById(R.id.loading_fail_layout_reload_btn);
    }

    public void showLoading() {
        this.setVisibility(VISIBLE);
        this.loadingLayout.setVisibility(VISIBLE);
        this.loadingErrorLayout.setVisibility(GONE);
    }

    public void showLoadingError() {
        this.loadingLayout.setVisibility(GONE);
        this.loadingErrorLayout.setVisibility(VISIBLE);
    }
}
