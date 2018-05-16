package com.yjy.user.utils;

/**
 * 枚举机型列表，用于switch case
 * 
 * @author Kapalai
 * */
public interface IMoblieModelConfig {


	// 在机型名前加上下划线，并且将机型名中的-或空格替换为下划线，以便支持枚举命名规则 (字母全大写)
	
	static enum HTC {
		_HTC_T528T,
		_HTC_T528W,
		_HTC_T328T,
		_HTC_T328D,
		//CommonDualSimInfo00->-1,CommonDualSimInfo07->1
		_HTC_T328W,
		_HTC_INCREDIBLE_S,
		_HTC_EVO_3D_X515m,
		//IMEI:CommonDualSimInfo08->-1,CommonDualSimInfo07->0
		_HTC_T528D,
		//IMEI:CommonDualSimInfo07->-1,CommonDualSimInfo07->0
		_HTC_D816W
	}

	static enum SAMSUNG {
//CommonDualSimInfo00->-1,CommonDualSimInfo03->1
		_GT_I8552,
		//CommonDualSimInfo00->-1,CommonDualSimInfo03->1
		_GT_S7572,
		//CommonDualSimInfo00->-1,CommonDualSimInfo03->1
		_GT_I8262D,
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		_GT_N7102,
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		_SM_N9009,
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		_GT_I9152,
		//CommonDualSimInfo00->-1,CommonDualSimInfo05->1 
		_GT_S7562I,
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		_SCH_I959,
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		_GT_I8558,
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		_SM_N9002,
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		_SCH_I869,
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		_SCH_N719,
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		_GT_I9502,
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		_GT_I9082,
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		_SCH_I829,
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		_GT_I9158,
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		_SCH_I879,
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		_SM_G3812,
		//CommonDualSimInfo00->-1,CommonDualSimInfo08->1
		_SM_G7108,
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		_SM_G3502U,
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		_SM_G3502,
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		_GT_S6352,
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		_SCH_W2013,
		//CommonDualSimInfo00->-1,CommonDualSimInfo03->1
		_SM_G3819D,
		//IMEI:CommonDualSimInfo08->-1,CommonDualSimInfo00->1
		_SCH_I939,
		//IMEI:CommonDualSimInfo08->-1,CommonDualSimInfo00->1
		_SM_G7106,
		//IMEI:CommonDualSimInfo08->-1,CommonDualSimInfo00->1
		_GT_I9082I,
		
		_GT_I9300
	}

	static enum MOTOROLA {
		
	}

	static enum HUAWEI {
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		_HUAWEI_Y511_T00,
		//CommonDualSimInfo00->-1,CommonDualSimInfo03->1
		_H30_T00,
		//CommonDualSimInfo00->-1,CommonDualSimInfo03->1
		_HUAWEI_G520_0000,
		//CommonDualSimInfo00->-1,CommonDualSimInfo03->1
		_HUAWEI_G610_U00,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_HUAWEI_G610_T11,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_H30_U10,
		//CommonDualSimInfo00->-1,CommonDualSimInfo03->1
		_HUAWEI_P6_C00,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_H30_T10,
		//CommonDualSimInfo00->-1,CommonDualSimInfo05->1 
		_HUAWEI_A199,
		//CommonDualSimInfo00->-1,CommonDualSimInfo05->1 
		_HUAWEI_Y321_C00,
		//CommonDualSimInfo00->-1,CommonDualSimInfo03->1
		_HUAWEI_C8813D,
		//CommonDualSimInfo00->-1,CommonDualSimInfo05->1
		_HUAWEI_U8825D,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_HUAWEI_Y325_T00,
		//CommonDualSimInfo00->-1,CommonDualSimInfo03->1
		_HUAWEI_G610_C00,
		//CommonDualSimInfo00->-1,CommonDualSimInfo05->1 
		_HUAWEI_Y320_T00,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_HUAWEI_G750_T00
	}

	static enum HISENSE {
		
	}


	static enum XIAOMI {
		_MI_1S,
	//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_2013022,
		//CommonDualSimInfo03->0,CommonDualSimInfo03->1
		_HM_1SC,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_HM_NOTE_1TD

	}

	static enum ZTE {
		_ZTE_V889D
	}

	static enum MEIZU {

	}

	/** 坑爹的手机，取到的厂商竟然是alps，然后在外面还显示的是oppo **/
	static enum ALPS {
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_R811,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_R801,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_U701
		
	}

	
	
	static enum COOLPAD {
		_7260,
		_7230_B,
		_COOLPAD_7235,
			//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_COOLPAD_8297,
		//CommonDualSimInfo02->-1,CommonDualSimInfo02->1
		_COOLPAD_8079,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_COOLPAD_7296,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_COOLPAD_7295C,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_COOLPAD_7295A,
		//CommonDualSimInfo02->-1,CommonDualSimInfo02->1 
		_COOLPAD_8076D,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_COOLPAD7295,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_8720,
		//CommonDualSimInfo00->-1,CommonDualSimInfo06->1
		_COOLPAD_7270
	}



	static enum LENOVO {
	//CommonDualSimInfo02->-1,CommonDualSimInfo02->1
		_LENOVO_A390T,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_LENOVO_A630T,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_LENOVO_A308T,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_LENOVO_A820T,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_LENOVO_A850,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_LENOVO_A670T,
		//CommonDualSimInfo02->-1,CommonDualSimInfo02->1
		_LENOVO_A278T,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_LENOVO_S720,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_LENOVO_A789,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_S890,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_LENOVO_S890,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_LENOVO_A820
		
	}
	
	static enum BBK {
	//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_VIVO_Y11,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_VIVO_Y17T,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_VIVO_Y11I_T,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_VIVO_Y15T,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_VIVO_S7T,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_VIVO_X1ST,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_VIVO_Y13,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_VIVO_S7,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_VIVO_Y19T,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_VIVO_S11T,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_VIVO_Y3T,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_VIVO_Y20T,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_VIVO_S9
	}
	
	static enum SONY {
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_S39H,
		_MT15I,
		_LT26I,
		_LT26II
	}

	static enum YULONG {
	
		//CommonDualSimInfo00->-1,CommonDualSimInfo06->1
		_COOLPAD_5950,
		_8020,
		_8022,
		_8060,
		_5860A
	}
	
		static enum K_TOUCH {

		
	}


	static enum OPPO {
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_R821T,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_R819T,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_R831T,
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		_R827T,
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		_R829T,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_R815T,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_R823T,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_U707T,
		//CommonDualSimInfo00->-1,CommonDualSimInfo00->1
		_R833T,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_R813T
		
	}
	
	static enum GIONEE {
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_V182,
		//CommonDualSimInfo00->-1,CommonDualSimInfo01->1
		_GN137
		
	}
	static enum OTHERPHONE {

	}
}
