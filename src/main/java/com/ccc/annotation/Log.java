package com.ccc.annotation;

import java.lang.annotation.*;

/**
 * Created by ccc on 2017/6/6.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    String value() default "";
}
