package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * AbstractAnnotationConfigDispatcherServletInitializer是WebApplicationInitializer的基础实现类
 * =======================执行细节=========================
 * 1、servlet容器会在类路径中查找javax.servlet.ServletContainerInitializer的实现类，用来配置Servlet容器
 * 2、Spring提供了上述这个接口的实现，SpringServletContainerInitializer
 * 3、SpringServletContainerInitializer会去寻找WebApplicationInitializer的实现类并将配置任务交给这些类完成
 * 4、自己写的SpittrWebAppInitializer类扩展了AbstractAnnotationConfigDispatcherServletInitializer，也就是
 * 	    实现了WebApplicationInitializer接口，所以Servlet容器会发现，并用来配置Servlet上下文。
 * 注：AbstractAnnotationConfigDispatcherServletInitializer是在Spring3.2中引入的
 * ========================================================
 * 这种通过扩展AbstractAnnotationConfigDispatcherServletInitializer需要在Servlet3.0上使用，（与Web.xml配置的差别）
 * 所以需要支持servlet3.0的服务器，Tomcat7以上
 * @author lu_gi
 *
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	//指明当ContextLoaderListener加载应用上下文（数据层、中间层用的一些Bean）时，使用的配置文件在RootConfig类中
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] {RootConfig.class};
	}

	//指明当DispatcherServlet加载应用上下文（web用的一些Bean，如控制器、视图解析器、处理映射器）时，使用的配置文件在WebConfig类中
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] {WebConfig.class};
	}

	//将DispatcherServlet映射到"/"
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}
	
}
