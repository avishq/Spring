package com.tech.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected String[] getServletMappings() {
		System.out.println("Mapping ");
		return new String[] { "/" };
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// System.out.println("getRootConfigClasses " +
		// ap.getClass().getName());
		System.out.println("getRootConfigClasses ");
		return new Class[] {SecurityConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses ");
		return new Class<?>[] { AppConfig.class, SecurityConfig.class };
	}

}