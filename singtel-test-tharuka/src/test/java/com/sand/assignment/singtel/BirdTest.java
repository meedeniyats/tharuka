package com.sand.assignment.singtel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sand.assignment.singtel.model.Bird;

public class BirdTest extends SysOutTest {
	
	
	@Test
	public void singTest() {
	    new Bird().sing();
	    String expected = "I am singing" + System.lineSeparator();
	    assertEquals(expected, outContent.toString());
	}

}
