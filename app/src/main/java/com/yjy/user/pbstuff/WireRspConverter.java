package com.yjy.user.pbstuff;

import android.util.Log;

import com.squareup.wire.ProtoAdapter;

import java.io.IOException;
import java.lang.reflect.Method;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

public class WireRspConverter<T>
        implements Converter<ResponseBody, T> {
    private Class<T> tClass;

    public WireRspConverter(Class<T> paramClass) {
        this.tClass = paramClass;
    }

    public T convert(ResponseBody paramResponseBody)
            throws IOException {
        try {
            Object localObject1 = this.tClass.getDeclaredField("ADAPTER").get(this.tClass);
            Log.d("WireRspConverter", localObject1.getClass().getSimpleName());
            //new Class[] { [B.class }

            Method[] methods = ProtoAdapter.class.getDeclaredMethods();
            for (Method method : methods) {
                //                Log.d("WireRspConverter", "convert: " + method);
            }

            Method localMethod = ProtoAdapter.class.getDeclaredMethod("decode", new Class[]{byte[].class});


            Object[] arrayOfObject = new Object[1];
            arrayOfObject[0] = paramResponseBody.bytes();
            T localObject2 = (T) localMethod.invoke(localObject1, arrayOfObject);

            return localObject2;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchFieldException e1) {
            e1.printStackTrace();
            return null;
        } /*catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            return null;
        } */ catch (OnErrorNotImplementedException ee4) {
            ee4.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return null;
    }
}