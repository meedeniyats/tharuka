package com.sand.assignment.singtel.model;

public class Fish extends Animal implements Swimmable {
	
	public enum Size{ SMALL, MEDIUM, LARGE};
	
	public enum Color{ GREY, ORANGE }
	
	protected Size size;
	protected Color color;
	
	protected Fin fin = new Fin();

	@Override
	public void swim() {
		fin.makeSwim();
	}

}
