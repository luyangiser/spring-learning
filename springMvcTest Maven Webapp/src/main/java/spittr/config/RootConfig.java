package spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages={"spittr"}, 
	excludeFilters=
		{@Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)})
/*
 * 个人理解excludeFilters中的内容：
 * 1、excludeFilters的意思是设置需要排除一些Bean不扫面的Filter
 * 2、用@Filter定义了一个Filter
 * 3、Filter的类型为注解，在Filter中的形式是FilterType.ANNOTATION
 * 4、注解的值为EnableWebMvc中的注解，如Controller等
 * 
 * 设想验证方法（未验证）：将EnableWebMvc.class换成Controller.class，看其他的WebMVC的注解有没有Filter掉
 */
public class RootConfig {

}
