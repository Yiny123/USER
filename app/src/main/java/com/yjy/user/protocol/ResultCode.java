package com.yjy.user.protocol;



public final class ResultCode {
	public static final int Code_OK = 0; 						// 正常结束，httpCode 200

	public static final int Code_Network_Unavaiable = -800; 	// 当前没有网络
	public static final int Code_Canceled = -801; 				// 请求被cancel
	public static final int Code_Request_ParamErr = -802; 		// 请求参数错误
	public static final int Code_Received_Html = -803; 			// 被劫持
	public static final int Code_Response_Empty = -804;         // 回报里的list或者item为null

	// ---- Http异常
	public static final int Code_Http_MalformedURLErr = -820; 	// url错误
	public static final int Code_Http_Client_ProtocolErr = -821; // http协议错误
	public static final int Code_Http_Connect_TimeOut = -822; 	// 连接超时
	public static final int Code_Http_Socket_Timeout = -823; 	// socket超时
	public static final int Code_Http_ConnectErr = -824; 		// 连接异常
	public static final int Code_Http_SocketErr = -825; 		// socket异常
	public static final int Code_Http_IOErr = -826; 			// IO异常
	public static final int Code_Http_Err = -827; 				// 其他Http异常

	public static final int Code_Http_EntityNull = -840; 		// 回包包体为空
	public static final int Code_Http_ResponseNull = -841; 		// 没有得到Response

	// -- JCE解包异常
	public static final int Code_PbErr_Response = -861; 		// Response jce 数据包错误
	public static final int Code_PbErr_Body = -862; 			// Body jce 数据包错误

	public static final int Code_UnzipErr = -871; 				// 解压失败
	public static final int Code_DecryptErr = -872; 			// 解密失败
		
	public static final int Code_RequestContextErr = -873;      //回包时上下文错误
	public static final int Code_CertificateFail = -874;        //身份认证失败
	public static final int Code_RequestHold_TimeOut = -875;    //请求hold住的时间太长
	
	public static final int Code_PackageReq_Err = -876;         //打包请求时发生错误
	
	//so异常定义
	public static final int Code_So_Pb_Attr_Nnt_Found = -1001;	 //查找不到相关属性
	public static final int Code_So_Pb_Encode_Err = -1002;	  //编码错误
	public static final int Code_So_Pb_Decode_Err = -1003;	  //解码错误
	public static final int Code_So_Pb_Runtime_Err = -1004;	  //其他运行时错误
	public static final int Code_So_Pb_Malloc_Err = -1005;	  //内存申请失败错误
	public static final int Code_So_Pb_Decode_EopNExt = -1006;	  //可选字段不存在
	public static final int Code_So_Fake_Aappid_Entity = -1007;      //伪造程序身份
	public static final int Code_So_Read_Cert_Fail = -1008;         //证书获取失败
	public static final int Code_So_Mem_Alloc_FAIL = -1009;        //内存分配失败
	public static final int Code_So_Compress_Fail = -1010;         //压缩失败
	public static final int Code_So_Encrypt_Fail = -1011;          //加密失败
	public static final int Code_So_Decrypt_Fail = -1012;          //解密失败
	public static final int Code_So_Uncompress_Fail = -1013;  //解压失败
	public static final int Code_So_New_Object_Fail = -1014;   //c层new对象失败
	public static final int Code_So_Get_JavaData_Fail = -1015;  //java层对象获取失败
	public static final int Code_So_Fake_AuthRequest = -1016;  //伪造认证协议（随机数验证错误）
	public static final int Code_So_Synchroinzed_Fail = -1017;  //so同步失败
	public static final int Code_So_Fake_StaTicket_Request  = -1018; //请求非法，在so没有动态票据的时候不加认证协议
	public static final int Code_So_Abandon_Request = -1019;   //过期废弃的请求，老的请求，但票据已经换过，不需要重换，只需重发
	
	public static final int Code_Upload_GetMd5_Err = -1020;    //上传文件，获取文件md5失败
	public static final int Code_Upload_Interrupted_Err = -1021; //上传文件，线程中断异常
	public static final int Code_Upload_Execution_Err = -1022; //上传文件，线程执行异常
	
	
	public static final int Code_Invalid = -9999; //无效的错误码

}
