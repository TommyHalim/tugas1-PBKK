package com.tommy.card;

import org.springframework.stereotype.Component;

@Component("myTrap")

public class Trap implements card{
	private String type;

	public void cardtype(String warna) {
		System.out.println("Trap card berwarna " + warna);		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
