package com.sand.assignment.singtel.model;

public class FlyableBird extends Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("I am flying");
	}

}
