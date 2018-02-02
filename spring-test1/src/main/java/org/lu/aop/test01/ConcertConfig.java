package org.lu.aop.test01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * aop和ioc的配置类
 * @author lu_gi
 *
 */
@Configuration
//启动自动代理功能，等价于在XML配置文件中加入<aop:aspectj-autoproxy>
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig {
	
	@Bean
	public Audience audience(){
		return new Audience();
	}
}
