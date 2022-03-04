package com.daffaz.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		FortuneService fortuneService = new HappyFortuneService();
		Coach theCoach = new TrackCoach(fortuneService);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
//		Below will result NullPointerException, because we 
//		did'nt inject any FortuneService to the TrackCoach class
		
//		Coach anotherCoach = new TrackCoach();
//		System.out.println("NEW COACH====\n");
//		System.out.println(anotherCoach);
	}

}
