package com.sand.assignment.singtel;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;

public class SysOutTest {

	protected final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	protected final PrintStream originalOut = System.out;
	protected final PrintStream newOut = new PrintStream(outContent);

	@Before
	public void setUpStreams() {
	    System.setOut(newOut);
	}

	@After
	public void restoreStreams() {
		outContent.reset();
	    System.setOut(originalOut);
	}
	
}
