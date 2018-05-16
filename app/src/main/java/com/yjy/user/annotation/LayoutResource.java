package com.yjy.user.annotation;

/**
 * Created by liny on 2018/4/4. 20:37
 */

import android.support.annotation.LayoutRes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface LayoutResource {
    @LayoutRes
    int value() default 0;
}
