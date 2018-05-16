package com.yjy.user.app;/**
 * Created by Administrator on 2017/10/31.
 */

import android.app.Activity;
import android.content.Context;
import android.support.multidex.MultiDexApplication;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.yjy.user.utils.StringQueue;

/**
 * Created by liny on 2017/10/31. 15:42
 */
public class BaseApplication extends MultiDexApplication {
    static final int PROCESS_CONNECTION = 1;
    static final int PROCESS_MARKET = 0;
    private static StringQueue activityNameQueue;
    private static Activity curAllTypeActivity;
    private static BaseApplication instance;
    private static Object lock = new Object();
    private static Context mContext;
    public static String sPackageName;
    private boolean isAppFront = false;
    //    private EventController mEventController;
    //    private EventDispatcher mEventDispatcher;
    private int mProcessFlag = -1;

    static {
        curAllTypeActivity = null;
        activityNameQueue = null;
        instance = new BaseApplication();
    }

    public static Context getContext() {
        if (mContext == null)
            throw new NullPointerException("you must set onCreate Method in you Application first!");
        return mContext;
    }

  /*  public static BaseActivity getCurActivity()
    {
        if (Settings.Global.isDeBug())
            HLog.d("AstApp", "getCurActivity:" + curAllTypeActivity);
        if ((curAllTypeActivity != null) && ((curAllTypeActivity instanceof BaseActivity)))
            return (BaseActivity)curAllTypeActivity;
        return null;
    }*/

    public static BaseApplication getInstance() {
        return instance;
    }

    public static String getRecentActivityString() {
        if (activityNameQueue != null)
            return activityNameQueue.toString();
        return "NotAdd";
    }

  /*  private void initPush(Context paramContext)
    {
        HandlerUtils.getHandler(HandlerUtils.HandlerId.DefaultHandler).post(new Runnable(paramContext)
        {
            public void run()
            {
                if (MiPushManager.getInstance().isMiDevice())
                    if (MiPushManager.getInstance().shouldInit(this.val$context))
                        MiPushManager.getInstance().registerPush(this.val$context);
                while (true)
                {
                    UMengPushManager.getInstance(this.val$context).registerPush(this.val$context);
                    return;
                    if (!HwPushManager.getInstance().isHwDevice())
                        continue;
                    HwPushManager.getInstance().registerPush(this.val$context);
                }
            }
        });
    }*/

  /*  private void intStep(Context paramContext)
    {
        Utils.init(paramContext);
         local1 = new QbSdk.PreInitCallback()
    {
        public void onCoreInitFinished()
        {
        }

        public void onViewInitFinished(boolean paramBoolean)
        {
            Log.d("app", " onViewInitFinished is " + paramBoolean);
        }
    };
        QbSdk.initX5Environment(PMF.getApplicationContext(), local1);
    }

    private void registerHook()
    {
        RegisterHookClass.registerWxClass();
        RegisterHookClass.registerQQClass();
    }*/

    /*public static void setCurActivity(Activity paramActivity)
    {
        if (activityNameQueue == null)
            activityNameQueue = new StringQueue(8);
        if (paramActivity != null);
        try
        {
            activityNameQueue.offer(paramActivity.getClass().getSimpleName());
            curAllTypeActivity = paramActivity;
            return;
        }
        catch (RuntimeException localRuntimeException)
        {
            while (true)
                localRuntimeException.printStackTrace();
        }
    }*/

 /*   public EventController getEventController()
    {
        return this.mEventController;
    }

    public EventDispatcher getEventDispatcher()
    {
        return this.mEventDispatcher;
    }*/

    public boolean isAppFront() {
        return this.isAppFront;
    }

    public boolean isMainProcess() {
        return this.mProcessFlag == 0;
    }

    @Override
    public void onCreate() {

        mContext = getApplicationContext();
        //        this.mEventController = EventController.getInstance();
        //        this.mEventDispatcher = EventDispatcher.getInstance(this.mEventController);
        sPackageName = getContext().getPackageName();
        //        intStep(paramContext);
        //        initPush(paramContext);
        //        Global.init();
        //        registerHook();

      /*  FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                // (Optional) Whether to show thread info or not. Default true
                .showThreadInfo(false)
                // (Optional) How many method line to show. Default 2
                .methodCount(0)
                // (Optional) Hides internal method calls up to offset. Default 5
                .methodOffset(5)
                // .logStrategy(customLog) // (Optional) Changes the log strategy to print out. Default LogCat
                // .tag("My custom tag")   // (Optional) Global tag for every log. Default PRETTY_LOGGER
                .build();

        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy) {
            @Override
            public boolean isLoggable(int priority, String tag) {
                return BuildConfig.DEBUG;
            }
        });*/

        Logger.addLogAdapter(new AndroidLogAdapter());
    }

    public void onCreate(Context paramContext) {
        mContext = paramContext;
        //        this.mEventController = EventController.getInstance();
        //        this.mEventDispatcher = EventDispatcher.getInstance(this.mEventController);
        sPackageName = paramContext.getPackageName();
        //        intStep(paramContext);
        //        initPush(paramContext);
        //        Global.init();
        //        registerHook();
    }

    public void onLowMemory(Context paramContext) {
        if (this.mProcessFlag == 0)
            ;
    }

    public static Context getApplication() {
        return mContext;
    }

    /*public void setAppFront(boolean paramBoolean, int paramInt)
    {
        if ((this.isAppFront) && (!paramBoolean))
            this.mEventDispatcher.sendMessageDelayed(this.mEventDispatcher.obtainMessage(1001), paramInt);
        while (true)
        {
            this.isAppFront = paramBoolean;
            return;
            if ((this.isAppFront) || (!paramBoolean))
                continue;
            this.mEventDispatcher.sendMessageDelayed(this.mEventDispatcher.obtainMessage(1002), paramInt);
        }
    }*/
}
