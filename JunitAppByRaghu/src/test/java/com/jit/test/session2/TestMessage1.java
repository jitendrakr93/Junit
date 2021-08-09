package com.jit.test.session2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jit.service.Message1;

public class TestMessage1 {
	// Declare variables
	private Message1 m;
	private String expected;
	private String actual;

	// provide init-data
	@BeforeEach
	public void setup() {
		m = new Message1();
		expected = "Welcome to :SAM";
		actual = "";
	}

	// Do Unit Test
	@Test
	public void testShowMsg() {
		actual = m.showMsg("SAM");
		assertEquals(expected, actual, "Data may not be matching!");
	}

	// clear heap data /clear memory.
	@AfterEach
	public void clean() {
		m = null;
		expected = actual = null;
	}
}
