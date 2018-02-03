package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * AbstractAnnotationConfigDispatcherServletInitializer��WebApplicationInitializer�Ļ���ʵ����
 * =======================ִ��ϸ��=========================
 * 1��servlet����������·���в���javax.servlet.ServletContainerInitializer��ʵ���࣬��������Servlet����
 * 2��Spring�ṩ����������ӿڵ�ʵ�֣�SpringServletContainerInitializer
 * 3��SpringServletContainerInitializer��ȥѰ��WebApplicationInitializer��ʵ���ಢ���������񽻸���Щ�����
 * 4���Լ�д��SpittrWebAppInitializer����չ��AbstractAnnotationConfigDispatcherServletInitializer��Ҳ����
 * 	    ʵ����WebApplicationInitializer�ӿڣ�����Servlet�����ᷢ�֣�����������Servlet�����ġ�
 * ע��AbstractAnnotationConfigDispatcherServletInitializer����Spring3.2�������
 * ========================================================
 * ����ͨ����չAbstractAnnotationConfigDispatcherServletInitializer��Ҫ��Servlet3.0��ʹ�ã�����Web.xml���õĲ��
 * ������Ҫ֧��servlet3.0�ķ�������Tomcat7����
 * @author lu_gi
 *
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	//ָ����ContextLoaderListener����Ӧ�������ģ����ݲ㡢�м���õ�һЩBean��ʱ��ʹ�õ������ļ���RootConfig����
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] {RootConfig.class};
	}

	//ָ����DispatcherServlet����Ӧ�������ģ�web�õ�һЩBean�������������ͼ������������ӳ������ʱ��ʹ�õ������ļ���WebConfig����
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] {WebConfig.class};
	}

	//��DispatcherServletӳ�䵽"/"
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}
	
}
