package com.sand.assignment.singtel;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sand.assignment.singtel.model.Duck;

public class DuckTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void restoreStreams() {
		outContent.reset();
	    System.setOut(originalOut);
	}
	
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