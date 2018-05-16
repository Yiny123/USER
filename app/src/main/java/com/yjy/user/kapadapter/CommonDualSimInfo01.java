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
public class CommonDualSimInfo01 implements IDualSimInfo {

	public final static int CLASS_NUMBER = 1 ; 
	
	private TelephonyManager simTelephonyManager = null;
	
	@Override
	public Object getKapalaiSimTelephonyManager(int simPos, Context context) {
		
		// TODO Auto-generated method stub
		if(null == simTelephonyManager){
			try {
				simTelephonyManager = (TelephonyManager)  ReflecterHelper.invokeStaticMethod(
                        "android.telephony.TelephonyManager", "getDefault", null, null);
			}catch(Exception e){
			}
		}
		
		return simTelephonyManager;
	}

	@Override
	public String getKapalaiDualSimIMSI(int simSlotPos, Context context) {
		// TODO Auto-generated method stub
		String imsiInfo = null ;
		TelephonyManager mSimTelephonyManager = (TelephonyManager) getKapalaiSimTelephonyManager(simSlotPos, context) ;
		try {
			imsiInfo = (String)  ReflecterHelper.invokeMethod(mSimTelephonyManager, "getSubscriberIdGemini", new Object[]{simSlotPos}) ;
		
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
