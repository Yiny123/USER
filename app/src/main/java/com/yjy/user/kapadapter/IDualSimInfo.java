package com.yjy.user.kapadapter;

import android.content.Context;

/**
 * ͨ�ýӿ�
 * @author Kapalai
 *
 */
public interface IDualSimInfo {
	int CLASS_NUMBER = -1 ;
	Object getKapalaiSimTelephonyManager(int simPos, Context context) ;
	String getKapalaiDualSimIMSI(int simSlotPos, Context context);
	String getKapalaiDualSimIMEI(int simSlotPos, Context context);
}
