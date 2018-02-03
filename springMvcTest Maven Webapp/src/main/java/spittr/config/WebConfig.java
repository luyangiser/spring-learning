package spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//说明时配置类
@Configuration
//启动Spring MVC
@EnableWebMvc
//启动组件扫描
@ComponentScan("spittr.web")
public class WebConfig extends WebMvcConfigurerAdapter{
	/*
	 * 配置视图解析器，在/WEB-INF/views/目录下，并且以jsp结尾的视图（jsp文件），
	 * 并且设置是否让所有Spring bean在应用程序上下文中可以作为请求属性访问，一旦访问属性就可以通过延迟检查
	 */
	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver internalResourceViewResolver =
				new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/views/");
		internalResourceViewResolver.setSuffix(".jsp");
		internalResourceViewResolver.setExposeContextBeansAsAttributes(true);
		return internalResourceViewResolver;
	}
	
	//配置静态资源的处理,要求DispatcherServlet对静态资源的请求转发到默认的servlet上
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
