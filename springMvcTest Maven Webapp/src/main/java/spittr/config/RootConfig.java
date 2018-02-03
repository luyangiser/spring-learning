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
 * �������excludeFilters�е����ݣ�
 * 1��excludeFilters����˼��������Ҫ�ų�һЩBean��ɨ���Filter
 * 2����@Filter������һ��Filter
 * 3��Filter������Ϊע�⣬��Filter�е���ʽ��FilterType.ANNOTATION
 * 4��ע���ֵΪEnableWebMvc�е�ע�⣬��Controller��
 * 
 * ������֤������δ��֤������EnableWebMvc.class����Controller.class����������WebMVC��ע����û��Filter��
 */
public class RootConfig {

}
