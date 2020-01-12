package com.sand.assignment.singtel.model;

public class Dolphin implements Swimmable {
	
	protected Fin fin = new Fin();

	@Override
	public void swim() {
		fin.makeSwim();
	}

}
