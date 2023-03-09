package org.overrun.chinawarecode.code.cnw.annotation;


import java.lang.annotation.*;
public class CnwAnnotations {
    public static void searchAnnotation() {

    }
    /**
     * @since 注册类
     */
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Target(value= ElementType.TYPE)
    public @interface Registry {
        String name() default "";
    }
}
