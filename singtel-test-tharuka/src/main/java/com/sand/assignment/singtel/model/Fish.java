package com.sand.assignment.singtel.model;

public class Fish extends Animal implements Swimmable {
	
	public enum Size{ SMALL, MEDIUM, LARGE};
	
	public enum Color{ GREY, ORANGE }
	
	protected Size size;
	protected Color color;

	@Override
	public void swim() {
		System.out.println("Fish swimming");
	}

}
