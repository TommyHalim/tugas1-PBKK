package com.tommy.card;

public class Monster implements card {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void cardtype(String warna) {
		System.out.println("Monster card berwarna " + warna);
		
	}
	

}
