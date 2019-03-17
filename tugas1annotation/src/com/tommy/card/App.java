package com.tommy.card;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Type.xml");
		card card1 = context.getBean("myMonster", card.class);
		card card2 = context.getBean("mySpell", card.class);
		card card3 = context.getBean("myTrap", card.class);
		
		card1.cardtype("coklat");
		card2.cardtype("hijau");
		card3.cardtype("ungu");
		
		
		context.close();
	}
}
