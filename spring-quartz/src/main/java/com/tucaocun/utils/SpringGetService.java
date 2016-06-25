package com.tucaocun.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringGetService implements ApplicationContextAware {
	public static ApplicationContext applicationContext;
	
	public static Object getSpringEntry(String beanId){
		checkApplicationContext();
		return applicationContext.getBean(beanId);
	}
	public static <T>T getSpringEntry(String beanId,Class<T>clazz){
		checkApplicationContext();
		return applicationContext.getBean(beanId,clazz);
	}

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		
		applicationContext = ctx;
	}
	
	private static void checkApplicationContext() {  
		if (applicationContext == null) {  
		throw new IllegalStateException("applicaitonContext未注入,请在applicationContext.xml中定义SpringContextHolder");  
		}  
		} 

}
