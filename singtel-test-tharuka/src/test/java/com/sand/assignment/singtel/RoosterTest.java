package com.sand.assignment.singtel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sand.assignment.singtel.model.Rooster;

public class RoosterTest extends SysOutTest {
	
	@Test
	public void singTest() {
	    new Rooster().sing();
	    String expected = "Cock-a-doodle-doo" + System.lineSeparator();
	    assertEquals(expected, outContent.toString());
	}

}
