package com.yjy.user.app;/**
 * Created by Administrator on 2017/10/31.
 */

import android.text.TextUtils;

import com.yjy.user.utils.SharePrefUtil;

/**
 * Created by liny on 2017/10/31. 17:12
 */
public class AccountManager {
    private static final String KEY_SID = "key-sid";
    private String mSid;


    private static AccountManager sInstance;

    public static AccountManager getInstance() {
        if (sInstance == null) {
            sInstance = new AccountManager();
        }

        return sInstance;
    }


    private AccountManager() {
        mSid = SharePrefUtil.getString(KEY_SID, "");
    }


    public String getSid() {
        return mSid;
    }

    /**
     * 登录完成后保存sid
     *
     * @param sid
     */
    public void setSid(String sid) {
        mSid = sid;
        SharePrefUtil.putString(KEY_SID, sid);

    }

    /**
     * 是否有登录、是否有登录态
     *
     * @return
     */
    public boolean isLogined() {
        try {
            return !TextUtils.isEmpty(mSid)/* && mUserBuilder.getUserBaseInfo().getUserId() != 0*/;
        } catch (Exception e) {
            return false;
        }
    }

}
