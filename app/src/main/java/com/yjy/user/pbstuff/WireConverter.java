package com.yjy.user.pbstuff;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

public class WireConverter extends Converter.Factory
{
  public static WireConverter create()
  {
    return new WireConverter();
  }

  public Converter<?, RequestBody> requestBodyConverter(Type paramType, Annotation[] paramArrayOfAnnotation1, Annotation[] paramArrayOfAnnotation2, Retrofit paramRetrofit)
  {
    return super.requestBodyConverter(paramType, paramArrayOfAnnotation1, paramArrayOfAnnotation2, paramRetrofit);
  }

  public Converter<ResponseBody, ?> responseBodyConverter(Type paramType, Annotation[] paramArrayOfAnnotation, Retrofit paramRetrofit)
  {
    if (!(paramType instanceof Class))
      return null;
    return new WireRspConverter((Class)paramType);
  }
}