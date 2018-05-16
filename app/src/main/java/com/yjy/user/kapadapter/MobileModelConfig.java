package com.yjy.user.kapadapter;


import com.yjy.user.utils.IMoblieModelConfig;

/**
 * 型号匹配
 * @author Kapalai
 * */
public class MobileModelConfig implements IMoblieModelConfig {
	
	/**单例对象*/
	private static MobileModelConfig mInstance;
	
	
	/**
	 * 私有化构造
	 * */
	private MobileModelConfig() { }

	/**
	 * 获取单例对象
	 * */
	public static MobileModelConfig getInstance() {
		if (null == MobileModelConfig.mInstance) {
			synchronized (MobileModelConfig.class) {
				if (null == MobileModelConfig.mInstance) {
					MobileModelConfig.mInstance = new MobileModelConfig();
				}
			}
		}
		return MobileModelConfig.mInstance;
	}
	
	/**
	 * 三星
	 * */
	public void updateSamSungConfig(String model) {
		SAMSUNG mSAMSUNG = null;
		try {
			mSAMSUNG = SAMSUNG.valueOf(transformToUnderLine(model));
		} catch (Exception e) {
			return;
		}
		switch (mSAMSUNG) {
        //CommonDualSimInfo00->-1,CommonDualSimInfo03->1
		case _GT_I8552:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo03.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo03->1
		case _GT_S7572:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo03.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo03->1
		case _GT_I8262D:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo03.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		case _GT_N7102:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.isSupportDualSimIMEI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		case _SM_N9009:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.isSupportDualSimIMEI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[0] = CommonDualSimInfo08.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		case _GT_I9152:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.isSupportDualSimIMEI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[0] = CommonDualSimInfo08.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo05->1 
		case _GT_S7562I:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo05.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		case _SCH_I959:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.isSupportDualSimIMEI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[0] = CommonDualSimInfo08.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		case _GT_I8558:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		case _SM_N9002:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		case _SCH_I869:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.isSupportDualSimIMEI =false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[0] = CommonDualSimInfo08.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		case _SCH_N719:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.isSupportDualSimIMEI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[0] = CommonDualSimInfo08.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		case _GT_I9502:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.isSupportDualSimIMEI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[0] = CommonDualSimInfo08.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		case _GT_I9082:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.isSupportDualSimIMEI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[0] = CommonDualSimInfo08.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		case _SCH_I829:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.isSupportDualSimIMEI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[0] = CommonDualSimInfo08.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		case _GT_I9158:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		case _SCH_I879:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.isSupportDualSimIMEI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[0] = CommonDualSimInfo08.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		case _SM_G3812:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo08->1
		case _SM_G7108:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo08.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		case _SM_G3502U:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		case _SM_G3502:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		case _GT_S6352:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.isSupportDualSimIMEI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[0] = CommonDualSimInfo08.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		case _SCH_W2013:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.isSupportDualSimIMEI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[0] = CommonDualSimInfo08.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo03->1
		case _SM_G3819D:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo03.CLASS_NUMBER ;
			break;
		case _SCH_I939:
			MobileIssueSettings.isSupportDualSimIMEI = false ;
			MobileIssueSettings.dualSimIMEISolutionNum[0] = CommonDualSimInfo08.CLASS_NUMBER;
			MobileIssueSettings.dualSimIMEISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER;
			break;
		case _SM_G7106:
			MobileIssueSettings.isSupportDualSimIMEI = false ;
			MobileIssueSettings.dualSimIMEISolutionNum[0] = CommonDualSimInfo08.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break ;
		case _GT_I9082I:
			MobileIssueSettings.isSupportDualSimIMEI = false ;
			MobileIssueSettings.dualSimIMEISolutionNum[0] = CommonDualSimInfo08.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break ;
		default:
			break;
		}
	}
	
	/**
	 * HTC
	 * */
	public void updateHtcConfig(String model) {

		HTC mHTC = null;
		try {
			mHTC = HTC.valueOf(transformToUnderLine(model));
		} catch (Exception e) {
			return;
		}
		switch (mHTC) {
		case _HTC_T328T:
		
		case _HTC_T528T:
		case _HTC_T528W:
		case _HTC_INCREDIBLE_S:
		case _HTC_EVO_3D_X515m:
			MobileIssueSettings.isSupportInsertContactGroup = false;
			break;
		case _HTC_T328W:
	    	MobileIssueSettings.isSupportInsertContactGroup = false;
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.isSupportDualSimIMEI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo07.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[0] = CommonDualSimInfo07.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[1] = CommonDualSimInfo07.CLASS_NUMBER ;
			MobileIssueSettings.IMEIPos[1] = 0 ;
			break;
//IMEI:CommonDualSimInfo07->-1,CommonDualSimInfo07->0
		case _HTC_D816W:
			MobileIssueSettings.isSupportDualSimIMEI = false ;
			MobileIssueSettings.dualSimIMEISolutionNum[0] = CommonDualSimInfo07.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[1] = CommonDualSimInfo07.CLASS_NUMBER ;
			MobileIssueSettings.IMEIPos[1] = 0 ;
			break;
		//IMEI:CommonDualSimInfo08->-1,CommonDualSimInfo07->0
		case _HTC_T328D:
		    MobileIssueSettings.isSupportInsertContactGroup = false;
			MobileIssueSettings.isSupportDualSimIMEI = false ;
			MobileIssueSettings.dualSimIMEISolutionNum[0] = CommonDualSimInfo08.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[1] = CommonDualSimInfo07.CLASS_NUMBER ;
			MobileIssueSettings.IMEIPos[1] = 0 ;
			break;
		//IMEI:CommonDualSimInfo08->-1,CommonDualSimInfo07->0
		case _HTC_T528D:
			MobileIssueSettings.isSupportDualSimIMEI = false ;
			MobileIssueSettings.dualSimIMEISolutionNum[0] = CommonDualSimInfo08.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMEISolutionNum[1] = CommonDualSimInfo07.CLASS_NUMBER ;
			MobileIssueSettings.IMEIPos[1] = 0 ;
			break;
		default:
			break;
		}
	}
	
	/**
	 * MOTO
	 * */
	public void updateMotorolaConfig(String model) {
		MOTOROLA mMOTOROLA = null;
		try {
			mMOTOROLA = MOTOROLA.valueOf(transformToUnderLine(model));
		} catch (Exception e) {
			return;
		}
	}

	/**
	 * 华为
	 * */
	public void updateHuaWeiConfig(String model) {
		
		HUAWEI mHUAWEI = null;
		try {
			mHUAWEI = HUAWEI.valueOf(transformToUnderLine(model));
		} catch (Exception e) {
			return;
		}
	   switch(mHUAWEI){
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		case _HUAWEI_Y511_T00:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo03->1
		case _H30_T00:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo03.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo03->1
		case _HUAWEI_G520_0000:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo03.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo03->1
		case _HUAWEI_G610_U00:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo03.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _HUAWEI_G610_T11:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _H30_U10:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo03->1
		case _HUAWEI_P6_C00:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo03.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _H30_T10:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo05->1 
		case _HUAWEI_A199:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo05.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo05->1 
		case _HUAWEI_Y321_C00:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo05.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo03->1
		case _HUAWEI_C8813D:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo03.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo05->1
		case _HUAWEI_U8825D:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo05.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _HUAWEI_Y325_T00:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo03->1
		case _HUAWEI_G610_C00:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo03.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo05->1 
		case _HUAWEI_Y320_T00:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo05.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _HUAWEI_G750_T00:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		default:
			break;
		}
	}
	
	/**
	 * 中兴
	 * */
	public void updateZteConfig(String model){
		ZTE mZte = null;
		try{
			mZte = ZTE.valueOf(transformToUnderLine(model));
		}
		catch(Exception e){
			return;
		}

        if(model.equalsIgnoreCase("ZTE-T U960s")){
            MobileIssueSettings.isSupportFlashAutoFocus = false;
        }
		switch (mZte) {
		case _ZTE_V889D:
			MobileIssueSettings.isSupportInsertContactGroup = false;
			break;
		default:
			break;
		}

	}

	/**
	 * 海信
	 * */
	public void updateHisenseConfig(String model) {
		HISENSE mHISENSE = null;
		try {
			mHISENSE = HISENSE.valueOf(transformToUnderLine(model));
		} catch (Exception e) {
			return;
		}
	}

	/**
	 * 小米
	 * */
	public void updateXiaomiConfig(String model) {
		XIAOMI xiaomi = null;
		try {
			xiaomi = XIAOMI.valueOf(transformToUnderLine(model));
		} catch (Exception e) {
			return;
		}
		switch (xiaomi) {
		case _MI_1S:
			MobileIssueSettings.isHasShortcutUri = false;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _2013022:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo03->0,CommonDualSimInfo03->1
		case _HM_1SC:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo03.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo03.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _HM_NOTE_1TD:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		default:
			break;
		}
	}
	
	/**
	 * 魅族
	 * */
	public void updateMeizuConfig(String model) {
		MEIZU meizu = null;
		try {
			meizu = MEIZU.valueOf(transformToUnderLine(model));
		} catch (Exception e) {
			return;
		}
	}

	/**
	 * 坑爹的手机，取到的厂商竟然是alps，然后在外面还显示的是oppo
	 * oppo / alps
	 * */
	public void updateAlpsConfig(String model) {
		ALPS alps = null;
		try {
			alps = ALPS.valueOf(transformToUnderLine(model));
		} catch (Exception e) {
			return;
		}
			switch(alps){
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _R811:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _R801:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _U701:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		default:
			break;
			}
	}
	
	/**
	 * 天语
	 * */
	public void updateK_TouchConfig(String model) {
		K_TOUCH k_touch = null;
		try {
			k_touch = K_TOUCH.valueOf(transformToUnderLine(model));
		} catch (Exception e) {
			return;
		}
	}
	
	

	
		
	
	/**
	 * 酷派
	 * */
	public void updateCoolpadConfig(String model) {
		COOLPAD coolpad = null;
		try {
			coolpad = COOLPAD.valueOf(transformToUnderLine(model));
		} catch (Exception e) {
			return;
		}
		switch (coolpad) {
//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _COOLPAD_8297:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo02->-1,CommonDualSimInfo02->1
		case _COOLPAD_8079:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo02.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo02.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _COOLPAD_7296:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _COOLPAD_7295C:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _COOLPAD_7295A:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo02->-1,CommonDualSimInfo02->1 
		case _COOLPAD_8076D:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo02.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo02.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _COOLPAD7295:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _8720:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo06->1
		case _COOLPAD_7270:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo06.CLASS_NUMBER ;
			break;
		default:
			break;
		}
	}
	
	
	/**
	 * 联想
	 * */
	public void updateLenovoConfig(String model) {
		LENOVO lenovo = null;
		try {
			lenovo = LENOVO.valueOf(transformToUnderLine(model));
		} catch (Exception e) {
			return;
		}
		
		switch(lenovo){
		//CommonDualSimInfo02->-1,CommonDualSimInfo02->1
		case _LENOVO_A390T:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo02.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo02.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _LENOVO_A630T:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _LENOVO_A308T:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _LENOVO_A820T:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _LENOVO_A850:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _LENOVO_A670T:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo02->-1,CommonDualSimInfo02->1
		case _LENOVO_A278T:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo02.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo02.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _LENOVO_S720:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _LENOVO_A789:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _S890:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _LENOVO_S890:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _LENOVO_A820:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		default:
			break;
		}
	}
	
	/**
	 * 步步高
	 * */
	public void updateBBKConfig(String model) {
		BBK mBBK = null;
		try {
			mBBK = BBK.valueOf(transformToUnderLine(model));
		} catch (Exception e) {
			return;
		}
		switch (mBBK) {
//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _VIVO_Y11:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _VIVO_Y17T:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _VIVO_Y11I_T:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _VIVO_Y15T:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _VIVO_S7T:
		    MobileIssueSettings.isSupportDeleteContactGroup = false;
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _VIVO_X1ST:
	     	MobileIssueSettings.isSupportDeleteContactGroup = false;
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _VIVO_Y13:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _VIVO_S7:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _VIVO_Y19T:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _VIVO_S11T:
		    MobileIssueSettings.isSupportDeleteContactGroup = false;
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _VIVO_Y3T:
		    MobileIssueSettings.isSupportDeleteContactGroup = false;
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _VIVO_Y20T:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _VIVO_S9:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
	    default:
			break;
		}
	}
	
	/**
	 * 索爱
	 * */
	public void updateSonyConfig(String model) {
		SONY mSony = null;
		try {
			mSony = SONY.valueOf(transformToUnderLine(model));
		} catch (Exception e) {
			return;
		}
		switch (mSony) {
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _S39H:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		case _MT15I:
		case _LT26I:
		case _LT26II:
			MobileIssueSettings.isSupportInsertContactGroup = false;
			break;
		default:
			break;
		}
	}
	
	/**
	 * OPPO
	 * @param model
	 */
	public void updateOppoConfig(String model) {
		// TODO Auto-generated method stub
		OPPO mOppo = null ;
		try{
			mOppo = OPPO.valueOf(transformToUnderLine(model)) ;
		}catch(Exception e){
			return ;
		}
		switch(mOppo){
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _R821T:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _R819T:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _R831T:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		case _R827T:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		case _R829T:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _R815T:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _R823T:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _U707T:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		case _R833T:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo00.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _R813T:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		default:
			break;
		}
	}
	
	
	/**
	 * 金立
	 * @param model
	 */
	public void updateGioneeConfig(String model) {
		// TODO Auto-generated method stub
		GIONEE mGionee = null;
		try{
			mGionee = GIONEE.valueOf(transformToUnderLine(model)) ;
		}catch(Exception e){
			return ;
		}
		
		switch(mGionee){
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _V182:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		case _GN137:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo01.CLASS_NUMBER ;
			break;
		default:
			break;
		}
	}
	/**
	 * Yulong
	 * */
	public void updateYulongConfig(String model) {
		YULONG yulong = null;
		try {
			yulong = YULONG.valueOf(transformToUnderLine(model));
		} catch (Exception e) {
			return;
		}
		switch (yulong) {
		case _8020:
		case _8022:
		case _8060:
		case _5860A:
			MobileIssueSettings.isSupportDeleteContactGroup = false;
			break;
		case _COOLPAD_5950:
			MobileIssueSettings.isSupportDualSimIMSI = false ;
			MobileIssueSettings.dualSimIMSISolutionNum[0] = CommonDualSimInfo00.CLASS_NUMBER ;
			MobileIssueSettings.dualSimIMSISolutionNum[1] = CommonDualSimInfo06.CLASS_NUMBER ;
			break;
		default:
			break;
		}
		
		
	}
	/**
	 * 其他品牌
	 * 如果汇集的比较多可以抽出单独的方法
	 * */
	public void updateOtherPhoneConfig(String model) {
		OTHERPHONE mOTHERPHONE = null;
		try {
			mOTHERPHONE = OTHERPHONE.valueOf(transformToUnderLine(model));
		} catch (Exception e) {
			return;
		}
	}

	private String transformToUnderLine(String model) {
		String underLine = "_";
		StringBuffer mark = new StringBuffer(underLine);
		// 在机型名前加上下划线，并且将机型名中的-或空格替换为下划线，以便支持枚举命名规则
		String tempModel = model.replaceAll("[-\\s]", underLine).toUpperCase();
		String ret = mark.append(tempModel).toString();
		return ret;
	}

}
