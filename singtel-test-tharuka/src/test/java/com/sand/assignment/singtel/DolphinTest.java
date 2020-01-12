package com.sand.assignment.singtel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sand.assignment.singtel.model.Fish;

public class DolphinTest extends SysOutTest {

	
	@Test
	public void swimTest() {
	    new Fish().swim();;
	    String expected = "I am swimming" + System.lineSeparator();
	    assertEquals(expected, outContent.toString());
	}
	
}
