package com.yjy.user.kapadapter;

import android.app.Service;
import android.content.Context;
import android.telephony.TelephonyManager;

import java.lang.reflect.Method;

/**
 * 
 * @author Kapalai
 *
 */

public class CommonDualSimInfo04 implements IDualSimInfo {

	public final static int CLASS_NUMBER = 4;
	private TelephonyManager[] simTelephonyManager = null;
	
	@Override
	public Object getKapalaiSimTelephonyManager(int simPos, Context context) {
		// TODO Auto-generated method stub
		if(null == simTelephonyManager){
			try{
				simTelephonyManager = new TelephonyManager[2] ;
				simTelephonyManager[0] = (TelephonyManager) context.getSystemService(Service.TELEPHONY_SERVICE) ;
				simTelephonyManager[1] = (TelephonyManager) context.getSystemService("phone2");
			}catch (Exception e) {
			}
		}

		if(null != simTelephonyManager){
			
			return simTelephonyManager[(simPos <= 0) ? 0 : 1] ;
		}
		return null;
	}

	@Override
	public String getKapalaiDualSimIMSI(int simSlotPos, Context context) {
	
		String imsiInfo = null ;
		TelephonyManager tmpTeleManager = (TelephonyManager) getKapalaiSimTelephonyManager(simSlotPos, context) ;
		
		if(simSlotPos <= 0){
			try{
				imsiInfo = tmpTeleManager.getSubscriberId() ;
			}catch (Exception e) {
			}
			
		}else{
			
			try {
				if (null != tmpTeleManager) {
					Method method = tmpTeleManager.getClass().getDeclaredMethod("getSubscriberId",(Class[]) null);
					if (null != method) {
						method.setAccessible(true);
						imsiInfo = (String) method.invoke(tmpTeleManager, (Object[]) null);
					}
				}
			}catch (Exception e) {;
			}
			
		}
		
		return imsiInfo;
	}

	@Override
	public String getKapalaiDualSimIMEI(int simSlotPos, Context context) {
		// TODO Auto-generated method stub
		return ((TelephonyManager)context.getSystemService(Service.TELEPHONY_SERVICE)).getDeviceId();
	}
}
