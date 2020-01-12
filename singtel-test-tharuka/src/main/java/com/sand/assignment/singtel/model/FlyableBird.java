package com.sand.assignment.singtel.model;

public class FlyableBird extends Bird implements Flyable {
	
	protected Wing wing = new Wing();

	@Override
	public void fly() {
		this.wing.makeFly();
	}

}
