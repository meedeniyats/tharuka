package com.sand.assignment.singtel.model;

public class CaterpillarOrButterfly extends Animal implements Walkable, Flyable {
	
	private Caterpillar caterpillar;
	
	private Butterfly butterfly;
	
	public CaterpillarOrButterfly() {
		this.caterpillar = new Caterpillar();
	}

	@Override
	public void fly() {
		if (this.butterfly == null)
			throw new IllegalStateException();
		
		this.butterfly.fly();
	}

	@Override
	public void walk() {
		if (this.caterpillar == null)
			throw new IllegalStateException();
		
		this.caterpillar.walk();
	}
	
	public void transform () {
		if (this.caterpillar == null)
			throw new IllegalStateException();
		
		this.caterpillar = null;
		this.butterfly = new Butterfly();
	}
	
	public boolean isCaterpillar() {
		return this.caterpillar != null;
	}
	
	public boolean isButterfly() {
		return !this.isCaterpillar();
	}
	
	

}
