package com.daffaz.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve the bean
		Coach myCoach = context.getBean("myCoach", Coach.class);
		System.out.println(myCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
