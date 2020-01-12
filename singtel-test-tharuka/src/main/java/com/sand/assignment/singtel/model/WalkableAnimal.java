package com.sand.assignment.singtel.model;

public abstract class WalkableAnimal extends Animal implements Walkable {

	@Override
	public void walk() {
		System.out.println("I am walking");
	}
	
}
