package com.sand.assignment.singtel.model;

public class Bird extends Animal implements Flyable, Singable {
	
	@Override
	public void fly() {
		System.out.println("I am flying");
	}
	
	@Override
	public void sing() {
		System.out.println("I am singing");
	}
	
}