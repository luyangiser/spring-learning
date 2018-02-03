package spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//˵��ʱ������
@Configuration
//����Spring MVC
@EnableWebMvc
//�������ɨ��
@ComponentScan("spittr.web")
public class WebConfig extends WebMvcConfigurerAdapter{
	/*
	 * ������ͼ����������/WEB-INF/views/Ŀ¼�£�������jsp��β����ͼ��jsp�ļ�����
	 * ���������Ƿ�������Spring bean��Ӧ�ó����������п�����Ϊ�������Է��ʣ�һ���������ԾͿ���ͨ���ӳټ��
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
	
	//���þ�̬��Դ�Ĵ���,Ҫ��DispatcherServlet�Ծ�̬��Դ������ת����Ĭ�ϵ�servlet��
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
