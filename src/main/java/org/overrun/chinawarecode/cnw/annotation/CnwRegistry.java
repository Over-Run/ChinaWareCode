package org.overrun.chinawarecode.cnw.annotation;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value=ElementType.TYPE)
public @interface CnwRegistry {
    String name() default "";
}
