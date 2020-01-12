package com.sand.assignment.singtel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sand.assignment.singtel.model.Duck;

public class DuckTest extends SysOutTest{
	
	@Test
	public void singTest() {
	    new Duck().sing();
	    String expected = "Quack, quack" + System.lineSeparator();
	    assertEquals(expected, outContent.toString());
	}
	
	@Test
	public void swimTest() {
	    new Duck().swim();
	    String expected = "I am swimming" + System.lineSeparator();
	    assertEquals(expected, outContent.toString());
	}

}