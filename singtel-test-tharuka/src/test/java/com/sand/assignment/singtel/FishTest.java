package com.sand.assignment.singtel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sand.assignment.singtel.model.Fish;

public class FishTest extends SysOutTest {

	
	@Test
	public void swimTest() {
	    new Fish().swim();;
	    String expected = "Fish swimming" + System.lineSeparator();
	    assertEquals(expected, outContent.toString());
	}
	
	
}
