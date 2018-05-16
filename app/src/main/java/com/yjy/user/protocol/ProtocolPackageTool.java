package com.yjy.user.protocol;/**
 * Created by Administrator on 2017/10/31.
 */

import android.text.TextUtils;

import com.yijianyi.protocol.AppRequest;
import com.yijianyi.protocol.AppResponse;
import com.yijianyi.protocol.ReqHead;
import com.yijianyi.protocol.RequestItem;
import com.yijianyi.protocol.ResponseItem;
import com.yijianyi.protocol.RspHead;
import com.yijianyi.protocol.Terminal;
import com.yjy.user.app.AccountManager;
import com.yjy.user.utils.Global;

import java.util.List;

/**
 * Created by liny on 2017/10/31. 16:37
 */
public class ProtocolPackageTool {


    public static AppRequest packageRequest(List<RequestItem> requests, int seqId) {
        if (requests == null || requests.isEmpty())
            return null;

        AppRequest.Builder appReqBuilder =new AppRequest.Builder();
                appReqBuilder.reqs = requests;

        appReqBuilder.requestId(seqId);
        appReqBuilder.version(Global.PROTO_VERSION);
        //TODO set user token
        //		appReqBuilder.setToken(null);


        ReqHead.Builder reqHeadBuilder =new ReqHead.Builder();
        packageTerminal(reqHeadBuilder);

        String yua = Global.getYUA();
        if (yua != null) {
            reqHeadBuilder.YUA(yua);
        }
        String guid = Global.getGuid();
        if (guid != null) {
            reqHeadBuilder.GUID(guid);
        }
        String sid = AccountManager.getInstance().getSid();
        if (sid != null) {
            reqHeadBuilder.SID(sid);
        }

        appReqBuilder.head(reqHeadBuilder.build());
        // TODO: 2017/3/3 lin 2017年3月8日19:29:47  2017年3月17日10:24:44
        //        appReqBuilder.setGpsInfo(AMapLBSEngine.getInstance().getLbsData());

        return appReqBuilder.build();
    }


    private static void packageTerminal(ReqHead.Builder builder) {
        Terminal.Builder terminalBuilder =  new Terminal.Builder();
        terminalBuilder.CHANNELID("android");
        String androidId = Global.getAndroidid();
        if (androidId != null) {
            terminalBuilder.ANDROIDID(Global.getAndroidid());
        }

        String imsi = Global.getImsi();
        if (imsi != null) {
            terminalBuilder.IMEI(imsi);
        }
        String imsi2 = Global.getImsi2();
        if (imsi2 != null) {
            terminalBuilder.IMEI2(imsi2);
        }

        String mac = Global.getMac();
        if (mac != null) {
            terminalBuilder.MAC(mac);
        }

        builder.terminal = terminalBuilder.build();
    }

    public static List<ResponseItem> unpackageResponse(AppResponse response) {
        if (response == null)
            return null;

        RspHead header = response.head;
        String guid = header.GUID;
        if (!TextUtils.isEmpty(guid)) {
            // 不为空，说明第一次下发guid，或者是guid变化
            Global.setGuid(guid);
            //            MessageManager.getInstance().initialize();
        }

        String sid = header.SID;
        if (!TextUtils.isEmpty(sid)) {
            AccountManager.getInstance().setSid(sid);
        }
        return response.rsps;
    }


}
