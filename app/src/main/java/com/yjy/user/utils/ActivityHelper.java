package com.yjy.user.utils;/**
 * Created by Administrator on 2018/4/4.
 */

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liny on 2018/4/4. 20:33
 */
public class ActivityHelper {
    private static List<Activity> sActivities = new ArrayList<>();


    public ActivityHelper() {

    }


    public static void add(Activity activity) {
        sActivities.add(activity);
    }
}
