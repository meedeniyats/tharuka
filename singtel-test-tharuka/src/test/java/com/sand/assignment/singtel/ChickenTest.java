package com.sand.assignment.singtel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sand.assignment.singtel.model.Chicken;

public class ChickenTest extends SysOutTest {
	
	@Test
	public void singTest() {
	    new Chicken().sing();
	    String expected = "Cluck, cluck" + System.lineSeparator();
	    assertEquals(expected, outContent.toString());
	}

}
