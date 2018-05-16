package com.yjy.user.utils;/**
 * Created by Administrator on 2017/10/31.
 */

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.text.TextUtils;

import com.yjy.user.BuildConfig;
import com.yjy.user.app.BaseApplication;

/**
 * Created by liny on 2017/10/31. 16:20
 */
public class Global {
    public static final int PROTO_VERSION = 1;
    /**
     * DEBGU版本
     */
    public static final int APP_DEV = 0;
    /**
     * 灰度版本
     */
    public static final int APP_GRAY = 1;
    /**
     * 发布版本
     */
    public static final int APP_RELEASE = 2;

    private static String sYUA;
    private static String sGuid;
    private static String sImei;
    private static String sImsi;
    private static String sMac;
    private static String sAndroidid;
    private static String sImei2;
    private static String sImsi2;


    public static void init() {
        genPhoneTerminal();
//        sAppStatus = SharePrefUtil.getIntPersist(GConstants.KEY_ENVIRONMENT, -1);
    }

    private static void genPhoneTerminal() {
        final String androidId = DeviceUtils.getAndroidIdInPhone();
        sAndroidid = androidId;
        String[] imeiInfo = new String[2];
        imeiInfo = DeviceUtils.getImeiFromNative();
        if (DeviceUtils.isAvailableImeiImsi(imeiInfo, 0)) {
            sImei = imeiInfo[0];
        } else {
            sImei = DeviceUtils.getImei();
        }
        if (DeviceUtils.isAvailableImeiImsi(imeiInfo, 1)) {
            sImei2 = imeiInfo[1];
        }
        String[] imsiInfo = new String[2];
        imsiInfo = DeviceUtils.getImsiFromNative();
        if (DeviceUtils.isAvailableImeiImsi(imsiInfo, 0)) {
            sImsi = imsiInfo[0];
        } else {
            sImsi = DeviceUtils.getImsi();
        }
        if (DeviceUtils.isAvailableImeiImsi(imsiInfo, 1)) {
            sImsi2 = imsiInfo[1];
        }
    }

    public static String getBaseUrl() {

        return "http://dev.1-1dr.com/";
    }

    public static boolean isDev() {
        return APP_RELEASE != BuildConfig.APP_STATUS;
    }



    public static String getAndroidid() {
        if (TextUtils.isEmpty(sAndroidid)) {
            init();
        }
        return sAndroidid;
    }

    public static String getImei() {
        if (TextUtils.isEmpty(sImei)) {
            init();
        }

        return sImei;
    }

    public static String getImsi() {
        if (TextUtils.isEmpty(sImsi)) {
            init();
        }

        return sImsi;

    }

    public static String getMac() {
        if (TextUtils.isEmpty(sMac)) {
            sMac = DeviceUtils.getMacAddress();
        }

        return sMac;
    }

    public static String getImei2() {
        if (TextUtils.isEmpty(sImei2)) {
            init();
        }
        return sImei2;
    }

    public static String getImsi2() {
        if (TextUtils.isEmpty(sImsi2)) {
            init();
        }
        return sImsi2;
    }

    public static String getYUA() {
        if (TextUtils.isEmpty(sYUA)) {
            genYUA();
        }

        return sYUA;
    }

    public static String getGuid() {
        if (TextUtils.isEmpty(sGuid)) {
            sGuid = SharePrefUtil.getStringPersist("guid", "");
        }

        return sGuid;
    }


    private static int getVersionCode() {
        PackageInfo info = null;
        try {
            info = BaseApplication.getContext().
                    getPackageManager().getPackageInfo(BaseApplication.sPackageName, 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        if (info == null)
            return 0;

        return info.versionCode;
    }

    private static String getVersionName() {
        PackageInfo info = null;
        try {
            info = BaseApplication.getContext().
                    getPackageManager().getPackageInfo(BaseApplication.sPackageName, 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        if (info == null)
            return null;

        return info.versionName;
    }


    private static void genYUA() {
        YUABuilder builder = new YUABuilder();

        Context context = BaseApplication.getContext();
        ApplicationInfo appInfo = null;
        try {
            appInfo = context.getPackageManager()
                    .getApplicationInfo(context.getPackageName(),
                            PackageManager.GET_META_DATA);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        // TODO: 2017/3/3 lin
        //        int msg = 0;
//        String msg = appInfo.metaData.getString("InstallChannel");
        builder.mBuildNo = getVersionCode();
        builder.mDeviceHeight = DeviceUtils.currentDeviceHeight;
        builder.mDeviceWidth = DeviceUtils.currentDeviceWidth;
        Configuration conf = context.getResources().getConfiguration();
        builder.mFont = conf.fontScale;
        builder.mModel = Build.MODEL;
        builder.mPlatform = "Android";
        builder.mSdkVersion = Build.VERSION.RELEASE;
        builder.mVersionCode = getVersionCode();
        builder.mVersionName = getVersionName();
        builder.mChannelNo = "dev";

        sYUA = builder.get();
    }

    public static void setGuid(String guid) {
        sGuid = guid;
        SharePrefUtil.putStringPersist("guid", guid);
    }


}
