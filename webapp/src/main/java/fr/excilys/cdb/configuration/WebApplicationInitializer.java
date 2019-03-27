package fr.excilys.cdb.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class [] {};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class [] {ConfigWebapp.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String [] {"/"};
	}
	
}