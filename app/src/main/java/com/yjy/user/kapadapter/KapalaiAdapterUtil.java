package com.yjy.user.kapadapter;

import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.Settings;

/**
 * @描述：kapalai问题解决方案适配工具类
 * @author kapalai
 */
public class KapalaiAdapterUtil {
	
	//9种方案集合
	private static IDualSimInfo[] allDualSimInfo = new IDualSimInfo[]{
			new CommonDualSimInfo00(),
			new CommonDualSimInfo01(),
			new CommonDualSimInfo02(),
			new CommonDualSimInfo03(),
			new CommonDualSimInfo04(),
			new CommonDualSimInfo05(),
			new CommonDualSimInfo06(),
			new CommonDualSimInfo07(),
			new CommonDualSimInfo08(),
	} ;
	
	private KapalaiAdapterUtil() {

	}

	private static class KAUHolder {
		public final static KapalaiAdapterUtil kauInstance = new KapalaiAdapterUtil();
	}

	public static KapalaiAdapterUtil getKAUInstance() {
		return KAUHolder.kauInstance;
	}

	/**
	 * @author kapalai
	 * @问题描述：应用宝中建立快捷方式时从数据库中查询快捷方式是否存在失败
	 * @问题机型：三星I9300等
	 * @平台问题标题：从数据库中查询快捷方式是否存在失败
	 */
	public String getHasShortcutUri() {
		String model = android.os.Build.MODEL.toLowerCase();
		if (model.equals("gt-i9300")) {
			return "content://com.sec.android.app.launcher.settings/favorites?notify=true";
		} else if (model.equals("mi 1s")) {
			return "content://com.miui.home.launcher.settings/favorites?notify=true";
		} else {
			return "content://com.android.launcher.settings/favorites?notify=true";
		}
	}

	/**
     * @author kapalai
	 * @问题描述：对于双卡手机，无法通过默认API得到SIMCard2的IMSI号。
	 * 
	 * @方案步骤：
	 * 	1.反编译。反编译对应双卡手机Framework层，获得厂商的调用方法。
	 *  2.反射。通过反射的方式获取系统调用方法。
	 *  3.获得值。根据反射得到的方法，取得SIMCard2的IMSI号。
	 *  
     * @return
     */
	public String[] getDualSimIMSIInfoMethod(Context context){
		
		String[] simCardsIMSINumber = new String[2] ;
		
		//获得两张卡的信息
		for(int counter = 0, lg = simCardsIMSINumber.length; counter < lg; counter++){
			
			simCardsIMSINumber[counter] = allDualSimInfo[MobileIssueSettings.dualSimIMSISolutionNum[counter]]
										.getKapalaiDualSimIMSI(MobileIssueSettings.IMSISimPos[counter], context) ;
			
		}
		return simCardsIMSINumber ;
	}

	/**
	 * 如果该机型不在Kapalai列表中，则采用碰撞的方式。
	 * 直到找到信息或者结果为空时返回
	 * @return
	 */
	public String[] getDualSimIMSIInfoNormalMethod(Context context) {
		// TODO Auto-generated method stub
		String[] simCardsIMSINumber = new String[2] ;
		
		//获得两张卡的信息
		for(int counter = 0, lg = simCardsIMSINumber.length; counter < lg; counter++){
			
			for(int methodCounter = 0, methodLg = allDualSimInfo.length;
					methodCounter < methodLg; methodCounter++){
				
				simCardsIMSINumber[counter] = allDualSimInfo[methodCounter].getKapalaiDualSimIMSI(MobileIssueSettings.IMSISimPos[counter], context) ;
				
				if(null != simCardsIMSINumber[counter]
						&& 0 != simCardsIMSINumber[counter].length()){
					break ;
				}
			}
		}
		return simCardsIMSINumber ;
	}
	
    /**
     * 
     * 获得已知双卡机型的IMEI数据
     * @author kapalai
	 * @问题描述：对于双卡手机，无法通过默认API得到IMEI2。
	 * 
	 * @方案步骤：
	 * 	1.反编译。反编译对应双卡手机Framework层，获得厂商的调用方法。
	 *  2.反射。通过反射的方式获取系统调用方法。
	 *  3.获得值。根据反射得到的方法，取得IMEI2。
	 *  
     * @return
     */
	public String[] getDualSimIMEIInfoMethod(Context context){
		
		String[] simCardsIMEINumber = new String[2] ;
		
		//获个IMEI
		for(int counter = 0, lg = simCardsIMEINumber.length; counter < lg; counter++){
			
			simCardsIMEINumber[counter] = allDualSimInfo[MobileIssueSettings.dualSimIMEISolutionNum[counter]]
										.getKapalaiDualSimIMEI(MobileIssueSettings.IMEIPos[counter], context) ;
			
		}
		return simCardsIMEINumber ;
	}

	/**
	 * 获得未知双卡机形的IMEI信息
	 * 如果该机型不在Kapalai列表中，则采用碰撞的方式。
	 * 直到找到信息或者结果为空时返回
	 * @return
	 */
	public String[] getDualSimIMEIInfoNormalMethod(Context context) {
		// TODO Auto-generated method stub
		String[] simCardsIMEINumber = new String[2] ;
		int imeiCounter = 0 ;
 	
		//通过探测四个位置，获得两个IMEI的信息
		for(int counter = 0, lg = MobileIssueSettings.CommonIMEIPos.length; counter < lg && imeiCounter < 2; counter++){
			
			for(int methodCounter = 0, methodLg = allDualSimInfo.length ;
					methodCounter < methodLg; methodCounter++){
				
				String tmp = allDualSimInfo[methodCounter].getKapalaiDualSimIMEI(MobileIssueSettings.CommonIMEIPos[counter], context) ;
				
				if(null != tmp
						&& 0 != tmp.length()
						&& !tmp.equals(simCardsIMEINumber[0])){
					simCardsIMEINumber[imeiCounter++] = tmp ;
					break ;
				}
			}
		}
		return simCardsIMEINumber ;
	}
	/**
	 * @author kapalai
	 * @问题描述：应用宝中无关通过pc端向手机插入联系人分组
	 * @问题机型：HTC T528t等
	 * @平台问题标题：手机不支持插入联系人分组
	 */
	public String[] getContactGroupAccountNameAndType(Context context) {
		String[] str = new String[2];
		String account_name = "";
		String account_type = "";
		String manufacturer = android.os.Build.MANUFACTURER.toLowerCase();
		String model = android.os.Build.MODEL.toLowerCase();
		int sdk = android.os.Build.VERSION.SDK_INT;
		if (model.equals("galaxy nexus") && sdk >= 14) { // android.os.Build.VERSION_CODES.ICE_CREAM_SANDWICH
			AccountManager accont = AccountManager.get(context);
			android.accounts.Account[] accounts = accont.getAccounts();
			if (accounts.length > 0) {
				str[0] = accounts[0].name;
				str[1] = accounts[0].type;
				return str;
			}
		}
		if (manufacturer.indexOf("samsung") >= 0 || manufacturer.indexOf("samsng") >= 0) {
			account_name = "vnd.sec.contact.phone";
			account_type = "vnd.sec.contact.phone";
		} else if (manufacturer.indexOf("htc") >= 0) {
			account_name = "pcsc";
			account_type = "com.htc.android.pcsc";
		} else if (manufacturer.indexOf("sony ericsson") >= 0) {
			account_name = "Phone contacts";
			account_type = "com.sonyericsson.localcontacts";
		} else if (manufacturer.indexOf("zte") >= 0) {
			account_name = "local@ztespecial_local.com";
			account_type = "ztespecial_local.com";
		} else if (manufacturer.indexOf("moto") >= 0) {
			account_name = "phone-contacts";
			account_type = "com.contacts.phone";
		}
		str[0] = account_name;
		str[1] = account_type;
		return str;
	}

	/**
	 * @author kapalai
	 * @问题描述：应用宝中无关通过pc端向手机删除联系人分组
	 * @问题机型：酷派 8060等
	 * @平台问题标题：手机无法删除联系人分组（非系统属性分组）
	 */
	public Uri getContactGroupUri(long id) {
		return ContentUris.withAppendedId(ContactsContract.Groups.CONTENT_URI, id).buildUpon()
				.appendQueryParameter("caller_is_syncadapter", "true").build();
	}

	/**
	 * @author kapalai
	 * @问题描述：应用宝中飞行模式下无法开启蓝牙
	 * @问题机型：三星GT-I9008l等
	 * @平台问题标题：在飞行模式下无法开启蓝牙
	 */
	public boolean getNotSupportBluetoothInAirplaneMode(Context context) {
		boolean isSupport = false;
		ContentResolver resolver = context.getContentResolver();
		if (resolver != null) {
			isSupport = Settings.System.getInt(resolver, Settings.System.AIRPLANE_MODE_ON, 0) == 1;
		}
		return isSupport;
	}

}
