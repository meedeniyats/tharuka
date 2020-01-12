package com.sand.assignment.singtel.model;

import java.util.HashMap;
import java.util.Map;

public class Rooster extends Chicken {
	
	protected static Map<String, String> roosterDisctionary;
	
	protected String sound; 
	
	static {
		roosterDisctionary = new HashMap<String, String>();
	    roosterDisctionary.put("English", "Cock-a-doodle-doo");
	    roosterDisctionary.put("Danish", "kykyliky");
	    roosterDisctionary.put("Dutch", "kukeleku");
	    roosterDisctionary.put("Finnish", "kukko kiekuu");
	    roosterDisctionary.put("French", "cocorico");
	    roosterDisctionary.put("German", "kikeriki");
	    roosterDisctionary.put("Greek", "kikiriki");
	    roosterDisctionary.put("Hebrew", "coo-koo-ri-koo");
	    roosterDisctionary.put("Hungarian", "kukuriku");
	    roosterDisctionary.put("Italian", "chicchirichi");
	    roosterDisctionary.put("Japanese", "ko-ke-kok-ko-o");
	    roosterDisctionary.put("Portuguese", "cucurucu");
	    roosterDisctionary.put("Russian", "kukareku");
	    roosterDisctionary.put("Swedish", "kuckeliku");
	    roosterDisctionary.put("Turkish", "kuk-kurri-kuuu");
	    roosterDisctionary.put("Urdu", "kuklooku");
	}
	
	public Rooster(String language) {
		super();
		this.sound = roosterDisctionary.get(language);
	}
	
	public Rooster() {
		this.sound = roosterDisctionary.get("English");
	}





	@Override
	public void sing() {
		System.out.println(this.sound);
	}

}
