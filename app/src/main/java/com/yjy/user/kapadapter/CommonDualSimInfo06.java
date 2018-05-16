package com.yjy.user.kapadapter;

import android.app.Service;
import android.content.Context;
import android.telephony.TelephonyManager;

import com.yjy.user.utils.ReflecterHelper;


/**
 * 
 * @author Kapalai
 *
 */
public class CommonDualSimInfo06 implements IDualSimInfo {

	public final static int CLASS_NUMBER = 6 ;
	
	private Object simTelephonyManager = null;
	
	@Override
	public Object getKapalaiSimTelephonyManager(int simPos, Context context) {
		// TODO Auto-generated method stub
		if (simTelephonyManager == null) {
			try {
				simTelephonyManager =  ReflecterHelper.invokeStaticMethod(
                        "com.yulong.android.telephony.CPTelephonyManager", "getDefault");
			} catch (Throwable e) {
			}
		}
		return simTelephonyManager;
	}

	@Override
	public String getKapalaiDualSimIMSI(int simSlotPos, Context context) {
		// TODO Auto-generated method stub
		String imsiInfo = null ;
		Object mSimTelephonyManager = getKapalaiSimTelephonyManager(simSlotPos, context);
		try {
			imsiInfo = (String)  ReflecterHelper.invokeMethod(mSimTelephonyManager,
                    "getDualSubscriberId", new Object[]{simSlotPos + 1});
		} catch (Throwable e) {
		}

		return imsiInfo;
	}

	@Override
	public String getKapalaiDualSimIMEI(int simSlotPos, Context context) {
		// TODO Auto-generated method stub
		return ((TelephonyManager)context.getSystemService(Service.TELEPHONY_SERVICE)).getDeviceId();
	}

}
