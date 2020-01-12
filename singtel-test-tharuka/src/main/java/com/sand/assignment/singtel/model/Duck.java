package com.sand.assignment.singtel.model;

public class Duck extends FlyableBird implements Swimmable {

	@Override
	public void swim() {
		System.out.println("I am swimming");
	}
	
	@Override
	public void sing() {
		System.out.println("Quack, quack");
	}

}
