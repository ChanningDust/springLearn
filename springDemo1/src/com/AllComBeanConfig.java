package com;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @function 自动扫描com包下所有的bean
 *
 */

@Configuration
@ComponentScan(basePackages ="com")
public class AllComBeanConfig {
}
