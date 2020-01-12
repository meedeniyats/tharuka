package com.sand.assignment.singtel.model;

public class Bird extends Animal implements Singable {
	
	@Override
	public void sing() {
		System.out.println("I am singing");
	}
	
}