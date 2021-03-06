package com.deloitte.ecommerce.dkartcarts.wadl;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.METHOD)
public @interface MethodDescription {
  /**
   * This provides description when generating docs.
   */
  public String value() default "";
  /**
   * This provides params when generating docs.
   */
  public String[] params() default {} ;
}