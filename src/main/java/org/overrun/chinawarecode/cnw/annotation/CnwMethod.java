package org.overrun.chinawarecode.cnw.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value= ElementType.METHOD)
public @interface CnwMethod {
    String name() default "";
}
