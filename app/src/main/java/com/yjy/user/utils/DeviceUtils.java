package com.yjy.user.utils;

import android.app.ActivityManager;
import android.app.ActivityManager.RecentTaskInfo;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;

import com.yjy.user.app.BaseApplication;
import com.yjy.user.kapadapter.KapalaiAdapterUtil;
import com.yjy.user.kapadapter.MobileIssueSettings;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.List;

/**
 * 跟设备信息相关，需要在程序一启动就调用
 *
 * @author vivianliao
 */
public class DeviceUtils {

    // 是否支持多点触摸？(sdk>=7 && 屏幕支持多点)
    public static boolean IS_SURPORT_MUTITOUCH_GESTURER = true;

    // 是否是高质量手机, 决定图片上传策略
    private static boolean IS_HIGH_QUALITY_DEVICE = true;

    public static int currentDeviceWidth;
    public static int currentDeviceHeight;
    public static float currentDensity;

    public static String model;

    private static String linuxKernelVersion;

    static {
        Context context = BaseApplication.getContext();
        int currentOrientation = context.getResources().getConfiguration().orientation;
        if (currentOrientation == Configuration.ORIENTATION_PORTRAIT) {
            currentDeviceWidth = context.getResources().getDisplayMetrics().widthPixels;
            currentDeviceHeight = context.getResources().getDisplayMetrics().heightPixels;
        } else if (currentOrientation == Configuration.ORIENTATION_LANDSCAPE) {
            currentDeviceWidth = context.getResources().getDisplayMetrics().heightPixels;
            currentDeviceHeight = context.getResources().getDisplayMetrics().widthPixels;
        } else {
            int _currentDeviceWidth = context.getResources().getDisplayMetrics().widthPixels;
            int _currentDeviceHeight = context.getResources().getDisplayMetrics().heightPixels;
            currentDeviceWidth = Math.min(_currentDeviceWidth, _currentDeviceHeight);
            currentDeviceHeight = Math.max(_currentDeviceWidth, _currentDeviceHeight);
        }
        currentDensity = context.getResources().getDisplayMetrics().density;

        int temp = (currentDeviceWidth > currentDeviceHeight) ? currentDeviceWidth : currentDeviceHeight;
        if (temp < 800 || currentDensity <= 1) {
            IS_HIGH_QUALITY_DEVICE = false;
        }

        if (CommonUtil.getAndroidSDKVersion() < 7 || !CommonUtil.isSupportMultiTouch()) {
            IS_SURPORT_MUTITOUCH_GESTURER = false;
        }
    }

    /**
     * 获取网络连接类型
     *
     * @return -1表示没有网络
     */
    public static final int TYPE_WIFI = 0;
    public static final int TYPE_3G = 1;
    public static final int TYPE_GPRS = 2;

    public static final int getNetWorkType(Context c) {
        ConnectivityManager conn = (ConnectivityManager) c.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (conn == null) {
            return -1;
        }
        NetworkInfo info = conn.getActiveNetworkInfo();
        if (info == null || !info.isAvailable()) {
            return -1;
        }
        int type = info.getType(); // MOBILE（GPRS）;WIFI
        if (type == ConnectivityManager.TYPE_WIFI) {
            return TYPE_WIFI;
        } else {
            TelephonyManager tm = (TelephonyManager) c.getSystemService(Context.TELEPHONY_SERVICE);
            switch (tm.getNetworkType()) {
                case TelephonyManager.NETWORK_TYPE_CDMA:
                    return TYPE_GPRS;
                case TelephonyManager.NETWORK_TYPE_EDGE:
                    return TYPE_GPRS;
                case TelephonyManager.NETWORK_TYPE_GPRS:
                    return TYPE_GPRS;
                default:
                    return TYPE_3G;
            }
        }
    }

    /**
     * 根据手机设备 决定图片拉取线程数量
     *
     * @return
     */
    public static int getProcessExcutorSizeByDevice() {
        if (IS_HIGH_QUALITY_DEVICE) {
            return 4;//8;
        } else {
            return 4;//5;
        }
    }

    /**
     * 获得IMEI 信息（卡1和卡2），关于双卡适配的入口
     */
    public static String[] getImeiFromNative() {
        Context context = BaseApplication.getContext();
        int result = -1;
        try {
            result = BaseApplication.getContext().checkCallingOrSelfPermission(android.Manifest.permission.READ_PHONE_STATE);
        } catch (Exception e) {
        }
        if (result != PackageManager.PERMISSION_GRANTED) {
            return null;
        }
        String[] imeiInfo = new String[2];
        try {
            if (!MobileIssueSettings.isSupportDualSimIMEI) {
                imeiInfo = KapalaiAdapterUtil.getKAUInstance().getDualSimIMEIInfoMethod(context);
            } else {
                imeiInfo = KapalaiAdapterUtil.getKAUInstance().getDualSimIMEIInfoNormalMethod(context);
            }
            if (imeiInfo != null && imeiInfo.length != 0) {
                return imeiInfo;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }


    /**
     * 获得IMSI 信息（卡1和卡2），关于双卡适配的入口
     */
    public static String[] getImsiFromNative() {
        Context context = BaseApplication.getContext();
        int result = context.checkCallingOrSelfPermission(android.Manifest.permission.READ_PHONE_STATE);
        if (result != PackageManager.PERMISSION_GRANTED) {
            return null;
        }
        String[] rs = new String[2];
        try {
            if (!MobileIssueSettings.isSupportDualSimIMEI) {
                rs = KapalaiAdapterUtil.getKAUInstance().getDualSimIMSIInfoMethod(context);
            } else {
                rs = KapalaiAdapterUtil.getKAUInstance().getDualSimIMSIInfoNormalMethod(context);
            }
            if (rs != null && rs.length != 0) {
                return rs;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public static final int getMaxHeapSize() {
        long mx = Runtime.getRuntime().maxMemory();

        return (int) (mx / 1024 / 1024);
    }

    public static final float getHeapModulus() {
        int heap = getMaxHeapSize();

        return (float) heap / 48;
    }
    
    /*
     * add by jimluo 20130703
     * 获取手机总内存大小和可用内存大小
     * 获取SD卡的信息
     * */

    //获取手机内存可用大小
    static public long getAvailableInternalMemorySize() {
        File path = Environment.getDataDirectory();
        if (path.exists() == false) {
            return -1;
        }

        StatFs stat = new StatFs(path.getPath());
        long blockSize = stat.getBlockSize();
        long availableBlocks = stat.getAvailableBlocks();

        return availableBlocks * blockSize;
    }

    //获取手机内存总量大小
    static public long getTotalInternalMemorySize() {
        File path = Environment.getDataDirectory();
        if (path.exists() == false) {
            return -1;
        }

        StatFs stat = new StatFs(path.getPath());
        long blockSize = stat.getBlockSize();
        long totalBlocks = stat.getBlockCount();
        return totalBlocks * blockSize;
    }

    /*
     * 获取手机sdcard的可用空间大小
     * -1 则没有取到
     * */
    static public long getAvailableExternalMemorySize() {
        if (FileUtil.isSDCardExistAndCanWrite()) {
            File path = Environment.getExternalStorageDirectory();
            if (path.exists() == false) {
                return -1;
            }

            StatFs stat = new StatFs(path.getPath());
            long blockSize = stat.getBlockSize();
            long availableBlocks = stat.getAvailableBlocks();
            return availableBlocks * blockSize;
        } else {
            return -1;
        }
    }

    /*
     * 获取手机sdcard的总容量的大小
     * */
    static public long getTotalExternalMemorySize() {
        if (FileUtil.isSDCardExistAndCanWrite()) {
            File path = Environment.getExternalStorageDirectory();
            if (path.exists() == false) {
                return -1;
            }
            try {
                StatFs stat = new StatFs(path.getPath());
                long blockSize = stat.getBlockSize();
                long totalBlocks = stat.getBlockCount();
                return totalBlocks * blockSize;

            } catch (Exception e) {  //rdm 61807373,加catch是为了处理这个问题
                return -1;
            }
        } else {
            return -1;
        }
    }

    public static String getImei() {
        int result = -1;
        try {
            result = BaseApplication.getApplication().checkCallingOrSelfPermission(android.Manifest.permission.READ_PHONE_STATE);
        } catch (Exception e) {
        }
        if (result != PackageManager.PERMISSION_GRANTED) {
            return "";
        }
        try {
            TelephonyManager tm = (TelephonyManager) BaseApplication.getApplication().getSystemService(Context.TELEPHONY_SERVICE);
            String rs = tm.getDeviceId();
            if (TextUtils.isEmpty(rs)) {
                return "";
            }
            return rs;
        } catch (Throwable e) {
            return "";
        }

    }

    public static String getImsi() {
        int result = BaseApplication.getApplication().checkCallingOrSelfPermission(android.Manifest.permission.READ_PHONE_STATE);
        if (result != PackageManager.PERMISSION_GRANTED) {
            return "";
        }
        try {
            final TelephonyManager tm = (TelephonyManager) BaseApplication.getApplication().getSystemService(Context.TELEPHONY_SERVICE);
            String rs = tm.getSubscriberId();
            if (TextUtils.isEmpty(rs)) {
                return "";
            }
            return rs;
        } catch (Exception e) {
            return "";
        }

    }

    public static boolean isAvailableImeiImsi(String[] items, int itemPosition) {
        try {
            if (items[itemPosition] != null && !TextUtils.isEmpty(items[itemPosition])) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static String getMacAddress() {
        try {
            final WifiManager wifiManager = (WifiManager) BaseApplication.getApplication().getSystemService(Context.WIFI_SERVICE);
            WifiInfo info = null;
            info = wifiManager.getConnectionInfo();
            if (info != null) {
                return info.getMacAddress();
            } else {
                return "";
            }
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
        return "";
    }

    public static String getAndroidIdInPhone() {
        return Secure.getString(BaseApplication.getApplication().getContentResolver(), Secure.ANDROID_ID);
    }

    public static String getAndroidIdInSdCard() {
        if (FileUtil.isSDCardExistAndCanWrite()) {
            String path = FileUtil.getCommonRootDir() + "/" + ".aid";
            return FileUtil.read(path);
        }
        return "";
    }

    public static String execCmd(String[] cmd) {

        String re = "";
        Process p = null;
        try {
            ProcessBuilder builder = new ProcessBuilder(cmd);

            builder.redirectErrorStream(false);
            p = builder.start();

            DataOutputStream localDataOutputStream = new DataOutputStream(p.getOutputStream());
            DataInputStream localDataInputStream = new DataInputStream(p.getInputStream());
            if (localDataInputStream != null && localDataOutputStream != null) {
                re = localDataInputStream.readLine();
            }
            localDataOutputStream.writeBytes("exit\n");
            localDataOutputStream.flush();
            p.waitFor();
        } catch (Exception e) {
        } finally {
            if (p != null) {
                p.destroy();
            }

        }

        return re;
    }

    static int selfVersionCode = 0;

    public static int getSelfVersionCode() {
        if (selfVersionCode > 0) {
            return selfVersionCode;
        } else {
            try {
                PackageInfo info = BaseApplication.getApplication().getPackageManager().getPackageInfo(BaseApplication.getApplication().getPackageName(), 0);
                if (info != null) {
                    selfVersionCode = info.versionCode;
                }
            } catch (NameNotFoundException e) {
                e.printStackTrace();
            }
            return selfVersionCode;
        }
    }

    public static boolean isSdCardEmulated() {
        final int sdkVersion = CommonUtil.getAndroidSDKVersion();
        boolean ret = false;
        if (sdkVersion >= 11) {
            Class<?> clazz = Environment.class;
            try {
                Method method = clazz.getMethod("isExternalStorageEmulated");
                ret = (Boolean) method.invoke(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ret;
    }

    public static boolean isSdCardRemoveable() {
        final int sdkVersion = CommonUtil.getAndroidSDKVersion();
        boolean ret = false;
        if (sdkVersion >= 9) {
            Class<?> clazz = Environment.class;
            try {
                Method method = clazz.getMethod("isExternalStorageRemovable");
                ret = (Boolean) method.invoke(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ret;
    }

    public static long getTotalMemory() {
        String path = "/proc/meminfo";// 系统内存信息文件

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader, 8192);
            String line = bufferedReader.readLine();    // 读取meminfo第一行，系统总内存大小
            if (line == null)
                return 0;

            // beginIndex
            int begin = line.indexOf(':');
            // endIndex
            int end = line.indexOf('k');

            String str = line.substring(begin + 1, end).trim();
            return Long.parseLong(str) * 1024;// 获得系统总内存，单位是KB，乘以1024转换为Byte
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return 0;
    }

    public static long getFreeMemory() {
        String path = "/proc/meminfo";// 系统内存信息文件

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader, 8192);
            String line = bufferedReader.readLine();    // 读取meminfo第一行，系统总内存大小
            String line2 = bufferedReader.readLine(); // 读取meminfo第二行，系统可用内存大小
            String line3 = bufferedReader.readLine(); //
            String line4 = bufferedReader.readLine();
            return handleMemoryInfo(line2) + handleMemoryInfo(line3) + handleMemoryInfo(line4);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Closer.close(fileReader);
            Closer.close(bufferedReader);
        }
        return 0;
    }

    private static long handleMemoryInfo(String memroyLine) {
        if (memroyLine == null)
            return 0;
        // beginIndex
        int begin = memroyLine.indexOf(':');
        // endIndex
        int end = memroyLine.indexOf('k');
        String str = memroyLine.substring(begin + 1, end).trim();
        try {
            return Long.parseLong(str) * 1024;
        } catch (Exception e) {
            return 0;
        }

    }

    public static long[] getSDCardMemory() {
        long[] sdCardInfo = new long[2];
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            File sdcardDir = Environment.getExternalStorageDirectory();
            StatFs sf = new StatFs(sdcardDir.getPath());
            long bSize = sf.getBlockSize();
            long bCount = sf.getBlockCount();
            long availBlocks = sf.getAvailableBlocks();

            sdCardInfo[0] = bSize * bCount;// 总大小
            sdCardInfo[1] = bSize * availBlocks;// 可用大小
        }
        return sdCardInfo;
    }

    public static String getSupportArchitecture() {

        String cpu = android.os.Build.CPU_ABI;
        if (android.os.Build.VERSION.SDK_INT >= 8) {
            java.lang.reflect.Field field = null;
            String cpu2 = null;
            try {
                field = android.os.Build.class.getField("CPU_ABI2");
            } catch (SecurityException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (NoSuchFieldException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if (field != null) {
                try {
                    cpu2 = (String) field.get(null);
                } catch (IllegalArgumentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (Throwable e) {
                    e.printStackTrace();
                }
            }
            if (cpu2 != null)
                cpu = cpu + "," + cpu2;
        }

        return cpu;
    }

    public static String getModel() {
        if (TextUtils.isEmpty(model)) {
            model = android.os.Build.MODEL;
        }
        return model;
    }

    /**
     * 获取设备名称， 用于备份应用列表
     *
     * @return
     */
    public static String getDeviceName() {
        Log.d("BACKUP_TAG", "android.os.Build.MANUFACTURER = " + android.os.Build.MANUFACTURER + " android.os.Build.MODEL = " + android.os.Build.MODEL);
        return android.os.Build.MANUFACTURER + "-" + android.os.Build.MODEL;
    }

    public static boolean isHightQuality() {
        return IS_HIGH_QUALITY_DEVICE;
    }

    /**
     * 获取Android Linux内核版本信息
     */
    public static String getLinuxKernalInfo() {

        if (linuxKernelVersion != null) {
            return linuxKernelVersion;
        }

        Process process = null;
        BufferedReader br = null;

        try {
            process = Runtime.getRuntime().exec("cat /proc/version");
            br = new BufferedReader(new InputStreamReader(process.getInputStream()), 8 * 1024);

            String result = "";
            String line;
            // get the whole standard output string
            while ((line = br.readLine()) != null) {
                result += line;
                // result += "\n";
            }

            if (!TextUtils.isEmpty(result)) {
                String Keyword = "version ";
                int index = result.indexOf(Keyword);
                line = result.substring(index + Keyword.length());
                index = line.indexOf(" ");
                linuxKernelVersion = line.substring(0, index);
            }
        } catch (Exception e) {
            linuxKernelVersion = null;
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return linuxKernelVersion;
    }

    /**
     * 判断当前屏幕是否是亮屏
     *
     * @return
     */
    public static boolean isScreenOn() {
        PowerManager powerMgr = (PowerManager) BaseApplication.getApplication().getSystemService(Context.POWER_SERVICE);
        return powerMgr != null && powerMgr.isScreenOn();
    }

    /**
     * 取最近运行的n个app
     *
     * @param
     * @return
     */
    public static List<RecentTaskInfo> getRecentTaskInfos(int n) {
        int checkResult = BaseApplication.getApplication().checkCallingOrSelfPermission(android.Manifest.permission.GET_TASKS);
        if (checkResult == PackageManager.PERMISSION_GRANTED) {
            ActivityManager activityManager = (ActivityManager) BaseApplication.getApplication().getSystemService(Context.ACTIVITY_SERVICE);
            return activityManager.getRecentTasks(n, ActivityManager.RECENT_WITH_EXCLUDED);
        }
        return null;
    }

}
