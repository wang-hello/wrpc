package com.github.wang.wrpc.common.ext;

import java.lang.annotation.*;


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Spi {

    /**
     * 是否是单例
     * @return
     */
    boolean singleton() default true;

}
