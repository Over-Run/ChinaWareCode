package org.overrun.chinawarecode.cnw.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value= ElementType.FIELD)
public @interface CnwField {
    String name() default "";
}
