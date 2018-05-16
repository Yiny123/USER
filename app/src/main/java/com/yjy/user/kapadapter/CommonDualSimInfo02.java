package com.yjy.user.kapadapter;

import android.content.Context;
import android.telephony.TelephonyManager;

import com.yjy.user.utils.ReflecterHelper;


/**
 * 
 * @author Kapalai
 *
 */
public class CommonDualSimInfo02 implements IDualSimInfo {
	
	public final static int CLASS_NUMBER = 2 ; 
	
	private TelephonyManager[] simTelephonyManager = null;
	
	@Override
	public TelephonyManager getKapalaiSimTelephonyManager(int simPos, Context context) {
		if (simTelephonyManager == null) {
			try {
				simTelephonyManager = new TelephonyManager[2];
				simTelephonyManager[0] = (TelephonyManager) ReflecterHelper.invokeStaticMethod(
                        "android.telephony.TelephonyManager", "getDefault", new Object[]{0});
				simTelephonyManager[1] = (TelephonyManager) ReflecterHelper.invokeStaticMethod(
                        "android.telephony.TelephonyManager", "getDefault", new Object[]{1});
			} catch (Exception e) {
			}
		}
		if (simTelephonyManager != null && simTelephonyManager.length > simPos) {
			return simTelephonyManager[(simPos<=0) ? 0 : 1];
		}
		return null;
	}

	@Override
	public String getKapalaiDualSimIMSI(int simSlotPos, Context context) {
		String imsiInfo = null ;
		try {
			TelephonyManager mSimTelephonyManager = getKapalaiSimTelephonyManager(simSlotPos, context);
			if(null != mSimTelephonyManager){
				imsiInfo = mSimTelephonyManager.getSubscriberId();
			}
		} catch (Exception e) {
		}
		return imsiInfo;
	}

	@Override
	public String getKapalaiDualSimIMEI(int simSlotPos, Context context) {
		// TODO Auto-generated method stub
		String imeiInfo = null ;
		try {
			TelephonyManager mSimTelephonyManager = getKapalaiSimTelephonyManager(simSlotPos, context);
			if(null != mSimTelephonyManager){
				imeiInfo = mSimTelephonyManager.getDeviceId();
			}
		} catch (Exception e) {
		}
		return imeiInfo;
	}

}
