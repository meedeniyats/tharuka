package com.sand.assignment.singtel;

import java.util.Arrays;

import com.sand.assignment.singtel.model.*;


public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		//bird.fly();  Not all the birds can fly
		bird.sing();
		
		
		System.out.println("Counting ...");
		
		Animal[] animals = new Animal[]{ 
		        new Bird(), 
		        new Duck(), 
		        new Chicken(), 
		        new Rooster(), 
		        new Parrot(), 
		        new Fish(), 
		        new Shark(), 
		        new ClownFish(), 
		        new Dolphin(),
		        new Butterfly(), 
		        new Caterpillar() 
		};
		
		System.out.println("Number of animals can fly: " + countFlyableAnimals(animals));
		
		
	}
	
	public static int countFlyableAnimals(Animal[] animals) {
		long count =  Arrays.stream(animals).filter(animal -> animal instanceof Flyable).count();
		return (int) count;
	}
}