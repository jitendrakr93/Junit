package com.jit.test.session1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//Test case: A class that will test our code
@DisplayName("TESTING EMPLOYEE TASK")
public class TestEmployee5 {
	@BeforeAll
	public static void setupOnce() {
		System.out.println("FROM ONETIME SETUP");
	}

	@BeforeEach
	public void setup() {
		// setup, init data
		System.out.println("FROM SETUP");
	}

	@Test
	@DisplayName("TESTING SAVE METHOD")
	public void testSave() {
		System.out.println("HELLO-SAVE");
	}

	@DisplayName("TESTING UPDATE METHOD")
	@Test
	public void testUpdate() {
		System.out.println("HELLO-UPDATE");
	}

	@AfterEach
	public void clear() {
		System.out.println("CLEAR DATA");
	}

	@AfterAll
	public static void closeAll() {
		System.out.println("ONCE AT END");
	}
}
