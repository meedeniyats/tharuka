package com.sand.assignment.singtel.model;

public class Butterfly extends Animal implements Flyable {

	protected Wing wing = new Wing();

	@Override
	public void fly() {
		this.wing.makeFly();
	}

}
