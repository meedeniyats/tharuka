package com.sand.assignment.singtel.model;

public class ClownFish extends Fish implements Joker {
	
	public ClownFish(Color color) {
		this.color = color;
	}
	
	public ClownFish() {
		this.color = Color.ORANGE;
	}

	@Override
	public void makeJokes() {
		System.out.println("ClownFish joking");
		
	}
	
	
	
	

}
