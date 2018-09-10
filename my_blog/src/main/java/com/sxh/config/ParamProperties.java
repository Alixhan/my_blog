package com.sxh.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description param.properties 文件映射类
 * @author 孙小寒
 * @date 2018-09-08
 */
@Configuration
@ConfigurationProperties(prefix = "param",ignoreInvalidFields = true)  
@PropertySource(value="classpath:config/param.properties",encoding = "UTF-8")
@Component@Setter@Getter
public class ParamProperties {
	private String field01;
}
