package com.yjy.user.kapadapter;

import android.content.Context;
import android.telephony.TelephonyManager;

import com.yjy.user.utils.ReflecterHelper;


/**
 * 
 * @author Kapalai
 *
 */
public class CommonDualSimInfo07 implements IDualSimInfo {

	public final static int CLASS_NUMBER =  7;
	
	private TelephonyManager simTelephonyManager = null;
	
	/**
	 * htc Telephony����ȡ״̬�ķ����ô�ֵ
	 */
	private int mCardId1 = 1;
	private int mCardId2 = 5;
	
	@Override
	public Object getKapalaiSimTelephonyManager(int simPos, Context context) {
		// TODO Auto-generated method stub
		if (simTelephonyManager == null) {
			try {
				simTelephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
			} catch (Exception e) {
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
                    "getSubscriberIdExt", new Object[]{simSlotPos == 0 ? mCardId1 : mCardId2});
		} catch (Exception e) {
		}

		return imsiInfo;
	}

	@Override
	public String getKapalaiDualSimIMEI(int simSlotPos, Context context) {
		// TODO Auto-generated method stub
		String imeiInfo = null ;
		Object mSimTelephonyManager = getKapalaiSimTelephonyManager(simSlotPos, context);
		try {
			imeiInfo = (String)  ReflecterHelper.invokeMethod(mSimTelephonyManager,
                    "getDeviceIdExt", new Object[]{simSlotPos == 0 ? mCardId1 : mCardId2});
		} catch (Exception e) {
		}

		return imeiInfo;
	}
	
}
