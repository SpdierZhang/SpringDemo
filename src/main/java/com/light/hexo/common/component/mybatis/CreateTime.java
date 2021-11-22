package com.light.hexo.common.component.mybatis;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author MoonlightL
 * @ClassName: CreateTime
 * @ProjectName hexo-boot
 * @Description: 创建时间注解
 * @DateTime 2020/7/29 17:34
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface CreateTime {
}
