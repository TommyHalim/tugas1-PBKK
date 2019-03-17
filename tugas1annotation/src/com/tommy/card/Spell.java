package com.tommy.card;

import org.springframework.stereotype.Component;

@Component("mySpell")

public class Spell implements card {
	private String type;

	public void cardtype(String warna) {
		System.out.println("Spell card berwarna " + warna);
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
