package com.yjy.user.protocol;

import com.yijianyi.protocol.AppResponse;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by liny on 2017/10/31. 17:46
 */
public interface UserApi {

    @POST("api/")
    Observable<AppResponse> operate(@Body RequestBody paramRequestBody);
}
