package com.sand.assignment.singtel.model;

public class Fish extends Animal implements Swimmable {

	@Override
	public void swim() {
		System.out.println("Fish swimming");
	}

}
