package com.yjy.user.kapadapter;

/**
 * Kapalai适配机型开关
 * @author Kapalai
 * */
public class MobileIssueSettings {
	
	/** 从数据库中查询快捷方式是否存在失败 */
	public static boolean isHasShortcutUri = true;
	
	/** 手机不支持插入联系人分组 */
	public static boolean isSupportInsertContactGroup = true;
	
	/** 手机不支持删除联系人分组 */
	public static boolean isSupportDeleteContactGroup = true;
	/** 手机无法通过默认API得到SIM Card2的IMSI Number*/
	public static boolean isSupportDualSimIMSI = true;

    /**使用getSupportedFlashModes() != null以及hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH)
     * 判断手机是否支持闪光灯(特殊机型还需要增加一种getSupportedFlashModes().size() > 1的判断)*/
    public static boolean isDefaultSupportedFlashModesSuccess = true;

    /** 当自动对焦时，如果闪光灯模式设置为“on”或者“torch”时闪光灯是否亮起 **/
    public static boolean isSupportFlashAutoFocus = true;

	/** 双卡IMSI解决问题方案对应的解决方案*/
	public static int[] dualSimIMSISolutionNum = new int[2] ;

	/** 手机无法通过默认API得到IMEI2 Number*/
	public static boolean isSupportDualSimIMEI = true;
	/** 双卡IMEI解决问题方案对应的解决方案*/
	public static int[] dualSimIMEISolutionNum = new int[2] ;
	
	/** 双卡IMSI对应的位置 **/
	public static int[] IMSISimPos = new int[]{-1,1} ;
	
	/** 双卡IMEI对应的位置 **/
	public static int[] IMEIPos = new int[]{-1,1} ;
	
	/** 通用IMEI对应的位置 **/
	public static int[] CommonIMEIPos = new int[]{-1,0,1,2} ;
	
	/**加载机型的静态代码块，按照厂商、型号的树形结构聚蔟*/
	static {
		String model = android.os.Build.MODEL.toLowerCase();
		String manufacturer = android.os.Build.MANUFACTURER.toLowerCase();
		
		if (manufacturer.indexOf("htc") >= 0) {
			MobileModelConfig.getInstance().updateHtcConfig(model);
		} 
		else if (manufacturer.indexOf("samsung") >= 0 || manufacturer.indexOf("samsng") >= 0) {
			/**坑爹的I7562手机，取到的厂商竟然是samsng **/
			MobileModelConfig.getInstance().updateSamSungConfig(model);
		} 
		else if (manufacturer.indexOf("motorola") >= 0) {
			MobileModelConfig.getInstance().updateMotorolaConfig(model);
		} 
		else if (manufacturer.indexOf("huawei") >= 0) {
			MobileModelConfig.getInstance().updateHuaWeiConfig(model);	
		} 
		else if (manufacturer.indexOf("hisense") >= 0) {
			MobileModelConfig.getInstance().updateHisenseConfig(model);
		} 
		else if (manufacturer.indexOf("xiaomi") >= 0) {
			MobileModelConfig.getInstance().updateXiaomiConfig(model);
		} 
		else if (manufacturer.indexOf("zte") >= 0){
			MobileModelConfig.getInstance().updateZteConfig(model);
		}
		else if (manufacturer.indexOf("meizu") >= 0){
			MobileModelConfig.getInstance().updateMeizuConfig(model);
		}
		else if (manufacturer.indexOf("alps") >= 0){
			MobileModelConfig.getInstance().updateAlpsConfig(model);
		}
		else if( manufacturer.indexOf("oppo") >= 0){
			MobileModelConfig.getInstance().updateOppoConfig(model);
		}
		else if (manufacturer.indexOf("k-touch") >= 0){
			MobileModelConfig.getInstance().updateK_TouchConfig(model);
		}
		else if (manufacturer.indexOf("yulong") >= 0){
			MobileModelConfig.getInstance().updateYulongConfig(model);			
		}
		else if( manufacturer.indexOf("coolpad") >= 0){
		    MobileModelConfig.getInstance().updateCoolpadConfig(model);	
		}
		else if (manufacturer.indexOf("lenovo") >= 0){
			MobileModelConfig.getInstance().updateLenovoConfig(model);			
		}
		else if (manufacturer.indexOf("bbk") >= 0){
			MobileModelConfig.getInstance().updateBBKConfig(model);			
		}
		else if (manufacturer.indexOf("gionee") >=0){
			MobileModelConfig.getInstance().updateGioneeConfig(model) ;	
		}
		else if (manufacturer.indexOf("sony ericsson") >= 0){
			MobileModelConfig.getInstance().updateSonyConfig(model);			
		}
	}
	
}
