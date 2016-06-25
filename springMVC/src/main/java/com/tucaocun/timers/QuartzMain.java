package com.tucaocun.timers;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuartzMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory = new ClassPathXmlApplicationContext("spring-quartz.xml");
		
		
		

	}

}
