package exercise.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import exercise.config.SessionConfig;
import exercise.config.SecurityConfig;

public class MvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { SecurityConfig.class, SessionConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { MvcConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}
