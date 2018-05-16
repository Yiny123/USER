package com.yjy.user.protocol;/**
 * Created by Administrator on 2017/10/31.
 */

import android.util.Log;

import com.yijianyi.protocol.APP_COMMAND;
import com.yijianyi.protocol.AppRequest;
import com.yijianyi.protocol.RequestItem;
import com.yjy.user.utils.Global;

import org.reactivestreams.Subscription;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import io.reactivex.disposables.Disposable;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.ByteString;


/**
 * Created by liny on 2017/10/31. 16:13
 */
public abstract class BaseEngine<T> implements IProtocolEngine {
    public static final String BASE_URL = Global.getBaseUrl();
    public static final int ENCRYPT_NO = 1;
    public static final int ENCRYPT_YES = 2;

    protected ConcurrentHashMap<APP_COMMAND, Disposable> mSubscriptions = new ConcurrentHashMap();

    /**
     * 生成请求体
     *
     * @param paramByteString 请求体
     * @param paramInt        是否加密
     * @param paramAppCommand 请求命令
     * @return
     */
    protected RequestItem genRequestItem(ByteString paramByteString, int paramInt, APP_COMMAND paramAppCommand) {
        RequestItem.Builder builder = new RequestItem.Builder();
        builder.command(paramAppCommand);
        builder.binBody(paramByteString);
        builder.encrypt(paramInt);
        return builder.build();
    }

    /**
     * 默认不加密
     *
     * @param paramByteString
     * @param paramAppCommand
     * @return
     */
    protected RequestItem genRequestItem(ByteString paramByteString, APP_COMMAND paramAppCommand) {
        return genRequestItem(paramByteString, 1, paramAppCommand);
    }

    /**
     * 获取请求api
     *
     * @return
     */
    protected abstract T getApiServer();

    protected RequestBody getRequestBody(RequestItem paramRequestItem) {
        return RequestBody.create(MediaType.parse("application/x-www-form-urlencoded;charset=UTF-8"), getBody(paramRequestItem));
    }

    protected byte[] getBody(RequestItem paramRequestItem) {
        AppRequest localAppRequest = ProtocolPackageTool.packageRequest(wrapRequest(paramRequestItem), 0);
        if (localAppRequest != null) {
            ByteString byteString = PbUtil.pbToByteString(localAppRequest);
            return byteString.toByteArray();
        }
//                    return localAppRequest.toByteArray();
        return null;
    }


    public void register(APP_COMMAND paramAppCommand, Disposable paramSubscription) {
        if (paramSubscription == null)
            return;
        synchronized (this.mSubscriptions) {
            if (this.mSubscriptions.contains(paramSubscription))
                return;
        }
        Log.d("BaseModel", "register:" + paramAppCommand);
        this.mSubscriptions.put(paramAppCommand, paramSubscription);
        //        monitorexit;
    }


    public void unregister(APP_COMMAND paramAppCommand) {
        if (paramAppCommand == null)
            return;
        synchronized (this.mSubscriptions) {
            Subscription localSubscription = (Subscription) this.mSubscriptions.get(paramAppCommand);
            if (localSubscription != null) {
                this.mSubscriptions.remove(paramAppCommand);
                //                if (!localSubscription.isUnsubscribed())
                //                {
                Log.d("BaseModel", "unregister:" + paramAppCommand);
                localSubscription.cancel();
                //                }
            }
            return;
        }
    }

    public void unregisterAll() {
        synchronized (this.mSubscriptions) {
            Iterator localIterator = this.mSubscriptions.entrySet().iterator();
            while (localIterator.hasNext()) {
                Subscription localSubscription = (Subscription) ((Map.Entry) localIterator.next()).getValue();
                if ((localSubscription == null)/*|| (localSubscription.isUnsubscribed())*/)
                    continue;
                localSubscription.cancel();
            }
        }
        this.mSubscriptions.clear();
        //        monitorexit;
    }

    protected List<RequestItem> wrapRequest(RequestItem paramRequestItem) {
        if (paramRequestItem == null)
            return null;
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(paramRequestItem);
        return localArrayList;
    }


}
