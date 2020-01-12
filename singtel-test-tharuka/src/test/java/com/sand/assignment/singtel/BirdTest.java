package com.sand.assignment.singtel;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sand.assignment.singtel.model.Bird;

public class BirdTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream newOut = new PrintStream(outContent);

	@Before
	public void setUpStreams() {
	    System.setOut(newOut);
	}

	@After
	public void restoreStreams() {
		outContent.reset();
	    System.setOut(originalOut);
	}
	
	@Test
	public void singTest() {
	    new Bird().sing();
	    String expected = "I am singing" + System.lineSeparator();
	    assertEquals(expected, outContent.toString());
	}

}
