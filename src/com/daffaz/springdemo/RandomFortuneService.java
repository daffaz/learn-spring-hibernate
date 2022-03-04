package com.daffaz.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] fortune = {
			"You got this",
			"Give up already",
			"This is not the day"
	};
	
	@Override
	public String getFortune() {
		Random index = new Random();
		
		return this.fortune[index.nextInt(3)];
	}

}
