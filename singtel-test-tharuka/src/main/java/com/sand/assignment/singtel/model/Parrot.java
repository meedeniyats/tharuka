package com.sand.assignment.singtel.model;

public class Parrot extends FlyableBird {
	
	public enum Location{
		WITH_DOG("Woof, woof"), WITH_CAT("Meow"), NEAR_ROOSTER("Cock-a-doodle-doo"), 
		DEFAULT("Parrot Singing");
		
		private String sound;
		public String getSound() {
			return this.sound;
		}
	
		Location (String sound) {
			this.sound = sound;
		}
	};
	
	
	private Location location;
	
	public Parrot(Location location) {
		this.location = location;
	}
	
	public Parrot() {
		this.location = Location.DEFAULT;
	}

	@Override
	public void sing() {
		System.out.println(this.location.getSound());
	}
	
	
	

}
