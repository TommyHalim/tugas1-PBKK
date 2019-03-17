package com.tommy.card;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public card Monster() {
		Monster myMonster = new Monster();
		
		return myMonster;
	}
	
	@Bean
	public card Spell() {
		Spell mySpell = new Spell();
		
		return mySpell;
	}
	
	@Bean
	public card Trap() {
		Trap myTrap = new Trap();
		
		return myTrap;
	}

}
