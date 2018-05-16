package com.yjy.user.utils;

import android.net.ParseException;

import com.google.gson.JsonParseException;

import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONException;

import java.net.ConnectException;
import java.net.SocketTimeoutException;

import javax.net.ssl.SSLHandshakeException;

import retrofit2.HttpException;

public class ExceptionHandle
{
  private static final int BAD_GATEWAY = 502;
  private static final int FORBIDDEN = 403;
  private static final int GATEWAY_TIMEOUT = 504;
  private static final int INTERNAL_SERVER_ERROR = 500;
  private static final int NOT_FOUND = 404;
  private static final int REQUEST_TIMEOUT = 408;
  private static final int SERVICE_UNAVAILABLE = 503;
  private static final int UNAUTHORIZED = 401;

  public static ResponeThrowable handleException(Throwable paramThrowable)
  {
    if ((paramThrowable instanceof HttpException))
    {
      HttpException localHttpException = (HttpException)paramThrowable;
      ResponeThrowable localResponeThrowable8 = new ResponeThrowable(paramThrowable, 1003);
      localHttpException.code();
      localResponeThrowable8.message = "网络错误";
      return localResponeThrowable8;
    }
    if ((paramThrowable instanceof ServerException))
    {
      ServerException localServerException = (ServerException)paramThrowable;
      ResponeThrowable localResponeThrowable7 = new ResponeThrowable(localServerException, localServerException.code);
      localResponeThrowable7.message = localServerException.message;
      return localResponeThrowable7;
    }
    if (((paramThrowable instanceof JsonParseException)) || ((paramThrowable instanceof JSONException)) || ((paramThrowable instanceof ParseException)))
    {
      ResponeThrowable localResponeThrowable1 = new ResponeThrowable(paramThrowable, 1001);
      localResponeThrowable1.message = "解析错误";
      return localResponeThrowable1;
    }
    if ((paramThrowable instanceof ConnectException))
    {
      ResponeThrowable localResponeThrowable2 = new ResponeThrowable(paramThrowable, 1002);
      localResponeThrowable2.message = "连接失败";
      return localResponeThrowable2;
    }
    if ((paramThrowable instanceof SSLHandshakeException))
    {
      ResponeThrowable localResponeThrowable3 = new ResponeThrowable(paramThrowable, 1005);
      localResponeThrowable3.message = "证书验证失败";
      return localResponeThrowable3;
    }
    if ((paramThrowable instanceof ConnectTimeoutException))
    {
      ResponeThrowable localResponeThrowable4 = new ResponeThrowable(paramThrowable, 1006);
      localResponeThrowable4.message = "连接超时";
      return localResponeThrowable4;
    }
    if ((paramThrowable instanceof SocketTimeoutException))
    {
      ResponeThrowable localResponeThrowable5 = new ResponeThrowable(paramThrowable, 1006);
      localResponeThrowable5.message = "连接超时";
      return localResponeThrowable5;
    }
    ResponeThrowable localResponeThrowable6 = new ResponeThrowable(paramThrowable, 1000);
    localResponeThrowable6.message = "未知错误";
    return localResponeThrowable6;
  }

  class ERROR
  {
    public static final int HTTP_ERROR = 1003;
    public static final int NETWORD_ERROR = 1002;
    public static final int PARSE_ERROR = 1001;
    public static final int SSL_ERROR = 1005;
    public static final int TIMEOUT_ERROR = 1006;
    public static final int UNKNOWN = 1000;

    ERROR()
    {
    }
  }

  public static class ResponeThrowable extends Exception
  {
    public int code;
    public String message;

    public ResponeThrowable(Throwable paramThrowable, int paramInt)
    {
      super();
      this.code = paramInt;
    }
  }

  public class ServerException extends RuntimeException
  {
    public int code;
    public String message;

    public ServerException()
    {
    }
  }
}