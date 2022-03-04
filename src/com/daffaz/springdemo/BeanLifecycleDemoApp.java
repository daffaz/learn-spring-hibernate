package com.daffaz.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		// retrieve the bean
		Coach myCoach = context.getBean("myCoach", Coach.class);
		System.out.println(myCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
