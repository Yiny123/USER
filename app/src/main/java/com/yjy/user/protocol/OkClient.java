package com.yjy.user.protocol;

import com.yjy.user.app.BaseApplication;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;

public class OkClient
{
  private static final int DEFAULT_TIME = 10;
  private static final Interceptor REWRITE_CACHE_CONTROL_INTERCEPTOR = new Interceptor()
  {
    public Response intercept(Interceptor.Chain paramChain)
      throws IOException
    {
      return paramChain.proceed(paramChain.request());
    }
  };
  private static Cache cache;
  private static int cacheSize;
  public static OkHttpClient client;
  private static File httpCacheDirectory;

  static
  {
    BaseApplication.getInstance();
    httpCacheDirectory = new File(BaseApplication.getContext().getCacheDir(), "itCache");
    cacheSize = 10485760;
    cache = new Cache(httpCacheDirectory, cacheSize);
    client = new OkHttpClient.Builder().connectTimeout(10L, TimeUnit.SECONDS).readTimeout(10L, TimeUnit.SECONDS).writeTimeout(10L, TimeUnit.SECONDS).build();
  }
}