package com.tommy.card;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		card card1 = context.getBean("Monster", card.class);
		card card2 = context.getBean("Spell", card.class);
		card card3 = context.getBean("Trap", card.class);
		
		card1.cardtype("coklat");
		card2.cardtype("hijau");
		card3.cardtype("ungu");
		
		
		context.close();
	}
}
