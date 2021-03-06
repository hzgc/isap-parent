package com.gosun.isap.warn.impl.alert.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 警情查看权限注解。
 * <p>创建时间：2017/5/15 12:34</p>
 *
 * @author 娄存银
 * @version 1.0
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckAlertPermission {
}
