package com.daffaz.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		//		load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		//		retrieve the bean from spring container
//		CricketCoach cricketCoach = 
//				context.getBean("myCricketCoach", CricketCoach.class);

		//		call the methods on the bean
//		System.out.println(cricketCoach.getDailyWorkout());
//		System.out.println(cricketCoach.getDailyFortune());
//		System.out.println(cricketCoach.getEmailAddress());
//		System.out.println(cricketCoach.getTeam());
		
		Coach coach = context.getBean("myRandomCoach", Coach.class);
		System.out.println(coach.getDailyFortune());
		//		close the context
		
		context.close();
	}

}
