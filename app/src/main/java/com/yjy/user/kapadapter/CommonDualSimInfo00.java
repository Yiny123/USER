package com.yjy.user.kapadapter;

import android.content.Context;

import com.yjy.user.utils.ReflecterHelper;


/**
 * @author Kapalai
 */

public class CommonDualSimInfo00 implements IDualSimInfo {
	
	public final static int CLASS_NUMBER =  0;
	
	private Object[] simTelephonyManager = null;
	
	@Override
	public Object getKapalaiSimTelephonyManager(int simPos, Context context) {
		// TODO Auto-generated method stub
		if (simTelephonyManager == null) {

			try {
				simTelephonyManager = new Object[2];
				simTelephonyManager[0] = context.getSystemService("phone");
				simTelephonyManager[1] = context.getSystemService("phone2");
			} catch (Exception e) {
			}
			
		}
		
		if(simTelephonyManager != null && simTelephonyManager.length > simPos){
			
			return simTelephonyManager[(simPos<=0) ? 0 : 1];
		
		}
		return null;
	}
	
	@Override
	public String getKapalaiDualSimIMSI(int simSlotPos, Context context) {
		
		String imsiInfo = null ;
		
		Object mSimTelephonyManager = getKapalaiSimTelephonyManager(simSlotPos, context);
		if(null != mSimTelephonyManager){
		try {
				imsiInfo = (String)  ReflecterHelper.invokeMethod(mSimTelephonyManager, "getSubscriberId");
			} catch (Exception e) {
				
			}
		}

		return imsiInfo;
	}

	@Override
	public String getKapalaiDualSimIMEI(int simSlotPos, Context context) {

		String imeiInfo = null ;
		
		Object mSimTelephonyManager = getKapalaiSimTelephonyManager(simSlotPos, context);
		if(null != mSimTelephonyManager){
			try {
				imeiInfo = (String)  ReflecterHelper.invokeMethod(mSimTelephonyManager, "getDeviceId");
			} catch (Exception e) {
				
			}
		}

		return imeiInfo;
	}
}
