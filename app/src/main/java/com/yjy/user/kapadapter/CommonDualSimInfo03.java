package com.yjy.user.kapadapter;

import android.app.Service;
import android.content.Context;
import android.telephony.TelephonyManager;

import com.yjy.user.utils.ReflecterHelper;

/**
 * ������MSim����������ITelephonyMSim·����com.android.internal.telephony.msim
 * Coolpad 5216D(4.1.2)
 * @author Kapalai
 *
 */
public class CommonDualSimInfo03 implements IDualSimInfo {

	public final static int CLASS_NUMBER = 3 ;
	private Object mMSimTelephonyManager = null;
	
	@Override
	public Object getKapalaiSimTelephonyManager(int simPos, Context context) {
		// TODO Auto-generated method stub
		if (mMSimTelephonyManager == null) {
			try {
				mMSimTelephonyManager = ReflecterHelper.invokeStaticMethod(
                        "android.telephony.MSimTelephonyManager", "getDefault", null, null);
			} catch (Exception e) {
			}
		}
		return mMSimTelephonyManager;
	}

	@Override
	public String getKapalaiDualSimIMSI(int simSlotPos, Context context) {
		// TODO Auto-generated method stub
		String imsiInfo = null ;
		Object mSimTelephonyManager = getKapalaiSimTelephonyManager(simSlotPos, context);
		try {
			imsiInfo = (String) ReflecterHelper.invokeMethod(mSimTelephonyManager, "getSubscriberId",
                    new Object[]{simSlotPos});
		} catch (Exception e) {
		}

		return imsiInfo;
	}

	@Override
	public String getKapalaiDualSimIMEI(int simSlotPos, Context context) {
		// TODO Auto-generated method stub
		return ((TelephonyManager)context.getSystemService(Service.TELEPHONY_SERVICE)).getDeviceId();
	}

}
