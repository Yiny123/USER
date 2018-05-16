package com.yjy.user.protocol;/**
 * Created by Administrator on 2017/10/31.
 */

import android.text.TextUtils;
import android.widget.Toast;

import com.yijianyi.protocol.APP_ERROR_CODE;
import com.yijianyi.protocol.AppError;
import com.yijianyi.protocol.AppResponse;
import com.yijianyi.protocol.ResponseItem;
import com.yjy.user.BuildConfig;
import com.yjy.user.app.BaseApplication;
import com.yjy.user.app.ThreadManager;
import com.yjy.user.utils.Global;
import com.yjy.user.utils.ULog;

import java.util.List;

import okio.ByteString;

/**
 * Created by liny on 2017/10/31. 17:28
 */
public class ResponseEngine {
    public static final String TAG = "ResponseEngine";
    private OnResponseListener listener;

    public ResponseEngine(OnResponseListener paramOnResponseListener) {
        this.listener = paramOnResponseListener;
    }


    private void response(ResponseItem paramResponseItem) {
        AppError localAppError = paramResponseItem.err;


        APP_ERROR_CODE errorCode = localAppError.errorCode;
        String msg = localAppError.msg;

        if (errorCode == null && !TextUtils.isEmpty(msg) && msg.equals("成功"))
            errorCode = APP_ERROR_CODE.AEC_SUCCESS;


        if (errorCode == APP_ERROR_CODE.AEC_SUCCESS) {
            if (this.listener != null) {
                this.listener.onComplete(paramResponseItem.binBody);
            }
        } else if (this.listener != null) {
            this.listener.onError(localAppError, msg, paramResponseItem.binBody);

        }

    }

    private void toastError(final AppError paramAppError) {
        if ((!Global.isDev()) || (paramAppError == null))
            return;
        ThreadManager.getMainThreadHandler().post(new Runnable() {
            public void run() {
                String str1 = "ret: " + paramAppError.errorCode;
                String str2 = str1 + "| msg: " + paramAppError.msg;
                Toast.makeText(BaseApplication.getContext(), str2, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void response(AppResponse paramAppResponse) {
        if (paramAppResponse != null) {
            if (BuildConfig.DEBUG)
                ULog.d("ResponseEngine", paramAppResponse.toString());
            List localList = ProtocolPackageTool.unpackageResponse(paramAppResponse);
            for (int i = 0; i < localList.size(); i++)
                response((ResponseItem) localList.get(i));
        }
    }


    public interface OnResponseListener {
        void onComplete(ByteString paramByteString);

        void onError(AppError paramAppErrorCode, String paramString, ByteString paramByteString);
    }

}
