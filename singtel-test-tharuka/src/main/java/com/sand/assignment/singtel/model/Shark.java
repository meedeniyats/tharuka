package com.sand.assignment.singtel.model;

public class Shark extends Fish implements FishEater {
	
	public Shark() {
		this.color = Color.GREY;
		this.size = Size.LARGE;
	}

	public void eat(Fish fish) {
		System.out.println("Shark eating");
	}
}
