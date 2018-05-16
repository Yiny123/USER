package com.yjy.user.protocol;/**
 * Created by Administrator on 2018/4/3.
 */

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;

import java.lang.reflect.Field;

import okio.ByteString;

/**
 * Created by liny on 2018/4/3. 17:03
 */
public class PbUtil {
    public static ByteString pbToByteString(Message body) {
        try {
            Class<? extends Message> aClass = body.getClass();
            Field adapter = aClass.getField("ADAPTER");
            ProtoAdapter o = (ProtoAdapter) adapter.get(body);
            return ByteString.of(o.encode(body));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return null;
    }
}
