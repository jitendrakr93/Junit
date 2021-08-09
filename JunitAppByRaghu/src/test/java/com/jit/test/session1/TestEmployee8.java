package com.jit.test.session1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

//Test case: A class that will test our code
@DisplayName("TESTING EMPLOYEE TASK")
public class TestEmployee8 {
	@Test
	@Tag("dev")
	public void testA() {
		System.out.println("HELLO-TEST-A");
	}

	@Test
	@Tag("prod")
	public void testB() {
		System.out.println("HELLO-TEST-B");
	}

	@Test
	@Tag("prod")
	public void testC() {
		System.out.println("HELLO-TEST-C");
	}

	@Test
	@Tag("dev")
	public void testD() {
		System.out.println("HELLO-TEST-D");
	}
}
