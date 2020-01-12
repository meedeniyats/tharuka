package com.sand.assignment.singtel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sand.assignment.singtel.model.Parrot;

public class ParrotTest extends SysOutTest {
	
	@Test
	public void withDogSingTest() {
	    new Parrot(Parrot.Location.WITH_DOG).sing();
	    String expected = "Woof, woof" + System.lineSeparator();
	    assertEquals(expected, outContent.toString());
	}
	
	@Test
	public void withCatSingTest() {
	    new Parrot(Parrot.Location.WITH_CAT).sing();
	    String expected = "Meow" + System.lineSeparator();
	    assertEquals(expected, outContent.toString());
	}
	
	@Test
	public void nearRoosterSingTest() {
	    new Parrot(Parrot.Location.NEAR_ROOSTER).sing();
	    String expected = "Cock-a-doodle-doo" + System.lineSeparator();
	    assertEquals(expected, outContent.toString());
	}

}
