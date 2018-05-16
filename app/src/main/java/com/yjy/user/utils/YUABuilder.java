package com.yjy.user.utils;


import com.yjy.user.R;
import com.yjy.user.app.BaseApplication;

public class YUABuilder {
    //softwareName&appversion&buildNo&versionName&平台&os版本&屏幕宽除以16_屏幕高除以16_当前汉字宽&设备名称&渠道

    // debug、gray、release
    // Kaopu?
    public String mSoftwareName;
    public int mVersionCode;
    public int mBuildNo;
    public String mVersionName;
    // 平台：Android or ios
    public String mPlatform;
    // Android版本
    public String mSdkVersion;
    public int mDeviceWidth;
    public int mDeviceHeight;
    public float mFont;
    // 机型信息
    public String mModel;
    public String mChannelNo;

    public String get() {
        StringBuffer sb = new StringBuffer();
        String appName = BaseApplication.getContext().getString(R.string.app_name);

        sb.append("yijianyi").append("&")
                .append(mVersionCode).append("&")
                .append(mBuildNo).append("&")
                .append(mVersionName).append("&")
                .append(mPlatform).append("&")
                .append(mSdkVersion).append("&")
                .append(mDeviceWidth).append("_")
                .append(mDeviceHeight).append("_")
                .append(mFont).append("&")
                .append(mModel).append("&")
                .append(mChannelNo);

        return sb.toString();
    }

}
